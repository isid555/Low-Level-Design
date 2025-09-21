import java.util.List;

public class EasyDifficulty implements DifficultyStratergy {

    @Override
    public void populate(Board board) {
        // 2 Snakes
        board.addEntity(new Snake(new Position(5, 2), new Position(2, 2)));
        board.addEntity(new Snake(new Position(6, 5), new Position(3, 3)));

        // 2 Ladders
        board.addEntity(new Ladder(new Position(1, 1), new Position(4, 1)));
        board.addEntity(new Ladder(new Position(2, 4), new Position(5, 4)));
    }
}
