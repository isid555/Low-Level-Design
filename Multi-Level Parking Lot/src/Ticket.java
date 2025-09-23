import java.time.LocalDateTime;

public class Ticket {
    private static int idCounter = 1;

    private int ticketId;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private int floorNumber;
    private int spotId;
    private boolean chargingUsed;

    public Ticket(Vehicle vehicle, ParkingSpot spot, boolean chargingUsed) {
        this.ticketId = idCounter++;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
        this.floorNumber = spot.getFloorNumber();
        this.spotId = spot.getSpotId();
        this.chargingUsed = chargingUsed && spot.hasCharging();
    }


    public int getTicketId() { return ticketId; }
    public Vehicle getVehicle() { return vehicle; }
    public LocalDateTime getEntryTime() { return entryTime; }
    public int getSpotId() { return spotId; }
    public boolean isChargingUsed() { return chargingUsed; }
}
