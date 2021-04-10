package assesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://erail.in/");
		driver.findElementById("chkSelectDateOnly").click();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.ENTER);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("CAPE",Keys.ENTER);
		
		List<WebElement> trainnames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]");
		List<String> tnNames = new ArrayList<String>();
        for (WebElement tn : trainnames) {
        	String text = tn.getText();
        	tnNames.add(text);
//        	System.out.println(tn.getText());
			
		}
        Collections.sort(tnNames);

		for (String eachName : tnNames) {
			System.out.println(eachName);
        
	}

}
}