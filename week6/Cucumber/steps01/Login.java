package steps01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login   extends BaseClass{
	


//TC001
//@Given("Open Chrome Browser")
//	public void openChromeBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//
//	}
@Given("Load the application Url")
	public void LoadappUrl() {
		
		driver.get("http://leaftaps.com/opentaps/");

	}
@Given("Enter the Username as {string}")
	public void EnterUsername(String username) {
		
		driver.findElementById("username").sendKeys(username);

	}
@Given("Enter the Password as {string}")
	public void EnterPassword(String password) {
		
		driver.findElementById("password").sendKeys(password);

	}
@When("Click on login button")
	public void ClickLoginButton() {
		
		driver.findElementByClassName("decorativeSubmit").click();

	}
@Then("Home page should be displayed")
	public void verifyHomePage() {
	boolean displayed = driver.findElementByLinkText("CRM/SFA").isDisplayed();
		Assert.assertTrue(displayed);

	}

@But("Error message should be displayed")
public void errorMessage() {
	
	System.out.println("Error message is Displayed");
}








//TC002

@Given("Click on CRMSFA link")
public void clickCrmsfa() {
	
	driver.findElementByLinkText("CRM/SFA").click(); 
	

}

@Given("Click on Leads button")
public void clickLeads() {
	
	driver.findElementByLinkText("Leads").click(); 
	

}

@Given("Click on Create Leads button")
public void createLeads() {
	
	driver.findElementByLinkText("Create Lead").click(); 

}

@Given("Enter company as TestLeaf ")
public void companyName() {
	
	driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");

}

@Given("Enter FirstName as Easwar")
public void firstName() {
	
	driver.findElementById("createLeadForm_firstName").sendKeys("Easwar");

}

@Given("Enter SecondName as US")
public void secondName() {
	
	driver.findElementById("createLeadForm_lastName").sendKeys("US"); 

}

@Given("Enter number as 9080512768")
public void phoneNumber() {
	
	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9080512768");

}

@When("Click the Submit button")
public void clickSubmit() {
	
	driver.findElementByName("submitButton").click(); 

}
}








