package ExecutionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import pageObjects.AppointmentDiary;
import pageObjects.AppointmentLocations;
import pageObjects.AvailableAppointments;
import pageObjects.BookedAppointments;
import pageObjects.BookingConfirmation;
import pageObjects.CancelAppointmentLink;
import pageObjects.Home_page;
import pageObjects.MedicalExpertsList;
import pageObjects.RearrangeAppointmentlink;
import pageObjects.SearchAvailableAppointments;
import pageObjects.SearchForAppointment;
import pageObjects.SearchMedicalExperts;

import utility.Constants;
import utility.ExcelUtilis;

import appModules.SignIn_Action;

public class OnlineAppointments {
	private static WebDriver dr=null;
	public static String BookingReference;
	
  @Test(enabled=true, priority=0)
  public void BookAppointment() throws Exception {
	  Home_page.BookAppointment(dr).click();
	  ExcelUtilis.setExcelFile(Constants.path + Constants.fileName,Constants.BookingDetails);
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
	  System.out.println("****************************************************************");
	  ExcelUtilis.PrintResult("Booked", 1, 6);
	  BookingConfirmation.HomeButton(dr).click();
  }
  
  @Test(enabled=true, priority=1)
  public static void SearchAppointment() throws Exception{
	  Home_page.SearchAppointments(dr).click();
	  SearchForAppointment.BookingReferenceNo(dr).sendKeys(BookingReference);
	  SearchForAppointment.SearchButton(dr).click();
	  String ReferenceID=SearchForAppointment.BookingID(dr).getText();
	  if(ReferenceID.equalsIgnoreCase(BookingReference)){
		  System.out.println("Searching done successfully");
		  System.out.println("Searched Booking Reference ID is:" +BookingReference);
		  System.out.println("****************************************************************");
		  SearchForAppointment.Home(dr).click();
	  } else {
		  System.out.println("Try again... !");
	  }
	  
  }
  
  @Test(enabled=true, priority=2)
  public static void RearrangeAppointment() throws Exception{
	  ExcelUtilis.setExcelFile(Constants.path + Constants.fileName,Constants.BookingDetails);
	  String EarlierDate=ExcelUtilis.getCellData(1, 1);
	  Home_page.RearrangeAppointment(dr).click();
	  BookedAppointments.BookingReferenceNo(dr).sendKeys(BookingReference);
	  BookedAppointments.Search(dr).click();
	  RearrangeAppointmentlink.RearrangeAppointment(dr).click();
	  String postcode=ExcelUtilis.getCellData(1, 0);
	  SearchAvailableAppointments.FromPostCode(dr).sendKeys(postcode);
	  SearchAvailableAppointments.SearchButton(dr).click();
	  String PS=dr.getPageSource();
	  if(PS.contains(Constants.RearrangePageError)){
		  AppointmentLocations.SearchAgain(dr).click();
		  SearchAvailableAppointments.EarliestDate(dr).clear();
		  SearchAvailableAppointments.EarliestDate(dr).sendKeys(EarlierDate);
		  SearchAvailableAppointments.SearchButton(dr).click();	  
	  }
	  AppointmentLocations.ViewAppointment1(dr).click();
	  AvailableAppointments.BookAppointment2(dr).click();
	  BookingConfirmation.ConfirmBooking(dr).click();
	  BookingReference =BookingConfirmation.BookingReference(dr).getText();
	  System.out.println("Appointment date rearranged done successfully");
	  System.out.println("Rearranged Booking Reference ID is:" +BookingReference);
	  System.out.println("****************************************************************");
	  ExcelUtilis.PrintResult("Rearranged", 1, 7);
	  BookingConfirmation.HomeButton(dr).click();
	  
  }
     
  @Test(enabled=true, priority=3)
  public static void CancelAppointment() throws Exception{
	  Home_page.CancelAppointment(dr).click();
	  BookedAppointments.BookingReferenceNo(dr).sendKeys(BookingReference);
	  BookedAppointments.Search(dr).click();
	  String PS=dr.getPageSource();
	  if(PS.contains(BookingReference)){
		  CancelAppointmentLink.CancelAppointment(dr).click();
		  CancelAppointmentLink.ConfirmCancel(dr).click();
		  BookingReference =BookingConfirmation.BookingReference(dr).getText();
		  System.out.println("Cancel Appointment done successfully");
		  System.out.println("Cancelled Booking Reference ID is:" +BookingReference);
		  System.out.println("****************************************************************");
		  ExcelUtilis.PrintResult("Booking Cancelled", 1, 8);
		  TimeUnit.SECONDS.sleep(2);
		  CancelAppointmentLink.HomeButton(dr).click();
	  }
  }
  
  @Test(enabled=true, priority=4)
  public static void ManageExpertsDiaries() throws Exception{
	  Home_page.manageExpertDiaries(dr).click();
	  dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  ExcelUtilis.setExcelFile(Constants.path + Constants.fileName, Constants.ExpertsDetails);
	  String Surname=ExcelUtilis.getCellData(1, 0);
	  String AppointmentDate=ExcelUtilis.getCellData(1, 1);
	  String AppointmentEndDate=ExcelUtilis.getCellData(1, 2);
	  SearchMedicalExperts.Surname(dr).sendKeys(Surname);
	  SearchMedicalExperts.Search(dr).click();
	  MedicalExpertsList.manageDiary(dr).click();
	  String ExpertName=AppointmentDiary.ExpertName(dr).getText();
	  String ExpertLocation=AppointmentDiary.ExpertLocation(dr).getText();
	  System.out.println("Expert name is :"+ExpertName);
	  System.out.println("Expert Location is :"+ExpertLocation);
	  System.out.println("****************************************************************");
	  AppointmentDiary.AddAvailability(dr).click();
	  AppointmentDiary.Appointmentdate(dr).clear();
	  AppointmentDiary.Appointmentdate(dr).sendKeys(AppointmentDate);
	  Select ST =new Select(AppointmentDiary.StartTimeHour(dr));
	  ST.selectByIndex(4);
	  Select SM =new Select(AppointmentDiary.StartTimeMinutes(dr));
	  SM.selectByIndex(6);
	  Select Duration =new Select(AppointmentDiary.Duration(dr));
	  Duration.selectByValue("45");
	  AppointmentDiary.OkButton(dr).click();
	  TimeUnit.SECONDS.sleep(2);
	  System.out.println("Appointment added successfully");
	  System.out.println("****************************************************************");
	  AppointmentDiary.DeleteAvailability(dr).click();
	  AppointmentDiary.StartDate(dr).clear();
	  AppointmentDiary.StartDate(dr).sendKeys(AppointmentDate);
	  AppointmentDiary.EndDate(dr).clear();
	  AppointmentDiary.EndDate(dr).sendKeys(AppointmentEndDate);
	  AppointmentDiary.SelectAllCheckBox(dr).click();
	  AppointmentDiary.Delete(dr).click();
	  System.out.println("Appointment Deleted successfully");
	  System.out.println("****************************************************************");
	  AppointmentDiary.HomeButton(dr).click();
	  
	  }
  
  @BeforeTest(alwaysRun = true)
  public void beforeTest() throws Exception {
	  	dr=new FirefoxDriver();
		dr.navigate().to(Constants.URL);
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ExcelUtilis.setExcelFile(Constants.path + Constants.fileName, Constants.loginDetails);
		// Using login now 
		SignIn_Action.Login_action(dr);
		ExcelUtilis.PrintResult("Pass", 1, 3);
		
  }

  @AfterTest(alwaysRun = true)
  public void afterTest() {
	  dr.close();
  }

}
