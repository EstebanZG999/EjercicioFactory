public class VehicleFactory {
    public static IVehicle getVehicle(String type) {
        switch(type) {
            case "Car":
            return new Car();
          case "Bike":
            return new Scooter();
          case "Scooter":
            return new Truck();
          default:
            throw new IllegalArgumentException("Invalid vehicle type");

        }
    }
}
