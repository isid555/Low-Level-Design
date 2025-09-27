public class ATM {
    private CardReader cardReader;
    private CashDispenser cashDispenser;
    private IBankService bankService; // interface instead of direct RealBankService

    public ATM(CardReader cardReader, CashDispenser cashDispenser, IBankService bankService) {
        this.cardReader = cardReader;
        this.cashDispenser = cashDispenser;
        this.bankService = bankService;
    }

    public void startTransaction(Card card, String pin, Transaction txn) {
        if (cardReader.injectCard(card) && bankService.validatePin(card, pin)) {
            executeTransaction(txn, card);
        } else {
            System.out.println("[ATM] Invalid card or PIN");
            cardReader.ejectCard(card);
        }
    }

    private void executeTransaction(Transaction txn, Card card) {
        txn.makeTransaction(bankService, cashDispenser, card);
        cardReader.ejectCard(card);
    }
}
