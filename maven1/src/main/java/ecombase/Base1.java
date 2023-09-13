package ecombase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class Base1 {
	
		public static WebDriver s;
		public static void browser() {
				s = new FirefoxDriver();
				s.get("https://www.amazon.in/");
				s.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				s.manage().window().maximize();
		}
		public static void search() {
			WebElement product = s.findElement(By.id("twotabsearchtextbox"));
			product.sendKeys("airpads");
			WebElement btn = s.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
			btn.submit();
			
		}
			public static void select() {
				s.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
				Set<String> win = s.getWindowHandles();
				List<String> list = new ArrayList<String>(win);
				s.switchTo().window(list.get(1));
				s.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
							
		}
			public static void cart() {
				s.findElement(By.xpath("(//a[@class='a-button-text'])[3]")).click();
				WebElement price = s.findElement(By.xpath("//span[@id='sc-subtotal-amount-activecart']"));
				System.out.println(price.getText());
			}
			public static void quantity() throws Exception {
//				WebElement drop = s.findElement(By.xpath("//select[@id='quantity']"));
//				Select drp = new Select(drop);
//				drp.selectByIndex(1);
//				WebElement opt = drp.getFirstSelectedOption();
//				System.out.println(opt.getText());
//				opt.click();
				File f =((TakesScreenshot)s).getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\Admin\\git\\newcode\\maven1\\Snapshot\\im.jpeg");
				FileHandler.copy(f, dest);
				
			}
			public static void login() {
				WebElement login = s.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
				login.click();
				
				
			}
			public static void user(WebElement ele , String value) {
				ele.sendKeys(value);
			}
			public static String data(int row , int cell) throws IOException {
				String value1 = null;
				
				
				File fil = new File("C:\\Users\\Admin\\git\\newcode\\maven1\\target\\Book 1.xlsx");
				FileInputStream f = new FileInputStream(fil);
				Workbook w = new XSSFWorkbook(f);
				Sheet e = w.getSheet("Sheet1");
				Row p = e.getRow(row);
				Cell c = p.getCell(cell);
				 CellType Type = c.getCellType();
				String value = null;
				if(Type==CellType.STRING) {
					value = c.getStringCellValue();
				}
				else if(Type==CellType.NUMERIC) {
					if(DateUtil.isCellDateFormatted(c)) {
						Date dt = c.getDateCellValue();
						SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
						value =sim.format(dt);
					}
					
				}
				else {
					long v = (long) c.getNumericCellValue();
					value = String.valueOf(v);
				}
				 System.out.println("Form Details:"+value);
				return value;
				 
				
			}
			public static void checkout() {
				s.findElement(By.xpath("//input[@class='a-button-input']")).click();
			}
			public static void pass(WebElement el , String va) {
				el.sendKeys(va);
				
			}
			public static void checkin() {
				s.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
			}
			public static void del() {
				s.findElement(By.xpath("(//input[@class='a-color-link'])[1]")).click();
				WebElement price1 = s.findElement(By.xpath("//span[@id='sc-subtotal-amount-activecart']"));
				System.out.println(price1);
				s.close();
				s.quit();
}
}
	