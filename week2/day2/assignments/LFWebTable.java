package selenium.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LFWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		 driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    driver.get(" http://www.leafground.com/pages/table.html");
		    
		    WebElement table = driver.findElementById("table_id");
		    List<WebElement> rows = driver.findElementsByXPath("//table[@class='display']//tr");
		    List<WebElement> clm = driver.findElementsByXPath("//table[@class='display']//tr/th");
		    
		    System.out.println(rows.size());
		    System.out.println(clm.size());
		    String text = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[2]").getText();
		    System.out.println("Learn to interact with Elements="+ text);
		    
		    List<WebElement> list  = driver.findElementsByXPath("//table[@id='table_id']//tr/td[2]");
		    for (WebElement ele : list) {
		    	System.out.println(ele.getText());
				
			}

	}

}
