import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    public static void main(String[] args){
        StartingStrategy start = new StartOnSix();
        EndingStrategy end = new EndAtLastCell();

        HumanPlayer alice = new HumanPlayer("Alice","R",start,end);
        HumanPlayer bob = new HumanPlayer("Bob","B",start,end);

        List<Player> players = new ArrayList<>(Arrays.asList(alice,bob));




        Board board = new Board(10, players);
        board.setKillingStrategy(new LudoKillingStrategy());

        // Populate board with difficulty
        DifficultyStratergy difficulty = new EasyDifficulty();
        difficulty.populate(board);


        DiceService diceService = new DiceService();

        boolean gameOver = false;
        while(!gameOver){
            for(Player p: players){
                int roll = diceService.roll();
                board.movePlayer(p,roll);
                board.printBoard();
                if(p.hasFinished(board)){
                    System.out.println(p.getName() + " wins!");
                    gameOver = true;
                    break;
                }
            }
        }
    }
}
