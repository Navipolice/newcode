package cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class Bankdetails {

	public Bankdetails() {
		
			PageFactory.initElements(Bankbase.s, this);
	}
			@FindBy(xpath = "//input[@ng-model='fName']")
			private WebElement fname;
			
			@FindBy(xpath = "//input[@ng-model='lName']")
			private WebElement lname;
			
			@FindBy(xpath = "//input[@ng-model='postCd']")
			private WebElement post;

			public WebElement getFname() {
				return fname;
			}

			public WebElement getLname() {
				return lname;
			}

			public WebElement getPost() {
				return post;
			}
			
	}



