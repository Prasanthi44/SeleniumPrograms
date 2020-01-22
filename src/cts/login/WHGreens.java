package cts.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WHGreens {
public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\SeleniumPrograms\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.greenstechnologys.com/");
WebElement contact = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	Actions acc=new Actions(driver);
	acc.moveToElement(contact).perform();
	acc.contextClick().perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);	
String parentWindow=driver.getWindowHandle();
System.out.println("Parent window id is "+parentWindow);
Set<String> allWindowsId = driver.getWindowHandles();
System.out.println("All Windows id "+allWindowsId);
for (String childWindow : allWindowsId) {
	if (!parentWindow.equals(allWindowsId)) {
	driver.switchTo().window(childWindow);
	} }
	System.out.println("Switch into Child Window");
	WebElement add = driver.findElement(By.xpath("//h5[text()='Greens Technologys In ']"));
	System.out.println(add.getText());
		
	}

}
