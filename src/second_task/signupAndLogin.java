package second_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class signupAndLogin extends Parameters{
	@BeforeTest
	public void myBeforeTest() {
		driver.get(URLink);	
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	}
	@Test(priority = 1)
	public void SignUpTest() {
		WebElement UserFirstName= driver.findElement(By.id("firstname"));
		UserFirstName.sendKeys(FName);
		WebElement UserLastName= driver.findElement(By.id("lastname"));
		UserLastName.sendKeys(LName);
		WebElement UserEmail= driver.findElement(By.name("email"));
		UserEmail.sendKeys(Email);
		WebElement UserPassword= driver.findElement(By.id("password"));
		UserPassword.sendKeys(Password);
		WebElement UserPasswordConf= driver.findElement(By.id("password-confirmation"));
		UserPasswordConf.sendKeys(Password);
		WebElement SignupButton = driver.findElement(By.className("primary"));
		SignupButton.click();
		
	}//test 1 end
	
	@Test(priority = 2)
	public void LoginTest() {
		
		WebElement UserEmail= driver.findElement(By.id("email"));
		UserEmail.sendKeys(Email);
		WebElement UserPassword= driver.findElement(By.id("pass"));
		UserPassword.sendKeys(Password);
		WebElement SignupButton = driver.findElement(By.className("login"));
		SignupButton.click();
		
}//test 2 end
}//class end
