package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchAvailableAppointments {
	
	private static WebElement element=null;
	
	public static WebElement FromPostCode(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_availabilitySearchControl_postCodeTextBox"));
		return element;
		
	}

	public static WebElement ExpertType(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_availabilitySearchControl_expertTypeList"));
		return element;
		
	}
	
	public static WebElement ExpertSurname(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_availabilitySearchControl_expertNameTextBox"));
		return element;
		
	}
	
	public static WebElement MaxTravelDistance(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_availabilitySearchControl_distanceList"));
		return element;
		
	}
	
	public static WebElement EarliestDate(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_availabilitySearchControl_startDateTextBox"));
		return element;
		
	}
	
	public static WebElement latestDate(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_availabilitySearchControl_endDateTextBox"));
		return element;
		
	}
	
	public static WebElement AppointmentTime(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_availabilitySearchControl_timeList"));
		return element;
		
	}
	
	public static WebElement SearchButton(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_availabilitySearchControl_searchButton"));
		return element;
		
	}
	
	public static WebElement CancelButton(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_availabilitySearchControl_cancelButton"));
		return element;
		
	}
	
	
	
}
