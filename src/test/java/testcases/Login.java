package testcases;

import base.BaseTest;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import utilities.ReadXLSdata;
import utilities.ScreenshotUtils;

public class Login extends BaseTest {

    @Test(dataProvider = "login_testdata", dataProviderClass = ReadXLSdata.class)
    public void loginTest(String username, String password) throws InterruptedException {
        System.out.println("🔐 Trying login with user: " + username);

        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(5000);
        loginPage.loginbtn();
        Thread.sleep(5000);
        loginPage.enterUsername(username);
        Thread.sleep(5000);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        Thread.sleep(5000); // better to use explicit wait

        // ✅ Take screenshot after login attempt
        ScreenshotUtils.takeScreenshot(driver, "AfterLogin_ ");

        System.out.println("🧪 Test Completed for: " + username);
    }
}
