package cucumber;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Bankbase {

	
	public static WebDriver s;
		
	public static void launch() {
		s = new FirefoxDriver();
		s.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		s.manage().window().maximize();
		s.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	}
public static void manlog() {
	s.findElement(By.xpath("(//button[@class='btn btn-primary btn-lg'])[2]")).click();
	s.findElement(By.xpath("//button[@ng-click='addCust()']")).click();
	
}
	public static void addcust(WebElement ele, String value) {
		ele.sendKeys(value);
}
	public static void openacc() {
		s.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		s.switchTo().alert().accept();
		s.findElement(By.xpath("//button[@ng-click='openAccount()']")).click();	
	}
	public static void amtallot() {
		WebElement cust = s.findElement(By.id("userSelect"));
		Select c = new Select(cust);
		c.selectByValue("6");
		WebElement det = c.getFirstSelectedOption();
		System.out.println(det);
		WebElement ind = s.findElement(By.id("currency"));
		Select money = new Select(ind);
		money.selectByValue("Rupee");
		s.findElement(By.xpath("//button[@type='submit']")).click();
		s.switchTo().alert().accept();
		
	}
	public static void check() {
		s.findElement(By.xpath("//button[@ng-click='showCust()']")).click();
		WebElement table = s.findElement(By.xpath("//table[@class='table table-bordered table-striped']"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		WebElement name = row.get(6);
		System.out.println("Add cust details: "+name.getText());
		WebElement pass = s.findElement(By.xpath("//input[@placeholder='Search Customer']"));
		pass.sendKeys("Police");
		
	}
	public static void deposite() {
		s.findElement(By.xpath("//button[@class='btn home']")).click();
		s.findElement(By.xpath("//button[@ng-click='customer()']")).click();
		WebElement select = s.findElement(By.id("userSelect"));
		Select cus = new Select(select);
		cus.selectByValue("6");
		s.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		s.findElement(By.xpath("//button[@ng-click='deposit()']")).click();
		s.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("50000");
		s.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		WebElement depamt = s.findElement(By.xpath("(//strong[@class='ng-binding'])[2]"));
		System.out.println("deposite amt: "+depamt.getText());
	}
	public static void trans() {
		s.findElement(By.xpath("//button[@ng-click='transactions()']")).click();
		File sh =((TakesScreenshot)s).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sh, new File("C:\\Users\\Admin\\git\\newcode\\Baseclasses\\target\\img1.jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		s.findElement(By.xpath("//button[@ng-click='back()']")).click();
		s.findElement(By.xpath("//button[@ng-click='deposit()']")).click();
		s.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("15000");
		s.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		WebElement depamt = s.findElement(By.xpath("(//strong[@class='ng-binding'])[2]"));
		System.out.println("deposite amt: "+depamt.getText());
	}
	public static void withdraw() {
		s.findElement(By.xpath("//button[@ng-click='withdrawl()']")).click();
		s.findElement(By.xpath("//input[@ng-model='amount']")).sendKeys("13050");
		s.findElement(By.xpath("//button[@type='submit']")).click();
		s.navigate().refresh();
		WebElement witamt = s.findElement(By.xpath("(//strong[@class='ng-binding'][2])"));
		System.out.println("withdraw amt: "+witamt.getText());
		s.findElement(By.xpath("//button[@ng-click='transactions()']")).click();
		
		File sh =((TakesScreenshot)s).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sh, new File("C:\\Users\\Admin\\git\\newcode\\Baseclasses\\target\\img2.jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
			Assert.assertTrue(s.getCurrentUrl().contains(""));
		}
	}
}
