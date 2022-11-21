package JUnitTestPackage1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAddNumber1.class, TestAddString1.class })
public class AllTests {

}
