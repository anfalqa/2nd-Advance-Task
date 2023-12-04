package second_task;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Parameters {
	
	static WebDriver driver = new ChromeDriver();
	static SoftAssert softassert= new SoftAssert();
	static Random random = new Random();
	static String URLink = "https://magento.softwaretestingboard.com/";
	static String URLSignup="https://magento.softwaretestingboard.com/customer/account/create/"; 
	static String URLLogin="https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/";
	static String URLLogout="https://magento.softwaretestingboard.com/customer/account/logout/";
	static String[] FirstName = { "Lina", "Lenda", "Aya", "Huda" };
	static String[] LastName = { "Mohammad", "Ali", "Abdallah", "Khaled" };
	static int randomNumber = random.nextInt((FirstName.length-1) - 0 + 1);
	static String FName = FirstName[randomNumber];
	static String LName = LastName[randomNumber];
	static int numberOfEmail = random.nextInt(120);
	static String Email = FName + LName + numberOfEmail + "@Gmail.com";
	static String Password = "ABsabS123!";
	static String MsgPath= "(//div[@class='panel header'])[1]";
	static String MyAccount = "(//a[normalize-space()='My Account'])[1]";
	static String welcome="(//div[@class='panel header'])";

}//class end
