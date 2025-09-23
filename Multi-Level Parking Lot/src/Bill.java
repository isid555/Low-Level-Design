import java.time.LocalDateTime;

public class Bill {
    private static int idCounter = 1;

    private int billId;
    private Ticket ticket;
    private LocalDateTime exitTime;
    private double totalAmount;

    public Bill(Ticket ticket, double totalAmount) {
        this.billId = idCounter++;
        this.ticket = ticket;
        this.exitTime = LocalDateTime.now();
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Bill ID: " + billId +
                ", Ticket ID: " + ticket.getTicketId() +
                ", Vehicle: " + ticket.getVehicle().getVehicleNumber() +
                ", Exit Time: " + exitTime +
                ", Total: $" + totalAmount;
    }
}
