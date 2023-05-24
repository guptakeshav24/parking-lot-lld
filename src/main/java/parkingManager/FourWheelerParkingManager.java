package parkingManager;

import parkingspots.FourWheelerParkingSpot;
import parkingspots.ParkingSpot;
import parkingspots.SpotType;
import parkingspots.TwoWheelerParkingSpot;
import parkingstrategy.ParkingStrategy;
import parkingstrategy.SequentialParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingManager extends ParkingManager {
    ParkingStrategy parkingStrategy;
    List<ParkingSpot> parkingSpotList;

    public FourWheelerParkingManager() {
        this.parkingStrategy = new SequentialParkingStrategy();
        parkingSpotList = new ArrayList<>();
    }

    @Override
    public ParkingSpot findParkingSpot() {
        return parkingStrategy.findParkingSpot(parkingSpotList);
    }

    @Override
    public void addParkingSpot() {
        this.parkingSpotList.add(new FourWheelerParkingSpot());
    }


}
