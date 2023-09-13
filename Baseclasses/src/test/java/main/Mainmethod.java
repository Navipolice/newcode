package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.*;
public class Mainmethod {
	
	public static WebDriver r;

	public static void Launch() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		r = new FirefoxDriver();
		r.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		r.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		r.manage().window().maximize();
		
		 
		
	}
		
	public static void val(WebElement ele , String value) {
		
		ele.sendKeys(value);
		
	}
	public static void male(WebElement male) {
		WebElement table = r.findElement(By.xpath("//table[@class='inline_grid choices']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement opt = rows.get(0);
		opt.click();
		
		}
		
	public static void female(WebElement female) {
		WebElement table = r.findElement(By.xpath("//table[@class='inline_grid choices']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement opt1 = rows.get(0);
		opt1.click();
		
		}
		public static void days() {
			WebElement t2 = r.findElement(By.xpath("(//table[@class='inline_grid choices'])[2]"));
			List<WebElement> rws = t2.findElements(By.tagName("tr"));
			rws.get(0).click();
			rws.get(2).click();
			rws.get(6).click();	
			}
			
				
			
			
		
		public static void time() {
			WebElement option = r.findElement(By.id("RESULT_RadioButton-9"));
			Select s = new Select(option);
			s.selectByValue("Radio-1");
			WebElement opt = s.getFirstSelectedOption();
			System.out.println(opt.getText());
			opt.click();
			r.findElement(By.id("FSsubmit")).click();
			r.navigate().back();
			JavascriptExecutor js =(JavascriptExecutor)r;
			js.executeScript("window.scrollTo(0,0)");
			
			
			
		}
			
				
		public static String data(int row , int cell) throws Exception {
			String value1 = null;
			
			File f = new File("C:\\Users\\Admin\\git\\newcode\\Baseclasses\\Testdata\\Book 11.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fi);
			Sheet s = w.getSheet("Sheet1");
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
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
		
	
		}
			
		
		
		
	

	


