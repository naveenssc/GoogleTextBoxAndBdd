package LinkCount.GoogleSerLink;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkCountPage {
	@FindBy(id="lst-ib")
	private static WebElement googlesearch;
	
	
	@FindBy(xpath="//div[@class='sbqs_c']")
	private static List<WebElement> googleautosuggestion;
	
	
	
	public LinkCountPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Enter text to the GoogleSearchTextBox
	public  void sendtextvalue(String text)
	{
		googlesearch.sendKeys(text);
	}
	
	// LinksData()method is Created to count and print the total number of auto Suggestion.
	public  void LinksData() 
	{
		int Autosugesstion = googleautosuggestion.size();
		System.out.println("List of Total AutoSuggestion Counts are :" + Autosugesstion);
		for (int i = 0; i < googleautosuggestion.size(); i++) {
		System.out.println(googleautosuggestion.get(i).getText());
		}
	}
}
