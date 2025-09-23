public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Build the parking lot
        ParkingLot lot = new ParkingLot()
                .setPricingStrategy(new HourlyWithCharging(10, 5))
                .setSlotAllocationStrategy(new NearestSpotStrategy())
                .addSpot(new ParkingSpot(1, 0,  VehicleType.CAR, false))
                .addSpot(new ParkingSpot(2, 0,  VehicleType.BIKE, false))
                .addSpot(new ParkingSpot(3, 0,  VehicleType.CAR, false))
                .addSpot(new ParkingSpot(4, 0,  VehicleType.ELECTRIC_BIKE, true))
                .addEntryGate(1)
                .addExitGate(1);

        // Vehicles enter
        Vehicle bike = new Vehicle("BIKE123", VehicleType.BIKE);
        Ticket bikeTicket = lot.enterVehicle(bike, 1);
        System.out.println("Bike ticket: Spot " + bikeTicket.getSpotId());

        Vehicle car = new Vehicle("CAR456",VehicleType.CAR);
        Ticket carTicket = lot.enterVehicle(car, 1);
        System.out.println("Car ticket: Spot " + carTicket.getSpotId());




        // Simulate parking
        Thread.sleep(2000);

        // Vehicles exit
        Bill bikeBill = lot.exitVehicle(bikeTicket, 1);
        System.out.println(bikeBill);

        Bill carBill = lot.exitVehicle(carTicket, 1);
        System.out.println(carBill);


        // new vehicle entry
        Vehicle EBike =  new Vehicle("E78",VehicleType.ELECTRIC_BIKE);
        EBike.NeedCharging();
        Ticket yulu = lot.enterVehicle(EBike , 1);
        System.out.println("Yulu ticket: Spot " + yulu.getSpotId());

        Bill yuluBill = lot.exitVehicle(yulu , 1);
        System.out.println(yuluBill);
    }
}
