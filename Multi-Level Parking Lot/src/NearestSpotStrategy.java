import java.util.List;

public class NearestSpotStrategy implements SlotAllocationStrategy {
    @Override
    public ParkingSpot findSpot(Vehicle vehicle, EntryGate gate, ParkingLot lot) {
        List<ParkingSpot> spots = lot.getSpots();
        ParkingSpot nearest = null;
        int minDistance = Integer.MAX_VALUE;

        for (ParkingSpot spot : spots) {
            if (vehicle.wantsCharging && !spot.hasCharging()) continue;
            if (spot.canFitVehicle(vehicle)) {
                int distance = calculateDistance(gate, spot);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearest = spot;
                }
            }
        }

        if (nearest != null) nearest.assignVehicle(vehicle);
        return nearest;
    }

    private int calculateDistance(EntryGate gate, ParkingSpot spot) {
        // Weighted distance (floor * 10 + row + column)
        return Math.abs(spot.getFloorNumber()) * 10 + spot.getFloorNumber() + spot.getSpotId();
    }
}
