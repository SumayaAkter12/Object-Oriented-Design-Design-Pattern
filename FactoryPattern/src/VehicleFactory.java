public class VehicleFactory {
    static Vehicle createVehicle(String type){
        if(type == "car"){
            return new Car();
        }

        if(type == "bike"){
            return new Bike();
        }
        return null;
    }
}
