package Inheritance_demo_two;

public class person_two {
	
	private String name;
	public String hairColor;
	
	
	public String getName() {
		return name;
	}
	
	
	public person_two(String name, String hairColor) {
		this.name = name;
		this.hairColor = hairColor;			
	}
	
	
	public void greet() {
		System.out.println("Hello, my name is " + getName());
	}

	
}
