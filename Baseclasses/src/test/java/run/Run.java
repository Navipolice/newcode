package run;


import org.testng.annotations.Test;
import utils.*;
import main.*;
import pojoclass.*;

public class Run {
@Test
	public  void main() throws Exception {
		Mainmethod.Launch();
		Pojo1 pojo = new Pojo1();
		
		Mainmethod.val(pojo.getFname(), Mainmethod.data(1 , 0));
		Mainmethod.val(pojo.getLname(), Mainmethod.data(1, 1));
		Mainmethod.val(pojo.getPhone(), Mainmethod.data(1, 2));
		Mainmethod.val(pojo.getCountry(), Mainmethod.data(1, 3));
		Mainmethod.val(pojo.getCity(), Mainmethod.data(1, 4));
		Mainmethod.val(pojo.getEmail(), Mainmethod.data(1, 5));
		String data1 = Mainmethod.data(1, 6);
		System.out.println(data1);
		if(data1.equalsIgnoreCase("Male")) {
			Mainmethod.male(pojo.getMale());
		}
		else {
			
			Mainmethod.female(pojo.getFemale());
		}
		
		
		
		
	}

}
