package m8l6;

public class Sub extends Base{
	public String x = "Sub.x value";
	private String y = "Sub.y value";
	public int z = 100;
	
	
	public void showFeatures(String x) {
		System.out.println("argument x is " + x);
		System.out.println("this.x is " + this.x);
		System.out.println("super.x is " + super.x);
		System.out.println();
		
		System.out.println("this.z is "+ this.z);
		System.out.println("super.z is " + super.z);
		System.out.println();
		
		
		System.out.println("y is " + y);
		System.out.println("this.y is " + this.y);
//		System.out.println("super.y is " + super.y);
		
	}
	
	public Sub() {}
	
	public Sub(String x ) {
//		this("Default from Sub(String" , x);
//		this(defaultString(), x);  --> this(this.defaultString(), x) will not work. Can call an uninitialized class)
		this(Sub.defaultString(), x);
		System.out.println("Back in sub(String");
	}
	
	public Sub(String bx, String x) {
		super(bx);
		System.out.println("Back in Sub(String, String)");
		this.x = x;
	}
	
	public static String defaultString() {
		return "A default String";
	}
	
	

}
