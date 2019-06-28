package structure;

public class ClassStructure {
	public float getTemparature() {
		return temparature;
	}
	
	public static int getABigNumber() {
		return A_Big_Number;
	}
	
	private static int A_Big_Number = 123456;  // The value of this variable is set here. As it is a static private method, it works well in this class. 
	private float temparature;
	
	public ClassStructure() {
		temparature = 98.4F;					// This is a constructor for the class ClassStructure.  As it does not have a return type
	}											// such as int or void and can be understood is not a method. It also has the same name as the class. 
	
	public void makeOne() {
		AConcept ac = new AConcept();			// Class available in the same package. Can be public, final, and abstract. Cannot be private or protected. Private is for that class only. 
	}
	
	public structure_sub.SecretiveClass sc;		// Calling out another class from a different package. Should be only public. Private or Protected will simply not work. 
		
	
	class AnInnerClass {						// This is an inner class
		public void doStuff() {
			
		}
	}

}
