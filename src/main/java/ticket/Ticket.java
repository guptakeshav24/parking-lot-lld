package ticket;

import parkingspots.ParkingSpot;
import vehicle.Vehicle;

public class Ticket {
    private String ticketId;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }
}
