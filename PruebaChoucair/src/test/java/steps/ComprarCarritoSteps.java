package steps;

import pageObjects.CompraCarritoPage;

public class ComprarCarritoSteps {
	CompraCarritoPage compraCarritoPage;
	
	public void ComprarCarrito() {
		compraCarritoPage.AgregarAlCarrito();
		compraCarritoPage.ProcesoCompra();
	}
	
	public void ValidarCompraExitosa() {
	compraCarritoPage.validarCompraExistosa();
	}
}
