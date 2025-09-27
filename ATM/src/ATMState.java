public interface ATMState {
    void insertCard(ATM atm, Card card);
    void ejectCard(ATM atm);
    void enterPin(ATM atm, String pin);
    void selectTransaction(ATM atm, Transaction transaction);
    void executeTransaction(ATM atm);
}
