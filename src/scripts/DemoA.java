package scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseTest{
	@Test
	public void testA1()
	{
		Reporter.log("testA1",true);
		Assert.fail();
		
	}
	@Test
	public void testA2()
	{
		Reporter.log("testA2",true);
		
	}
	@Test(dependsOnMethods={"testA1","testA2"},alwaysRun=true)
	public void testA3()
	{
		Reporter.log("testA3",true);
		
	}

}
