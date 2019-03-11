package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.EnterTimeTrackPage;
import page.LicensesPage;
import page.LoginPage;

public class CheckIssueDate extends BaseTest{
@Test(priority=3)
public void testCheckIssueDate() {
	String un = FWUtil.getXLData(INPUT_PATH, "CheckIssueDate", 1,0);
	String pw = FWUtil.getXLData(INPUT_PATH, "CheckIssueDate", 1,1);
	String issueDate= FWUtil.getXLData(INPUT_PATH, "CheckIssueDate", 1,2);

	//Enter valid user name
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//Enter valid password
	l.setPassword(pw);
	//Click on login
	l.clickLogin();
	//Click settings
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.clickSettings();
	//Click licenses
	e.clickLicenses();
	//verify issue date
	LicensesPage lp=new LicensesPage(driver);
	lp.verifyIssueDate(issueDate);
	//Click logout
	lp.clickLogout();
}
}
