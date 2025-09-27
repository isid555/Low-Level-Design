public class RealBankService implements IBankService {
    @Override
    public boolean validatePin(Card card, String pin) {
        return "1234".equals(pin); // dummy validation
    }

    @Override
    public boolean debit(Card card, int amount) {
        System.out.println("[Bank] Debiting " + amount + " from card " + card.getCardNumber());
        return true;
    }

    @Override
    public boolean credit(Card card, int amount) {
        System.out.println("[Bank] Crediting " + amount + " to card " + card.getCardNumber());
        return true;
    }

    @Override
    public void getStatement(Card card) {
        System.out.println("[Bank] Fetching statement for " + card.getCardNumber());
    }

    @Override
    public void changePin(Card card, String newPin) {
        System.out.println("[Bank] Changing PIN for " + card.getCardNumber());
    }
}
