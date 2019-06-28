package Inheritance_demo;

public class friend extends person {
	
	private String favor;
	
	public friend(String name, String hairColor, String favor) {
		super(name, hairColor);
		this.favor = favor;
	}
		
	public void doFavor() {
		System.out.println("Hey " + getName() +", my friend, let me " + favor + "!");
	}
	
	
}
