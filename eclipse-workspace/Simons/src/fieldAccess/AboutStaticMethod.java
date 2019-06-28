package fieldAccess;

public class AboutStaticMethod {
	private int x;
	private static int y;
	
	public static void main(String[] args) {
		y=99;
		System.out.println("y is "+ y);
		AboutStaticMethod object1 = new AboutStaticMethod();
		AboutStaticMethod object2 = new AboutStaticMethod();
		System.out.println("object1.y is " + object1.y);
		System.out.println("object2.y is " + object2.y);
		
		object1.x = 100;
		object2.x = 200;
		System.out.println("object1.x is " + object1.x);
		System.out.println("object2.x is " + object2.x);
		
		showY();
		object1.showX();
		object2.showX();
		//showX();  // --> Calling out only the method is a static reference. That will not work on a non-static method.
		
	}
		
		static void showY() {
			System.out.println("y is " +y);
			// The following line resolves as "y" and is not an instance variable. Can be called using the reference from class (static reference), i.e. <classname>.y
			System.out.println("AboutStaticMethod.y is " + AboutStaticMethod.y ); 
//			System.out.println("this.y is " + this.y); 							  // There is no "this" for static variable. 
			
			/*
			 * Calling a non-static variable from static method won't work. The compiler will not compile only "x"
			 * The only way to call out the value for "x" is through instantiation. 
			 * We cannot instantiate an object inside a method. It is done in the main() method.
			 * The only way to call out x now is through "this.x". That will not work because we don't have "this"
			 * in this context. The following will not work. 
			 */
			
//          System.out.println("x is " + x);           
//			System.out.println("this.x is " + this.x);
				
	}
	
		void showX() {
			System.out.println("x is " + x);				// Calling out non-static variable works just fine from non-static method.
//			System.out.println("AboutStaticMethod.x is " + AboutStaticMethod.x ); --> Static reference will not work on a non-static variable.
			System.out.println("this.x is " + this.x);  // "this" keyword works on non-static variable. 
			
//			System.out.println("y is " +y);
//			System.out.println("AboutStaticMethod.y is " + AboutStaticMethod.y );
			System.out.println("this.y is " + this.y); 
			// A static variable works with "this" inside a non-static method. This proves "static" in method supersedes "static" field.
			// Also, the "this" keyword is in context in non-static method, and "this" knows y is a variable that it can call out. 
//			
//			
		}
		
		static void showX(AboutStaticMethod saran) {   // This static method takes the argument same as the enclosing class 
			System.out.println("object x is " + saran.x);  // --> We're referring x with the qualification of "saran" object, which is an object created using "AboutStaticMethod" class
			// Now, in the main method, I can run something like "showX(object1)" --> This would show me the value of X for object1. 
	}

}

