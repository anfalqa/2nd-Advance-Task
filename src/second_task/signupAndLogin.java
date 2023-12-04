package second_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class signupAndLogin extends Parameters{
	@BeforeTest
	public void myBeforeTest() {
		driver.get(URLink);	
	}
	@Test(priority = 1)
	public void SignUpTest() throws InterruptedException {
		driver.get(URLSignup);
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
		Thread.sleep(2000); 
		
		//assert 1
		
		String signAssert =driver.findElement(By.xpath(MsgPath)).getText();
		softassert.assertEquals(signAssert.contains("Welcome"), true, "Validation The Signup Process");
		 softassert.assertAll();

	}//test 1 end
	@Test(priority = 2 )
	public void LogoutTest() throws InterruptedException {
		
		driver.get(URLLogout);
		Thread.sleep(10000); 
		 
		//assert 2
		 softassert.assertEquals(driver.getCurrentUrl(), URLink ,"validation of url after the logout process");
		 softassert.assertAll();
	}//test 3 end 
	
	@Test(priority = 3)
	public void LoginTest() throws InterruptedException {
		driver.get(URLLogin);
		WebElement UserEmail= driver.findElement(By.id("email"));
		UserEmail.sendKeys(Email);
		
		WebElement UserPassword= driver.findElement(By.id("pass"));
		UserPassword.sendKeys(Password);
		
		WebElement LoginButton = driver.findElement(By.id("send2"));
		LoginButton.click();
		
		Thread.sleep(3000); 
		//assert 3 
		
		String welcomeAssert = driver.findElement(By.xpath(welcome)).getText();
		softassert.assertEquals(welcomeAssert.contains("Welcome"), true,"Validation The Login Process 1");
		softassert.assertEquals(welcomeAssert.contains(FName), true,"Validation The Login Process 2");

		 softassert.assertAll();
		 
		
}//test 3 end
	
}//class end
