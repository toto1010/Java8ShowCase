import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Zadanie2Test {

	@Test
	public void testSearchForRealDevelopers() {
		Zadanie2 z2 = new Zadanie2();
		assertEquals(z2.findRealProgramers().size(), 4);
		
	}
	
	@Test
	public void testgroupDevelopersByAge() {
		Zadanie2 z2 = new Zadanie2();
		Map<Integer, List<Developer>> map = z2.groupDevelopersByAge();
		assertEquals(map.get(27).size(), 2);
		assertEquals(map.get(29).size(), 1);
		assertEquals(map.get(13), null);
		
	}
	
	@Test
	public void testWhoIsCool() {
		Zadanie2 z2 = new Zadanie2();
		assertEquals(z2.whoIsCool(), "W mojej firmie Adam oraz Natalia s¹ cool");
		
	}
}
