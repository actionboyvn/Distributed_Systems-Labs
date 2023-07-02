package RabbitMQ;

import com.rabbitmq.client.*;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeoutException;

public class ImageServiceServer {
    private static final String QUEUE_NAME = "Image_Request_Queue";
    private static final String QUEUE_NAME2 = "Image_Upload_Queue";
    static Date date;
    static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        Channel channel2 = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        channel2.queueDeclare(QUEUE_NAME2,false,false,false,null);
        DefaultConsumer consumer = new DefaultConsumer(channel){
            public void handleDelivery(String consumerTag,
                                       Envelope envelope,
                                       AMQP.BasicProperties properties,
                                       byte[] body) throws IOException {
                String imageName = new String(body,"UTF-8");
                String imagePath = "./src/main/java/images/" + imageName + ".jpg";
                File file = new File(imagePath);
                FileInputStream fileInputStream;
                byte[] bytes;
                try {
                    fileInputStream = new FileInputStream(file);
                    bytes = fileInputStream.readAllBytes();
                    fileInputStream.close();
                } catch (FileNotFoundException e) {
                    bytes = null;
                }
                date = new Date();
                System.out.println(dateFormat.format(date) + ": Sent " + imageName + ".jpg");
                channel.basicPublish("", properties.getReplyTo(), properties, bytes);
            }
        };
        DefaultConsumer consumer2 = new DefaultConsumer(channel2){
            public void handleDelivery(String consumerTag,
                                       Envelope envelope,
                                       AMQP.BasicProperties properties,
                                       byte[] body) throws IOException {
                String imageName = properties.getReplyTo();
                String imagePath = "./src/main/java/images/" + imageName + ".jpg";
                File file = new File(imagePath);
                FileOutputStream fileOutputStream;
                fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(body);
                fileOutputStream.close();
                date = new Date();
                System.out.println(dateFormat.format(date) + ": Saved " + imageName + ".jpg");
            }
        };
        channel.basicConsume(QUEUE_NAME,true, consumer);
        channel2.basicConsume(QUEUE_NAME2,true, consumer2);
    }
}
