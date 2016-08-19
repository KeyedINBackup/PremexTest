package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchMedicalExperts {

	private static WebElement element=null;
	
	public static WebElement Surname(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_surnameTextBox"));
		return element;
		
	}
	
	public static WebElement ExpertReference(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_webReferenceTextBox"));
		return element;
		
	}
	
	public static WebElement LocationReference(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_locationReferenceTextBox"));
		return element;
		
	}
	
	public static WebElement FirstLineOfAddress(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_addressLine1TextBox"));
		return element;
		
	}
	
	public static WebElement Town(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_townTextBox"));
		return element;
		
	}
	
	public static WebElement PostCode(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_postCodeTextBox"));
		return element;
		
	}
	
	public static WebElement Search(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_SearchButton"));
		return element;
		
	}
	
	public static WebElement Cancel(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_cancelButton"));
		return element;
		
	}
	
	
}
