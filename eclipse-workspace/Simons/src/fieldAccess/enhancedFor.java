package fieldAccess;

import java.util.ArrayList;
import java.util.*;


public class enhancedFor {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println("i is " + i);
			if (Math.random() > 0.5) {
				System.out.println("Oh, the number " + i + " is boring. Let's move on to the next number");
				continue;
			}
			System.out.println("Let's do that for the next number");
		}
		System.out.println("Loop has finished");
//		ArrayList<String> gf = new ArrayList<>();
//		gf.add("Chocolate");
//		gf.add("Bananana");
//		
//
//// Printing something using while loop
//		Iterator<String> itr = gf.iterator();
//		while (itr.hasNext()) {
//			String t = itr.next();
//			System.out.println(t);
//		}
//
//// Using enhanced for loop 
//		
//		for (String t: gf) {
//			System.out.println(t);
//		}
		
//		public add intUp (int ... values) {...}
		
	
		
	}

}
