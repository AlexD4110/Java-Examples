
public class Main {

	public static void main(String[] args) {
		
		
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro", "Corvetter", "Tesla","BMW"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[3]);
		
		
		
		String[] trucks = new String[3];
		
		trucks[0] = "F150";
		trucks[1] = "Tundra";
		trucks[2] = "Ram";
		
		for(int i = 0; i < trucks.length; i++) {
			System.out.println(trucks[i]);
		}
	}

}
