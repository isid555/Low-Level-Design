public class RidePrinter {
    static void print(Ride ride) {
        System.out.println("Ride ID: " + ride.rideId);
        System.out.println("Customer: " + ride.customerName);
        System.out.println("Type: " + ride.type);
        System.out.println("Pickup: " + ride.pickupLocation);
        System.out.println("Drop: " + ride.dropLocation);
        System.out.println("Distance: " + ride.distance + " km");
        if (ride instanceof CarRide) {
            System.out.println("Luxury: " + (((CarRide) ride).luxury ? "Yes" : "No"));
        }
        System.out.println("Fare: $" + ride.total);
    }
}
