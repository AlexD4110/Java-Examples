
public class MemoryExample {

    public static void main(String[] args) {
        
        // Stack allocation for primitive types and reference variables
        int x = 10;  // 'x' is stored in the stack
        MemoryExample example = new MemoryExample();  // 'example' is a reference variable stored in the stack
        
        // The actual object is stored in the heap
        example.createObject();
        
    }
    
    public void createObject() {
        Car myCar = new Car("Green", "Ford Mustang", 2021);  // 'myCar' reference is in the stack, 'Car' object is in the heap
        myCar.displayDetails();
    }
    
}
 
class Car {
    String color;
    String model;
    int year;

    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
    }
}
