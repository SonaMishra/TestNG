package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeMethod(alwaysRun = true)
	public void Method1() {
		System.out.println("Inside Befor Method");
	}
	
	@BeforeTest(alwaysRun = true)
	public void Method3() {
		System.out.println("Inside Befor Test");
	}
	
	@AfterMethod(alwaysRun = true)
	public void Method2() {
		System.out.println("Inside After Method");
	}
	
	@AfterTest(alwaysRun = true)
	public void Method4() {
		System.out.println("Inside After Test");
	}
}
