package stringbuildermethods;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;

public class StringTestingMethod {
	public static void main(String[] args) {
		String s = "Hello World";
		String s1 = new String(s);
		String s2 = new String(s);
		
		s1 = s1.intern(); // Intern method when invoked, looks for a string in the pool and if one matches as per EQUALS method, then they are true.
		s2 = s2.intern(); // It follows that for any two strings S and T, s.intern() == t.intern as long as s.equals(t) is true.
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("s1 and s2 are " + (s1 == s2));
		
		String t = "Saran";
		StringBuilder o = new StringBuilder("1");
		String t2 = t.concat(o.toString());
		System.out.println("Printing t2: " + t2);
		
		"Hello ".trim();
		
		Calendar date = Calendar.getInstance();
		date.set(2019, 03, 31);
		String Output = String.format("There are %d planets now that"
				+ "%s was demoted on %3$tB %3$td, %3$tY", 8, "pluto", date);
		System.out.println(Output);
		
		
		boolean saran = "hello".startsWith("ll", 2);
		System.out.println(saran);
		int  output ="elk".compareTo("deer");
		System.out.println(output);
		
		String z = "Hello";
		z = z.concat(" World");  //
		System.out.println(z);
		
// The same with the Date method. 
		LocalDateTime ldt = LocalDateTime.of(2014, Month.MARCH, 12, 12, 0);
		System.out.println("> " + ldt);
		
		ldt = ldt.plusMonths(2); //
		System.out.println("> " + ldt);
	}

}
