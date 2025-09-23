import java.time.Duration;

public class HourlyWithCharging implements PricingStrategy {
    private double hourlyRate;
    private double chargingRate;

    public HourlyWithCharging(double hourlyRate, double chargingRate) {
        this.hourlyRate = hourlyRate;
        this.chargingRate = chargingRate;
    }

    @Override
    public double calculatePrice(Ticket ticket) {
        Duration duration = Duration.between(ticket.getEntryTime(), java.time.LocalDateTime.now());
        double hours = Math.max(1, Math.ceil(duration.toMinutes() / 60.0));
        double total = hours * hourlyRate;
        if (ticket.isChargingUsed()) total += chargingRate;
        return total;
    }
}
