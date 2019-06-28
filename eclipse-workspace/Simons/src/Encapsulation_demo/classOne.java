package Encapsulation_demo;

public class classOne {
	
	static int x = 99;
	static final StringBuilder sb = new StringBuilder("Hello");
	
	public static void main(String[] args) {
		
		// for primitive variables, the value is copied to the method argument variable and the new value is set on the fly.
		// Once the method invocation is completed, garbage collection gets invoked and the value of the variable in the caller
		// in "classOne" remains unchanged
		addOne(x);	
		System.out.println(x);
		
		
		
		// For reference type variables - such as String Builder in this case, the pointer of the variable from the caller is directly referred by 
		// method argument variable. This means, any changes the method makes to the actual variable during the process of method invocation
		// actually changes the value of of the variable in the caller as well, as the method does not copy the value instead directly make changes
		// to the memory location it refers to. This is because we are calling the .append() function. 
		
		addString(sb);
			System.out.println(sb);
			
		// This is an exception. This "addStringNew" method is pointing a new reference "Good bye" defined in the method. This is not modifying the 
		// existing "sb" that is defined in the caller. It is pointing a new reference and the original value is untouched. 
			
		addStringNew(sb);
		System.out.println(sb);
		
}
	
static void addOne(int x) {
		x++;
		System.out.println("method invocation of x is " + x);
		
	}
	
static void addString(StringBuilder sb) {
		sb.append(" World!");
		System.out.println("method invocation of sb is " + sb);
	
		
}

static void addStringNew(StringBuilder sb) {
	 sb = new StringBuilder("good bye");
	 System.out.println("sb invoked now is " + sb);
	
}
		
	
	

}

