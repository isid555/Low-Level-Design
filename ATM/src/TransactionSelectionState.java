public class TransactionSelectionState implements ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card already inserted");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected");
        atm.setCard(null);
        atm.setState(new WaitingForCardState());
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        System.out.println("PIN already validated");
    }

    @Override
    public void selectTransaction(ATM atm, Transaction transaction) {
        atm.setCurrentTransaction(transaction);
        System.out.println("Transaction selected: " + transaction.getClass().getSimpleName());
        atm.setState(new ProcessingTransactionState());
    }

    @Override
    public void executeTransaction(ATM atm) {
        System.out.println("Select a transaction first");
    }
}
