import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;


public class Zadanie4Test {

	@Test
	public void testSplitListTo3s() {
		Zadanie4 z4 = new Zadanie4();
		List<List<Integer>> lsts = z4.splitListTo3s();
		assertArrayEquals(lsts.get(1).toArray(),new Integer[] {1,2,3});
		assertArrayEquals(lsts.get(2).toArray(), new Integer[] {2,3,4});
		assertArrayEquals(lsts.get(3).toArray(), new Integer[] {3,4,5});
	}

	@Test
	public void testJoinBackLists() {

		Zadanie4 z4 = new Zadanie4();
		assertArrayEquals(z4.joinBackLists().toArray(),new Integer[] {0,1,2,1,2,3,2,3,4,3,4,5});
	}
}
