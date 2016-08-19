package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookedAppointments {

	private static WebElement element=null;
	
	public static WebElement BookingReferenceNo(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_appointmentSearchControl_refNumberTextBox"));
		return element;
		
	}

	public static WebElement ExpertSurname(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_appointmentSearchControl_expertNameTextBox"));
		return element;
		
	}
	
	public static WebElement ExpertPostCode(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_appointmentSearchControl_postCodeTextBox"));
		return element;
		
	}
	
	public static WebElement Search(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_appointmentSearchControl_searchButton"));
		return element;
		
	}
	
	public static WebElement Cancel(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_appointmentSearchControl_cancelButton"));
		return element;
		
	}
	
}
