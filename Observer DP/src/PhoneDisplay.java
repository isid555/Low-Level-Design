public class PhoneDisplay implements  Observer{
    @Override
    public void update(int temperature) {
        System.out.println("Phone display temp is" + temperature);
    }
}
