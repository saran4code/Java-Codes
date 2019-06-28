package getClass2;

public class method_main {
	public static void main(String[] saran) {
		
		Animal_Class a;
		System.out.println("===========Investigation of an Animal============");
		a = new Animal_Class();
		showYourClass(a);
		
		System.out.println("===========Investigation of Dog============");
		a = new Dog_Class();
		showYourClass(a);
		
		System.out.println("===========Investigation of Lion============");
		a = new Lion_Class();
		showYourClass(a);
	}
	
	
	private static void showYourClass(Animal_Class a) {
		Class theClass = a.getClass();
		String className = theClass.getName();
		Class parentClass = theClass.getSuperclass();
		String parentClassName = parentClass.getName();
		System.out.println("Class Name is " + className);
		System.out.println("Parent Class name is " + parentClassName);
		
		
		if (a instanceof Animal_Class) {
			System.out.println("It is an Animal");
		}
		
		if (a instanceof Lion_Class) {
			System.out.println("It is a Lion");
		}
		if (a instanceof Dog_Class) {
			System.out.println("It is a Dog");
		}
		
		System.out.println("This animal says " + a.whatDoYouSay());
	}

}
