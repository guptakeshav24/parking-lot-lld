package terminal;

import parkingspots.ParkingSpot;
import ticket.Ticket;
import vehicle.Vehicle;

public interface EntryTerminal extends Terminal {

    public Ticket issueTicket(Vehicle vehicle, ParkingSpot parkingSpot);
}
