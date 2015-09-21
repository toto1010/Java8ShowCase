import java.util.List;



public class Zadanie6 {

	public Developer findYougestDev(List<Developer> developers) {
		return developers.stream()
				.reduce((d1, d2) -> d1.getAge() > d2.getAge() ? d2 : d1).get();

	}

	public Integer developersAgeSum(List<Developer> developers) {
		return developers.stream().reduce(0, (sum, d) -> sum + d.getAge(),
				Integer::sum);
	}
}
