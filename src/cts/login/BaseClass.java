package cts.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
public static String getData(int row,int cell) throws Throwable {
File loc=new File("C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\MvnProject\\src\\test\\Sample.xlsx");
FileInputStream stream=new FileInputStream(loc);	
Workbook w=new XSSFWorkbook(stream);	
Sheet s=w.getSheet("Sheet4");	
Row r=s.getRow(row);
Cell c=r.getCell(cell);
System.out.println(c);
String value=null;
int cellType=c.getCellType();
if (cellType==1) {
value=c.getStringCellValue();
}
else if (cellType==0) {
if (DateUtil.isCellDateFormatted(c)) {
	Date d=c.getDateCellValue();
	SimpleDateFormat sd=new SimpleDateFormat("MM-DD-YYYY");
	value=sd.format(d);
}
else {
	double numericValue=c.getNumericCellValue();
	long l=(long)numericValue;
	value=String.valueOf(1);
}
}
return value;
}
public static  void selectValue(WebElement element,String ele){
	Select s=new Select(element);
	s.selectByValue(ele);
}
public static  void selectIndex(WebElement element, int ele){
	Select s=new Select(element);
	s.selectByIndex(ele);
}

public static void writeExcel(int row,int cell,String cellValue)throws Throwable {
File loc=new File("C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\MvnProject\\src\\test\\Sample.xlsx");
FileInputStream stream=new FileInputStream(loc);
Workbook w=new XSSFWorkbook(stream);
Sheet s=w.getSheet("Sheet1");
Row r=s.getRow(cell);
Cell c=r.getCell(row);
c.setCellType(cell);
FileOutputStream stream1=new FileOutputStream(loc);
w.write(stream1);
}



}