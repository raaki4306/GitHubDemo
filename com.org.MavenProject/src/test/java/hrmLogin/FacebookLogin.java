package hrmLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	@Test
	public void operation() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("9063871030");
		driver.findElement(By.id("pass")).sendKeys("pspk9063871030");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		
		
	}
	@Test
	public void validation() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='x1n2onr6 x78zum5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x3x7a5m x6prxxf xvq8zen xk50ysn xzsf02u x1yc453h'])[position()=5]")).click();
		Thread.sleep(4000);
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
