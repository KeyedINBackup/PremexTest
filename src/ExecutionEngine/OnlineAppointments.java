package ExecutionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import pageObjects.AppointmentLocations;
import pageObjects.AvailableAppointments;
import pageObjects.BookingConfirmation;
import pageObjects.Home_page;
import pageObjects.SearchAvailableAppointments;

import utility.Constants;
import utility.ExcelUtilis;

import appModules.SignIn_Action;

public class OnlineAppointments {
	private static WebDriver dr=null;
	String BookingReference;
	
  @Test
  public void BookAppointment() throws Exception {
	  Home_page.BookAppointment(dr).click();
	  ExcelUtilis.setExcelFile(Constants.path + Constants.fileName,"Sheet2");
	  String postcode=ExcelUtilis.getCellData(1, 0);
	  String EarlierDate=ExcelUtilis.getCellData(1, 1);
	  String latestDate=ExcelUtilis.getCellData(1, 2);
	  String FirstName=ExcelUtilis.getCellData(1, 3);
	  String lastName=ExcelUtilis.getCellData(1, 4);
	  String caseReference=ExcelUtilis.getCellData(1, 5);
	  SearchAvailableAppointments.FromPostCode(dr).sendKeys(postcode);
	  Select sel= new Select(SearchAvailableAppointments.ExpertType(dr));
	  sel.selectByIndex(1);
	  Select max= new Select(SearchAvailableAppointments.MaxTravelDistance(dr));
	  max.selectByIndex(5);
	  SearchAvailableAppointments.EarliestDate(dr).clear();
	  SearchAvailableAppointments.EarliestDate(dr).sendKeys(EarlierDate);
	  SearchAvailableAppointments.latestDate(dr).clear();
	  SearchAvailableAppointments.latestDate(dr).sendKeys(latestDate);
	  SearchAvailableAppointments.SearchButton(dr).click();
	  AppointmentLocations.ViewAppointment1(dr).click();
	  AvailableAppointments.BookAppointment1(dr).click();
	  Select title = new Select(BookingConfirmation.Title(dr));
	  title.selectByIndex(1);
	  BookingConfirmation.FirstName(dr).sendKeys(FirstName);
	  BookingConfirmation.SurName(dr).sendKeys(lastName);
	  BookingConfirmation.caseReference(dr).sendKeys(caseReference);
	  BookingConfirmation.ConfirmBooking(dr).click();
	  TimeUnit.SECONDS.sleep(3);
	  String ps=dr.getPageSource();
	  if(ps.contains("Warning")){
		  BookingConfirmation.ConfirmBooking(dr).click();
	  }
	  BookingReference =BookingConfirmation.BookingReference(dr).getText();
	  System.out.println("Booking done successfully");
	  System.out.println("Booking Reference ID is:" +BookingReference);
	  ExcelUtilis.PrintResult("Booked", 1, 6);
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  	dr=new FirefoxDriver();
		dr.navigate().to(Constants.URL);
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ExcelUtilis.setExcelFile(Constants.path + Constants.fileName,"Sheet1");
		// Using login now 
		SignIn_Action.Login_action(dr);
		ExcelUtilis.PrintResult("Pass", 1, 3);
		
  }

  @AfterTest
  public void afterTest() {
//	  dr.close();
  }

}
