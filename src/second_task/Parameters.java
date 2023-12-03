package second_task;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	
	static WebDriver driver = new ChromeDriver();
	static Random random = new Random();
	static String URLink = "https://magento.softwaretestingboard.com/";
	static String[] FirstName = { "Lina", "Lenda", "Aya", "Huda" };
	static String[] LastName = { "Mohammad", "Ali", "Abdallah", "Khaled" };
	static int randomNumber = random.nextInt((FirstName.length-1) - 0 + 1);
	static String FName = FirstName[randomNumber];
	static String LName = FirstName[randomNumber];
	static int numberOfEmail = random.nextInt(120);
	static String Email = FName + LName + numberOfEmail + "@Gmail.com";
	static String Password = "Abc123456789";
	

}//class end
