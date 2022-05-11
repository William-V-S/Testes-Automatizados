package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.InicialPage;

public class RegistrarSteps {
	@Dado("que esteja na pagina inicial")
	public void queNaPaginaDeLogin() {
		assertTrue(driver.findElement(By.linkText("Conheça nossos requisitos")).isDisplayed());	
	}
	

	@Dado("que esteja na tela de registro")
	public void queEstejaNaTelaDeRegistro() {
	   assertTrue(driver.findElement(By.linkText("Voltar ao login")).isDisplayed());
	}

	
	//////////////------DIVISA DE ACOES------//////////////
	
	
	@Quando("o usuario acionar o botao registrar")
	public void oUsuarioAcionarOBotaoRegistrar() {
		Na(InicialPage.class).clicarBotaoRegistrar();
	}

	@Quando("preencher o campo email {string}")
	public void informarOCampoEmail(String email) {
		Na(InicialPage.class).informarCampoEmail(email);
	}

	@Quando("preencher o campo nome {string}")
	public void informarOCampoNome(String nome) {
		Na(InicialPage.class).informarCampoNome(nome);

	}

	@Quando("preencher o campo senha {string}")
	public void informarOCampoSenha(String senha) {
		Na(InicialPage.class).informarCampoSenha(senha);

	}

	@Quando("preencher o campo confirmacao senha {string}")
	public void informarOCampoConfirmacaoSenha(String senha) {
		Na(InicialPage.class).informarCampoConfirmacaoSenha(senha);

	}

	@Quando("acionar o botao criar conta com saldo")
	public void acionarOBotaoCriarContaComSaldo() {
		Na(InicialPage.class).clicarBotaoSaldo();
		
	}

	@Quando("acionar o botao cadastrar")
	public void acionarOBotaoCadastrar() {
		Na(InicialPage.class).clicarBotaoCadastrar();

	}

	
	//////////////------DIVISA DE ACOES------//////////////
	
	@Entao("a conta foi criada")
	public void aContaFoiCriada() {
		assertTrue(driver.findElement(By.partialLinkText("x")).isDisplayed());

	}
	

}
