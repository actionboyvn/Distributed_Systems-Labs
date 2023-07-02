package Producers;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ProducerR {
    private static final String EXCHANGE_NAME = "My_exchange2";
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        String routing_key = "alert";
        for (int i = 0; i < 3; i++) {
            String msg = "Hello there! Sms " + i + " from " + routing_key;
            channel.basicPublish(EXCHANGE_NAME, routing_key,null, msg.getBytes());
        }
        routing_key = "info";
        for (int i = 0; i < 3; i++) {
            String msg = "Hello there! Sms " + i + " from " + routing_key;
            channel.basicPublish(EXCHANGE_NAME, routing_key,null, msg.getBytes());
        }
        routing_key = "news";
        for (int i = 0; i < 3; i++) {
            String msg = "Hello there! Sms " + i + " from " + routing_key;
            channel.basicPublish(EXCHANGE_NAME, routing_key,null, msg.getBytes());
        }
        channel.close();
        connection.close();
    }
}
