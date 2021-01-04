package steps;

import pageObjects.IngresoPaginaPage;

public class IngresoPaginaSteps {
 IngresoPaginaPage ingresoPaginaPage;
	public void AbrirPagina() {
	 ingresoPaginaPage.open();
	 ingresoPaginaPage.ValidarIngresoPagina();
	}

	public void SeccionLogin() {
		ingresoPaginaPage.SeccionLoguin();
	}

}
