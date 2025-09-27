public class Main {
    public static void main(String[] args) {
        CardReader reader = new CardReader();
        CashDispenser dispenser = new CashDispenser();
        IBankService bankProxy = new BankServiceProxy(); // <-- using proxy
        ATM atm = new ATM(reader, dispenser, bankProxy);

        Card debitCard = new DebitCard("1111-2222-3333-4444", "Sid");

        Transaction withdraw = new Withdraw(500);
        atm.startTransaction(debitCard, "1234", withdraw);

        Transaction deposit = new Deposit(1000);
        atm.startTransaction(debitCard, "wrongpin", deposit);
    }
}
