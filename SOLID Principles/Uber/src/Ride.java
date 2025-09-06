abstract class Ride {
    String rideId, customerName, pickupLocation, dropLocation, type;
    int baseFare, distance, total;
    FareCalculator fareCalculator;


    Ride(String rideId, String customerName, String pickupLocation, String dropLocation,
         int baseFare, int distance, String type, FareCalculator fareCalculator) {
        this.rideId = rideId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.baseFare = baseFare;
        this.distance = distance;
        this.type = type;
        this.fareCalculator = fareCalculator;
    }



//    abstract  void calculateFare();
//    abstract  void displayRideDetails();

    /*
    * SRP -> 2 resps
    * */

    void calculateFare(){
        this.total = fareCalculator.calculateFare(baseFare  , distance);
    }



}
