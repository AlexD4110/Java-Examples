public class Vehicle implements Driveable {

	private String year;
    private String make;
    private String model;
    private String plateNumber;
    private boolean inTransit;
	
    public Vehicle() {}
     //Getter for year
    public String getYear() {
        return year;
    }
     //Setter for year
    public void setYear(String year) {
        this.year = year;
    }
	 // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for plateNumber
    public String getPlateNumber() {
        return plateNumber;
    }

    // Setter for plateNumber
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    // Getter for inTransit
    public boolean isInTransit() {
        return inTransit;
    }

    // Setter for inTransit
    public void setInTransit(boolean inTransit) {
        this.inTransit = inTransit;
    }

    // Implement the drive method
    @Override
    public void drive() {
        this.inTransit = true;
    }

}