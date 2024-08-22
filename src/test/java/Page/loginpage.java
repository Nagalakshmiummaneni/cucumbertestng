package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginpage {

	WebDriver driver;

	By usernamElement = By.name("username");
	By passwordElement = By.name("password");
	By loginElement = By.xpath("//button[@type=\"submit\"]");

	public loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public void setusername(String username) {
		driver.findElement(usernamElement).sendKeys(username);
	}

	public void setpassword(String password) {
		driver.findElement(passwordElement).sendKeys(password);
	}

	public void login() {
		driver.findElement(loginElement).click();
	}
	public void homepage() {
		String value=driver.findElement(By.xpath("//span//h6")).getText();
			System.out.println(value+"home page");
			
	}
}
