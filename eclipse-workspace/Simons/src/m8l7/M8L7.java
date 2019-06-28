package m8l7;

public class M8L7 {
	public static void main(String[] args) {
		
		Useful b = new ExpensiveUseful();      //This requires knowledge of the implementation. 
		b.doStaticIf();
		Useful u = Useful.getOne(19);   //  This method does not as our condition defined in "useful" interface will decide that.
		u.beUseful();
		
		
	
		
	}

}
