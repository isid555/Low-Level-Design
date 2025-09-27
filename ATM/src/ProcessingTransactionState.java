public class ProcessingTransactionState implements ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Transaction in progress. Cannot insert card.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Transaction in progress. Cannot eject card.");
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        System.out.println("Transaction in progress.");
    }

    @Override
    public void selectTransaction(ATM atm, Transaction transaction) {
        System.out.println("Transaction already selected.");
    }

    @Override
    public void executeTransaction(ATM atm) {
        Transaction txn = atm.getCurrentTransaction();
        if (txn != null) {
            txn.makeTransaction(atm.getBankService(), atm.getCashDispenser(), atm.getCard());
            System.out.println("Transaction completed.");
        }
        atm.setCurrentTransaction(null);
        atm.setCard(null);
        atm.setState(new WaitingForCardState());
    }
}
