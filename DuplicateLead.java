package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import Week2.Day1.CreateLead;

public class DuplicateLead {

	public static void main(String[] args) {

		System.out.println("Edit");

		CreateLead objDriver = new CreateLead();
		WebDriver getDriver = objDriver.LoginPage();

		objDriver.NewLead(getDriver);

		// Click on edit button
		getDriver.findElement(By.linkText("Duplicate Lead")).click();

		// Clear the CompanyName Field using .clear() And Enter new CompanyName
		WebElement elementCompanyName = getDriver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.clear();
		elementCompanyName.sendKeys("Copybook Copy Centre");

		// Clear the FirstName Field using .clear() And Enter new FirstName
		WebElement elementFirstName = getDriver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.clear();
		elementFirstName.sendKeys("Magesh");

		// Click on update button
		getDriver.findElement(By.className("smallSubmit")).click();

		// Get the Title of Resulting Page. refer the video using driver.getTitle()
		System.out.println(getDriver.getTitle());
	}
}
