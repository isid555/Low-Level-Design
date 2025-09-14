public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird(new FlyHigh() , new VisionHunt());
        eagle.perfornmmFly();
        eagle.performHunt();

        Bird penguin = new Bird(new NoFly(), new WaterHunt());
        penguin.perfornmmFly();   // Cannot fly
        penguin.performHunt();

        // Change strategy at runtime
        penguin.setFlyBehavior(new FlyHigh());
        penguin.perfornmmFly();  // Flying high in the sky
    }
}