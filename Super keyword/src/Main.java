
public class Main {

	public static void main(String[] args) {
		
		
		// super = keyword refers to the superclass (paren) of an object
		
		Hero hero1 = new Hero("Batman",42,"$$$");
		Hero hero2 = new Hero("Superman",50,"everything");
		
		//System.out.println(hero1.name);
		//System.out.println(hero1.age);
		//System.out.println(hero1.power);
		
		
		System.out.println(hero2.toString());
	}

}
