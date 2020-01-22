package cts.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowsHandling {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\SeleniumPrograms\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.homedepot.com/");
WebElement search = driver.findElement(By.xpath("//input[@id='headerSearch']"));
	search.sendKeys("celling fan",Keys.ENTER);	
	Thread.sleep(2000);
WebElement fan = driver.findElement(By.xpath("(//div[@class='vis-nav__title vis-nav__title--default'])[1]"));
fan.click();
//WebElement btn = driver.findElement(By.xpath("(//span[@class='product-pod__title__product--text'])[1]"));
//	btn.click();	
	}

}
