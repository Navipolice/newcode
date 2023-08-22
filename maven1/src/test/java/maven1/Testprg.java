package maven1;

import org.testng.annotations.Test;

import maven1.*;

public class Testprg {
	@Test 
	public  void launch()  {
		Baseclass.Launch();
	}
	@Test (dependsOnMethods = "launch")
	public void login() {
		Baseclass.login();
	}
	@Test (dependsOnMethods = "login")
	public void product() {
		Baseclass.product();
		
	}
	@Test (dependsOnMethods = "product")
	public void cart() {
		Baseclass.cart();
	}
	@Test (dependsOnMethods = "cart")
	public void check() {
		Baseclass.check();
	}
	@Test (dependsOnMethods = "check")
	public void ss() throws Exception {
		Baseclass.screenshot();
	}	
	@Test(dependsOnMethods = "ss")
	public void signout() {
		Baseclass.signout();
		
	}
	
	
	
		
	}

	
			
	
	
	

	

	


