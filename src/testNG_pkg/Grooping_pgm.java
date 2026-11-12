package testNG_pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grooping_pgm {

	@BeforeClass (alwaysRun=true)
	public void BF_class() {
		System.out.println("BF_class");
	}
	@Test(priority=1,groups="smoke")
	public  void meth_1() {
		System.out.println("meth_1");
	}
	@Test(priority=2,groups="sanity")
	public  void meth_2() {
		System.out.println("meth_2");
	}
	@Test(priority=3,groups={"regerssion","smoke"})
	public  void meth_3() {
		System.out.println("meth_3");
	}
	@AfterClass(alwaysRun=true)
	public void met_AC() {
		System.out.println("met_AC");
	}
		

}
