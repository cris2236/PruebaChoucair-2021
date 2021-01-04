package pageObjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.hibernate.validator.constraints.URL;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("http://automationpractice.com/index.php")
public class IngresoPaginaPage extends PageObject{
	@FindBy (xpath = "//*[@id=\"header\"]/div[1]/div/div/a/img")
	WebElementFacade imgInicio;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElementFacade btnSignIn;
	@FindBy(xpath = "//h1")
	WebElementFacade lblAuthentication;

	public void ValidarIngresoPagina() {
		waitFor(3).second();
		imgInicio.isPresent();
	}
	
	public void SeccionLoguin() {
		btnSignIn.click();
		ValidarIngresoSeccionLoguin();
	}
	
	public void ValidarIngresoSeccionLoguin() {
		String lbl=lblAuthentication.getText().toLowerCase();
		assertThat(lbl,containsString("authentication"));
	}

}
