package maven1;


import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	 static WebDriver r;
	public static void Launch() {
		WebDriverManager.chromedriver().setup();
		r = new ChromeDriver();
		r.get("https://www.amazon.in/");
		r.manage().window().maximize();
		r.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		r.findElement(By.xpath("(//a[@class='nav-a  '])[5]")).click();
		
		}
		public static void product() {
			WebElement mobile = r.findElement(By.xpath("(//img[@class='s-image'])[1]"));
			Actions n = new Actions(r);
			n.moveToElement(mobile,1280,657);
			r.findElement(By.linkText("OnePlus Nord CE 3 Lite 5G (Chromatic Gray, 8GB RAM, 128GB Storage)")).click();
				
		}
		public static void cart() {
		
			Set<String> hand = r.getWindowHandles();
			
			List<String> list  = new ArrayList<String>(hand);
			r.switchTo().window(list.get(1));
			r.findElement(By.xpath("(//a[@class='nav-a nav-hasArrow'])[4]")).click();
			r.navigate().back();
			r.findElement(By.id("add-to-cart-button")).click();
			r.findElement(By.id("attach-close_sideSheet-link")).click();
			
		}
		public static void check() {
			JavascriptExecutor j =(JavascriptExecutor)r;
			j.executeScript("window.scrollTo(0,0)");
			r.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
			System.out.println("Product sucessfully add into cart..!");
			
			
			
		}
		public static void screenshot() throws Exception {
			File s = ((TakesScreenshot)r).getScreenshotAs(OutputType.FILE);
			Files.copy(s, new File("C:\\Users\\Admin\\git\\newcode\\maven1\\Snapshot\\img3.jpeg"));
			
		}
		public static void login() {
			r.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
			r.findElement(By.id("ap_email")).sendKeys("9514327531");
			r.findElement(By.id("continue")).click();
			r.findElement(By.id("ap_password")).sendKeys("Navi@police");
			r.findElement(By.id("signInSubmit")).click();
		}
		public static void signout() {
			//r.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
			JavascriptExecutor jr =(JavascriptExecutor)r;
			jr.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
			r.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']")).click();
			r.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
			boolean res =false;
			r.findElement(By.xpath("//input[@value='Delete']")).click();
			if(res =!false)
				System.out.println("Product is deleted..!");
			else
				System.out.println("Product is not deleted..X");
			
			r.close();
			
		}

	}


