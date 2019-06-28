package m8l62;

import animals.Animal;
import animals.Tiger;

public class M8L62 {
	
	public static void main(String[] args) {
		//Animal a = new Animal(4);
		Animal a = new Tiger();
	
		System.out.println("Animal " + a.getClass().getName() + " has " + a.getLegs() + " legs"
				//" and likes to eat " + a.likesToEat()
				
				);
	
	}

}
