package Polymorphism_2;

public class Lion extends Animal{
	private static final String f_food = "Meat";
	
	@Override
	public String getName() {
		return "Larry the Lion";
	}
	
	@Override
	public String eats() {
		return f_food;
	}
	
	@Override
	public void eats(String food ) {
		if (f_food.equals(food)) {
			System.out.println("Roar, yum, I like " + food + "!");
		} else {
			System.out.println("Roar!... Eat the zookeeper");
		}
	}

}
