package practica;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatizacionPractice {
	private WebDriver driver;
	By SigninLocator = By.linkText("Sign in");
	By registerPageLocator = By.xpath("//h1[ @class='page-heading']");//
	
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("passwd");
	By submitBtnLocator = By.name("SubmitLogin");
	By SignoutLocator = By.linkText("Sign out");
	
	@Before
	public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void  registerUser() throws InterruptedException{
//pasos 		
		driver.findElement(SigninLocator).click();
		//driver.findElement(SignoutLocator).click();
		Thread.sleep(2000);
		if(driver.findElement(registerPageLocator).isDisplayed()){
			driver.findElement(usernameLocator).sendKeys("pepe_1@hotmail.com");
			driver.findElement(passwordLocator).sendKeys("Hola14");	
			driver.findElement(submitBtnLocator).click();
			
			
			
	}
		else {
			System.out.println("Register pages was not found");
		}



	}
	
}
	
