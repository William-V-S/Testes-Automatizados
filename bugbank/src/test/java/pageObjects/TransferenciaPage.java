package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferenciaPage {

	@FindBy (xpath = "//input[@type='transferValue']")
	private WebElement campoValorTransferencia;
	@FindBy (xpath = "//input[@type='accountNumber']")
	private WebElement campoNumeroConta;
	@FindBy (name = "digit")
	private WebElement campoDigito;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement botaoTransferirAgora;
	
	
	
	public void informarCampoValorTranf(String valor) {
		campoValorTransferencia.clear();
		campoValorTransferencia.sendKeys(valor);
	}
	
	
	public void informarCampoNumeroConta(String numConta) {
		campoNumeroConta.clear();
		campoValorTransferencia.sendKeys(numConta);
	}
	
	
	public void informarCampoDigito(String digito) {
		campoDigito.clear();
		campoValorTransferencia.sendKeys(digito);
	}
	
	
	public void clicarBotaoTransferir() {
		botaoTransferirAgora.click();
	}
	
}
