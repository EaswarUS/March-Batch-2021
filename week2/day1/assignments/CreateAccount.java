package assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElementByLinkText("Accounts").click();
	    driver.findElementByLinkText("Create Account").click();
	    
	    driver.findElementByXPath("//input[@id='accountName']").sendKeys("Easwar");
        driver.findElementByName("description").sendKeys("Selenium Automation Tester");
        driver.findElementByName("parentPartyId").sendKeys("democlass1");
        
        driver.findElementByXPath("//input[@name='groupNameLocal']").sendKeys("USE");
        driver.findElementById("officeSiteName").sendKeys("Testleaf");
        driver.findElementById("annualRevenue").sendKeys("200000");
        driver.findElementByName("industryEnumId").sendKeys("Computer Software");
        WebElement Ownership=driver.findElementByName("ownershipEnumId");
        Select drop1= new Select(Ownership);
        drop1.selectByVisibleText("S-Corporation");
        WebElement Source=driver.findElementById("dataSourceId");
        Select drop2= new Select(Source);
        drop2.selectByValue("LEAD_EMPLOYEE");
        WebElement Marketing=driver.findElementById("marketingCampaignId");
        Select drop3= new Select(Marketing);
        drop3.selectByIndex(6);
        WebElement State=driver.findElementByName("generalStateProvinceGeoId");
        Select drop4= new Select(State);
        drop4.selectByValue("TX");
        driver.findElementByXPath("//input[@value='Create Account']").click();
	 String title = driver.getTitle();
        System.out.println(title);
        if (title.contains("Create Account")) {
        	System.out.println("Home Page is verified");
			
		}
        else {
        	System.out.println("Home Page is not verified");
		}	
        
		
		

	}

}
