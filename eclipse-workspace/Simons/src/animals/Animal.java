package animals;

public abstract class Animal {
	private int legs;
	
	public Animal(int legs) {
		System.out.println("Initializer for Animal");
		this.legs = legs;
	}
	
	public int getLegs() {
		return this.legs;
	}
	
 public abstract String likesToEat();

}
