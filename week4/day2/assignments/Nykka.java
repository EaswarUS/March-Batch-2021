package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykka {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();

		// search perfume
		driver.findElement(By.id("SearchInputBox")).sendKeys("Perfumes", Keys.ENTER);

		List<WebElement> productlist = driver
				.findElements(By.xpath("//div[@class='product-list-box card desktop-cart']"));
		TreeMap<Integer, WebElement> productMap = new TreeMap<Integer, WebElement>();
		for (WebElement webElement : productlist) {
			WebElement productname = webElement.findElement(By.tagName("h2"));
			String price = webElement.findElement(By.className("post-card__content-price-offer")).getText();
			System.out.println(productname.getText() + "--" + "Rs." + " " + price + " ");

			int priceval = Integer.parseInt(price.replaceAll("\\D", ""));
			productMap.put(priceval, webElement);
		}

		int highestPriceKey = productMap.descendingKeySet().first();
		productMap.get(highestPriceKey).click();
		Thread.sleep(3000);

		// move to new window
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow.size());

		List<String> allwindows = new ArrayList<String>(allwindow);
		String secondwindow = allwindows.get(1);
		driver.switchTo().window(secondwindow);

		Thread.sleep(3000);

		// add to bag
		driver.findElement(By.xpath("//button[text()='ADD TO BAG']")).click();
		String verifyitemadded = driver.findElement(By.xpath("//div[text()='Item added to cart']")).getText();
		System.out.println("The item added was verified " + verifyitemadded);

		// click on bag
		driver.findElement(By.xpath("//div[@class='cursor-hand arrowup-tooltip']//div[1]")).click();
		List<String> paywindow = new ArrayList<String>(allwindow);
		String secwindow = paywindow.get(1);
		driver.switchTo().window(secwindow);

		// get grand total
		String grandtot = driver.findElement(By.xpath("//div[text()='Grand Total']/following-sibling::div")).getText();
		String grandtotal = grandtot.replaceAll("[^0-9]", "");
		Thread.sleep(3000);
		int gtotal = Integer.parseInt(grandtotal);
		System.out.println("The Grand total " + gtotal);
		Thread.sleep(3000);
		// proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//div[text()='Checkout as guest']/following-sibling::button")).click();
		// fill address
		driver.findElement(By.name("name")).sendKeys("Shenba");
		driver.findElement(By.name("email")).sendKeys("shenbagavallibe@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("9597738795");
		driver.findElement(By.name("pinCode")).sendKeys("600028");
		driver.findElement(By.xpath("//legend[text()='Address']/following-sibling::textarea"))
				.sendKeys("ramakrishnan street, Chennai");

		driver.findElement(By.xpath("//div[@class='shipping-address-wrap']/following-sibling::button[1]")).click();
		driver.findElement(By.xpath("//button[text()='PAY ₹']")).click();

		// error messages
		String carderror = driver.findElement(By.xpath("//span[text()='This field is required.']")).getText();
		System.out.println("Error for card " + carderror);
		String expiry = driver.findElement(By.xpath("(//div[contains(@class,'form-field mt10')]//span)[3]")).getText();
		System.out.println("card expiry error " + expiry);
		String cvv = driver.findElement(By.xpath("(//span[@class='field-error'])[3]")).getText();
		System.out.println("Cvv error " + cvv);

		// close current window
		driver.quit();
	}

}
