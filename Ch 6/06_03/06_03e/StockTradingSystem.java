import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StockTradingSystem {
  public static void main(String[] args) {
    ExecutorService threadPool = Executors.newFixedThreadPool(5);

    long startTime = System.currentTimeMillis();

    for (int i = 0; i < 10; i++) {
      threadPool.submit(() -> {
        boolean tradeComplete = false;
        while (!tradeComplete) {
          // Process trade data
          System.out.println("Processing trade " +
              Thread.currentThread().getName());
          tradeComplete = true;
        
          long currentTime = System.currentTimeMillis();
          if (currentTime - startTime > 10000) {
            System.out.println(Thread.currentThread().getName() + 
            " exceeded timeout. Exiting...");
            break;
          }
        }
      });
    }

    System.out.print("Trades are complete");

    threadPool.shutdown();
  }
}
