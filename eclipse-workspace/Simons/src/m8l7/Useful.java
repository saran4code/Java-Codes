package m8l7;

public interface Useful extends TestInterface{
	void beUseful();
	static Useful getOne(int digit) {     // This method defines which class to be implemented based on the amount that is entered. 
		if (digit > 10) {
			return new ExpensiveUseful();
			
		}
		else {
			return	new CheapUseful();
		}
	}
	
	default void beEssential() {  // Adding a concrete method with the default type prevents the code being broken on classes that has implemented this interface
		
	};
	
		

}
