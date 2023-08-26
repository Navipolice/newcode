package maven1;

import org.testng.annotations.Test;

import maven1.*;

public class Testprg {
	@Test (groups = {"smoke"})
	public  void launch()  {
		Baseclass.Launch();
	}
	@Test (groups = {"sanity"})
	public void login() {
		Baseclass.login();
	}
	@Test (groups = {"smoke"})
	public void product() {
		Baseclass.product();
		
	}
	@Test (groups = {"sanity"})
	public void cart() {
		Baseclass.cart();
	}
	@Test (groups = {"smoke"})
	public void check() {
		Baseclass.check();
	}
	@Test (groups = {"sanity"})
	public void ss() throws Exception {
		Baseclass.screenshot();
	}	
	@Test(groups = {"reg"})
	public void signout() {
		Baseclass.signout();
		
	}
	
	
	
		
	}

	
			
	
	
	

	

	


