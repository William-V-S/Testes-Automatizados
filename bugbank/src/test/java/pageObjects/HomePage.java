package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy (id = "btn-TRANSFERÊNCIA")
	private WebElement botaoTransferencia;
	@FindBy (id = "btn-PAGAMENTOS")
	private WebElement botaoPagamento;
	@FindBy (id = "btn-EXTRATO")
	private WebElement botaoExtrato;
	@FindBy (id = "btn-SAQUE")
	private WebElement botaoSaque;
	
	
	public void clicarBotaoTransferencia() {
		botaoTransferencia.click();
	}
	public void clicarBotaoPagamentos() {
		botaoPagamento.click();
	}
	public void clicarBotaoExtrato() {
		botaoExtrato.click();
	}
	public void clicarBotaoSaque() {
		botaoSaque.click();
	}

}
