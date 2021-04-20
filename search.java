package fflippack;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search  {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rosario Stanislaus\\Desktop\\Java rosy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		System.out.println("website launched");
		String mainwin=driver.getWindowHandle();
		driver.switchTo().window(mainwin);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		System.out.println("pop up closed");
		
		WebElement ty= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		ty.sendKeys("milton flask ");
		driver.findElement(By.className("L0Z3Pu")).click();
		System.out.println("search button clicked");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[5]")).click();
		System.out.println("product div selected");
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement prod=wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("MILTON Glassyii flask insulated bottle, Hot n Cold 500m...")));
		prod.click();
		System.out.println("selected product page opened");
		Thread.sleep(2000);
		Set <String> s=driver.getWindowHandles();
		java.util.Iterator<String> ii=s.iterator();
		String childwin = null;
		while(ii.hasNext())
		{
			 childwin=ii.next();
		}
		driver.switchTo().window(childwin);
		
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("window scrolled down");
		WebDriverWait wait1=new WebDriverWait(driver,30);
		WebElement add=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
		add.click();
		Thread.sleep(2000);
		System.out.println("added to cart");
		driver.switchTo().window(mainwin);
		System.out.println("switched to main window");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[5]/div/div/a/span")).click();
		System.out.println("opened cart");
		driver.quit();
		System.out.println("Driver quit successfully");
	
		
	}
}
		
		
		