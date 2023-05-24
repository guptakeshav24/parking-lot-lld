package tester;

import terminal.EntryTerminal1;
import terminal.Terminal;
import vehicle.FourWheeler;
import vehicle.TwoWheeler;
import vehicle.VehicleType;
import vehicle.Vehicle;

public class ParkingApp {
    public static void main(String[] args) {
        ParkingService parkingService = new ParkingService();
        parkingService.addParkingSlots();
        Vehicle two = new FourWheeler();
        Terminal terminal = new EntryTerminal1();
        parkingService.parkVehicle(two, terminal);
    }
}
