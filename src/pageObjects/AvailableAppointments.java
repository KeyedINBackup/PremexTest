package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AvailableAppointments {
	
	private static WebElement element=null;
	
	public static WebElement ShowMap(WebDriver dr){
		element =dr.findElement(By.id("show"));
		return element;
		
	}

	public static WebElement BookAppointment1(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_slotListControl_slotsGrid_ctl02_bookAppointmentLink"));
		return element;
		
	}
	
	public static WebElement SearchAgain(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_searchButton"));
		return element;
		
	}
	
	public static WebElement Cancel(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_cancelButton"));
		return element;
		
	}

	
}
