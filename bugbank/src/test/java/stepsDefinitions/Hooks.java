package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.InicialPage;

import static utils.Utils.*;

public class Hooks {
	
	@Before (value = "@inicio")
	public void abrirNavegador() {
		acessarSistema();
	}
	
	
	
	@After(order = 3)
	public void tirarPrint(Scenario scenario) {
		capturarTela(scenario);
	}
	
	
	@After(value = "@modal", order = 2)
	public void fecharModal() {
		Na(InicialPage.class).fecharModal();	
	}
	
	
	@After(value ="@fim", order = 1)
	public void fecharNavegador() {
		driver.quit();	
	}
	
}
