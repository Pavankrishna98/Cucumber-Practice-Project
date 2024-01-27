package pomFrameworkWithPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {

	RemoteWebDriver driver = null;

	@FindBy(name = "username")
	private WebElement u_name_txt;
	@FindBy(name = "password")
	WebElement p_wd_txt;
	@FindBy(xpath = "//*[@type='submit']")
	WebElement lgn;

	public Page1(RemoteWebDriver ordriver) {
		this.driver = ordriver;
		PageFactory.initElements(driver, this);
	}

	public void user_name(String uname) {
		u_name_txt.sendKeys(uname);
	}

	public void pwrd(String pwrd) {
		p_wd_txt.sendKeys(pwrd);
	}

	public void lgn_btn() {
		lgn.click();
	}
}
