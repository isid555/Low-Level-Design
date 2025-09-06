public class CarFareCalculator implements  FareCalculator{

    private  boolean luxury;

    CarFareCalculator(boolean luxury){
        this.luxury = luxury;
    }

    @Override
    public int calculateFare(int baseFare, int distance) {
        int total = baseFare + 5 * distance;
        if (luxury) {
            total += 10;
        }
        return total;
    }
}
