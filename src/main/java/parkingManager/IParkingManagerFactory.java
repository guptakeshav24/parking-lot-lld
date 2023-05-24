package parkingManager;

import vehicle.VehicleType;

public abstract interface IParkingManagerFactory {
    public abstract ParkingManager getParkingManager(VehicleType vehicleType);
}
