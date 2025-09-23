public class EntryGate {
    private int gateNumber;
    private ParkingLot lot;

    public EntryGate(int gateNumber, ParkingLot lot) {
        this.gateNumber = gateNumber;
        this.lot = lot;
    }

    public Ticket createTicket(Vehicle vehicle) {
        ParkingSpot spot = lot.getAllocationStrategy().findSpot(vehicle, this, lot);
        if (spot == null) { System.out.println("No available spot!"); return null; }
        return new Ticket(vehicle, spot, vehicle.wantsCharging);
    }


    public int getGateNumber() {
        return gateNumber;
    }
}
