package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RearrangeAppointmentlink {

	private static WebElement element=null;
	
	public static WebElement RearrangeAppointment(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_appointmentListControl_appointmentsGrid_ctl02_cancelAppointmentLink"));
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
	
	public static WebElement ConfirmCancel(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_confirmButton"));
		return element;
		
	}
	
	public static WebElement HomeButton(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_cancelButton"));
		return element;
		
	}
	
	
}
