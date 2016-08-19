package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Login_Page;
import utility.ExcelUtilis;

public class SignIn_Action {

	public static void Login_action(WebDriver dr) throws Exception{
		String Sname=ExcelUtilis.getCellData(1, 1);
		String Spass=ExcelUtilis.getCellData(1, 2);
		Login_Page.user_name(dr).sendKeys(Sname);
		Login_Page.password(dr).sendKeys(Spass);
		Login_Page.login_button(dr).click();
		System.out.println("****************************************************************");
		System.out.println("Login done successfully");
		System.out.println("****************************************************************");
	}

}
