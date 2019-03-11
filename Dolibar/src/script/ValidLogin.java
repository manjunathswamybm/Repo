package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest{
@Test(priority=1)
public void testValidLogin() throws InterruptedException {
String un = FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1,0);
String pw = FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1,1);
String hpTitle= FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1,2);

//	Enter valid user name
LoginPage l=new LoginPage(driver);
l.setUserName(un);
//	Enter valid password
l.setPassword(pw);	
//	Click login
l.clickLogin();
//	verify home page is displayed
EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
e.verifyHomePageDisplayed(driver,hpTitle, ETO);
}
}










