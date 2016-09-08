package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingConfirmation {
	
	private static WebElement element=null;
	
	public static WebElement ShowMap(WebDriver dr){
		element =dr.findElement(By.id("show"));
		return element;
		
	}

	public static WebElement Title(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_TitleDropDownList"));
		return element;
		
	}
	
	public static WebElement FirstName(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_FirstNameTextBox"));
		return element;
		
	}
	
	public static WebElement SurName(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_SurnameTextBox"));
		return element;
		
	}

	public static WebElement caseReference(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_CaseReferenceTextbox"));
		return element;
		
	}
	
	public static WebElement ConfirmBooking(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_confirmButton"));
		return element;
		
	}
	
	public static WebElement SearchAgain(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_SearchAgainButton"));
		return element;
		
	}
	
	public static WebElement Cancel(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_cancelButton"));
		return element;
		
	}
	
	public static WebElement BookingReference(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_bookingInfo_referenceNumberLabel"));
		return element;
		
	}
	
	public static WebElement HomeButton(WebDriver dr){
		element =dr.findElement(By.id("ctl00_mainContentPlaceHolder_cancelButton"));
		return element;
		
	}
	
}
