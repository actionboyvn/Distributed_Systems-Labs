package Producers;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

public class ProducerOfWork {
    private static final String EXCHANGE_NAME = "My_exchange";
    private static final String ROUTING_KEY = "My_key";
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        String callbackQueue = channel.queueDeclare().getQueue();

        DefaultConsumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String response = new String(body, "UTF-8");
                System.out.println("Received response: " + response);
            }
        };
        channel.basicConsume(callbackQueue, true, consumer);

        String message = "Hello, world!";
        AMQP.BasicProperties props = new AMQP.BasicProperties.Builder()
                .correlationId(java.util.UUID.randomUUID().toString())
                .replyTo(callbackQueue)
                .build();
        channel.basicPublish(EXCHANGE_NAME, ROUTING_KEY, props, message.getBytes("UTF-8"));

    }
}
