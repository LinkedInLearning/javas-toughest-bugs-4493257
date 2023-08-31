import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class EventTicketBookingSystem {
  private int availableTickets = 100;

  public synchronized void bookTicket(int numTickets) {
    if (numTickets <= availableTickets) {
      System.out.println(Thread.currentThread().getName() +
          " booking " + numTickets + " tickets with available " +
          availableTickets);
      availableTickets = availableTickets - numTickets;
      System.out.println(Thread.currentThread().getName() +
          " booked " + numTickets + " tickets with available " +
          availableTickets + " left \n");
    } else {
      System.out.println(Thread.currentThread().getName() +
          " could not book " + numTickets +
          " tickets. Not enough available. Available:" +
          availableTickets);
    }
  }

  public synchronized int getAvailableTickets() {
    System.out.println(Thread.currentThread().getName() +
        " current available: " + availableTickets);
    return availableTickets;
  }

  public static void main(String[] args) {
    EventTicketBookingSystem bookingSystem = new EventTicketBookingSystem();
    ExecutorService executorService = Executors.newFixedThreadPool(10);

    while (bookingSystem.getAvailableTickets() > 0) {
      executorService.execute(() -> {
        bookingSystem.bookTicket(new Random().nextInt(5) + 1);
      });
    }

    executorService.shutdownNow();

    System.out.println("Remaining tickets: " +
        bookingSystem.getAvailableTickets());
  }
}
