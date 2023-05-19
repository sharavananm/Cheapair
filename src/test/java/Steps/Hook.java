package Steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {
	
	public static WebDriver driver;

	@Before
	public void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void clearText(WebElement element)
	{
		element.clear();	
	}
	
	public static void implicitlyWait()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	public static void windowHandles(int value)
	{
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wh = new ArrayList<>();
		wh.addAll(windowHandles);
		driver.switchTo().window(wh.get(value));
	}
	
	

}
