public class Main {
    public static void main(String[] args) {
        WeatherSection weatherSection = new WeatherSection();
        Observer phone = new PhoneDisplay();
        Observer TV = new TVDisplay();
        weatherSection.attach(phone);
        weatherSection.attach(TV);

        weatherSection.setTemperature(100);
        weatherSection.setTemperature(-98);

    }
}