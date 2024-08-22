package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Page.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefinition {
	WebDriver driver;
	loginpage loginpage;
	@Given("user should open any browser")
	public void user_should_open_any_browser() {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@And("user should be on login page of orangehrm")
	public void user_should_be_on_login_page_of_orangehrm() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^enter (.*) and (.*)$")
	public void enter_user_and_password(String user,String password) {
		loginpage=new loginpage(driver);
		loginpage.setusername(user);
		loginpage.setpassword(password);
		
		
	   	}

	@And("click login button")
	public void click_login_button() {
	  loginpage.login();
	}

	@Then("user must be on home page")
	public void user_must_be_on_home_page() {
	  System.out.println("user is on home page");
	}

	@And("check title of home page is correct")
	public void check_title_of_home_page_is_correct() throws InterruptedException {
		Thread.sleep(5000);
	  loginpage.homepage();
	}


}
