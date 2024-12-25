package SeleniumProjectSampleNew.Sabarib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Broswerlaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement myTextBox = driver.findElement(By.id("my-text-id"));
		myTextBox.sendKeys("Sabari");
		
		driver.findElement(By.name("my-password")).sendKeys("crmsfa");
		
		driver.findElement(By.name("my-textarea")).sendKeys("Beasant Technology");

		Thread.sleep(3000);
		
		driver.close();	
		

	}

}
