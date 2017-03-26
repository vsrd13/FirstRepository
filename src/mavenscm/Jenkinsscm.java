package mavenscm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jenkinsscm {

	public static WebDriver driver;
	public static String baseUrl = "http://www.seleniumhq.org";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File dir = new File("./");
		String path = dir.getCanonicalPath();
		// System.setProperty("webdriver.chrome.driver", path+
		// "//BrowserDrivers//chromedriver.exe" );
		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.navigate().to(baseUrl);
		driver.get(baseUrl + "/");

	}

}
