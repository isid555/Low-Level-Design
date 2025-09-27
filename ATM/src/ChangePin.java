
public class ChangePin implements Transaction {
    private String newPin;

    public ChangePin(String newPin) {
        this.newPin = newPin;
    }

    @Override
    public void makeTransaction(IBankService bankService, CashDispenser dispenser, Card card) {
        bankService.changePin(card, newPin);
    }
}