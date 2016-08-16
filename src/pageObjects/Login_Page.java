package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

	private static WebElement element=null;
	
	public static WebElement user_name(WebDriver dr){
		element = dr.findElement(By.id("ctl00_mainContentPlaceHolder_loginControl_loginViewControl_LoginControl_UserName"));
		return element;	
	}
	
	public static WebElement password(WebDriver dr){
		element = dr.findElement(By.id("ctl00_mainContentPlaceHolder_loginControl_loginViewControl_LoginControl_Password"));
		return element;	
	}
	
	public static WebElement login_button(WebDriver dr){
		element = dr.findElement(By.id("ctl00_mainContentPlaceHolder_loginControl_loginViewControl_LoginControl_LoginButton"));
		return element;	
	}
	
	public static WebElement Forgot_login(WebDriver dr){
		element = dr.findElement(By.id("ctl00_mainContentPlaceHolder_loginControl_loginViewControl_ForgottenPassword_Hyperlink"));
		return element;	
	}
	
}
