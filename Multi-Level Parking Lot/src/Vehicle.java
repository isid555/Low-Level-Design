public class Vehicle {

    private String vehicleNumber;
    public VehicleType type;
    public boolean wantsCharging;

    public Vehicle(String vehicleNumber, VehicleType type) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public VehicleType getType() { return type; }
    public void NeedCharging(){
        this.wantsCharging = true;
    }
}
