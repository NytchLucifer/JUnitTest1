package JUnitTestPackage1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddString1 {

	@Test
	public void test() {
		JUnitFunction1 junitstring=new JUnitFunction1();
		String  result= junitstring.AddString1("Milind","Gupta");
		assertEquals("MilindGupta",result);
	}

}
