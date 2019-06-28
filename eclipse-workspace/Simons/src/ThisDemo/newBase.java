package ThisDemo;

public class newBase extends newThing{
	int y;

	newBase(int y, int x) {  // newBase constructor
		super(x);			 // super(x) assigns the value to x in parent class and initialize it.
		this.y = y;			 // this.y assigns the value we specify in the object to y in the member variable and initialize it. 
		
	}
	newBase(int y){			// 
		this(y,100);
		
	}
		
	
	

}

