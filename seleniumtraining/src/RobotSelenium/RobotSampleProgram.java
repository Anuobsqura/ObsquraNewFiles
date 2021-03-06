package RobotSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotSampleProgram {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/");
		driver.findElement(By.id("loginform-username")).click();
		driver.findElement(By.id("loginform-username")).sendKeys("carol");

		driver.findElement(By.id("loginform-password")).click();
		driver.findElement(By.id("loginform-password")).sendKeys("1q2w3e4r");

		driver.findElement(By.xpath("//button[@name='login-button']")).click();

		Thread.sleep(2000);

		// driver.findElement(By.linkText("Invoice")).click();

		driver.findElement(By.xpath("//a[@href='/payrollapp/invoice/index']")).click();

		driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-paperclip'])[1]")).click();

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_ENTER);

	}

}

