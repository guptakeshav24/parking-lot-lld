package parkingspots;
import vehicle.Vehicle;

import java.util.UUID;

public abstract class ParkingSpot {
    protected boolean isEmpty;

    protected Vehicle vehicle;
    protected String slotId;

    protected SpotType spotType;

    public ParkingSpot(SpotType spotType) {
        slotId = UUID.randomUUID().toString();
        this.isEmpty = true;
        this.spotType = spotType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.isEmpty = false;
        this.vehicle = vehicle;
        System.out.println(vehicle.getId() + " is " + vehicle.getVehicleType() + " is parked in slot " + slotId + " of type " + spotType);
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }
}
