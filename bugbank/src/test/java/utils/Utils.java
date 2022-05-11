package utils;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.api.Scenario;

public class Utils {

	public static WebDriver driver;
	
	public static void acessarSistema () {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://bugbank.netlify.app/");
	}
	
	public static <T> T Na(Class<T>clase ){
		return PageFactory.initElements(driver, clase);
	}
	
	public static void capturarTela(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
	
	// Validar qual texto aparece no modal(Mensagem de confirmacao da acao)
	public static void validacaoDoModal(String fraseNoModal) throws InterruptedException {
		Thread.sleep(600);
		assertEquals(driver.findElement(By.id("modalText")).getText(), fraseNoModal);
	}
}
