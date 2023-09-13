package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecombase.Base1;

public class Pojoamz {

	public Pojoamz() {
		
		PageFactory.initElements(Base1.s ,this);
	}
		
	@FindBy (id = "ap_email")
	private WebElement user;
	
	@FindBy (id = "ap_password")
	private WebElement pass;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}
	
		}

		
		

		


