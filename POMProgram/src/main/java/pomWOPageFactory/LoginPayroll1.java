package pomWOPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPayroll1 {

	
		// TODO Auto-generated constructor stub
	WebDriver driver;
	By username=By.id("loginform-username");
	By password=By.xpath("//input[@id='loginform-password']");
	By login=By.xpath("//button[@name='login-button']");
	
	
	
	public LoginPayroll1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void enterUserName() {
		driver.findElement(username).sendKeys("carol");
	}
	
	public void enterPassword() {
		driver.findElement(password).sendKeys("1q2w3e4r");
	}
	
	
	public void clickLoginButton() {
		driver.findElement(login).click();
	}

	}


