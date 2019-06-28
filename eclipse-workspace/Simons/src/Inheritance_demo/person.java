package Inheritance_demo;

public class person {
	
	private String name;
	public String hairColor;
	
	
	public String getName() {
		return name;
	}
	
	
	
	public person(String name, String hairColor) {
		this.name = name;
		this.hairColor = hairColor;
		
			
	}
	
	
	public void greet() {
		System.out.println("Hello, my name is " + getName());
	}

	

}
