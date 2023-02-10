public class VehicleFactory {
    public static IVehicle getVehicle(String type) {
        switch(type) {
            case "car":
            return new Car();
          case "bike":
            return new Scooter();
          case "Scooter":
            return new Truck();
          default:
            throw new IllegalArgumentException("Invalid vehicle type");

        }
    }
}
