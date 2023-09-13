package Runner;

import org.testng.annotations.Test;

import cucumber.*;

public class Bankrun {

	@Test
	public  void Run() {
		Bankbase.launch();
	}
	@Test(dependsOnMethods = "Run")
	public void login() {
		Bankbase.manlog();
		}
	@Test(dependsOnMethods = "login")
		public void details() {
			Bankdetails det = new Bankdetails();
			Bankbase.addcust(det.getFname(), "Navi");
			Bankbase.addcust(det.getLname(), "police");
			Bankbase.addcust(det.getPost(), "85246");	
		}
		@Test(dependsOnMethods = "details")
		public void openacc() {
			Bankbase.openacc();
		}
		@Test(dependsOnMethods = "openacc")
		public void amt() {
			Bankbase.amtallot();
			Bankbase.check();
		}
		@Test(dependsOnMethods = "amt")
		public void deposite() {
			Bankbase.deposite();
		}
		@Test(dependsOnMethods = "deposite")
		public void trans() {
			Bankbase.trans();
		}
		@Test(dependsOnMethods = "trans")
		public void withdraw() {
			Bankbase.withdraw();
		}
		
	}


