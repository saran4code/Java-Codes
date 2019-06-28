package Inheritance_demo_two;


import Inheritance_demo.friend;
import Inheritance_demo.person;

public class main_class_two {
	
	public static void main(String[] args) {
		person p = new person("Andrew", "Gray");
		System.out.println(p.getName() + " has " + p.hairColor + " hair");
		p.greet();
		
		System.out.println("==================================");
		
		
		friend_two f = new friend_two("Tony", "Blond", "help you fix that flat tire");
		System.out.println(f.getName() + " has " + f.hairColor + " hair " );
		f.greet();
		f.doFavor();
	}

}
