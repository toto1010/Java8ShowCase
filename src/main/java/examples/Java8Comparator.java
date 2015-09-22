package examples;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Java8Comparator {

	public static void main(String[] args) {
		Java8Comparator j8c = new Java8Comparator();
		//old sort
		List<String> names = j8c.getNames();
		System.out.println(names);
		j8c.oldSortStrings(names);
		System.out.println(names);
		
		//java 8 sort
		names = j8c.getNames();
		System.out.println(names);
		j8c.sortStrings(names);
		System.out.println(names);
		
		
		// sort by length
		names = j8c.getNames();
		System.out.println(names);
		j8c.sort(names);
		System.out.println(names);
	}
	
	public List<String> getNames() { 
		return Arrays.asList("Tomek", "Ania", "Ewa", "Karolina");
	}
	
	public void sortStrings(List<String> list) {
		Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
	}
	
	public void oldSortStrings(List<String> list) {
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
		});
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void sort(List<String> list) {
		Collections.sort(list, Comparator.comparing((String s) -> s.length()));
		
	}
}
