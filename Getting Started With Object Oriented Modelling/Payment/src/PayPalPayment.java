public class PayPalPayment extends  Payment{

    String PayPalId;

    PayPalPayment(Customer customer , int amount , String payPalId){
        this.customer = customer;
        this.amount  = amount;
        this.type = "PayPal";
        this.isProcessed = false;
        this.PayPalId = payPalId;
    }

    @Override
    void processPayment() {
        if(amount < 0){
            System.out.println("Payment failed: Amount must be greater than 0");
            return;
        }

        System.out.println("Processing payment of $" +amount+ " for "+ customer.name+" using "+type);
        this.isProcessed = true;
    }

    @Override
    void generateReceipt() {
        if(!this.isProcessed){
            System.out.println("Cannot generate receipt: Payment not processed");
            return;
        }

        System.out.println("Receipt:");

        System.out.println("Customer: "+customer.name);
        System.out.println("Email: "+customer.email);
        System.out.println("Payment Method: "+type);
        System.out.println("Additional Details: "+ PayPalId );
        System.out.println("Amount Paid: $"+amount);


    }
}
