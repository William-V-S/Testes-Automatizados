package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InicialPage {
	
	@FindBy (xpath  = "//div[@class='login__buttons']/button[@type='button']")
	private WebElement botaoRegistrar;
	@FindBy(xpath = "//div[@class='card__register']//input[@name='email']")
	private WebElement campoEmailRegistrar;
	@FindBy(name = "name" )
	private WebElement campoNomeRegistrar;
	@FindBy (xpath = "//div[@class='card__register']//input[@name='password']")
	private WebElement campoSenhaRegistrar;
	@FindBy (name="passwordConfirmation")
	private WebElement campoConfirmacaoSenhaRegistrar;
	@FindBy (id="toggleAddBalance" )
	private WebElement botaoSaldo;
	@FindBy (xpath = "//div[@class='card__register']//button[@type='submit']")
	private WebElement botaoCadastrar;
	@FindBy (css = "#btnCloseModal")
	private WebElement botaoFecharModal;
	@FindBy(linkText = "Conheça nossos requisitos")
	private WebElement botaoRequisitos;
	
	
	@FindBy(xpath = "//div[@class='card__login']//input[@name='email']")
	private WebElement campoEmail;
	@FindBy (xpath = "//div[@class='card__login']//input[@type='password']")
	private WebElement campoSenha;
	@FindBy(xpath = "//div[@class='login__buttons']/button[@type='submit']" )
	private WebElement botaoAcessar;
	
	
	
	
	
	
	public void clicarBotaoRegistrar() {
		botaoRegistrar.click();
	}
	public void informarCampoEmail(String email) {
		campoEmailRegistrar.clear();
		campoEmailRegistrar.sendKeys(email);
	}
	public void informarCampoNome(String name) {
		campoNomeRegistrar.clear();
		campoNomeRegistrar.sendKeys(name);
	}
	public void informarCampoSenha(String senha) {
		campoSenhaRegistrar.clear();
		campoSenhaRegistrar.sendKeys(senha);
	}
	public void informarCampoConfirmacaoSenha(String senha) {
		campoConfirmacaoSenhaRegistrar.clear();
		campoConfirmacaoSenhaRegistrar.sendKeys(senha);
	}
	public void clicarBotaoSaldo() {
		botaoSaldo.click();
	}
	public void clicarBotaoCadastrar() {
		botaoCadastrar.click();
	}
	
	public void fecharModal() {
		botaoFecharModal.click();
	}
	
	public void informarEmail(String email) {
		campoEmail.clear();
		campoEmail.sendKeys(email);
	}
	
	public void informarSenha(String senha) {
		campoSenha.clear();
		campoSenha.sendKeys(senha);
	}
	
	public void clicarBotaoAcessar() {
		botaoAcessar.click();
	}
	
	public void logar(String email,String senha) {
		campoEmail.sendKeys(email);
		campoSenha.sendKeys(senha);
		botaoAcessar.click();
	}
	
	public void acessarRequisitos() {
		botaoRequisitos.click();
	}
	
}
