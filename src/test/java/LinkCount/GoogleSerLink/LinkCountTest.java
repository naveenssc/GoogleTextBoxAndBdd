package LinkCount.GoogleSerLink;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import LinkCount.GoogleSerLink.LinkCountPage;

public class LinkCountTest {
public static void main(String args[])  {
	String Path = "D:\\Users\\diness\\Desktop\\naveen\\geckodriver.exe"; 
		String Url = "https://www.google.com";
		System.setProperty("webdriver.gecko.driver" ,Path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Url);
	     
		LinkCountPage lp = new LinkCountPage(driver);
	    	lp.sendtextvalue("Test Automation");
			lp.LinksData();	
	    
}
}
