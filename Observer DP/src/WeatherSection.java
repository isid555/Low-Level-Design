import java.util.ArrayList;
import java.util.List;

public class WeatherSection implements  Subject{

    private List<Observer> observers = new ArrayList<>();
    private int temperature;



    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }


    public  void setTemperature(int temp){
        this.temperature = temp;
        notifyObservers();
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(temperature);
        }
    }
}
