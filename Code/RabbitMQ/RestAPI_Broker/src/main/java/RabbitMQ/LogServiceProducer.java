package RabbitMQ;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class LogServiceProducer {
    String EXCHANGE_NAME = "Log_service_exchange";
    String ROUTING_KEY_CRUD_LOG = "CRUD_Log";
    String ROUTING_KEY_STATUS_LOG = "Status_log";
    ConnectionFactory factory;
    Connection connection;
    Channel channel;
    public LogServiceProducer() throws IOException, TimeoutException {
        factory = new ConnectionFactory();
        factory.setHost("localhost");
        connection = factory.newConnection();
        channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
    }
    public void logCRUD(String log) throws IOException {
        channel.basicPublish(EXCHANGE_NAME, ROUTING_KEY_CRUD_LOG,null, log.getBytes());
    }
    public void logStatus(String log) throws IOException {
        channel.basicPublish(EXCHANGE_NAME, ROUTING_KEY_STATUS_LOG,null, log.getBytes());
    }
    public void close() throws IOException, TimeoutException {
        channel.close();
        connection.close();
    }
}
