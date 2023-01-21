package tricentis;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TricentisRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neetu\\eclipse-workspace\\selenium\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\selenium\\lib\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement register=driver.findElement(By.xpath("//a[@href='/register']"));
		register.click();
		WebElement gender=driver.findElement(By.xpath("//input[@id='gender-female']"));
		gender.click();
		WebElement firstName=driver.findElement(By.xpath("//input[@name='FirstName']"));
		firstName.sendKeys("sudeshna");
		WebElement lastName=driver.findElement(By.xpath("//input[@name='LastName']"));
		lastName.sendKeys("shetty");
		WebElement eMail=driver.findElement(By.xpath("//input[@id='Email']"));
		eMail.sendKeys("1919shivani@gmail.com");
		WebElement passWord=driver.findElement(By.xpath("//input[@name='Password']"));
		passWord.sendKeys("123456");
		WebElement confirmPass=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		confirmPass.sendKeys("123456");
		WebElement confirmRegister=driver.findElement(By.xpath("//input[@id='register-button']"));
		confirmRegister.click();
		WebElement contIune=driver.findElement(By.xpath("//input[@value='Continue']"));
		contIune.click();
		String userId=driver.findElement(By.xpath("//div[@class='header-links']//child::ul//a[@class='account']")).getText();
		System.out.println("userID="+userId);
		String expectedUserId="1919shivani@gmail.com";
		Assert.assertEquals(userId, expectedUserId);
		WebElement logOut=driver.findElement(By.xpath("//a[@href='/logout']"));
		logOut.click();
		driver.close();
		
		

	}

}