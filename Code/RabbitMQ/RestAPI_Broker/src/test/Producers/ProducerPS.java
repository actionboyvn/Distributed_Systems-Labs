package Producers;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ProducerPS {
    private static final String EXCHANGE_NAME = "My_exchange";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);
        for (int i = 0; i < 10; i++) {
            String msg = "Hello there! Sms" + i;
            channel.basicPublish(EXCHANGE_NAME,"",null, msg.getBytes());
        }
        channel.close();
        connection.close();
    }
}
