


import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		
	Scanner scanner = new Scanner(System.in);
		
	System.err.println("You are playing a game! Press q or Q to quit");
	String response = scanner.next();
		
	if(!response.equals("q") && !response.equals("Q")) {
		System.out.println("you are still playing the game");
		

	} else {
		System.out.println("You quit the game");

			
	}
		
	}

}
