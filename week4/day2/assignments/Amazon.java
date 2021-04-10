package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(" https://www.amazon.in/");
		
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles", Keys.ENTER);

		System.out.println(driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText());
		
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		
		Set<String> multiple=driver.getWindowHandles();
		List<String> getwindow= new ArrayList<String>(multiple);
		driver.switchTo().window(getwindow.get(1));
		System.out.println(driver.findElementById("acrCustomerReviewText").getText());
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@value='Add to Cart']").click();
		
		Thread.sleep(2000);
boolean addCart = driver.findElementByXPath("(//h4[text()='Added to Cart'])[2]").isDisplayed();
		
		if (addCart=true) {
			System.out.println("Added to Cart text message appeared");
		}else {
			System.out.println("Added to Cart text message not appeared");
		}
	

		Thread.sleep(3000);
		  driver.findElementByXPath("//span[@id='attach-sidesheet-checkout-button']").click();
		  String tit=driver.getTitle();
			String title="Amazon Sign In";
			if(tit.contentEquals(title)) {
				System.out.println("The tile is verified "+tit);
			}
		  driver.findElementByXPath("//input[@id='continue']").click();
		  Thread.sleep(2000);
		  
          String email = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
          String errorMessage="Enter your email or mobile phone number";
  		if(email.contentEquals(errorMessage))
  		{
  		System.out.println("The error message is verified "+email);
  		}

        
          
          driver.quit();
          

		  }

	}


