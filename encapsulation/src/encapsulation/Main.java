package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		
		
		// Encapsulation = attributes of a class will be hidden or private,
		//				   can be accessed only through methods (getter & setters)
		//				   You should make attributes private if you don't have a reason to make them public
		
		Car car = new Car("chevy","camaro", 2021);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		
		car.setYear(2024);
		
		System.out.println(car.getYear());

	}

}
