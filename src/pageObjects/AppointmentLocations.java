package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppointmentLocations {
	
	private static WebElement element=null;
	
	public static WebElement ShowMap(WebDriver dr){
		element =dr.findElement(By.id("show"));
		return element;
		
	}

	public static WebElement ViewAppointment1(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_locationListControl_locationsGrid_ctl02_ViewAppointmentsLink"));
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
