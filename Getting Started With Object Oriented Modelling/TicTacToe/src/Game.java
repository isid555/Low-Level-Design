import java.awt.im.InputMethodRequests;
import java.util.Scanner;

public class Game {

    Board board;
    Player player;

    public Game(int size){
     board = new Board(size);
     player = new Player();
     launch();
    }

    public void launch(){

        boolean game = true;

        int n = this.board.board.length;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            if(!game){
                break;
            }
            for(int j = 0;j<n;j++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                try {
                    board.validate(a, b);
                    if(player.playerX){
                        board.place(a,b,'X');
                    }else{
                        board.place(a,b,'Y');
                    }
                    player.toggle();
                } catch (InvalidMoveException e) {
                    System.out.println(e.getMessage());
                    continue;
                }


                char ch = board.winning();
                if(ch == 'X'){
                    System.out.println("X is the winner");
                    game = false;
                    break;
                } else if (ch == 'Y') {
                    System.out.println("Y is the winner");
                    game = false;
                    break;
                } else if (i == n-1 && j == n-1) {
                    System.out.println("Draw");
                }


            }
        }

    }




}
