import java.util.*;

public class ParkingLot {
    private List<ParkingSpot> spots = new ArrayList<>();
    private List<EntryGate> entryGates = new ArrayList<>();
    private List<ExitGate> exitGates = new ArrayList<>();
    private PricingStrategy pricingStrategy;
    private SlotAllocationStrategy allocationStrategy;

    // Builder-style methods
    public ParkingLot setPricingStrategy(PricingStrategy strategy) {
        this.pricingStrategy = strategy;
        return this;
    }

    public ParkingLot setSlotAllocationStrategy(SlotAllocationStrategy strategy) {
        this.allocationStrategy = strategy;
        return this;
    }

    public ParkingLot addSpot(ParkingSpot spot) {
        spots.add(spot);
        return this;
    }

    public ParkingLot addEntryGate(int gateNumber) {
        entryGates.add(new EntryGate(gateNumber, this));
        return this;
    }

    public ParkingLot addExitGate(int gateNumber) {
        exitGates.add(new ExitGate(gateNumber, this));
        return this;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public SlotAllocationStrategy getAllocationStrategy() {
        return allocationStrategy;
    }

    // Enter vehicle
    public Ticket enterVehicle(Vehicle vehicle, int entryGateNumber) {
        EntryGate gate = entryGates.stream()
                .filter(g -> g.getGateNumber() == entryGateNumber)
                .findFirst()
                .orElse(null);
        if (gate == null) {
            System.out.println("Entry gate not found!");
            return null;
        }
        return gate.createTicket(vehicle);
    }

    // Exit vehicle
    public Bill exitVehicle(Ticket ticket, int exitGateNumber) {
        ExitGate gate = exitGates.stream()
                .filter(g -> g.getGateNumber() == exitGateNumber)
                .findFirst()
                .orElse(null);
        if (gate == null) {
            System.out.println("Exit gate not found!");
            return null;
        }

        ParkingSpot spot = spots.stream()
                .filter(s -> s.getSpotId() == ticket.getSpotId())
                .findFirst()
                .orElse(null);
        if (spot == null) {
            System.out.println("Spot not found!");
            return null;
        }

        return gate.processExit(ticket, spot);
    }
}
