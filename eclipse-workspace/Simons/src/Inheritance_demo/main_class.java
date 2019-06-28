package Inheritance_demo;

public class main_class {
	
	public static void main(String[] args) {
		person p = new person("Andrew", "Gray");
		System.out.println(p.getName() + " has " + p.hairColor + " hair");
		p.greet();
		
		System.out.println("==================================");
		
		
		friend f = new friend("Tony", "Blond", "help you fix that flat tire");
		System.out.println(f.getName() + " has " + f.hairColor + " hair " );
		f.greet();
		f.doFavor();
	}

}
