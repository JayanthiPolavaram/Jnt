package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB  {
@Test(invocationCount=3)
public void runMultiple()
{
	Reporter.log("run multiple times",true);
}
}
