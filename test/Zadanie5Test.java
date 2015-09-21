import static org.junit.Assert.*;

import org.junit.Test;


public class Zadanie5Test {

	@Test
	public void testGetCompetentionsByDevsList() {
		Zadanie5 z5 = new Zadanie5();
		assertEquals(z5.getCompetentionsByDevsList(Developer.Repository
				.getSampleList()).toArray().length, new Developer.Language[] {
				Developer.Language.C, Developer.Language.SCALA, Developer.Language.PYTHON,
				Developer.Language.JAVA, Developer.Language.RUBY, Developer.Language.GROOVY,
				Developer.Language.JAVA_SCRIPT}.length);
	}

}
