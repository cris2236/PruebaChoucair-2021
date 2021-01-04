package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InicioSesionPage extends PageObject{
@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
WebElementFacade btnSigin;

@FindBy(id = "email")
WebElementFacade txtEmail;
@FindBy(id = "passwd")
WebElementFacade txtPass;

@FindBy(name = "SubmitLogin")
WebElementFacade btnLogin;

public void Login() {
	btnSigin.click();
	waitFor(5).second();
	txtEmail.click();
	txtEmail.sendKeys("cristian2236@gmail.com");
	txtPass.click();
	txtPass.sendKeys("123456789");
	btnLogin.click();
}
}
