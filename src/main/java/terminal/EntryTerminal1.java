package terminal;

import parkingManager.IParkingManagerFactory;
import parkingManager.ParkingManager;
import parkingManager.ParkingManagerFactory;
import parkingspots.ParkingSpot;
import ticket.Ticket;
import vehicle.*;

public class EntryTerminal1 implements EntryTerminal {

    ParkingManager parkingManager;

    @Override
    public Ticket issueTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        if (parkingSpot != null) {
            return new Ticket(parkingSpot, vehicle);
        }
        return null;
    }
}
