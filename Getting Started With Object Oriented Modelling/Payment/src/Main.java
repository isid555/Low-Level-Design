public class Main {
    public static void main(String[] args) {
//        Customer customer1 = new Customer("Alice", "alice@example.com");
//        Payment creditCardPayment = new CreditCardPayment(customer1, 120, "1234567812345678");
//        creditCardPayment.processPayment();
//        creditCardPayment.generateReceipt();
//
//        Payment failedCreditCardPayment = new CreditCardPayment(customer1, -50, "1234567812345678");
//        failedCreditCardPayment.processPayment();
//        failedCreditCardPayment.generateReceipt();


//        Customer customer2 = new Customer("Bob", "bob@example.com");
//        Payment upiPayment = new UPIPayment(customer2, 75, "bob@upi");
//        upiPayment.processPayment();
//        upiPayment.generateReceipt();

        Customer customer3 = new Customer("Charlie", "charlie@example.com");
        Payment paypalPayment = new PayPalPayment(customer3, 200, "charlie@paypal.com");
        paypalPayment.processPayment();
        paypalPayment.generateReceipt();

    }
}