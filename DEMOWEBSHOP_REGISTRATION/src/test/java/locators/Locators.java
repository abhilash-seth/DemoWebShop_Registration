package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browser;

public class Locators extends Browser {
	
	public static WebElement homeRegisterLink()
	{
		WebElement home_Register_Link = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		return home_Register_Link;
	}
	
	public static WebElement registrationFirstNameTextbox()
	{
		WebElement registration_FirstName_Textbox = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		return registration_FirstName_Textbox;
	}
	public static WebElement registrationLastNameTextbox() 
	{
		WebElement registration_LastName_Textbox = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		return registration_LastName_Textbox;
	}
	public static WebElement registrationEmailIdTextbox()
	{
		WebElement registration_EmailId_Textbox = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		return registration_EmailId_Textbox;
	}
	public static WebElement registrationPasswordTextbox()
	{
		WebElement registration_Password_Textbox =driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		return registration_Password_Textbox;
	}
	
	public static WebElement registrationConfirmPasswordTextbox()
	{
		WebElement registration_Confirm_Password_Textbox =driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
		return registration_Confirm_Password_Textbox;
	}
	
	public static WebElement registrationRegisterButton()
	{
	
	WebElement registration_Register_Button =driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
	return registration_Register_Button;
	}

//public static void  Allvalid() throws  InterruptedException {
//	
//
//	fname.sendKeys("Abhishek");
//	
//	
//	WebElement lname = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
//	lname.sendKeys("Desale");
//
//	
//	WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
//	email.sendKeys("djijhhijes@gmail.com");
//
//	
//	WebElement pass =driver.findElement(By.xpath("//*[@id=\"Password\"]"));
//	pass.sendKeys("Abhishek@123");
//	
//	
//	WebElement cpass =driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
//	cpass.sendKeys("Abhishek@123");
//	
//	
//	WebElement reg_but =driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
//	reg_but.click();
//	
//	
//	Thread.sleep(1000);
//	WebElement tik = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
//	tik.click();
//	
//	
//	WebElement rik = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
//	rik.click();
//
//}
//
//public static void checkemail() throws InterruptedException {
//	WebElement hjh = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
//	hjh.sendKeys("Abhishek");
//	
//	WebElement abi = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
//	abi.sendKeys("Desale");
//	
//	
//	
//	WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
//	email.sendKeys("abhhhdes@@22@@gmail..com");
//	
//	WebElement reg_but =driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
//	reg_but.click();
//	
//	
//	
//	Thread.sleep(5000);
//	
//	WebElement fname1 = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
//	fname1.clear();
//	
//	
//	WebElement lname2 = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
//	lname2.clear();
//
//	
//	
//	WebElement email1 = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
//	email1.clear();
//	
//	
//}
//public static void checkpass1() {
//	WebElement fname = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
//	fname.sendKeys("Abhishek");
//	
//	
//	WebElement lname = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
//	lname.sendKeys("Desale");
//
//	
//	WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
//	email.sendKeys("djijhhijes@gmail.com");
//
//	
//	WebElement pass =driver.findElement(By.xpath("//*[@id=\"Password\"]"));
//	pass.sendKeys("Abhi@1233");
//	
//	
//	WebElement cpass =driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
//	cpass.sendKeys("Abhi@3213");
//	
//	
//	WebElement reg_but =driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
//	reg_but.click();
//	
//	
//	WebElement fname1 = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
//	fname1.clear();
//	
//	
//	WebElement lname1 = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
//	lname.clear();
//
//	
//	WebElement email1 = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
//	email.clear();
//
//	
//	WebElement pass1 =driver.findElement(By.xpath("//*[@id=\"Password\"]"));
//	pass.clear();
//	
//	
//	WebElement cpass2 =driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
//	cpass2.clear();
//	
//	
//	
//}
//public static void checkpass2() {
//	WebElement fname = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
//	fname.sendKeys("Abhishek");
//	
//	
//	WebElement lname = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
//	lname.sendKeys("Desale");
//
//	
//	WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
//	email.sendKeys("djijhhijes@gmail.com");
//
//	
//	WebElement pass =driver.findElement(By.xpath("//*[@id=\"Password\"]"));
//	pass.sendKeys("Abhi");
//	
//	
//	WebElement cpass =driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
//	cpass.sendKeys("Abhi");
//	
//	
//}

}

