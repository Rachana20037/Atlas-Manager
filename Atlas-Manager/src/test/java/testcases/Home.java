
package testcases;

import base.BaseTest;
import org.testng.annotations.Test;

import pageObject.HomePage;
import utilities.ReadXLSdata;
import utilities.ScreenshotUtils;

public class Home extends BaseTest {

  @Test(dataProvider = "login_testdata", dataProviderClass = ReadXLSdata.class)
    public void NavbarClick(String username, String password) throws InterruptedException {
	  
	  // ✅ Login once using helper
      login(username, password);
      Thread.sleep(2000);
      
        System.out.println("Click all the navbar");

        HomePage homePage = new HomePage(driver);
        Thread.sleep(3000);
        
        homePage.homeClick();
        Thread.sleep(3000);
        homePage.exploreClick();
        Thread.sleep(3000);
        
        homePage.dashboardClick();
        Thread.sleep(3000);
        
        homePage.logsClick();
        Thread.sleep(3000);
        
        homePage.applicationClick();
        Thread.sleep(3000);
        
        homePage.faqsClick();
        Thread.sleep(3000);
        
        homePage.contactClick();
        Thread.sleep(3000);
        
        homePage.logoClick();
        Thread.sleep(3000);
        
        homePage.profileClick();
        Thread.sleep(3000); // better to use explicit wait

        // ✅ Take screenshot after login attempt
        ScreenshotUtils.takeScreenshot(driver, "Navbar_AllClicked ");

        System.out.println("🧪 Test Completed for the Navbar clicked action: ");
    }
}
