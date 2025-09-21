public class DiceService {
    private Dice dice;
    private int lastRoll;   // last roll value
    private int totalSum;   // sum of rolls if required

    public DiceService() {
        this.dice = Dice.getInstance();
        this.lastRoll = 0;
        this.totalSum = 0;
    }

    public int roll() {
        lastRoll = dice.roll();
        totalSum += lastRoll;
        System.out.println("Dice rolled: " + lastRoll);
        return lastRoll;
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public int getTotalSum() {
        return totalSum;
    }



}
