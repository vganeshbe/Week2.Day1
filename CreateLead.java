package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	
	public WebDriver LoginPage() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		return(driver);
	}
	
	public void NewLead(WebDriver driver) {
		
//		CreateLead webD = new CreateLead();
//		WebDriverManager driver = webD.getDriver();

//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");

//Window Management (Maximize)		
		driver.manage().window().maximize();

//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

//Click on Create Lead		
		driver.findElement(By.linkText("Create Lead")).click();

//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Copybook Copy Services");

//Enter FirstName Field Using id Locator		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ganesh");

//Enter LastName Field Using id Locator	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vasudevan");

//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ajay");

//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Techincal");

//Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Having 5 years technical experience");

//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vganeshbe.nz@gmail.com");

//Select State/Province as NewYork Using Visible Text
		WebElement elementDDState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD = new Select(elementDDState);

		stateDD.selectByVisibleText("New York");

//Click on Create Button 		
		driver.findElement(By.className("smallSubmit")).click();

	}

	public static void main(String[] args) {

		CreateLead objCreateLead = new CreateLead();
		WebDriver getDriver = objCreateLead.LoginPage();
		
		objCreateLead.NewLead(getDriver);
		
		System.out.println(getDriver.getTitle());

	}

}
