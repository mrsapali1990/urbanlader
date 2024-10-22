package POM.SPECS;

import java.io.IOException;

public class Login {
public static void validLogin() throws IOException {
	
	POM.COMMON.Common.openBrowser();

	POM.CONFIGURATION.Driver.driver.get(POM.CONFIGURATION.Config.url);
	String[] data=POM.COMMON.Common.readCsv(POM.CONFIGURATION.Config.filepath);
	POM.PAGES.LoginPage.getUname().sendKeys(data[0]);
	POM.PAGES.LoginPage.getPass().sendKeys(data[1]);
	POM.PAGES.LoginPage.getLogButt().click();
}

}
