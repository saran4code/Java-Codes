package Polymorphism_2;

public class Dog extends Animal {
	@Override
	public String getName() {
		return "Dougal the Dog";
	}
	
	@Override
	public String eats() {
		return "Kibbles";
	}
	
	@Override
	public void eats(String food) {
			System.out.println("Woof, wag! great, " + food + "! I eat everything anyway, so i like this too!");
	}

}
