public class Main {
    public static void main(String[] args) {

        Vehicle myCar = VehicleFactory.createVehicle("car");
        myCar.drive();

        Vehicle myBike = VehicleFactory.createVehicle("bike");
        myBike.drive();

    }

}