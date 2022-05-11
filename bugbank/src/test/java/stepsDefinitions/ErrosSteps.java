package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.HomePage;
import pageObjects.InicialPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class ErrosSteps {	
	
	@Quando("ele clicar no botao saque")
	public void eleClicarNoBotaoSaque() {
	    Na(HomePage.class).clicarBotaoSaque();
	}

	
	@Quando("o usuario clicar no botao pagamento")
	public void oUsuarioClicarNoBotaoPagamento() {
		Na(HomePage.class).clicarBotaoPagamentos();
	}
	

	@Quando("o usuario informar o email {string}")
	public void oUsuarioInformarOEmail(String email) {
	    Na(InicialPage.class).informarEmail(email);    
	}

	
	@Quando("informar senha {string}")
	public void informarSenha(String senha) {
	    Na(InicialPage.class).informarSenha(senha);   
	}
	
	
	@Quando("acionar o botao acessar")
	public void acionarOBotaoAcessar() {
	    Na(InicialPage.class).clicarBotaoAcessar();    
	}

	
	//////////////------DIVISA DE ACOES------//////////////
	
	
	@Entao("o modal de login invalido aparece")
	public void oModalDeLoginInvalidoAparece() throws InterruptedException {
	    validacaoDoModal("Usuário ou senha inválido.\n"+"Tente novamente ou verifique suas informações!");
	}

	
	@Entao("formato invalido aparece embaixo do compo email")
	public void formatoInvalidoApareceEmbaixoDoCompoEmail() {
		assertTrue(driver.findElement(By.cssSelector("form>div>p")).isDisplayed());
	}

	
	@Entao("a mensagem que nao aceita {string} vai ser exibida")
	public void aMensagemQueNaoAceitaLetrasVaiSerExibida(String frase) {
		assertEquals(driver.findElement(By.xpath("//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 kOeYBn input__child']/p")).getText(), "transferValue must be a `number` type, but the final value was: `NaN` (cast from the value `\""+frase+"\"`).");
	}
	
	
	@Entao("o modal de saldo insuficiente vai ser exibido")
	public void oModalDeSaldoInsuficienteVaiSerExibido() throws InterruptedException{
	   validacaoDoModal("Você não tem saldo suficiente para essa transação");
	}
	
	
	@Entao("o modal de desenvolvimento vai ser exibido")
	public void aMensagemDeDesenvolvimentoVaiSerExibida() throws InterruptedException {
	    validacaoDoModal("Funcionalidade em desenvolvimento");
	}

	
	@Entao("aparece a mesagem de campo obrigatorio")
	public void apareceAMesagemDeCampoObrigatorio() {
	    assertEquals(driver.findElement(By.xpath("//div[@class='card__register']//p[@class='input__warging']")).getText(), "É campo obrigatório");
	}

	
	@Entao("o modal de nome em branco aparece")
	public void oModalDeNomeEmBrancoAparece() throws InterruptedException {
	    validacaoDoModal("Nome não pode ser vazio.");    
	}

	
	@Entao("o modal de senha diferente aparece")
	public void oModalDeSenhaDiferenteAparece() throws InterruptedException {
	    validacaoDoModal("As senhas não são iguais.");  
	}
	
}
