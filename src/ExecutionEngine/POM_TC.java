package ExecutionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.*;

import appModules.SignIn_Action;

public class POM_TC {

	private static WebDriver dr=null;
	
	public static void main(String[] args) throws Exception{
		
		dr=new FirefoxDriver();
		dr.navigate().to(Constants.URL);
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ExcelUtilis.setExcelFile(Constants.path + Constants.fileName,"Sheet1");
		// Using login now 
		SignIn_Action.Login_action(dr);
		ExcelUtilis.PrintResult("Pass", 1, 3);
		dr.close();
	}
}
