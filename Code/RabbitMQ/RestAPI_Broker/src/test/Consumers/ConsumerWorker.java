package Consumers;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ConsumerWorker {
    private static final String EXCHANGE_NAME = "My_exchange";
    private static final String ROUTING_KEY = "My_key";
    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        //channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        String queueName = channel.queueDeclare().getQueue();
        channel.queueBind(queueName, EXCHANGE_NAME, ROUTING_KEY);

        DefaultConsumer consumer = new DefaultConsumer(channel){
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println("Received message: " + message);
                String responseMessage = "Response to: " + message;

                String correlationId = properties.getCorrelationId();
                String replyToQueue = properties.getReplyTo();
                AMQP.BasicProperties responseProps = new AMQP.BasicProperties.Builder()
                        .correlationId(correlationId)
                        .build();
                getChannel().basicPublish("", replyToQueue, responseProps, responseMessage.getBytes("UTF-8"));
            }
        };
        channel.basicConsume(queueName,true, consumer);
    }
}
