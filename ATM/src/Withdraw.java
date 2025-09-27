public class Withdraw implements Transaction {
    private int amount;

    public Withdraw(int amount) {
        this.amount = amount;
    }

    @Override
    public void makeTransaction(IBankService bankService, CashDispenser dispenser, Card card) {
        if (bankService.debit(card, amount)) {
            dispenser.dispense(amount);
        }
    }
}