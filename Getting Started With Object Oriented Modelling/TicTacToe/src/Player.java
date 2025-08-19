public class Player {
    boolean playerX;
    boolean playerY;

    public Player(){
        this.playerX = true;
        this.playerY = false;
        System.out.println("Player X turn");
    }

    public void toggle(){

        if(this.playerX){
            this.playerX = false;
            this.playerY = true;
            System.out.println("Player Y turn");
        }else{
            this.playerX = true;
            this.playerY = false;
            System.out.println("Player X turn");
        }

    }

    // player -> human / AI
            /*
            * human works on cord
            * Ai  fills the first empty cell
            * human vs human
            * human vs AI
            * */


}
