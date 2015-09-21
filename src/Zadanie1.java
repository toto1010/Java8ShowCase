import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Zadanie1 {

	public List<Developer> sortByNameFirstnameAge() {
		List<Developer> developers = Developer.Repository.getSampleList();
		developers.sort(Comparator.comparing(Developer::getLastName)
				.thenComparing(Developer::getFirstName).thenComparing(Developer::getAge));
		return developers;
	}
	
	public List<Developer> removeNonJavaDevlopers() {
		List<Developer> list = new ArrayList<Developer>();
		list.addAll(Developer.Repository.getSampleList());
		list.removeIf(
				v -> !v.getProgrammingLanguages().contains(
						Developer.Language.JAVA));
		return list;
	}
	
	public Map<Developer.Language, Integer> countDevsForProgLanguages() {
		Map<Developer.Language, Integer> map = new HashMap<>();
		for (Developer dev : Developer.Repository.getSampleList()) {
			for (Developer.Language lang : dev.getProgrammingLanguages()) {
				map.putIfAbsent(lang, 0);
				map.compute(lang, (k, v) -> ++v);
			}
		}
		return map;
	}
}
