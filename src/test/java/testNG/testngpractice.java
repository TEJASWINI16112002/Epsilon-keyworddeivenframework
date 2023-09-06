package testNG;

import org.testng.annotations.Test;

public class testngpractice {
	@Test(priority = -1)
	public void createcustomer() {
		System.out.println("customer created");
	}
	@Test
	public void modifycustomer() {
		System.out.println("customer modified");
	}
	@Test(priority=1)
	//(invocationCount=1)
	public void deletecustomer() {
		System.out.println("customer deleted");
	}
	//we can add priorities aswell
	//default priority is 0 and it will accept negtive values also.
	//lowest priority exceutes first
    //invocation count-to run more than once,default is =1
	// if we cgive negative value it will not run
	//data provider- (load the data into test script)run multiple time with different data for every run
}
