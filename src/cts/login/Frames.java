package cts.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\SeleniumPrograms\\driver\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/guru99home/");
driver.manage().window().maximize();
 List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
 int size = frameCount.size();
 System.out.println(size);
 driver.switchTo().frame(1);
 driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
 
driver.switchTo().defaultContent();
driver.switchTo().frame("a077aa5e");
driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
//driver.findElement(By.xpath("//iframe[@id='primis_playerSekindoSPlayer5dff1d6741c59']")).click();
driver.quit();

}
}