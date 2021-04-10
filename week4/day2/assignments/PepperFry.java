package week4.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PepperFry {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//close sweet alert
		driver.findElement(By.xpath("//div[@id='regPopUp']//a")).click();
		//driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		
		//mouseover to choose furniture
		 WebElement furniture=driver.findElement(By.xpath("//*[@id=\"menu_wrapper\"]/ul/li[1]/a"));
		 Actions builder=new Actions(driver);
	     builder.moveToElement(furniture).perform();
	    // WebElement chair=driver.findElement(By.xpath("//div[text()='Chairs']"));
	     //builder.moveToElement(chair).perform();
	     driver.findElement(By.xpath("//a[text()='Office Chairs']")).click();
	     //executive chair
	     driver.findElement(By.xpath("(//div[@class='cat-wrap-ttl']//h5)[2]")).click();
	     //height
	     driver.findElement(By.xpath("(//div[@class='clip__filter-dimension-input-holder']//input)[3]")).sendKeys("50",Keys.ENTER);
	     //search the Galician High Back
	     driver.findElement(By.id("search")).sendKeys("Galician High Back",Keys.ENTER);
	     //add to wishlist
	     driver.findElement(By.xpath("(//div[contains(@class,'clip-prd-hrt pf-col')]//a)[2]")).click();
	     //mouse over for bedroom
	     WebElement bedroom=driver.findElement(By.xpath("(//div[contains(@class,'menu_wrapper transition')]//a)[3]"));
	     builder.moveToElement(bedroom).perform();
	     
	     driver.findElement(By.xpath("//div[@id='meta-bedroom']//div[4]//div[3]/a[1]")).click();
	     //choose spacewood
	     
	     //driver.findElement(By.xpath("driver.findElement(By.xpath(\"//input[@id='brandsnameSpacewood']/following-sibling::label[1]\")).click();")).click();
	     driver.findElement(By.xpath("//input[@id='brandsnameSpacewood']/following-sibling::label[1]")).click();
	     
	     driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
	     driver.findElement(By.xpath("//span[contains(@class,'wewidgeticon we_close')]")).click();
	     driver.switchTo().defaultContent();
		//select 7k to 8k
	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	     
	     WebElement price=driver.findElement(By.xpath("//label[text()='₹ 7,000 to ₹ 8,000']"));
	     builder.click(price).perform();
	     
	     driver.findElement(By.xpath("//a[@data-productname='SOS Carter Study Table in Lorraine walnut & silver grey Finish']")).click();
	     
	     //get wishlist count
	     String wishlistcount = driver.findElement(By.xpath("//span[@id='wishlist_mini_cart']")).getText();
	     System.out.println(wishlistcount);
	     
	     driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
	     driver.findElement(By.xpath("//div[@class='action_block']//a")).click();
	     driver.findElement(By.xpath("//div[@class='minicart_footer']//a[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.className("order_summary_pincode")).sendKeys("600028");
	     driver.findElement(By.id("pin_check")).click();
	     driver.findElement(By.xpath("//a[@href='https://www.pepperfry.com/checkout/onepage/']")).click();
		

	}

}