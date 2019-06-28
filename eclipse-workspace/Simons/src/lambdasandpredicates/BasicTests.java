package lambdasandpredicates;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class BasicTests {
	
	public static List<Student> get21Plus(List<Student> ls) {
		List<Student> = new ArrayList<Student>();
		for (Student s : ls ) {
			if (s.getAge() >= 21 ) results.add(s);
		}
		return results;
	}
	
	public static List<Student> getFirstHalfAlphabet(List<Student> ls) {
		List<Student> = new ArrayList<Student>();
		for (Student s : ls ) {
			if (Character.toLowerCase(s.getLastName().charAt(0) <= 'm')) {
				results.add(s);
		}
		return results;
	}


}
