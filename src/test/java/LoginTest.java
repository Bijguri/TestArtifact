import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver = null;

	@BeforeSuite
	public void setup() {
		driver = new ChromeDriver();
		System.out.println("In Setup");

	}

	@AfterSuite
	public void tearDown() {
		System.out.println("In Teardown");
	}

	@Test
	public void testCase() {
		System.out.println("In Test Case");
		driver.findElement(By.id("a"));

	}

}
