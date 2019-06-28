package m10l4;
import java.util.*;
import java.util.List;


public class ArrayListTest{
	
	public static void showList(List l) {
		int count = l.size();
		for (int i =0 ; i < count; i++) {
			System.out.println("> " + l.get(i));
		}
		System.out.println("====================");
	}
	public static void main(String[] args) {
		List l = new ArrayList();
		System.out.println("list length is: " + l.size());
		l.add("Hello");
		l.add("Bonjour");
		l.add("Willkommen");
		System.out.println("list length is: " + l.size());
		int index = l.indexOf("Bonjour");
		System.out.println("Bonjour is found at index: " + index );
		
		showList(l);
		l.add(1, "bienvenidos");
		showList(l);
		l.remove(0);
		showList(l);
		
//		List list = new ArrayList();
//		x.add("Hello");
//		x.add("Bye");
//		x.add
		
///*		String s = l.get(0);   --> This is illegal */	
//		//String s = (String) (l.get(0)); // --> Clean code
					
	}
	
}


