import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie4 {

	public List<List<Integer>> splitListTo3s() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		return numbers.stream().map(n -> Arrays.asList(n - 1, n, n + 1))
				.collect(Collectors.toList());
	}

	public List<Integer> joinBackLists() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		return numbers.stream().map(n -> Arrays.asList(n - 1, n, n + 1))
				.flatMap(lst -> lst.stream()).distinct().collect(Collectors.toList());
	}
	
}
