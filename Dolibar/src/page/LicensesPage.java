package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LicensesPage {

	@FindBy(xpath="//nobr[text()='Issue Date:']/../../td[2]")
	private WebElement issueDate;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public LicensesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout() {
		logoutLink.click();
	}
	
	public void verifyIssueDate(String expectedIssueDate) {
		String actualIssueDate=issueDate.getText();
		Assert.assertEquals(actualIssueDate,expectedIssueDate);
	}
	
}








