package org.sampledata;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataDrivenTask4 extends BaseClass{
public static void main(String[] args) throws IOException {
	launchBrowser("https://demoqa.com/automation-practice-form/");
	maxWindow();
	WebElement firstName = driver.findElement(By.id("firstName"));
	toSendKeys(firstName, excelRead(1, 0));
	
	WebElement lastName = driver.findElement(By.id("lastName"));
	toSendKeys(lastName, excelRead(1, 1));
	
	WebElement emailId = driver.findElement(By.id("userEmail"));
	toSendKeys(emailId, excelRead(1, 2));
	
	WebElement radioBtn = driver.findElement(By.xpath("//label[text()='Female']"));
	clicking(radioBtn);
	
	WebElement mobileNumber = driver.findElement(By.id("userNumber"));
	toSendKeys(mobileNumber, excelRead(1, 3));
	
//	WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
//	toSendKeys(dob, "25/06/1985");
//	dob.click();
	
	WebElement subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
	javaScriptSendkeys(subject, excelRead(1, 4));
	
	WebElement hobbies = driver.findElement(By.xpath("//label[text()='Music']"));
	clicking(hobbies);
	
	WebElement address = driver.findElement(By.id("currentAddress"));
	toSendKeys(address, excelRead(1, 5));
	
//	WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));
//	selectIndex(state, 1);
//	
//	WebElement city = driver.findElement(By.id("city"));
//	selectIndex(city, 3);
//	
//	WebElement clickSubmit = driver.findElement(By.id("submit"));
//	clicking(clickSubmit);
	
	
	
	
}
}
