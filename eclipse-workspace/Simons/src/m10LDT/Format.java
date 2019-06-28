package m10LDT;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Format {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		System.out.println(" > " + dtf.format(ldt));
		
		
		String date = "October 31, 2000";
		TemporalAccessor ta = dtf.parse(date);
		LocalDate ld = LocalDate.from(ta);
		System.out.println("> " + ld);
		
		dtf = DateTimeFormatter.ofPattern("'The date is': MMMM dd, yyyy");
		System.out.println(" > " + dtf.format(LocalDateTime.now()));
		
	}

}
