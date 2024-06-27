
public class TaxiService {

    public Ride process(Driver driver, Passenger[] passengers) {
        Ride ride = new Ride();
        ride.setDriver(driver);
        ride.setPassengers(passengers);
        return ride;
    }

    public static void main(String[] args) {
        // Example usage
        Vehicle vehicle = new Vehicle();
        Driver driver = new Driver(vehicle);
        Passenger passenger1 = new Passenger();
        passenger1.setName("John Doe");
        passenger1.setEmail("john@example.com");

        Passenger passenger2 = new Passenger();
        passenger2.setName("Jane Smith");
        passenger2.setEmail("jane@example.com");

        Passenger[] passengers = {passenger1, passenger2};

        TaxiService service = new TaxiService();
        Ride ride = service.process(driver, passengers);

        System.out.println("Driver: " + ride.getDriver().getName());
        for (Passenger p : ride.getPassengers()) {
            System.out.println("Passenger: " + p.getName() + ", Email: " + p.getEmail());
             }
    }
 }