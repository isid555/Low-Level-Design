import java.util.HashMap;
import java.util.Map;

public class CashDispenser {
    private Map<Integer, Integer> denominations = new HashMap<>();

    public CashDispenser() {
        denominations.put(100, 10);
        denominations.put(500, 5);
    }

    public boolean dispense(int amount) {
        System.out.println("Dispensing " + amount);
        while(amount != 0){
            if(amount>=500){
                amount-= 500;
            }else{
                amount -=100;
            }
        }
        return true;
    }

    public int getAvailableBalance() {
        return denominations.entrySet()
                .stream()
                .mapToInt(e -> e.getKey() * e.getValue())
                .sum();
    }
}
