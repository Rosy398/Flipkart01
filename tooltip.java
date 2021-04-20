package fflippack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosario Stanislaus\\Desktop\\Java rosy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		String org="What's new in 3.2";
		WebElement dwnld= driver.findElement(By.xpath("//*[@id=\"download_now\"]"));
		Actions act=new Actions(driver);
		act.clickAndHold().moveToElement(dwnld);
		act.moveToElement(dwnld).build().perform();
		WebElement txttooltip=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/a")); 
		String actual=txttooltip.getText();
		System.out.println("The actual text is :"+ actual);
		if(actual.equals(org))
		{
			System.out.println("Test Passed");
		}
		driver.close();
		}

	}


