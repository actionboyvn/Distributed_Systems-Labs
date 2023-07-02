package Producers;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ProducerRPC {
    static class RPCClient{
        String QUEUE_NAME = "My_queue";
        ConnectionFactory factory;
        Connection connection;
        Channel channel;
        RPCClient() throws IOException, TimeoutException {
            factory = new ConnectionFactory();
            factory.setHost("localhost");
            connection = factory.newConnection();
            channel = connection.createChannel();
        }
        String call(String msg) throws IOException, ExecutionException, InterruptedException {
            String callback_queue_name = channel.queueDeclare().getQueue();
            String correlationID = UUID.randomUUID().toString();
            AMQP.BasicProperties props = new AMQP.BasicProperties.Builder()
                    .correlationId(correlationID)
                    .replyTo(callback_queue_name)
                    .build();
            System.out.println("Sending msg");
            channel.basicPublish("",QUEUE_NAME, props, msg.getBytes());
            CompletableFuture<String> response = new CompletableFuture<>();
            String tag = channel.basicConsume(callback_queue_name,true,
                    (consumerTag, returnMsg) -> {
                        if (returnMsg.getProperties().getCorrelationId().equals(correlationID))
                            response.complete(new String(returnMsg.getBody(),"UTF-8"));
                    },consumerTag -> { }
            );
            String result = response.get();
            channel.basicCancel(tag);
            return result;
        }
        void close() throws IOException, TimeoutException {
            channel.close();
            connection.close();
        }
    }
    public static void main(String[] args) throws IOException, TimeoutException, ExecutionException, InterruptedException {
        try {
            RPCClient client = new RPCClient();
            System.out.println(client.call("Hi there!"));
            client.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
