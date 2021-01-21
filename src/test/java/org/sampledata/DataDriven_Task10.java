package org.sampledata;

import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataDriven_Task10 extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException {
	launchBrowser("http://www.adactin.com/HotelApp/");
	maxWindow();
	
	WebElement username = driver.findElement(By.id("username"));
	toSendKeys(username, excelRead(1, 0));
	
	WebElement pass = driver.findElement(By.id("password"));
	toSendKeys(pass, excelRead(1, 1));
	
	driver.findElement(By.id("login")).click();
	
	WebElement location = driver.findElement(By.id("location"));
	selectSngleIndex(location, excelRead(1, 2));
	
	WebElement hotelName = driver.findElement(By.id("hotels"));
	selectSngleIndex(hotelName, excelRead(1, 3));
	
	WebElement roomType = driver.findElement(By.id("room_type"));
	selectSngleIndex(roomType, excelRead(1, 4));
	
	WebElement NoOfRooms = driver.findElement(By.id("room_nos"));
	selectIndex(NoOfRooms, 2);
//	selectSngleIndex(NoOfRooms, excelRead(1, 5));
	
	WebElement checkIn = driver.findElement(By.id("datepick_in"));
	toSendKeys(checkIn, excelRead(1, 6));
	
	WebElement checkOut = driver.findElement(By.id("datepick_out"));
	toSendKeys(checkOut, excelRead(1, 7));
	
	WebElement adultRoom = driver.findElement(By.id("adult_room"));
	selectIndex(adultRoom, 3);
//	selectSngleIndex(adultRoom, excelRead(1, 8));
	
	WebElement childRoom = driver.findElement(By.id("child_room"));
	selectIndex(childRoom, 2);
//	selectSngleIndex(childRoom, excelRead(1, 9));
	
	driver.findElement(By.xpath("//input[@id='Submit']")).click();
	
	driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	
	driver.findElement(By.id("continue")).click();
	
	WebElement firstName = driver.findElement(By.id("first_name"));
	toSendKeys(firstName, excelRead(1, 10));
	
	WebElement lastName = driver.findElement(By.id("last_name"));
	toSendKeys(lastName, excelRead(1, 11));
	
	WebElement address = driver.findElement(By.id("address"));
	toSendKeys(address, excelRead(1, 12));
	
	WebElement cardNumber = driver.findElement(By.id("cc_num"));
	toSendKeys(cardNumber, excelRead(1, 13));
	
	WebElement cardType = driver.findElement(By.id("cc_type"));
	selectSngleIndex(cardType, excelRead(1, 14));
	
	WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
	selectSngleIndex(expMonth, excelRead(1, 15));
	
	WebElement expYear = driver.findElement(By.id("cc_exp_year"));
	selectSngleIndex(expYear, excelRead(1, 16));
	
	WebElement cvvNumber = driver.findElement(By.id("cc_cvv"));
	toSendKeys(cvvNumber, excelRead(1, 17));

	driver.findElement(By.id("book_now")).click();
	
    Thread.sleep(5000);
	WebElement orderNumber = driver.findElement(By.id("order_no"));
	String attribute = orderNumber.getAttribute("value");
	System.out.println(attribute);
//	excelWrite(0, 18, "order nubrr")
	excelWrite(1, 18, attribute);
	
	
	
}
}
