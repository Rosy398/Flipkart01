package fflippack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uplddwlnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosario Stanislaus\\Desktop\\Java rosy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/upload/");
		System.out.println("page loaded successfully");
		WebElement but= driver.findElement(By.id("uploadfile_0"));
		System.out.println("value stored successfully");
		but.sendKeys("C:\\Users\\Rosario Stanislaus\\Desktop\\Java rosy\\upload.html");
		System.out.println("file uploaded successfully");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		driver.close();
		System.out.println("driver closed successfully");
	}

}
