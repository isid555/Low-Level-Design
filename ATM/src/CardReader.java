public class CardReader {
    public boolean injectCard(Card card) {
        System.out.println("Card inserted: " + card.getCardNumber());
        return validate(card); // pretend validation
    }

    public boolean validate(Card card) {
        // basic check
        return card.getCardNumber() != null;
    }

    public void ejectCard(Card card) {
        System.out.println("Card ejected: " + card.getCardNumber());
    }
}
