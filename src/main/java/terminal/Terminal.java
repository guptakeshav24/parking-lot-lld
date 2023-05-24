package terminal;

import parkingspots.ParkingSpot;
import ticket.Ticket;
import vehicle.Vehicle;

public interface Terminal {
    Ticket issueTicket(Vehicle vehicle, ParkingSpot parkingSpot);
}