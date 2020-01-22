package cts.login;

import org.openqa.selenium.By;

public class BaseClass1 extends BaseClass {
	public static void main(String[] args) {
		Launch();
	driver.get("https://www.facebook.com/");
	
	type(driver.findElement(By.id("email")),"dfgwdveghfenb");	
	type(driver.findElement(By.id("pass")),"dvwdgdbe");	
	btn(driver.findElement(By.xpath("//input[@value='Log In']")));	
		getUrl();
		getTitle();
		closeBrowser();
	}

}
