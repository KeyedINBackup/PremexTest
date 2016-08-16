package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_page {

	private static WebElement element=null;
	
	public static WebElement BookAppointment(WebDriver dr){
		element= dr.findElement(By.id("ctl00_mainContentPlaceHolder_LinkButton1"));
		return element;
	}
	
	public static WebElement CancelAppointment(WebDriver dr){
		element= dr.findElement(By.id("ctl00_mainContentPlaceHolder_cancelLink"));
		return element;
	}
	
	public static WebElement RearrangeAppointment(WebDriver dr){
		element= dr.findElement(By.id("ctl00_mainContentPlaceHolder_rearrangeLink"));
		return element;
	}
	
	public static WebElement manageExpertDiaries(WebDriver dr){
		element= dr.findElement(By.xpath(".//*[@id='userMenu']/div[2]/ul/li[4]/span[1]/a"));
		return element;
	}
	
	public static WebElement SearchAppointments(WebDriver dr){
		element= dr.findElement(By.xpath(".//*[@id='userMenu']/div[2]/ul/li[4]/span[1]/a"));
		return element;
	}
	
	public static WebElement ChangePassword(WebDriver dr){
		element= dr.findElement(By.xpath(".//*[@id='ctl00_mainContentPlaceHolder_Li1']/span[1]/a"));
		return element;
	}
	
	public static WebElement ChangeName(WebDriver dr){
		element= dr.findElement(By.xpath(".//*[@id='ctl00_mainContentPlaceHolder_Li2']/span[1]/a"));
		return element;
	}
	
	
}
