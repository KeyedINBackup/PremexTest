package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppointmentDiary {
	
	private static WebElement element= null;
	
	public static WebElement ExpertName(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_ServiceProviderLabel"));
		return element;
		
	}
	
	public static WebElement ExpertLocation(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_LocationsList"));
		return element;
		
	}
	
	public static WebElement AddAvailability(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_AddAppointment"));
		return element;
		
	}
	
	public static WebElement Appointmentdate(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_InsertSlots_AppointmentDateTextBox"));
		return element;
		
	}
	
	public static WebElement StartTimeHour(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_InsertSlots_StartTimeHourList"));
		return element;
		
	}
	
	public static WebElement StartTimeMinutes(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_InsertSlots_StartTimeMinuteList"));
		return element;
		
	}
	
	public static WebElement Duration(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_InsertSlots_Duration"));
		return element;
		
	}
	
	public static WebElement SessionBookingCheckBox(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_InsertSlots_SessionBookingCheckBox"));
		return element;
		
	}
	
	public static WebElement RecurrenceCheckBox(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_InsertSlots_RecurrenceCheckBox"));
		return element;
		
	}
	
	public static WebElement OkButton(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_InsertSlots_OkButton"));
		return element;
		
	}
	
	public static WebElement Cancel(WebDriver dr){
		element=dr.findElement(By.xpath(".//*[@value='Cancel']"));
		return element;
		
	}
	
	public static WebElement DeleteAvailability(WebDriver dr){
		element=dr.findElement(By.id("BulkDeleteButton"));
		return element;
		
	}
	
	public static WebElement StartDate(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_BulkDeleteSlots_StartDateTextBox"));
		return element;
		
	}
	
	public static WebElement EndDate(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_BulkDeleteSlots_EndDateTextBox"));
		return element;
		
	}
	
	public static WebElement SelectAllCheckBox(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_BulkDeleteSlots_SlotsToDeleteRepeater_ctl00_SelectAllCheckBox"));
		return element;
		
	}
	
	public static WebElement Delete(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_BulkDeleteSlots_OkButton"));
		return element;
		
	}
	
	public static WebElement CancelButton(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_BulkDeleteSlots_CancelButton"));
		return element;
		
	}
	
	public static WebElement SearchAgainButton(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_SearchAgainButton"));
		return element;
		
	}
	
	public static WebElement HomeButton(WebDriver dr){
		element=dr.findElement(By.id("ctl00_mainContentPlaceHolder_expertDiaryControl_HomeButton"));
		return element;
		
	}
	
	
	
	
	
	
	
}
