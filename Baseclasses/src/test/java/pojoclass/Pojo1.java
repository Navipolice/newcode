package pojoclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.xml.LaunchSuite;
import utils.Excel;
import main.Mainmethod;

public class Pojo1 {
	public Pojo1() {
		
	

	PageFactory.initElements(Mainmethod.r, this);
	}
	@FindBy(id="RESULT_TextField-1")
	private WebElement fname;
	
	@FindBy(id="RESULT_TextField-2")
	private WebElement lname;
	
	@FindBy(id="RESULT_TextField-3")
	private WebElement phone;
	
	@FindBy(id="RESULT_TextField-4")
	private WebElement country;
	
	@FindBy(id="RESULT_TextField-5")
	private WebElement city;
	
	@FindBy(id="RESULT_TextField-6")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='RESULT_RadioButton-7_0']")
	private WebElement Male;
	
	@FindBy(xpath = "//input[@id='RESULT_RadioButton-7_1']")
	private WebElement Female;

	
	
	public WebElement getFname() {
		
		return fname;
	}

	public WebElement getMale() {
		return Male;
	}

	public WebElement getFemale() {
		return Female;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getEmail() {
		return email;
	}
}
