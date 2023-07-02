package pwr.wit.rsi;

public class MessageService {
    private static final int DELAY_SEC = 3;
    public String echo(String message) {
        System.out.println("Message received:" + message);
        System.out.println("Response: sending echo message...");
        return "Echo: " + message;
    }
    public String echoWithDelay(String message) throws InterruptedException {
        System.out.println("Message received:" + message);
        System.out.println(String.format("Waiting for %d seconds before sending response...", DELAY_SEC));
        Thread.sleep(DELAY_SEC * 1000);
        System.out.println("Response: sending echo message...");
        return "Echo after delay: " + message;
    }
    public int add(int a, int b) {
        return a + b;
    }
}
