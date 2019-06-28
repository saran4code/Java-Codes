package fieldAccess;

public class StringLength {
	
	public static int addUpNumbers(int ... values) {
		int rv =0;
		for (int v : values) {
			rv += v;
		}
		return rv;
		
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("> " + addUpNumbers(new int[] {1,2,3}));
		System.out.println("> " + addUpNumbers(new int[] {1,2,3,4,5,6,7,8,9}));
		System.out.println("> " + addUpNumbers(new int[] {}));
		
		
		System.out.println("> " + addUpNumbers(1,2,3));
		System.out.println("> " + addUpNumbers(1,2,3,4,5,6,7,8,9));
		System.out.println("> " + addUpNumbers());
	}

}
