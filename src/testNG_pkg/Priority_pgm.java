package testNG_pkg;

import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_pgm {

	@BeforeClass
	public void setup() {
		System.out.println("beforetest, browser open");
	}

	@Test(priority =1,invocationCount=3)
	public void mthd_f() {
		System.out.println("mthd_f");
	}

	@Test(priority = 2)
	public void meth_2() {
		System.out.println("meth_2");
	}
		// @Test(priority = 3)
		@AfterClass
		public void Af_clasMeth() {
			System.out.println("Af_clasMeth");
		}
		
	}


