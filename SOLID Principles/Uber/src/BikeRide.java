class BikeRide extends  Ride{


    BikeRide(String rideId, String customerName  ,  String pickupLocation , String dropLocation,int fare , int distance){
        super(rideId, customerName, pickupLocation, dropLocation,
                fare, distance, "Bike Ride", new BikeFareCalculator());
    }



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
//        System.out.println("Fare: $"+total);
//
//
//
//    }
}
