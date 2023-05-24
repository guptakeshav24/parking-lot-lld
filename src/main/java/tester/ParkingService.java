package tester;

import parkingManager.ParkingManager;
import parkingManager.ParkingManagerFactory;
import parkingspots.ParkingSpot;
import terminal.Terminal;
import vehicle.Vehicle;

public class ParkingService {
    ParkingManagerFactory parkingManagerFactory;

    public ParkingService() {
        this.parkingManagerFactory = new ParkingManagerFactory();
    }

    public void addParkingFloor() {

    }

    public void addParkingSlots() {
        parkingManagerFactory.getFourWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getFourWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getFourWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getFourWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getFourWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getFourWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getFourWheelerParkingManager().addParkingSpot();

        parkingManagerFactory.getTwoWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getTwoWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getTwoWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getTwoWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getTwoWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getTwoWheelerParkingManager().addParkingSpot();
        parkingManagerFactory.getTwoWheelerParkingManager().addParkingSpot();

    }

    public void parkVehicle(Vehicle vehicle, Terminal terminal) {
        ParkingManager parkingManager = parkingManagerFactory.getParkingManager(vehicle.getVehicleType());
        ParkingSpot parkingSpot = parkingManager.findParkingSpot();
        terminal.issueTicket(vehicle, parkingSpot);
        parkingSpot.parkVehicle(vehicle);
    }
}