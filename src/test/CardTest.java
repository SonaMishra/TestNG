package test;

import org.testng.annotations.Test;

public class CardTest extends BaseClass {

	@Test(groups= {"Sanity"})
	public void CCTEst() {
		System.out.println("Inside CC Test");
	}
}
