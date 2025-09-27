public class Main {
    public static void main(String[] args) {
        CardReader reader = new CardReader();
        CashDispenser dispenser = new CashDispenser();
        IBankService bankProxy = new BankServiceProxy(); // Proxy BankService
        ATM atm = new ATM(reader, dispenser, bankProxy);

        Card debitCard = new DebitCard("1111-2222-3333-4444", "Sid");

        System.out.println("---- Successful Withdraw ----");
        atm.insertCard(debitCard);
        atm.enterPin("1234");
        atm.selectTransaction(new Withdraw(500));
        atm.executeTransaction();
        atm.ejectCard();

        System.out.println("\n---- Failed Deposit (wrong PIN) ----");
        atm.insertCard(debitCard);
        atm.enterPin("wrongpin"); // PIN validation fails here
        atm.selectTransaction(new Deposit(1000)); // This will print an error (because PIN not validated)
        atm.executeTransaction();
        atm.ejectCard();
    }
}
