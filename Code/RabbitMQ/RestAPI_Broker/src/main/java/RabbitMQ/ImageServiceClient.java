package RabbitMQ;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ImageServiceClient {
    String QUEUE_NAME = "Image_Request_Queue";
    String QUEUE_NAME2 = "Image_Upload_Queue";
    ConnectionFactory factory;
    Connection connection;
    Channel channel;
    public ImageServiceClient() throws IOException, TimeoutException {
        factory = new ConnectionFactory();
        factory.setHost("localhost");
        connection = factory.newConnection();
        channel = connection.createChannel();
    }
    public byte[] call(String imageName) throws IOException, ExecutionException, InterruptedException {
        String callback_queue_name = channel.queueDeclare().getQueue();
        String correlationID = UUID.randomUUID().toString();
        AMQP.BasicProperties props = new AMQP.BasicProperties.Builder()
                .correlationId(correlationID)
                .replyTo(callback_queue_name)
                .build();
        channel.basicPublish("", QUEUE_NAME, props, imageName.getBytes());
        CompletableFuture<byte[]> response = new CompletableFuture<>();
        String tag = channel.basicConsume(callback_queue_name, true,
                (consumerTag, returnMsg) -> {
                    if (returnMsg.getProperties().getCorrelationId().equals(correlationID)) {
                        response.complete(returnMsg.getBody());
                    }
                }, consumerTag -> {
                }
        );
        byte[] result = response.get();
        channel.basicCancel(tag);
        return result;
    }
    public void upload(String imageName, byte[] bytes) throws IOException {
        AMQP.BasicProperties props = new AMQP.BasicProperties.Builder()
                .replyTo(imageName)
                .build();
        channel.basicPublish("", QUEUE_NAME2, props, bytes);
    }
    public void close() throws IOException, TimeoutException {
        channel.close();
        connection.close();
    }
}

