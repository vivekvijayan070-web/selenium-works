package testNG_pkg;

import org.testng.annotations.Test;

public class Depends_on_metods {
	@Test//(enabled = false)used to stop running
	public void resg() 
	{
		System.out.println("regestration method ");
	}

	@Test(dependsOnMethods = "resg")
	public void login()
	{
		System.out.println("login ");
	}

	@Test(dependsOnMethods = {"resg","login"})
	public void home()
	{
		System.out.println("home");
	}
}

