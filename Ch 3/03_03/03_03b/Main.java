public class Main {
  public static void main(String[] args) {
    // Create instances of CreditCardPayment and PayPalPayment
    CreditCardPayment creditCardPayment = new CreditCardPayment();
    PayPalPayment payPalPayment = new PayPalPayment();

    // Set different transaction fees for each payment method
    creditCardPayment.setTransactionFee(2.5);
    payPalPayment.setTransactionFee(1.8);

    // Process payments
    creditCardPayment.processPayment(100.0);
    payPalPayment.processPayment(100.0);
  }
}

abstract class PaymentMethod {
  private static double transactionFee = 0.0;

  public PaymentMethod() {
  }

  public abstract void processPayment(double amount);

  public static double getTransactionFee() {
    return transactionFee;
  }

  public void setTransactionFee(double fee) {
    transactionFee = fee;
  }
}

class CreditCardPayment extends PaymentMethod {
  public CreditCardPayment() {
    super();
  }

  public void processPayment(double amount) {
    double totalAmount = amount + PaymentMethod.getTransactionFee();
    System.out.println("Processing credit card payment for amount $"
        + amount + " with transaction fee $" +
        PaymentMethod.getTransactionFee() + ", total: $" + totalAmount);
  }
}

class PayPalPayment extends PaymentMethod {
  public PayPalPayment() {
    super();
  }

  public void processPayment(double amount) {
    double totalAmount = amount + PaymentMethod.getTransactionFee();
    System.out.println("Processing PayPal payment for amount $" +
        amount + " with transaction fee $" +
        PaymentMethod.getTransactionFee()
        + ", total: $" + totalAmount);
  }
}