package campaignTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Genericmethods.Propertiyfileutility;
import Genericmethods.WebDriverUtility;
import Genericmethods.javaUtility;
import Objectrepositary.Campaingspage;
import Objectrepositary.CreateCampaignInfoPage;
import Objectrepositary.CreateNewCampaignPage;
import Objectrepositary.homePage;
import Objectrepositary.loginPage;
import checking.ExcelfileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignUsingTest {

	public static void main(String[] args) throws IOException,FileNotFoundException, InterruptedException
	{
		Random ran=new Random();
		int random=ran.nextInt(3000);
		
		//Create all the object of all utilities
		 
		javaUtility jutil=new javaUtility();
		WebDriverUtility wutil=new WebDriverUtility();
		ExcelfileUtility eutil=new ExcelfileUtility();
		Propertiyfileutility putil=new Propertiyfileutility();
		
		System.out.println("create utility");
		
		WebDriver driver=null;
		
		//Read all the required data
		String BROWSER=putil.readDataFromPropertyFile("browser");
		String URL=putil.readDataFromPropertyFile("url");
		String USERNAME=putil.readDataFromPropertyFile("username");
		String PASSWORD=putil.readDataFromPropertyFile("password");
		
		System.out.println("Read Data");
		//CONTACT NUMBER NEEDED
		String CAMPAIGNNAME =eutil.readDataFromExcel("Sheet2", 4, 2);//+jutil.getRandomnumber();
		String CAMPAIGNTYPE =eutil.readDataFromExcel("Sheet2", 4, 3);
		
		System.out.println("Excel Sheet");
	
		
		//Step1  Lanuch the browser usinr - runtime polymorphism
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			System.out.println(BROWSER+"lanuched");
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			System.out.println(BROWSER+"lanuched");
		}
		else
		{
			System.out.println("invalid browser");
		}
	
		System.out.println("Browser Lanuched");
		
		
		wutil.maximizeWindow(driver);
		wutil.waitForPageLoad(driver);
		
		driver.get(URL);
		
		System.out.println("Browser opened");
	
		//login to application
		loginPage lp=new loginPage(driver);
		lp.loginToapp(USERNAME, PASSWORD);
		System.out.println("Login to browser");
		
		//Navigate to Campaign Links
		homePage hp=new homePage(driver);
		hp.clickOnCampaignslnk(driver);
		System.out.println("");
		
		//click on create campaign look up image
		Campaingspage cp= new Campaingspage(driver);
		cp.clickOnCreateCampaignLookUpImg();
		
		//create a new campaign with campaing type dropdown
		CreateNewCampaignPage cncp = new CreateNewCampaignPage(driver);
		cncp.createNewCapaign(CAMPAIGNNAME,CAMPAIGNTYPE);
		
		//validate for campaign
		CreateCampaignInfoPage cip=new CreateCampaignInfoPage(driver);
		String CampHeader=cip.getcampaignHeaderText();
		if(CampHeader.contains(CAMPAIGNNAME))
		{
			System.out.println(CampHeader);
			System.out.println("pass");
		}
		else
		{ 
			System.out.println("fail");
		}
		
		//logout
		hp.logOutApplnk(driver);
		
		
		//close the broser
		
		driver.quit();
		
		
		
		
	}
}
