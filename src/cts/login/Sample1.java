package cts.login;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\SeleniumPrograms\\driver\\chromedriver.exe");		
WebDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-form/");
driver.manage().window().maximize();
WebElement multipleSelect = driver.findElement(By.id("continentsmultiple"));
	Select s=new Select(multipleSelect);
	s.selectByVisibleText("Africa");		
	s.selectByIndex(6);	
	s.selectByValue("AS");
	List<WebElement> options = s.getOptions();
	int size=options.size();
	System.out.println(size);
	//for (int i = 0; i < size; i++) {
	//	String text=options.get(i).getText();
	//	System.out.println(text);		
	//}
	//for (WebElement x : options) {
	//     System.out.println(x.getText());
	//	}	
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement x : allSelectedOptions) {
		System.out.println(x.getText());
		}
	s.deselectByValue("AS");
	s.selectByIndex(6);
	s.deselectAll();
	
	driver.close();	
}

}
