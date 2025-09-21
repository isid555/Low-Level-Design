public abstract class Player {
     String name ;
     String color;
     Position position;
     boolean isStarted;

      StartingStrategy startingStrategy;
      EndingStrategy endingStrategy;

    public Player(String name, String color , StartingStrategy startStrat, EndingStrategy endStrat) {
        this.name = name;
        this.color = color;
        this.position = new Position(0, 0);
        this.isStarted = false;
        this.startingStrategy = startStrat;
        this.endingStrategy = endStrat;
    }

    public abstract void move(Position newPosition);


    public boolean tryStart(int diceRoll) {
        if (!isStarted && startingStrategy.canStart(this, diceRoll)) {
            isStarted = true;
            System.out.println(name + " has started the game!");
        }
        return isStarted;
    }

    public boolean hasFinished(Board board) {
        return endingStrategy.hasEnded(this, board);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setPosition(Position pos){
        this.position  = pos;
    }

}
