package Polymorphism_3;

public class Lion extends Animal{
	
	private static final String F_food = "Meat";
	
	@Override
	public String getName() {
		return "Larry the Lion";
	}
	
	
	@Override
	public String eats() {
		return F_food;
	}
	
	@Override
	public void eats(String food) {
		if (F_food.equals(food)) {
			System.out.println("Roar, yum, I like " + food);
		} else {
			System.out.println("Roar, I will have the zookeeper today");
		}
	}

}
