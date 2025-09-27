public class WaitingForCardState implements ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        atm.setCard(card);
        System.out.println("Card inserted");
        atm.setState(new WaitingForPinState());
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("No card to eject");
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        System.out.println("Insert card first");
    }

    @Override
    public void selectTransaction(ATM atm, Transaction transaction) {
        System.out.println("Insert card first");
    }

    @Override
    public void executeTransaction(ATM atm) {
        System.out.println("Insert card first");
    }
}
