package m10LDT;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Difference {
	public static void main (String[] args) {
		LocalDate start = LocalDate.of(2015, Month.MARCH, 1);
		LocalDate end = LocalDate.of(2015, Month.MAY, 15);
		long between = ChronoUnit.DAYS.between(start, end);
		System.out.println("Between " + start +" and " + end+" is " + between + " days.");
		between = ChronoUnit.MONTHS.between(start, end);
		System.out.println("Between " + start +" and " + end+ " is " + between + " months.");
		
		Period p = Period.ofMonths(1);
		end = start.plus(p);
		System.out.println("Difference is " + Period.between(start, end).getMonths());
		
		p = Period.of(10, 38, 400);
		p = p.normalized(); // MUST ASSIGN
		System.out.println("Period is " + p);
	}

}
