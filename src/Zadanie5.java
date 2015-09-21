import java.util.List;
import java.util.stream.Collectors;

public class Zadanie5 {

	public List<Developer.Language> getCompetentionsByDevsList(
			List<Developer> developers) {
		return developers.stream()
				.flatMap(d -> d.getProgrammingLanguages().stream())
				.distinct()
				.collect(Collectors.toList());
	}
}
