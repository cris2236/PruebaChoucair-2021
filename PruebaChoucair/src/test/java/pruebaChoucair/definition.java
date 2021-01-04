package pruebaChoucair;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import steps.ComprarCarritoSteps;
import steps.IformacionPersonalSteps;
import steps.IngresoCorreoElectronicoSteps;
import steps.IngresoPaginaSteps;
import steps.InicioSesionSteps;

public class definition {
	@Steps IngresoPaginaSteps ingresoPaginaSteps;
	@Steps IngresoCorreoElectronicoSteps  ingresoCorreoElectronicoSteps;
	@Steps IformacionPersonalSteps iformacionPersonalSteps;
	@Steps InicioSesionSteps inicioSesionSteps;
	@Steps ComprarCarritoSteps comprarCarritoSteps;
	@Given("^Ingresar a la página$")
	public void ingresar_a_la_página() {
		ingresoPaginaSteps.AbrirPagina();
	}

	@When("^Ingresar a la seccion de login$")
	public void ingresar_a_la_seccion_de_login() {
	ingresoPaginaSteps.SeccionLogin();
	}

	@When("^Ingresar un correo electronico valido$")
	public void ingresar_un_correo_electronico_valido()  {
		ingresoCorreoElectronicoSteps.IngresarCorreoElectronico();
	}

	@When("^Llenar todos lo campos de informacion personal$")
	public void llenar_todos_lo_campos_de_informacion_personal(DataTable dtDatosForm)  {
	List<List<String>> data= dtDatosForm.raw();
		
		for(int i=1 ; i <data.size();i++) {
			iformacionPersonalSteps.DiligenciarDatos(data,i);
		}
	}

	@Then("^Creacion de usuario atisfactorio$")
	public void creacion_de_usuario_atisfactorio() {
	    iformacionPersonalSteps.ValidacionCrearCuenta();
	}
	
	@Given("^Login activo$")
	public void login_activo(){
		inicioSesionSteps.InciarSesion();
	}

	@When("^Ingresar articulos al carro de compra$")
	public void ingresar_articulos_al_carro_de_compra()  {
		comprarCarritoSteps.ComprarCarrito();
	}

	@Then("^Compra exitosa$")
	public void compra_exitosa() {
	    comprarCarritoSteps.ValidarCompraExitosa();
	}
}
