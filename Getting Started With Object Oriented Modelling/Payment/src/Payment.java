public abstract class Payment {
    Customer customer;
    int amount;
    boolean  isProcessed;
    String type;

    abstract void processPayment();
    abstract void generateReceipt();
}
