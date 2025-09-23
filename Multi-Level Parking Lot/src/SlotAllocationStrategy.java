public interface SlotAllocationStrategy {
    ParkingSpot findSpot(Vehicle vehicle, EntryGate gate, ParkingLot lot);
}
