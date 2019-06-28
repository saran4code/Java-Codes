package ThisDemo;

public class method_main {
	public static void main(String[] args) {
		Thing t = new Thing();
		Thing o = new Thing(100);
		t.doStuff(9);
		System.out.println(t.y);
		System.out.println(o.y);
		
		newBase b = new newBase(9,10);
		System.out.println("x is : " + b.x + "y is : " + b.y);
		
		
		
		Child c = new Child();
		System.out.println(c.sayHello());
	}

	
	}


