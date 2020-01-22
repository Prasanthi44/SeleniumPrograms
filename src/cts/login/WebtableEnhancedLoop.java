package cts.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebtableEnhancedLoop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\SeleniumPrograms\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
	for (WebElement eachRow : tRow) {
		List<WebElement> tData = driver.findElements(By.tagName("td"));
		for (WebElement eachData : tData) {
			 String text = eachData.getText();
			 
			if(text.equals("Dubai")) { 
				System.out.println(text);
			}
		}
		}
}
}
