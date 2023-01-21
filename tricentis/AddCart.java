package tricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class AddCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\eclipse-workspace\\selenium\\chromedriver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\neetu\\eclipse-workspace\\selenium\\driveredge\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement logIn=driver.findElement(By.xpath("//a[@href='/login']"));
		logIn.click();
		WebElement eMail=driver.findElement(By.xpath("//input[@id='Email']"));
		eMail.sendKeys("sudeshnashetty2211@gmail.com");
		WebElement passW=driver.findElement(By.xpath("//input[@id='Password']"));
		passW.sendKeys("987654Suddu@");
		WebElement logIn1=driver.findElement(By.xpath("//input[@value='Log in']"));
		logIn1.click();
		WebElement Books=driver.findElement(By.xpath("//div[@class='listbox']//child::ul//a[@href='/books']"));
		Books.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
  	  js.executeScript("window.scrollBy(0,200)");
  	WebElement findBook=driver.findElement(By.xpath("//div[@class='details']//a[@href='/computing-and-internet' ]"));
	findBook.click();
	WebElement addCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']"));
	addCart.click();
	/*String productAdd=driver.findElement(By.xpath("//*[contains(text(),'The product has been added to your')]")).getText();*/
	 Thread.sleep(3000);
	String productAdd=driver.findElement(By.xpath("//p[@class='content']")).getText();
	String expectedText="The product has been added to your shopping cart";
	Assert.assertEquals(productAdd, expectedText);
	WebElement Close=driver.findElement(By.xpath("//span[@title='Close']"));
	Close.click();
	WebElement shoppingCart=driver.findElement(By.cssSelector("#topcartlink > a > span.cart-label"));
	//WebElement shoppingCart=driver.findElement(By.xpath("//a[@href='/cart']//child::span[@class='cart-label']"));
	shoppingCart.click();
	//#CountryId
	////*[@id="CountryId"]
	//css-selector=#topcartlink > a > span.cart-label
	////*[@id="topcartlink"]/a/span[1]
	
	
	
  	
		
	}

}
