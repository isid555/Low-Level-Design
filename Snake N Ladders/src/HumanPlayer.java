public class HumanPlayer extends Player {

    public HumanPlayer(String name, String color, StartingStrategy startStrat, EndingStrategy endStrat) {
        super(name, color, startStrat, endStrat);
    }

    @Override
    public void move(Position newPosition) {
        // Simply update the position
        setPosition(newPosition);
        System.out.println(getName() + " moves to " + newPosition);
    }
}
