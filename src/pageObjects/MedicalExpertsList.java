package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MedicalExpertsList {

	private static WebElement element=null;
	
	public static WebElement manageDiary(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_serviceProviderGridView_ctl02_ManageDiaryLink"));
		return element;
		
	}
	
	public static WebElement Search(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_searchButton"));
		return element;
		
	}
	
	public static WebElement Close(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_cancelButton"));
		return element;
		
	}
	
}
