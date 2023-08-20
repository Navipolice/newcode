package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

		WebDriver r;
	
		@Given("Login using the facebook url")
		public void loginUsingTheFacebookUrl() {
		 r = new FirefoxDriver();
		 r.get("https://www.facebook.com/login/");
		 r.manage().window().maximize();
			r.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		@Given("enter the user name")
		public void enterTheUserName() {
			r.findElement(By.id("email")).sendKeys("8682895434");
		  
		}
		@Given("enter the password")
		public void enterThePassword() {
			r.findElement(By.id("pass")).sendKeys("Gunagokul");
		}
		@Given("click the login butten")
		public void clickTheLoginButten() {
			r.findElement(By.id("loginbutton")).click();
		    
		}
		@When("the login sucessfully")
		public void theLoginSucessfully() {
			String title = r.getTitle();
			System.out.println("Login sucessfully..!"+title);
		   
		}
		@Then("Login sucess..!")
		public void loginSucess() {
		    
		}


	}


