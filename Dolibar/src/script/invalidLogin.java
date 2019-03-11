package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.LoginPage;

public class invalidLogin extends BaseTest{
@Test(priority=2)
public void testInvalidLogin()
{
	String un = FWUtil.getXLData(INPUT_PATH, "InvalidLogin", 1,0);
	String pw = FWUtil.getXLData(INPUT_PATH, "InvalidLogin", 1,1);

	//Enter invalid user name
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//Enter invalid password
	l.setPassword(pw);
	//Click on login
	l.clickLogin();
	//Verify Err Msg Dispalyed
	l.verifyErrMsgDisaplyed();
}
}

