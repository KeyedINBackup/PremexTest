package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchForAppointment {

	private static WebElement element=null;
	
	public static WebElement BookingReferenceNo(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_refNumberTextBox"));
		return element;
		
	}
	
	public static WebElement CaseReference(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_caseRefTextBox"));
		return element;
		
	}
	
	public static WebElement InjuredpartySurname(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_IPSurnameTextBox"));
		return element;
		
	}
	
	public static WebElement AppointmentFromDate(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_AppointmentStartTimeTextBox"));
		return element;
		
	}
	
	public static WebElement AppointmentToDate(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_AppointmentEndTimeTextBox"));
		return element;
		
	}
	
	public static WebElement BookingFromDate(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_BookingTimeStartTimeTextBox"));
		return element;
		
	}
	
	public static WebElement BookingToDate(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_BookingTimeEndTimeTextBox"));
		return element;
		
	}
	
	public static WebElement SearchButton(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_searchButton"));
		return element;
		
	}
	
	public static WebElement CancelButton(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_BookingTimeEndTimeTextBox"));
		return element;
		
	}
	
	public static WebElement BookingID(WebDriver dr){
		element =dr.findElement(By.xpath(".//*[@id='ctl00_mainContentPlaceHolder_searchResultGrid']/tbody/tr[2]/td[3]"));
		return element;
		
	}
	
	public static WebElement Home(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_cancel2Button"));
		return element;
		
	}
	
}

