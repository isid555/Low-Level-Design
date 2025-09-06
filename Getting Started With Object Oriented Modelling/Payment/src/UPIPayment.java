public class UPIPayment extends Payment {

    String upiId;
    // constructor
    UPIPayment(Customer customer , int amount  , String upiId){
        this.customer = customer;
        this.amount = amount;
        this.type = "UPI";
        this.isProcessed = false;
        this.upiId = upiId;
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
        System.out.println("Additional Details: "+upiId);
        System.out.println("Amount Paid: $"+amount);
    }
}
