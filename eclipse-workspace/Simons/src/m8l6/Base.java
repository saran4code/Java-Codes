package m8l6;

public class Base {
	public String x = "Base.x value";
	private String y = "Base.y value";
	public String z = "Base.z value";
	
	public String getGreeting() {
		return "Hello";
	}
	
	public Base() {}
	
	public Base(String x) {
		super();
		System.out.println("Back in Base(String)");
		this.x = x;
	}
	

}
