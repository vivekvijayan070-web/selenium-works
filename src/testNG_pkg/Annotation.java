package testNG_pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeTest
	public void sugu() {
		System.out.println("sugu");

	}

	@BeforeClass
	public void sugu2() {
		System.out.println("sugu2");
	}

	@BeforeMethod
	public void sugu3() {
		System.out.println("sugu3");

	}

	@Test
	public void testmethod_a() {
		System.out.println("testmethod_a");
	}

	@Test
	public void testmethod_b() {
		System.out.println("testmethod_b");
	}

	@Test
	public void testmethod_c() {
		System.out.println("testmethod_c");
	}

	@AfterMethod
	public void Af_methd() {
		System.out.println("Af_methd");
	}

	@AfterClass
	public void Ac_methd() {
		System.out.println("Ac_methd");
	}

	@AfterTest
	public void At_methd() {
		System.out.println("At_methd");
	}
}
