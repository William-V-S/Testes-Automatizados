package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.InicialPage;
import pageObjects.RequisitosPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class RepositorioSteps {
	
	@Quando("o usuario clicar em conheca nossos requisitos")
	public void oUsuarioClicarEmConhecaNossosRequisitos() {
	   Na(InicialPage.class).acessarRequisitos();
	}

	@Quando("depois em acessar o link do repositorio")
	public void depoisEmAcessarOLinkDoRepositorio() {
	   Na(RequisitosPage.class).acessarRepositorio();
	}

	@Entao("ele estara no repositorio do github")
	public void eleEstaraNoRepositorioDoGithub() {
	    assertTrue(driver.findElement(By.linkText("Contact GitHub")).isDisplayed());
	    assertTrue(driver.findElement(By.linkText("bugbank")).isDisplayed());
	}


}
