public interface IBankService {
    boolean validatePin(Card card, String pin);
    boolean debit(Card card, int amount);
    boolean credit(Card card, int amount);
    void getStatement(Card card);
    void changePin(Card card, String newPin);
}
