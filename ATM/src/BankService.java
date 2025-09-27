public class BankService implements  IBankService {
    public boolean validatePin(Card card, String pin) {
        return "1234".equals(pin); // dummy
    }

    public boolean debit(Card card, int amount) {
        System.out.println("Debiting " + amount + " from card " + card.getCardNumber());
        return true;
    }

    public boolean credit(Card card, int amount) {
        System.out.println("Crediting " + amount + " to card " + card.getCardNumber());
        return true;
    }

    public void getStatement(Card card) {
        System.out.println("Fetching statement for " + card.getCardNumber());
    }

    public void changePin(Card card, String newPin) {
        System.out.println("Changing pin for " + card.getCardNumber());
    }
}
