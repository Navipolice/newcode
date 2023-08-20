package maven1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testprg {

	@org.testng.annotations.Test
	public  void Test() {
		WebDriver i = new FirefoxDriver();
		i.get("https://www.facebook.com/login/");
		i.manage().window().maximize();
		i.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		i.findElement(By.id("email")).sendKeys("8682895434");
		i.findElement(By.id("pass")).sendKeys("Gunagokul");
		i.findElement(By.id("loginbutton")).click();
		String title = i.getTitle();
		System.out.println(title);

	}

}
