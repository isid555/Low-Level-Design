public class EndAtLastCell implements EndingStrategy {
    @Override
    public boolean hasEnded(Player player, Board board) {
        Position pos = player.getPosition();
        int lastIndex = board.size * board.size - 1;
        int currentIndex = pos.getRow() * board.size + pos.getCol();
        return currentIndex == lastIndex;
    }
}
