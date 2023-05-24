package vehicle;

import java.util.UUID;

public class FourWheeler extends Vehicle {
    private String id;

    public FourWheeler() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.FOUR;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
