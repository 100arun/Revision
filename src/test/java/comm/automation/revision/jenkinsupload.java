package comm.automation.revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jenkinsupload {
	
	WebDriver driver;
	
	@BeforeMethod
	public void systemrun() {
		System.setProperty("webriver.chrome.driver", "C:\\\\Users\\\\Arun\\\\Downloads\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testcase1() {
		driver.get("https://www.Automationtalks.com");
		String Title1 = driver.getTitle();
		System.out.println("The First Title is" + Title1);
		
		
	}
	
	@Test
	public void testcase2() {
		driver.get("https://www.Automationtalks.com");
		String Title1 = driver.getTitle();
		System.out.println("The Second Title is" + Title1);
		
		
	}
	
	@Test
	public void testcase3() {
		driver.get("https://www.Automationtalks.com");
		String Title1 = driver.getTitle();
		System.out.println("The Third Title is" + Title1);
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
}
