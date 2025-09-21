import javax.sound.midi.Synthesizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Board {
    int size;
    char[][] board;
    private List<Player> players;
    private List<Entity> entities;
    private Map<Position, List<Object>> occupants; // hybrid mapping
    private  KillingStrategy killingStrategy;

    // Constructor
    public Board(int size, List<Player> players) {
        this.size = size;
        this.players = players;
        this.entities = new ArrayList<>();
        this.board = new char[size][size];
        this.occupants = new HashMap<>();

        // initialize board with empty cells
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }




    //violates SRP , this can be kept in other class such a s BoardPrintwer
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addPlayer(Player player) {
        players.add(player);
        updatePlayerOnBoard(player);
    }

    private void updatePlayerOnBoard(Player player) {
        Position pos = player.getPosition();
        List<Object> objs = occupants.getOrDefault(pos, List.of(player));
        String cell = "";
        for (Object o : objs) {
            if (o instanceof Player) cell += ((Player)o).getName().charAt(0);
            else if (o instanceof Snake) cell += "S";
            else if (o instanceof Ladder) cell += "L";
        }
        board[pos.row][pos.col] = cell.length() > 0 ? cell.charAt(0) : '-';
    }


    void updateBoard() {
        // reset board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }

        for(Entity e : entities){
            board[e.getFrom().row][e.getFrom().col] = (e instanceof Snake)? 'S' : 'L';
        }
        for(Player p : players){
            board[p.getPosition().row][p.getPosition().col] = p.getName().charAt(0);
        }
    }


    public void addEntity(Entity entity) {
        // 1. Cannot start at (0,0) or end at last cell
        if ((entity.getFrom().row == 0 && entity.getFrom().col == 0) ||
                (entity.getTo().row == size - 1 && entity.getTo().col == size - 1)) return;

        // 2. Check for conflicts with existing entities
        for (Entity e : this.entities) {
            if (entity.getFrom().equals(e.getFrom()) || entity.getFrom().equals(e.getTo()) ||
                    entity.getTo().equals(e.getFrom())   || entity.getTo().equals(e.getTo())) {
                return; // conflict, do not add
            }
        }

        // 3. Add entity to board’s internal list
        this.entities.add(entity);

        // 4. Update board for display
        updateBoard();
    }







    // Movement

    // Movement: map board index to row/col
    private Position getPositionFromIndex(int index) {
        int row = index / size;
        int col = index % size;
        return new Position(row, col);
    }

    private int getIndexFromPosition(Position pos) {
        return pos.getRow() * size + pos.getCol();
    }

    public void movePlayer(Player player, int diceRoll){
        if(!player.tryStart(diceRoll)) return;

        int idx = player.getPosition().row * size + player.getPosition().col;
        int newIdx = idx + diceRoll;
        if(newIdx >= size*size){
            return;
        }

        Position newPos = new Position(newIdx/size, newIdx%size);

        // 2. Trigger only entities at current position
        boolean jumped;
        do {
            jumped = false;
            for (Entity e : entities) {
                if (e.getFrom().equals(newPos)) {
                    System.out.println("Yes it exists "+ e.name);
                    Position afterJump = e.jump(newPos);
                    System.out.println("New pos  for the player" + e.to);
                    if (!afterJump.equals(newPos)) {
                        newPos = afterJump;
                        jumped = true;
                        break;
                    }
                }
            }
        } while (jumped);




        player.setPosition(newPos);

        // handle killing
        if(killingStrategy != null)
            killingStrategy.handleKill(player, this);

        updateBoard();

        if(player.hasFinished(this))
            System.out.println(player.getName() + " has finished the game!");
    }



    public List<Player> getPlayers() {
        return players;
    }
    public void setKillingStrategy(KillingStrategy killingStrategy) {
        this.killingStrategy = killingStrategy;
    }}
