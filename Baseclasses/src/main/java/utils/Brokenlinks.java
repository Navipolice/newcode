package utils;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlinks {

	static	WebDriver s;
	public static void launch() {
		s = new FirefoxDriver();
		s.get("https://www.redbus.in/");
		s.manage().window().maximize();
		s.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	public static void links() throws Exception {
		List<WebElement> list = s.findElements(By.tagName("a"));
		for (WebElement link : list) {
			String href = link.getAttribute("href");
			//System.out.println(href);
			if(href!=null) {
				URL url = new URL(href);
				URLConnection temp = url.openConnection();
				HttpsURLConnection con =(HttpsURLConnection)temp;
				int responseCode = con.getResponseCode();
				//System.out.println(responseCode);
				if(responseCode!=200) {
			
			System.out.println(href);
		}
	}

}
	}}
