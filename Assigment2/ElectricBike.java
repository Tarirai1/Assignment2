public class ElectricBike extends ElectricVehicle {
    @Override
    public String batteryType() {
        return "Lithium-polymer";
    }
}

class ElectricVehicle {
}
