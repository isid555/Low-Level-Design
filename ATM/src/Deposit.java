public class Deposit implements Transaction {
    private int amount;

    public Deposit(int amount) {
        this.amount = amount;
    }

    @Override
    public void makeTransaction(IBankService bankService, CashDispenser dispenser, Card card) {
        bankService.credit(card, amount);
    }
}