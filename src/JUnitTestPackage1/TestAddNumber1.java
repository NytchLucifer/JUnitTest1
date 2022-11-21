package JUnitTestPackage1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumber1 {

	@Test
	public void test() {
		JUnitFunction1 junit=new JUnitFunction1();
		int result = junit.AddNumber1(100,200);
		assertEquals(300,result);
		
	}

}
