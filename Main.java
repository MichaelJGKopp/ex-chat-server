import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

  public static void main(String[] args) {

    List<ChatClient> clients = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      clients.add(new ChatClient("ChatClient " + (i + 1)));
    }

    try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

      for (ChatClient c : clients) {
        executor.submit(() -> {
          for (int i = 0; i < 3; i++) {
            try {
              c.sendMsg();
              c.receiveMsg();
            } catch (InterruptedException e) {
              e.printStackTrace();
              Thread.currentThread().interrupt();
            }
          }
        });
      }
    }
  }
}
