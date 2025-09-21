public class LudoKillingStrategy implements KillingStrategy {

    @Override
    public void handleKill(Player movingPlayer, Board board) {
        Position currentPos = movingPlayer.getPosition();

        for (Player other : board.getPlayers()) {
            if (other != movingPlayer && other.getPosition().equals(currentPos)) {
                System.out.println(movingPlayer.getName() + " killed " + other.getName() + "!");
                // send killed player back to start
                other.setPosition(new Position(0, 0));
                board.updateBoard(); // update board to reflect changes
            }
        }
    }
}
