public class Bird {
    FlyBehavior flyBehavior;
    HuntBehavior huntBehavior;

    public  Bird(FlyBehavior flyBehavior , HuntBehavior huntBehavior){
        this.flyBehavior = flyBehavior;
        this.huntBehavior = huntBehavior;
    }

    public  void perfornmmFly(){
        flyBehavior.fly();
    }
    public void performHunt(){
        huntBehavior.hunt();
    }

    public void setFlyBehavior(FlyBehavior fb) { this.flyBehavior = fb; }
    public void setHuntBehavior(HuntBehavior hb) { this.huntBehavior = hb; }

}
