
public class Driver extends User {
    private Vehicle vehicle;

    // No-argument constructor
    public Driver() {
    }

    // Constructor that takes a Vehicle object
    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // Implement the drive method to delegate to the vehicle's drive method
    public void drive() {
        if (vehicle != null) {
            vehicle.drive();
        } else {
            System.out.println("No vehicle assigned to driver");
        }
    }

    // Getter for vehicle
    public Vehicle getVehicle() {
        return vehicle;
    }

    // Setter for vehicle
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}