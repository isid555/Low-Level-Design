public class ParkingSpot {
    private int spotId;
    private int floorNumber;
    private VehicleType size;
    private boolean hasCharging;
    private boolean isAvailable = true;
    private Vehicle currentVehicle;


    public ParkingSpot(int spotId, int floor, VehicleType size, boolean hasCharging) {
        this.spotId = spotId;
        this.floorNumber = floor;
        this.size = size;
        this.hasCharging = hasCharging;
    }


    public boolean isAvailable() { return isAvailable; }

    public boolean canFitVehicle(Vehicle vehicle) {
        return isAvailable && (vehicle.getType() == size || (vehicle.getType() == VehicleType.BIKE && size == VehicleType.CAR));
    }

    public void assignVehicle(Vehicle vehicle) {
        this.currentVehicle = vehicle;
        this.isAvailable = false;
    }

    public void removeVehicle() {
        this.currentVehicle = null;
        this.isAvailable = true;
    }

    public int getFloorNumber() { return floorNumber; }
    public boolean hasCharging() { return hasCharging; }
    public int getSpotId() { return spotId; }

}
