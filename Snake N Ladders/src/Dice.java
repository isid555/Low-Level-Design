public class Dice {


    private static  Dice instance;
    private Dice(){}


    public static Dice getInstance(){
        if(instance == null){
            instance = new Dice();
        }
        return instance;
    }


    //must be singleton , only 1 instance
    public  int roll(){
        return (int) (Math.random() * 6) + 1;
    }
}
