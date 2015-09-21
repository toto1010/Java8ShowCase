import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Zadanie2 {

	public List<Developer> findRealProgramers() {
		return Developer.Repository.getSampleList()
				.stream()
				.filter(d -> isRealDeveloper(d))
				.collect(Collectors.toList());
	}

	private boolean isRealDeveloper(Developer d) {
		return d.getProgrammingLanguages().contains(Developer.Language.JAVA);
	}
	
	public Map<Integer, List<Developer>> groupDevelopersByAge() {
		return Developer.Repository.getSampleList()
				.stream()
				.collect(Collectors.groupingBy(Developer::getAge, Collectors.toList()));
	}
	
	public String whoIsCool() {
		return Developer.Repository.getSampleList()
				.stream()
				.filter(d -> isCool(d))
				.map(d -> d.getFirstName())
				.collect(Collectors.joining(" oraz ", "W mojej firmie ", " s¹ cool"));
	}

	private boolean isCool(Developer d) {
		return d.getProgrammingLanguages().contains(Developer.Language.SCALA);
	}
}
