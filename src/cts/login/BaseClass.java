package cts.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static WebDriver driver;
public static void Launch() {

System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\SeleniumPrograms\\driver\\chromedriver.exe"); 
driver=new ChromeDriver();
}
public static void url() {
driver.get("url");
}
public static void type(WebElement ele,String value) {
ele.sendKeys(value);	
System.out.println(value);
	
}
public static void btn(WebElement ele) {
	ele.click();
}
public static void getTitle() {
	driver.getTitle();
}
public static void getUrl() {

driver.getCurrentUrl();
}
public static void closeBrowser() {
driver.close();

}


}