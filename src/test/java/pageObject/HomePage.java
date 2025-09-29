
package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver; //Instance created

	public HomePage(WebDriver driver) { //Constructor
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initializes WebElements
	}

//==================================API Dev=======================================
//	@FindBy(xpath  = "img[alt='Atlas Financial Inclusion']")
	@FindBy(xpath  = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement logo_img;

	@FindBy(xpath = "//a[.='Home']")
	WebElement home_nav;
	
	@FindBy(xpath = "//a[.='Explore APIs']")
	WebElement explore_nav;
	
	@FindBy(xpath = "//a[.='Dashboard']")
	WebElement dashboard_nav;
	
	@FindBy(xpath = "//a[.='Logs']")
	WebElement logs_nav;
	
	@FindBy(xpath = "//a[.='Applications']")
	WebElement application_nav;
	
	@FindBy(xpath = "//a[.='FAQs']")
	WebElement faqs_nav;
	
	@FindBy(xpath = "//a[.='Contact Us']")
	WebElement contact_nav;

	@FindBy(xpath = "(//span[.='AS'])[2]")
	WebElement profile_nav;
	
	public void logoClick() {
		logo_img.click();
	}

	public void homeClick() {
		home_nav.click();
	}
	
	public void exploreClick() {
		explore_nav.click();
	}
	
	public void dashboardClick() {
		dashboard_nav.click();
	}
	public void logsClick() {
		logs_nav.click();
	}
	
	public void applicationClick() {
		application_nav.click();
	}
	
	public void faqsClick() {
		faqs_nav.click();
	}
	public void contactClick() {
		contact_nav.click();
	}
	public void profileClick() {
		profile_nav.click();
	}
	
//	public void clickLogin() {
//		login_submit.click();
//	}
	
}
