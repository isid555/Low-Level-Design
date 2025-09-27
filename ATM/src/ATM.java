public class ATM {
    private ATMState currentState;
    private Card card;
    private Transaction currentTransaction;
    private CardReader cardReader;
    private CashDispenser cashDispenser;
    private IBankService bankService;

    public ATM(CardReader cardReader, CashDispenser cashDispenser, IBankService bankService) {
        this.cardReader = cardReader;
        this.cashDispenser = cashDispenser;
        this.bankService = bankService;
        this.currentState = new WaitingForCardState();
    }

    public void insertCard(Card card) {
        currentState.insertCard(this, card);
    }

    public void ejectCard() {
        currentState.ejectCard(this);
    }

    public void enterPin(String pin) {
        currentState.enterPin(this, pin);
    }

    public void selectTransaction(Transaction transaction) {
        currentState.selectTransaction(this, transaction);
    }

    public void executeTransaction() {
        currentState.executeTransaction(this);
    }

    // getters and setters for state and fields
    public void setState(ATMState state) {
        this.currentState = state;
    }

    public ATMState getState() {
        return currentState;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    public CardReader getCardReader() {
        return cardReader;
    }

    public CashDispenser getCashDispenser() {
        return cashDispenser;
    }

    public IBankService getBankService() {
        return bankService;
    }
}
