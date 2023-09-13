package steps;

import org.testng.annotations.Test;

import ecombase.Base1;

public class Amazonlaunch {

	@Test
	public  void name() throws Exception {
	
		Base1.browser();
		Base1.search();
		Base1.select();
		Base1.cart();
		Base1.quantity();
		Base1.login();
		Pojoamz pojo = new Pojoamz();
		Base1.user(pojo.getUser(), Base1.data(1, 0));
		Base1.checkout();
		Base1.pass(pojo.getPass(), Base1.data(1, 1));
		Base1.checkin();
		Base1.del();
		
		
		
	}
			
		

	}


