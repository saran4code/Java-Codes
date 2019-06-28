package fieldAccess;

import java.util.ArrayList;
import java.util.*;


public class AnotherTest {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Hello");
		al.add("Bienvenue");
		al.add("Wilkommen");
//		
//		
//		//ENHANCED FOR LOOP
//		for (Object obj : al) {       	// al is the bucket with three strings here
//			System.out.println("obj is " + obj);
//		}
//		
//		for (Object obj : al) {       	// Buckets are not affected by the for loop and therefore 
//			System.out.println("obj is " + obj);
//		}
//		
		ArrayList<String> als = new ArrayList<> ();
		als.add("Hello");
		als.add("Bienvenue");
		als.add("Wilkommen");
		
//		for (String s : als) {
//			System.out.println("String is " + s);
//		}
		
		// Iterator does not support generic type set. Objects are considered by Iterator
		/*
		 * Iterator itr = al.iterator(); --> will not work as al is an array of generic objects
		 * als will work as it is a string. 
		 */
		Iterator<String> itr = als.iterator();
		while (itr.hasNext()) {
			String t = itr.next();
			System.out.println(t);
			
			
		}
		
		
	}
	
	
}

	/*
	 
//	public static void show2DimensionalArray(int[][] iaa) {
//		System.out.println("Array contains:");
//		for (int x = 0; x < iaa.length; x++) {
//			System.out.println(iaa[x].length + " items: ");
//			for (int y = 0; y < iaa[x].length; y++) {
//				System.out.println(" " + iaa[x][y]);
//			}
//			System.out.println();
//		}
//	}
//	
//	
//	public static void main(String[] args) {
//		int[][] iaa1 = {
//				{1,3,5,7,9},
//				{2},
//				{3,2,3,4},
//				{4,2}
//		};
//		show2DimensionalArray(iaa1);
//		public static void main(String[] args) {
//			int t;
//			int a = 0;
//			int b = 0,c = 0;
//			for (t = (int)(Math.random() * 10.0); a<0; a++, b += 10, sayHello()) {
//				System.out.println("tick ....");
//			}
//		}
//
////		
////		show2DimensionalArray(new int[][] {
//			{1,2,3},
//			{2,3,4}
//		});
//		
//		int [][][] iaaa = new int[2][][];
//		iaaa[0] = new int[3][];
//		iaaa[0][0] = new int[]{1,2,3};
//		iaaa[0][1] = new int[]{ 1, 2};
//		iaaa[0][2] = new int[]{ 1 };
//		
//		show2DimensionalArray(iaaa[0]);
//		
//		int [][] iaa2 = new int [][];
//		
//		
//	}
//
//	public static void sayHello() {
//		// TODO Auto-generated method stub
//		System.out.println("Hello");
//	}

}

	 */