package mavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleTest {
	
	WebDriver driver;
  @Test
  public void launchTest() {
	  String Expected = "Google";
	  String Actual = driver.getTitle();
	  Assert.assertEquals(Actual, Expected);
  }
  @BeforeTest
  public void launchAppTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\IBM_SeleniumWD\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.google.com");
  }

  @AfterTest
  public void browserCloseTest() {
	  driver.quit();
  }

}
