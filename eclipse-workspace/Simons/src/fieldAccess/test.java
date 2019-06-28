package fieldAccess;
import java.util.Date;


public class test {
	
	public static void main(String[] args) {
//	System.out.println("This is a fucking " + 1 + 4);
//		short b = 99;
//		byte s = 10;
//		short S = b + s;
//		System.out.println(S);
//		
//	int x = 99;
//		System.out.println(x);
//		int y = ++x;
//		
//		System.out.println(x);
//		System.out.println(y);
//		
//		
//	int [] xa = {0, 1, 3, 5, 7, 9, 13, 56, 78};
//	int x = 2;
//	for (int i : xa) {
//	System.out.println(i);
//	}
//	System.out.println("now adding 100");
//	xa[x++] += 100;
//	for (int i : xa) {
//		System.out.println(i);
//		}
//	System.out.println(x);
//	
//	System.out.println("Now assignment");
//	int o = 2;
//	for (int i : xa) {
//		System.out.println(i);
//		}	
//	xa[o++] = xa[o++] + 100;
//	for (int i : xa) {
//		System.out.println(i);
//		}
//			
//			
//			
//		for ( int i : xa) {
//			System.out.println(i);
//		}
//		xa[1]++;
//		System.out.println("Now we are using incremental on one of the element");
//		
//		for (int i : xa) {
//			System.out.println(i);
//			}
//			
//
//		Integer i1 = new Integer (12345);
//		Integer i2 = new Integer (12345);
//		System.out.println(i1==i2);
//		
//		Integer i3 = 1;
//		Integer i4 = 1;
//		System.out.println(i3==i4);
//		
//		short x = 100;
//		short y = 10;
//		x += y;
//		System.out.println(x);
//		
//		
//		int x = 128;
//		byte b = (byte) x;
//		System.out.println(b);
//		
//		Integer y = 3;
//		String o = y.toString();
//		System.out.println(o);
//		
//		
//		String s = null;
//		if (s instanceof String) {
//			System.out.println("True");
//		}
//		else
//			System.out.println("false");
//		
////		int x = 45;
////		System.out.println((x + 95));
//		
//		Date d1 = new Date();
//		Date d2 = new Date();
//		Date d3 = d2;
//		
//		if (d1.equals(d2)) {
//			System.out.println("d1 and d2 are " + d1.equals(d2));
//		}
//		
//		if (d2 == d3) {
//			System.out.println("d2 and d3 are the same");
//		}
//		
//		StringBuilder s1 = new StringBuilder("Saran");
//		StringBuilder s2 = new StringBuilder("Saran");
//		StringBuilder s3 = s1;
//		
//		System.out.println("s1 and s2 are "+ s1.equals(s2));  // StringBuilder does not parse the .equals() functionality. 
//		System.out.println("s1 and s3 are "+ s1.equals(s3));
//		
//		StringBuilder[] s1 = new StringBuilder[10];
//		for (int i =0; i < s1.length; i++ ) {
//			s1[i] = new StringBuilder("Hello "+ i);
//		}
//		for ( StringBuilder i : s1) {
//			System.out.println(i);
//		}
		
		int[] saran = {3,5,6,7,8,};
		int[] sarannew = new int[50];
		
		System.arraycopy(saran, 0, sarannew, 0, saran.length);
		for ( int i = 0; i<sarannew.length ; i++) {
			System.out.println(sarannew[i]);
		}
		System.out.println(saran[3]);
		
		
		
		
		
		
			
		
			
		
				
	
  }

}
