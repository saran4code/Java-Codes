package m10LDT;

import java.time.LocalDateTime;
import java.time.Month;

public class LDT {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(2014, Month.MARCH, 12, 12, 0);
		System.out.println("> " + ldt);
		
		ldt = ldt.plusMonths(2);
		System.out.println("> " + ldt);
	}

}
