package Inheritance_demo_two;

import Inheritance_demo.person;

public class friend_two extends person {
	
	private String favor;
	
	public friend_two(String name, String hairColor, String favor) {
		super(name, hairColor);
		this.favor = favor;
	}
		
	public void doFavor() {
		System.out.println("Hey " + getName() +", my friend, let me " + favor + "!");
	}
	
	@Override
	public void greet() {
		System.out.println(getName() + " jibuna kothaba magane, surega oreno nindhotha");
		
	}
	
	
}
