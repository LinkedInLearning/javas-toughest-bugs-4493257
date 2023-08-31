import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StockTradingSystem {
  public static void main(String[] args) {
    ExecutorService threadPool = Executors.newFixedThreadPool(5);

    for (int i = 0; i < 10; i++) {
      threadPool.submit(() -> {
        boolean tradeComplete = false;
        while (!tradeComplete) {
          // Process trade data
          System.out.println("Processing trade " +
              Thread.currentThread().getName());
          tradeComplete = !Thread.currentThread().getName().contains("2");
        }
      });
    }

    System.out.print("Trades are complete");

    threadPool.shutdown();
  }
}
