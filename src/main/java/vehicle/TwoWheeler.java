package vehicle;

import java.util.UUID;

public class TwoWheeler extends Vehicle {
    private String id;

    public TwoWheeler() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.TWO;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
