public class TVDisplay implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("TV display temp is" + temperature);
    }
}
