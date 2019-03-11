package script;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
public class TestUtil extends BaseTest{
	@Test
	public void testA() {
		String path=INPUT_PATH;
		String sheet="Sheet1";
		String v = FWUtil.getXLData(path, sheet,0,0);
		System.out.println(v);
		int rc=FWUtil.getXLRowCount(path, sheet);
		System.out.println(rc);
		FWUtil.setXLData(path, sheet,0,0,123);
		FWUtil.setXLData(path, sheet,1,0,"BTR");
		FWUtil.getPhoto(driver,PHOTO_PATH+"google.png");

	}
}

