package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fblogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul\\Desktop\\cd\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement UserID = driver.findElement(By.xpath("//INPUT[@id='email']"));
        UserID.sendKeys("kondetidinesh08@gmail.com");
        
        WebElement Password = driver.findElement(By.xpath("//INPUT[@id='pass']"));
        Password.sendKeys("kondeti08");
        
        WebElement Submit = driver.findElement(By.xpath("//BUTTON[@type='submit']"));
        Submit.click();

	}

}