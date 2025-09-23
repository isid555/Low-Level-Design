public class ExitGate {
    private int gateNumber;
    private ParkingLot lot;

    public ExitGate(int gateNumber, ParkingLot lot) {
        this.gateNumber = gateNumber;
        this.lot = lot;
    }

    public Bill processExit(Ticket ticket, ParkingSpot spot) {
        spot.removeVehicle();
        double total = lot.getPricingStrategy().calculatePrice(ticket);
        return new Bill(ticket, total);
    }

    public int getGateNumber() {
        return gateNumber;
    }
}
