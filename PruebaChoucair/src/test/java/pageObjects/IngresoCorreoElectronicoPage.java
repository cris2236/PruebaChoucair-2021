package pageObjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IngresoCorreoElectronicoPage extends PageObject {
@FindBy(id = "email_create")
WebElementFacade txtEmailCreate;

@FindBy(id = "SubmitCreate")
WebElementFacade btnCreateAccount;

@FindBy(xpath = "//h3[contains(text(),'Your personal information')]")
WebElementFacade lblPersonalInformation;

public void IngresoCorreoElectronico() {
	txtEmailCreate.click();
	txtEmailCreate.sendKeys("prueba@choucair.com");
	btnCreateAccount.click();
	waitFor(5).second();
	ValidarExitoCorreoElectronico();
}

public void ValidarExitoCorreoElectronico() {
	String lbl= lblPersonalInformation.getText().toLowerCase();
	assertThat(lbl,containsString("your personal information"));
}

}
