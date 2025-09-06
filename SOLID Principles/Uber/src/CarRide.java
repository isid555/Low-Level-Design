class CarRide extends  Ride {
    boolean luxury;

    CarRide(String rideId, String customerName  ,  String pickupLocation , String dropLocation,int fare , int distance,boolean luxury){
        super(rideId, customerName, pickupLocation, dropLocation,
                fare, distance, "Car Ride", new CarFareCalculator(luxury));

        this.luxury = luxury;
    }

//    @Override
//    void calculateFare() {
//        this.total = fare + (5*distance);
//        if(luxury){
//            this.total += 10;
//        }
//    }

//
//    @Override
//    void displayRideDetails() {
//
//        System.out.println("Ride ID: "+rideId);
//        System.out.println("Customer: "+customerName);
//        System.out.println("Type: "+type);
//        System.out.println("Pickup: "+pickupLocation);
//        System.out.println("Drop: "+dropLocation);
//        System.out.println("Distance: "+distance+" km");
//        System.out.println("Luxury: "+(luxury?"Yes":"No"));
//        System.out.println("Fare: $"+total);
//
//    }
}
