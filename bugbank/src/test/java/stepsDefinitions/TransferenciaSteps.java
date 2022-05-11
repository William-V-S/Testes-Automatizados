package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.HomePage;
import pageObjects.InicialPage;
import pageObjects.TransferenciaPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TransferenciaSteps {
	
	@Dado("que esteja na transfer page")
	public void queEstejaNaTransferPage() {
	    assertEquals(driver.findElement(By.xpath("//button[@type='submit']")).getText(), "Transferir agora");
	}


	@Dado("que esteja na home page")
	public void queEstejaNaHomePage() {
		assertTrue(driver.findElement(By.id("textBalance")).isDisplayed());
	}

	
	//////////////------DIVISA DE ACOES------//////////////
	
	
	@Quando("o usuario realizar o login")
	public void oUsuarioRealizarOLogin() {
		Na(InicialPage.class).logar("conta01@gmail.com", "bug1234");
	}

	
	@Quando("o usuario clicar no botao transferencia")
	public void oUsuarioClicarNoBotaoTransferencia() {
	    Na(HomePage.class).clicarBotaoTransferencia();
	}

	@Quando("o usuario clicar no botao tranferencia")
	public void oUsuarioClicarNoBotaoTranferencia() {
	   Na(HomePage.class).clicarBotaoTransferencia();
	}

	@Quando("informar o valor da tranferencia {string}")
	public void informarOValorDaTranferencia(String string) {
	  Na(TransferenciaPage.class).informarCampoValorTranf(string);
	}

	
	@Quando("informa a conta {string}")
	public void informaAConta(String string) {
		Na(TransferenciaPage.class).informarCampoNumeroConta(string);
	}

	
	@Quando("informa a o digito {string}")
	public void informaAODigito(String string) {
		Na(TransferenciaPage.class).informarCampoDigito(string);
	}

	@Quando("clicar no botao transferir agora")
	public void clicarNoBotaoTransferirAgora() {
		Na(TransferenciaPage.class).clicarBotaoTransferir();
	}


	//////////////------DIVISA DE ACOES------//////////////
	
	@Entao("o modal de transferencia realizada vai ser exibido")
	public void oModalDeTransferenciaRealizadaVaiSerExibido()  throws InterruptedException {
		validacaoDoModal("Transferencia realizada com sucesso");
	}
	
	


}
