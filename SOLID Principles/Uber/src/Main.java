public class Main {
    public static void main(String[] args) {
        // Bike Ride
        Ride bikeRide = new BikeRide("RIDE001", "Alice", "Downtown", "Airport", 5, 10);
        bikeRide.calculateFare();
        RidePrinter.print(bikeRide);


        // Car Ride
        Ride carRide = new CarRide("RIDE002", "Bob", "City Center", "Mall", 10, 20, true);
        carRide.calculateFare();
//        carRide.displayRideDetails();
        RidePrinter.print(carRide);


    }
}