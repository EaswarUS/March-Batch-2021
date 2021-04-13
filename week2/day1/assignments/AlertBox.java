package leafGrounds;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertBox {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	driver.findElementByXPath("//button[text()='Alert Box']").click();
	Thread.sleep(2000);
	Alert alert =driver.switchTo().alert();
	alert .accept();
	
	driver.findElementByXPath("//button[@onclick='confirmAlert()']").click();
	Thread.sleep(2000);
	Alert conformAlert = driver.switchTo().alert();
	conformAlert.accept();
	
	driver.findElementByXPath("//button[@onclick='confirmPrompt()']").click();
	Thread.sleep(2000);
	Alert text =driver.switchTo().alert();
	Thread.sleep(2000);
	text.sendKeys("testleaf");
	Thread.sleep(2000);
	alert.accept();
	
	driver.findElementByXPath("//button[@onclick='lineBreaks()']").click();
	Thread.sleep(2000);
	Alert breakAlert =driver.switchTo().alert();
	String text2 = breakAlert.getText();
	System.out.println(text2);
	Thread.sleep(2000);
	breakAlert.accept();
	
	WebElement element = driver.findElementByXPath("//button[@onclick='sweetalert()']");
	element.click();
	String text3 = element.getText();
	System.out.println(text3);
	driver.close();
}
}
