public interface Transaction {
    void makeTransaction(IBankService bankService, CashDispenser dispenser, Card card);
}
