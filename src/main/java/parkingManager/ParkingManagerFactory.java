package parkingManager;

import vehicle.VehicleType;

public class ParkingManagerFactory implements IParkingManagerFactory {
    private ParkingManager twoWheelerParkingManager;
    private ParkingManager fourWheelerParkingManager;

    public ParkingManagerFactory() {
        this.fourWheelerParkingManager = new FourWheelerParkingManager();
        this.twoWheelerParkingManager = new TwoWheelerParkingManager();
    }

    @Override
    public ParkingManager getParkingManager(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO :
                return twoWheelerParkingManager;
            case FOUR:
                return fourWheelerParkingManager;
        }
        throw new RuntimeException("wrong vehicle type");
    }

    public ParkingManager getTwoWheelerParkingManager() {
        return twoWheelerParkingManager;
    }

    public ParkingManager getFourWheelerParkingManager() {
        return fourWheelerParkingManager;
    }
}
