package run;


import org.testng.annotations.Test;

import main.*;
import pojoclass.*;

public class Run {
@Test
	public  void main() {
		Mainmethod.Launch();
		Pojo1 pojo = new Pojo1();
		
		Mainmethod.val(pojo.getFname(), "Naveen");
		Mainmethod.val(pojo.getLname(), "Kumar");
		Mainmethod.val(pojo.getPhone(), "123456789");
		Mainmethod.val(pojo.getCountry(), "Rusia");
		Mainmethod.val(pojo.getCity(), "Pokih");
		Mainmethod.val(pojo.getEmail(), "Run@124hotmail");
		Mainmethod.options();
		Mainmethod.days();
		Mainmethod.time();
		
		
		
	}

}
