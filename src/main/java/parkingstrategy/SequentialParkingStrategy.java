package parkingstrategy;

import parkingspots.ParkingSpot;

import java.util.List;

public class SequentialParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        for(ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.isEmpty()) {
                return parkingSpot;
            }
        }
        throw new RuntimeException("no empty parking");
    }
}
