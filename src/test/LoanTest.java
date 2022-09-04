package test;

import org.testng.annotations.Test;
//@Test(groups = {"regression"})
public class LoanTest extends BaseClass {

	@Test(groups= {"Sanity","regression"}, priority = 2)
	public void HomeLoan() {
		System.out.println("Inside Home Loan Test");
	}

	@Test(groups = {"regression"})
	public void PersonalLoanTest() {
		System.out.println("Inside Personal Loan Test");
	}
	
	@Test(enabled = true, description = "This is PL", priority = 0)
	public void PersonalLoanTest2() {
		System.out.println("Inside Personal Loan Test 1");
	}
	
}
