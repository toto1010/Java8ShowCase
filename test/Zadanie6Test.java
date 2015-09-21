import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class Zadanie6Test {

	@Test
	public void testFindYougestDev() {
		Zadanie6 z6 = new Zadanie6();
		assertEquals(z6.findYougestDev(Developer.Repository.getSampleList()).getAge(), Integer.valueOf(24));
		
	}
	
	@Test
	public void testDevelopersAgeSum() {
		Zadanie6 z6 = new Zadanie6();
		assertEquals(z6.developersAgeSum(Developer.Repository.getSampleList()), Integer.valueOf(230));
		
	}

}
