public class WaitingForPinState implements ATMState {
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
        if (atm.getBankService().validatePin(atm.getCard(), pin)) {
            System.out.println("PIN validated");
            atm.setState(new TransactionSelectionState());
        } else {
            System.out.println("Invalid PIN. Try again or eject card.");
        }
    }

    @Override
    public void selectTransaction(ATM atm, Transaction transaction) {
        System.out.println("Enter PIN first");
    }

    @Override
    public void executeTransaction(ATM atm) {
        System.out.println("Enter PIN first");
    }
}
