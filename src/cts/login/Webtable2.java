package cts.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\SeleniumPrograms\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		List<WebElement> tableCount = driver.findElements(By.tagName("table"));
		int size = tableCount.size();
		System.out.println(size);
		List<WebElement> tRow=driver.findElements(By.tagName("tr"));
			for (int j = 0; j <tRow.size()-2; j++) {
			WebElement eachRow  = tRow.get(j);
            String text=eachRow.getText();
			System.out.println(text);
			
			
			}	
			
		}			
			
}
