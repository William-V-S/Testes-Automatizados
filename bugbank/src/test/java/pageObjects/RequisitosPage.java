package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequisitosPage {
	

	@FindBy(css = "#linkGithub")
	private WebElement botaoAcessarRepositorio;
	
	
	public void acessarRepositorio() {
		botaoAcessarRepositorio.click();
	}
	
}
