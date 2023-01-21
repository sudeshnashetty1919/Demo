package tricentis;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class TricentisLogin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "‪C:\\Users\\neetu\\eclipse-workspace\\selenium\\Edgedriver\\msedgedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\selenium\\lib\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement title= driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		title.isDisplayed();
		WebElement logIn=driver.findElement(By.xpath("//a[@href='/login']"));
		logIn.click();
		WebElement eMail=driver.findElement(By.xpath("//input[@id='Email']"));
		eMail.sendKeys("sudeshnashetty2211@gmail.com");
		WebElement passW=driver.findElement(By.xpath("//input[@id='Password']"));
		passW.sendKeys("987654Suddu@");
		WebElement logIn1=driver.findElement(By.xpath("//input[@value='Log in']"));
		logIn1.click();////div[@class='header-links']//ul//li//a[@class='account']
		////div[@class='header-links']//child::ul//a[@class='account']
		String userId=driver.findElement(By.xpath("//div[@class='header-links']//child::ul//a[@class='account']")).getText();
		System.out.println("userID="+userId);
		String expectedUserId="sudeshnashetty2211@gmail.com";
		Assert.assertEquals(userId, expectedUserId);
		driver.close();
	}

}
