public class CreditCardPayment extends Payment{

    String cardNumber;

    // constructor
    CreditCardPayment(Customer customer , int amount , String cardNumber){
        this.customer = customer;
        this.amount = amount;
        this.isProcessed = false;
        this.cardNumber = cardNumber;
        this.type = "Credit Card";
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


        StringBuilder sb = new StringBuilder();

        for(int i = 13;i<=16;i++){
            char c = cardNumber.charAt(i-1);
            sb.append(c);
        }

        String stars = "**** **** **** ";
        StringBuilder ans = new StringBuilder(stars);
        ans.append(sb);


        System.out.println("Receipt:");

        System.out.println("Customer: "+customer.name);
        System.out.println("Email: "+customer.email);
        System.out.println("Payment Method: "+type);
        System.out.println("Additional Details: "+ans);
        System.out.println("Amount Paid: $"+amount);



    }
}
