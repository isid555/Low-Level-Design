public class Snake extends  Entity{
    public Snake( Position from, Position to ) {
        super("Snake", from, to );
    }

    @Override
    public Position jump(Position current) {
        if(current.equals(from)){
            System.out.println("Snake bites! Going down from " + from + " to " + to);
            return to;
        }
        return current;
    }
}
