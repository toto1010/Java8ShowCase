import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class Zadanie1Test {

	@Test
	public void testSortByNameFirstnameAge() {
		Zadanie1 z1 = new Zadanie1();
		List<Developer> developers = z1.sortByNameFirstnameAge();

		assertEquals(developers.get(3).getFirstName(), "Beata");
		assertEquals(developers.get(3).getAge(), Integer.valueOf(27));
		assertEquals(developers.get(4).getFirstName(), "Beata");
		assertEquals(developers.get(4).getAge(), Integer.valueOf(29));

	}

	@Test
	public void testCountDevsForProgLanguages() {

		Zadanie1 z1 = new Zadanie1();
		assertEquals(z1.countDevsForProgLanguages()
				.get(Developer.Language.JAVA), Integer.valueOf(4));
	}

	@Test
	public void testRemoveNonJavaDevlopers() {
		Zadanie1 z1 = new Zadanie1();
		assertEquals(z1.removeNonJavaDevlopers().size(), 4);

	}

}
