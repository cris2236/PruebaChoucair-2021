package steps;

import java.util.List;

import pageObjects.InformacionPersonalPage;

public class IformacionPersonalSteps {
	InformacionPersonalPage informacionPersonalPage;

	public void DiligenciarDatos(List<List<String>> data, int i) {
		informacionPersonalPage.DiligenciarTitle(data.get(i).get(0).trim());
		informacionPersonalPage.DiligenciarFirstname(data.get(i).get(1).trim());
		informacionPersonalPage.DiligenciarLastname(data.get(i).get(2).trim());
		informacionPersonalPage.DiligenciarPass(data.get(i).get(3).trim());
		informacionPersonalPage.DiligenciarDayOfBirth(data.get(i).get(4).trim());
		informacionPersonalPage.DiligenciarMonthOfBirth(data.get(i).get(5).trim());
		informacionPersonalPage.DiligenciarYearOfBirth(data.get(i).get(6).trim());
		informacionPersonalPage.DiligenciarNewsletther(data.get(i).get(7).trim());
		informacionPersonalPage.DiligenciarSpecialOffers(data.get(i).get(8).trim());
		informacionPersonalPage.DiligenciarFirstnameAddress(data.get(i).get(9).trim());
		informacionPersonalPage.DiligenciarLastnameAddress(data.get(i).get(10).trim());
		informacionPersonalPage.DiligenciarCompany(data.get(i).get(11).trim());
		informacionPersonalPage.DiligenciarAddress1(data.get(i).get(12).trim());
		informacionPersonalPage.DiligenciarCity(data.get(i).get(13).trim());
		informacionPersonalPage.DiligenciarState(data.get(i).get(14).trim());
		informacionPersonalPage.DiligenciarPostalCode(data.get(i).get(15).trim());
		informacionPersonalPage.DiligenciarCountry(data.get(i).get(16).trim());
		informacionPersonalPage.DiligenciarAdditionalInformation(data.get(i).get(17).trim());
		informacionPersonalPage.DiligenciarHomePhone(data.get(i).get(18).trim());
		informacionPersonalPage.DiligenciarMobilePhone(data.get(i).get(19).trim());
		informacionPersonalPage.DiligenciarAlias(data.get(i).get(20).trim());
	}
	
	public void ValidacionCrearCuenta() {
		informacionPersonalPage.ValidacionCrearCuenta();
	}
}
