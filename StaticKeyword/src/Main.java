
public class Main {

	public static void main(String[] args) {
		
		
		// static = modifier. A single copy of a variable/mehtod is created and shared.
		// 			The class "owns" the static member
		
		Friend friend1 = new Friend("Aang");
		
		Friend friend2 = new Friend("Katara");
		
		Friend friend3 = new Friend("Sokka");
		
		Friend friend4 = new Friend("Toph");
		
		//System.out.println(Friend.numberOfFriends);
		
		Friend.displayFriends();
		
	

	}
	
}
