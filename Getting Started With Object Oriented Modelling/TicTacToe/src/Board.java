public class Board {
//params for the board , -> size
    char[][] board;
    public Board(int size){
        this.board = new char[size][size];
        //method to fill the board with _
        FillNull();
        print();
    }
    public void FillNull(){
        int n = this.board.length;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                this.board[i][j] = '_';
            }
        }
    }
    public void validate(int x, int y) throws InvalidMoveException {
        int n = this.board.length;

        if (x < 0 || x >= n || y < 0 || y >= n) {
            throw new InvalidMoveException("Coordinates out of bounds: (" + x + "," + y + ")");
        }
        if (this.board[x][y] != '_') {
            throw new InvalidMoveException("Cell already occupied at (" + x + "," + y + ")");
        }
    }

    public void place(int x , int y,char a){
        this.board[x][y] = a ;

        print();
    }
    public void print(){
        int n = this.board.length;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public char winning() {
        int n = this.board.length;

        // 1. Check rows
        for (int i = 0; i < n; i++) {
            char first = board[i][0];
            if (first != '_') {
                boolean rowWin = true;
                for (int j = 1; j < n; j++) {
                    if (board[i][j] != first) {
                        rowWin = false;
                        break;
                    }
                }
                if (rowWin) return first; // Return winner
            }
        }

        // 2. Check columns
        for (int j = 0; j < n; j++) {
            char first = board[0][j];
            if (first != '_') {
                boolean colWin = true;
                for (int i = 1; i < n; i++) {
                    if (board[i][j] != first) {
                        colWin = false;
                        break;
                    }
                }
                if (colWin) return first;
            }
        }

        // 3. Check main diagonal
        char firstDiag = board[0][0];
        if (firstDiag != '_') {
            boolean diagWin = true;
            for (int i = 1; i < n; i++) {
                if (board[i][i] != firstDiag) {
                    diagWin = false;
                    break;
                }
            }
            if (diagWin) return firstDiag;
        }

        // 4. Check anti-diagonal
        char firstAnti = board[0][n - 1];
        if (firstAnti != '_') {
            boolean antiDiagWin = true;
            for (int i = 1; i < n; i++) {
                if (board[i][n - 1 - i] != firstAnti) {
                    antiDiagWin = false;
                    break;
                }
            }
            if (antiDiagWin) return firstAnti;
        }

        // No winner
        return '_';
    }


}
