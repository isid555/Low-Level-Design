public class BankServiceProxy implements IBankService {
    private BankService realBankService;
    private boolean authenticated = false;

    public BankServiceProxy() {
        this.realBankService = new BankService();
    }

    @Override
    public boolean validatePin(Card card, String pin) {
        authenticated = realBankService.validatePin(card, pin);
        if (authenticated) {
            System.out.println("[Proxy] PIN validated successfully");
        } else {
            System.out.println("[Proxy] PIN validation failed");
        }
        return authenticated;
    }

    @Override
    public boolean debit(Card card, int amount) {
        if (!authenticated) {
            System.out.println("[Proxy] Transaction denied. Please authenticate first.");
            return false;
        }
        System.out.println("[Proxy] Processing debit request...");
        return realBankService.debit(card, amount);
    }

    @Override
    public boolean credit(Card card, int amount) {
        if (!authenticated) {
            System.out.println("[Proxy] Transaction denied. Please authenticate first.");
            return false;
        }
        System.out.println("[Proxy] Processing credit request...");
        return realBankService.credit(card, amount);
    }

    @Override
    public void getStatement(Card card) {
        if (!authenticated) {
            System.out.println("[Proxy] Transaction denied. Please authenticate first.");
            return;
        }
        System.out.println("[Proxy] Fetching statement...");
        realBankService.getStatement(card);
    }

    @Override
    public void changePin(Card card, String newPin) {
        if (!authenticated) {
            System.out.println("[Proxy] Transaction denied. Please authenticate first.");
            return;
        }
        System.out.println("[Proxy] Changing PIN securely...");
        realBankService.changePin(card, newPin);
    }
}
