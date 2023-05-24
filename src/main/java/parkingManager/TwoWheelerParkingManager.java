package parkingManager;

import parkingspots.ParkingSpot;
import parkingspots.TwoWheelerParkingSpot;
import parkingstrategy.ParkingStrategy;
import parkingstrategy.SequentialParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingManager extends ParkingManager {
    ParkingStrategy parkingStrategy;
    List<ParkingSpot> parkingSpotList;

    public TwoWheelerParkingManager() {
        this.parkingSpotList = new ArrayList<>();
        this.parkingStrategy = new SequentialParkingStrategy();
    }

    @Override
    public ParkingSpot findParkingSpot() {
        return parkingStrategy.findParkingSpot(parkingSpotList);
    }

    @Override
    public void addParkingSpot() {
        this.parkingSpotList.add(new TwoWheelerParkingSpot());
    }
}
