package co.AutomizeApps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assessment_1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/KING/Downloads/chromedriver_win32/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");

		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//Search for mixer grinder
		WebElement w = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		w.sendKeys("mixer grinder");
		Thread.sleep(2000);
		w.submit();
		
		driver.navigate().back();
		
		//Search for Ceiling Fans
		WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		w1.sendKeys("Ceiling Fans");
		Thread.sleep(2000);
		w1.submit();
//		Thread.sleep(2000);
		
//		driver.quit();

	}

}
