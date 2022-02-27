package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import Week2.Day1.CreateLead;

public class EditLead {
	
	public static void main(String[] args) {
		
		System.out.println("Edit");
		
		CreateLead objDriver = new CreateLead();
		WebDriver getDriver = objDriver.LoginPage();
		
		objDriver.NewLead(getDriver);

		// Click on edit button
				getDriver.findElement(By.linkText("Edit")).click();

		// Clear the Description Field using .clear()
				getDriver.findElement(By.id("updateLeadForm_description")).clear();
				
		// Fill ImportantNote Field with Any text
				getDriver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Lead");

		// Click on update button
				getDriver.findElement(By.className("smallSubmit")).click();
				
		// Get the Title of Resulting Page. refer the video  using driver.getTitle()
				System.out.println(getDriver.getTitle());

	}
}


