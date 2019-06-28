package ThisDemo;

public class Thing {
	private int x = 9;
	public int y = 99;
	public Thing() {
	}
	
	public Thing(int y) {
		this.y = y;
	}
	
	
	public void doStuff(int x) {
		x++;
		System.out.println("This -> " + x + "is the value of the variable incremented using method argument");
		this.x = x++;
		System.out.println("This -> " + x + "is the  is the value of the member variable incrementing.");
	}

}
