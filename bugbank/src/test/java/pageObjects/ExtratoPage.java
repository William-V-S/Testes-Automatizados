package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExtratoPage {

	@FindBy(linkText = "Voltar")
	private WebElement botaoVoltar;
	
	
	public void clicarBotaoVoltar() {
		botaoVoltar.click();
	}
}
