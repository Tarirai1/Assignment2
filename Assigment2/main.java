public class main {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        System.out.println("Battery type of the car: " + car.batteryType());

        ElectricBike bike = new ElectricBike();
        System.out.println("Battery type of the bike: " + bike.batteryType());
    }
}

class ElectricCar {
    public String batteryType() {
        return "Lithium-ion";
    }
}

class ElectricBike {
    public String batteryType() {
        return "Lithium-polymer";
    }
}
