public abstract  class Entity {
    protected String name;
    protected Position from;
    protected Position to;

    public Entity(String name, Position from, Position to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public Position getFrom() {
        return from;
    }

    public Position getTo() {
        return to;
    }

    public abstract Position jump(Position position);

}
