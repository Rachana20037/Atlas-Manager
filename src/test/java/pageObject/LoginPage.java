package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver; //Instance created

	public LoginPage(WebDriver driver) { //Constructor
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initializes WebElements
	}
//=============================API Manager=====================================
/*	@FindBy(xpath = "//input[@type='username']")  //    @FindBy(xpath = "//input[@placeholder='Email / Username']")
 
	WebElement usernameInput;

	@FindBy(xpath = "//input[@type='password']")
	WebElement passwordInput;

	@FindBy(xpath = "//button[.='Login']")
	WebElement loginBtn;
	
//	@FindBy(xpath = "(//div[.='Account not found.'])[1]")
//	public WebElement ErrorMsg;

	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void clickLogin() {
		loginBtn.click();
	}
//	public String getErrorMsg() {
//		return ErrorMsg.getText();
//	}
	*/
//==================================API Dev=======================================
	@FindBy(linkText = "Login")
	WebElement loginBtn;

//	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	@FindBy(id = "username")
	WebElement usernameInput;

	@FindBy(id = "password")
	WebElement passwordInput;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login_submit;
	
//	@FindBy(xpath = "(//div[.='Account not found.'])[1]")
//	public WebElement ErrorMsg;
	
	public void loginbtn() {
		loginBtn.click();
	}

	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void clickLogin() {
		login_submit.click();
	}
	
	// ✅ Reusable Login Method
    public void doLogin(String username, String password) {
        loginbtn();
//        enterUsername(username);
//        enterPassword(password);
//        clickLogin();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(usernameInput));
        usernameInput.sendKeys(username);

        wait.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(login_submit));
        login_submit.click();
        
    }
	
}
