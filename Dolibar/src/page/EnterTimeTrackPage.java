package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EnterTimeTrackPage {
	@FindBy(xpath="//div[contains(text(),'Settings')]")
	private WebElement settings;
	
	@FindBy(linkText="Licenses")
	private WebElement licenses;
	
	public EnterTimeTrackPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void clickSettings(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		settings.click();
	}
	
	public void clickLicenses(){
		licenses.click();
	}
 
	public void verifyHomePageDisplayed(WebDriver driver,String eTitle,long ETO) {
		WebDriverWait wait=new WebDriverWait(driver,ETO);
		wait.until(ExpectedConditions.titleContains(eTitle));
		String aTitle=driver.getTitle();
		Assert.assertEquals(aTitle,eTitle);
		
	}
	
	
}
