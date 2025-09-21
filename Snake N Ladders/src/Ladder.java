public class Ladder extends  Entity{
    public Ladder( Position from, Position to) {
        super("Ladder", from, to);
    }

    public Position jump(Position current) {
        if(current.equals(from)){
            System.out.println("Climb ladder from " + from + " to " + to);
            return to;
        }
        return current;
    }
}
