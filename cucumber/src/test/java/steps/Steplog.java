package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steplog {
	
	WebDriver r;
	
		@Given("Launch the browser")
		public void Launch() {
			r = new ChromeDriver();
			r.get("https://www.flipkart.com/");
			r.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			r.manage().window().maximize();
			
		
		}
		@Given("login with user name")
		public void loginWithUserName() {
			r.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		}
		@Given("Scarch product")
		public void scarchProduct() throws Exception {
		    WebElement ele = r.findElement(By.xpath("(//div[.='Fashion'])[4]"));
		    Actions s = new Actions(r);
		    Actions elect = s.moveToElement(ele);
		    elect.click().build().perform();
		    System.out.println("Fasion clicked");
		    Thread.sleep(2000);
		    WebElement kid = r.findElement(By.linkText("Kids"));
		    kid.click();
		}
		@Given("find and add to cart")
		public void findAndAddToCart() {
		   
		}
		@Then("check and quite")
		public void checkAndQuite() {
		  
		}

	}

	

