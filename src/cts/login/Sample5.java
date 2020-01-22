package cts.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Sample5 {
public static void main(String[] args){
System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\SeleniumPrograms\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	
driver.manage().window().maximize();
driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
WebElement element = driver.findElement(By.xpath("//select[@id='dcdrLocation']"));
Select s=new Select(element);	
s.selectByIndex(2);
WebElement element2 = driver.findElement(By.xpath("//select[@id='hintQues']"));
Select s1=new Select(element2);	
s1.selectByValue("First School");

//s.selectByValue("Bareilly");
//s.selectByValue("Bhopal");
//s.selectByValue("Chandigarh");
//s.selectByValue("Coimbatore");
List<WebElement> options = s1.getOptions();
for(WebElement x:options) {
System.out.println(x.getText());
}
	
	
	
	
	
	
}

}
