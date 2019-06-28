package stringbuildermethods;

public class StringBuilderMethods {
	public static void main(String[] args) {
//		boolean b = true;
//		StringBuilder sb = new StringBuilder("b is");
//		sb.append(b);
//		System.out.println("sb has "+ sb );
//		
//		StringBuilder sb1 = new StringBuilder("Hello");
//		StringBuilder sb2 = new StringBuilder("this is the world calling");
//		sb1.append(sb2, 11, 17);
//		System.out.println("sb1 has " + sb1);
//		
//		StringBuilder sb = new StringBuilder("This is not good");
//		sb.delete(7, 11);  // Leave the 7th element and delete until 11. That is "<space>not" = 11th place.
//		sb.delete(1, 2);
//		System.out.println("sb has " + sb);
		
//		StringBuilder sb = new StringBuilder("This is good");
//		sb.insert(8, "very ");
//		System.out.println("sb has " + sb);
		
//		StringBuilder sb = new StringBuilder("!bargainS");
//		sb.reverse();
//		System.out.println("sb has " + sb);
		
//		StringBuilder sb = new StringBuilder("Tee");
//		sb.setCharAt(2, 'a');
//		System.out.println("sb has " + sb);
		
//		StringBuilder sb = new StringBuilder("This is a text that rambles on needlessly.");
//		sb.setLength(27);
//		System.out.println("sb has " + sb);
		
//		StringBuilder sb = new StringBuilder("!bargainS");
//		sb.reverse();
//		System.out.println("sb has " + sb);
		
//		StringBuilder sb = new StringBuilder("This is a text that rambles on needlessly ");
//		String result = sb.substring(8);
//		System.out.println("Result has " + result);
		
//		StringBuilder sb = new StringBuilder("This is text that rambles on needlessly ");
//		String result = sb.substring(8, 12);
//		System.out.println("Result has " + result);
		
//		StringBuilder sb = new StringBuilder("0123456789");
//		char [] dest = new char[20];
//		for (int i =0 ; i< dest.length; i++) {
//			dest[i] = '+';
//		}
//		sb.getChars(3, 7, dest, 7);
//		System.out.println("dest is " + new String(dest));
		
//		StringBuilder sb = new StringBuilder("Here, there, where?");  // upper case is ignored. 
//		int pos = sb.indexOf("here");
//		System.out.println("here was found at " + pos);
//		
//		pos = sb.indexOf("here", 9);
//		System.out.println("Here was found at position" + pos);
//		
//		pos = sb.lastIndexOf("here");
//		System.out.println("here was found at position " + pos);
//		
//		StringBuilder sb = new StringBuilder();
//		while (sb.capacity() < 16384) {
//			int cap = sb.capacity();
//			sb.ensureCapacity(cap + 1);
//			System.out.println("sb capacity now is " + sb.capacity());
//		}
		
		StringBuilder sb = new StringBuilder();
		System.out.println("sb.initial.capacity " + sb.capacity());
		sb.append("0123456789abcdef");
		System.out.println("sb.capacity now is " + sb.capacity());
		sb.append('x');
		System.out.println("sb.capacity now is " + sb.capacity());
		sb.trimToSize();  // this does cause a buffer allocation. But that is better than avoiding memory being wasted. 
						  // trim() removes the leading and trailing whitespace
		System.out.println("sb.capacity post trim is " + sb.capacity());
		
	}

}
