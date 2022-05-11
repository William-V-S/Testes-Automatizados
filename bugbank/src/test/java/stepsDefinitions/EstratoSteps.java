package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ExtratoPage;
import pageObjects.HomePage;

import static utils.Utils.*;

import org.openqa.selenium.By;

public class EstratoSteps {

	@Quando("o usuario clicar em voltar")
	public void oUsuarioClicarEmVoltar() {
	   Na(ExtratoPage.class).clicarBotaoVoltar();
	}

	@Quando("clicar no botao extrato")
	public void clicarNoBotaoExtrato() {
	   Na(HomePage.class).clicarBotaoExtrato();
	}

	@Entao("o extrato da conta vai ser mostrado")
	public void oExtratoDaContaVaiSerMostrado() {
	    assertEquals(driver.findElement(By.xpath("//p[@class='bank-statement__LabelText-sc-7n8vh8-10 UPwdn']")).getText(), "Saldo disponível");
	}

}
