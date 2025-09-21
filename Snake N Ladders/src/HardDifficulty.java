public class HardDifficulty implements DifficultyStratergy {
    @Override
    public void populate(Board board) {
        // 20 Snakes (start > end)
        board.addEntity(new Snake(new Position(9, 1), new Position(6, 1)));
        board.addEntity(new Snake(new Position(8, 3), new Position(5, 3)));
        board.addEntity(new Snake(new Position(7, 5), new Position(4, 5)));
        board.addEntity(new Snake(new Position(6, 7), new Position(2, 7)));
        board.addEntity(new Snake(new Position(9, 9), new Position(7, 9)));
        board.addEntity(new Snake(new Position(8, 2), new Position(5, 2)));
        board.addEntity(new Snake(new Position(7, 0), new Position(3, 0)));
        board.addEntity(new Snake(new Position(6, 4), new Position(1, 4)));
        board.addEntity(new Snake(new Position(5, 6), new Position(2, 6)));
        board.addEntity(new Snake(new Position(9, 5), new Position(6, 5)));
        board.addEntity(new Snake(new Position(8, 6), new Position(4, 6)));
        board.addEntity(new Snake(new Position(7, 8), new Position(3, 8)));
        board.addEntity(new Snake(new Position(9, 3), new Position(5, 3)));
        board.addEntity(new Snake(new Position(6, 2), new Position(2, 2)));
        board.addEntity(new Snake(new Position(5, 0), new Position(1, 0)));
        board.addEntity(new Snake(new Position(8, 8), new Position(4, 8)));
        board.addEntity(new Snake(new Position(7, 4), new Position(3, 4)));
        board.addEntity(new Snake(new Position(6, 9), new Position(2, 9)));
        board.addEntity(new Snake(new Position(9, 0), new Position(5, 0)));
        board.addEntity(new Snake(new Position(8, 1), new Position(3, 1)));

        // 10 Ladders (start < end)
        board.addEntity(new Ladder(new Position(1, 1), new Position(4, 1)));
        board.addEntity(new Ladder(new Position(2, 3), new Position(5, 3)));
        board.addEntity(new Ladder(new Position(1, 5), new Position(6, 5)));
        board.addEntity(new Ladder(new Position(2, 7), new Position(7, 7)));
        board.addEntity(new Ladder(new Position(0, 2), new Position(3, 2)));
        board.addEntity(new Ladder(new Position(1, 8), new Position(5, 8)));
        board.addEntity(new Ladder(new Position(2, 0), new Position(6, 0)));
        board.addEntity(new Ladder(new Position(0, 4), new Position(4, 4)));
        board.addEntity(new Ladder(new Position(1, 6), new Position(5, 6)));
        board.addEntity(new Ladder(new Position(0, 9), new Position(3, 9)));
    }
}
