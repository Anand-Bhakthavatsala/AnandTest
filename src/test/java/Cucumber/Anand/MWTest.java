package Cucumber.Anand;

import java.io.File;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MWTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_91\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	WebDriverWait wait = new WebDriverWait(driver,10);
	//	wait.until(arg0)
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
	//	Thread.sleep(2000);
	
		Set<String> ids = driver.getWindowHandles();
		
		Iterator<String> it = ids.iterator();
	
		String parent = it.next();
		String child = it.next();
		System.out.println("Parent window "+parent);
		System.out.println("Child window "+ child);
	//	System.out.println(parent + "  \n"+ child);
		driver.switchTo().window(child);
	//	Thread.sleep(3000);
	//	driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());		
		
	//	driver.quit();
	//	driver.close();
		
	}

}

