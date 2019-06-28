package getClass;



public class method_main {
	public static void main (String[] saran) {
		Animal a;
		
		System.out.println("Investigation of an Animal.........");
		a = new Animal();
		showYourClass(a);
		
		System.out.println("======================Investigating a Lion========================");
		a = new Lion_class();
		showYourClass(a);
		
		System.out.println("======================Investigating a Doggy========================");
		a = new Dog_class();
		showYourClass(a);
			
	}

	
private static void showYourClass(Animal a) {
	Class theClass = a.getClass();
	String className = theClass.getName();
	Class parentClass = theClass.getSuperclass();
	String parentClassName = parentClass.getName();
	System.out.println("Class name is " + className);
	System.out.println("Parent Class name is " + parentClassName);
	
	if (a instanceof Animal) {
		System.out.println("It is an Animal");
	}
	
	if (a instanceof Lion_class) {
		System.out.println("It is a Lion");
	}
	
	if (a instanceof Dog_class) {
		System.out.println("It is a dog");
		
	}
			
	System.out.println("This animal says " + a.whatDoYouSay());
	
		
	}


}
