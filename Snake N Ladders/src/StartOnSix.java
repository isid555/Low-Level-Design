public class StartOnSix implements StartingStrategy {
    @Override
    public boolean canStart(Player player, int diceRoll) {
        return diceRoll == 6; // must roll 6 to start
    }
}
