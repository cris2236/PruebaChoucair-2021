package pageObjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompraCarritoPage extends PageObject{
@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
WebElementFacade btnWomen;

@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]")
WebElementFacade btnArticulo1;
@FindBy(name = "Submit")
WebElementFacade btnAddCar;
@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
WebElementFacade btnSeguirComprando;

@FindBy(xpath = "//*[@id=\"columns\"]/div[1]/a[2]")
WebElementFacade btnWomens;

@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]")
WebElementFacade btnArticulo2;
@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
WebElementFacade btnProceed;
@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
WebElementFacade btnProceed2;
@FindBy(name = "processAddress")
WebElementFacade btnProceed3;
@FindBy(id = "uniform-cgv")
WebElementFacade btnAceparTerminos;
@FindBy(name = "processCarrier")
WebElementFacade btnProceed4;
@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
WebElementFacade btnProceedBank;
@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
WebElementFacade btnConfirm;
@FindBy(xpath = "//h1")
WebElementFacade lblOrderConfirmation;

public void AgregarAlCarrito() {
	btnWomen.click();
	waitFor(2).second();
	btnArticulo1.click();
	waitFor(2).second();
	btnAddCar.click();
	waitFor(2).second();
	btnSeguirComprando.click();
	btnWomens.click();
	waitFor(2).second();
	btnArticulo2.click();
	waitFor(2).second();
	btnAddCar.click();
	waitFor(2).second();
	btnProceed.click();
	waitFor(2).second();

	
}
public void ProcesoCompra() {
	btnProceed2.click();
	waitFor(2).second();
	btnProceed3.click();
	waitFor(2).second();
	btnAceparTerminos.click();
	waitFor(2).second();
	btnProceed4.click();
	waitFor(2).second();
	btnProceedBank.click();
	waitFor(2).second();
	btnConfirm.click();
	waitFor(2).second();
}
public void validarCompraExistosa() {
	String lbl=lblOrderConfirmation.getText().toLowerCase();
	assertThat(lbl,containsString("order confirmation"));
}
}
