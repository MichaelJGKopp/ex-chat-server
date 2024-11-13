import java.util.Random;

public class ChatClient {

  private String clientName;
  private final Random random = new Random();

  public ChatClient(String clientName) {
    this.clientName = clientName;
  }

  public void sendMsg() throws InterruptedException {
    Thread.sleep(random.nextInt(200, 2_000));
    System.out.printf("%-13s %-25s %s%n", clientName, "<< is sending a message",
      "(" + Thread.currentThread() + ")");
  }

  public void receiveMsg() throws InterruptedException {
    Thread.sleep(random.nextInt(5, 100));
    System.out.printf("%-13s %-25s %s%n", clientName, ">> received a message",
      "(" + Thread.currentThread() + ")");
  }

}
