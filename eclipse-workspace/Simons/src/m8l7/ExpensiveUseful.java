package m8l7;

public class ExpensiveUseful implements Useful{
	
	@Override
	public void beUseful() {
		System.out.println("Expensively spent. Keep it up.");
	}
	
	@Override
	public void doStaticIf() {
		System.out.println("You're beautiful"); 
	}

}
// The purpose of extending an interface within an interface to combinate the abstract methods defined in both the interface
// and the implementing class can leverage both the abstract methods by overriding them. 