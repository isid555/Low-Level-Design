public class BikeFareCalculator implements FareCalculator {
    @Override
    public int calculateFare(int baseFare, int distance) {
        return baseFare + (2*distance);
    }
}
