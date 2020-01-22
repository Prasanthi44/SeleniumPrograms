package cts.login;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\SeleniumPrograms\\driver\\chromedriver.exe");		
WebDriver driver=new ChromeDriver();
driver.get("https://www.snapdeal.com/");
driver.manage().window().maximize();
	
		
		
	}

}
