package pageObjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InformacionPersonalPage extends PageObject{

//Campo genero masculino
 @FindBy(id = "uniform-id_gender1")
 WebElementFacade rbnMr;
 @FindBy(id = "uniform-id_gender2")
 WebElementFacade rbnMrs;
 @FindBy(id = "customer_firstname")
 WebElementFacade txtFirstName;
 @FindBy(id = "customer_lastname")
 WebElementFacade txtLastName;
 @FindBy(id = "passwd")
 WebElementFacade txtPass;
 @FindBy(id = "uniform-newsletter")
 WebElementFacade rbnNewsLetter;
 @FindBy(id = "uniform-optin")
 WebElementFacade rbnOptin;
 @FindBy(id = "firstname")
 WebElementFacade txtFirstNameAddress;
 @FindBy(id = "lastname")
 WebElementFacade txtlastNameAddress;
 @FindBy(id = "company")
 WebElementFacade txtcompany;
 @FindBy(id = "address1")
 WebElementFacade txtAddress1;
 @FindBy(id = "address2")
 WebElementFacade txtAddress2;
 @FindBy(id = "city")
 WebElementFacade txtCity;
 @FindBy(id = "postcode")
 WebElementFacade txtpostcode;
 @FindBy(id = "other")
 WebElementFacade txtOther;
 @FindBy(id = "phone")
 WebElementFacade txtPhone;
 @FindBy(id = "phone_mobile")
 WebElementFacade txtPhoneMobile;
 @FindBy(id = "alias")
 WebElementFacade txtalias;
 @FindBy(id = "submitAccount")
 WebElementFacade btnRegister;
 @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
 WebElementFacade validate;
public void DiligenciarTitle(String dato) {
 if(dato.equalsIgnoreCase("mr")) {
	 rbnMr.click();
 }else {
	 rbnMrs.click();
 }
	
}
 
public void DiligenciarFirstname(String dato) {
	txtFirstName.click();
	txtFirstName.sendKeys(dato);
}
public void DiligenciarLastname(String dato) {
	txtLastName.click();
	txtLastName.sendKeys(dato);
}
public void DiligenciarPass(String dato) {
	txtPass.click();
	txtPass.sendKeys(dato);
}
public void DiligenciarDayOfBirth(String dato) {
	//chbxDayDate.selectByVisibleText(dato);
	getDriver().findElement(By.xpath("//*[@id=\"days\"]/option[.][contains(text(),'"+ dato +"')]")).click();
}

public void DiligenciarMonthOfBirth(String dato) {
	//chbxMonthDate.selectByVisibleText(dato);
	getDriver().findElement(By.xpath("//*[@id=\"months\"]/option[.][contains(text(),'"+ dato +"')]")).click();
}
public void DiligenciarYearOfBirth(String dato) {
	//chbxYearDate.selectByVisibleText(dato);
	getDriver().findElement(By.xpath("//*[@id=\"years\"]/option[.][contains(text(),'"+ dato +"')]")).click();
}
public void DiligenciarNewsletther(String dato) {
	if(dato.equalsIgnoreCase("si")) {
		if(!rbnNewsLetter.isSelected()) {
			rbnNewsLetter.click();
		}else {
			
		}
	}else if(dato.equalsIgnoreCase("no")) {
		if(rbnNewsLetter.isSelected()) {
			rbnNewsLetter.click();
		}else {
			
		}
	}
	
	
	
}
public void DiligenciarSpecialOffers(String dato) {
	if(dato.equalsIgnoreCase("si")) {
		if(!rbnOptin.isSelected()) {
			rbnOptin.click();
		}else {
			
		}
	}else if(dato.equalsIgnoreCase("no")) {
		if(rbnOptin.isSelected()) {
			rbnOptin.click();
		}else {
			
		}
	}
	
	
	
}
public void DiligenciarFirstnameAddress(String dato) {
	txtFirstNameAddress.click();
	txtFirstNameAddress.sendKeys(dato);
}

public void DiligenciarLastnameAddress(String dato) {
	txtlastNameAddress.click();
	txtlastNameAddress.sendKeys(dato);
}
public void DiligenciarCompany(String dato) {
	txtcompany.click();
	txtcompany.sendKeys(dato);
}
public void DiligenciarAddress1(String dato) {
	txtAddress1.click();
	txtAddress1.sendKeys(dato);
}
public void DiligenciarAddress2(String dato) {
	txtAddress2.click();
	txtAddress2.sendKeys(dato);
}
public void DiligenciarCity(String dato) {
	txtCity.click();
	txtCity.sendKeys(dato);
}
public void DiligenciarState(String dato) {
	//chbxState.selectByVisibleText(dato);
	//chbxState.sendKeys(dato);
	getDriver().findElement(By.xpath("//*[@id=\"id_state\"]/option[.][contains(text(),'"+ dato +"')]")).click();
}
public void DiligenciarPostalCode(String dato) {
	txtpostcode.click();
	txtpostcode.sendKeys(dato);
}
public void DiligenciarCountry(String dato) {
	//chbxCountry.click();
	//chbxCountry.sendKeys(dato);
	getDriver().findElement(By.xpath("//*[@id=\"id_country\"]/option[.][contains(text(),'"+ dato +"')]")).click();
}
public void DiligenciarAdditionalInformation(String dato) {
	txtOther.click();
	txtOther.sendKeys(dato);
}
public void DiligenciarHomePhone(String dato) {
	txtPhone.click();
	txtPhone.sendKeys(dato);
}
public void DiligenciarMobilePhone(String dato) {
	txtPhoneMobile.click();
	txtPhoneMobile.sendKeys(dato);
}
public void DiligenciarAlias(String dato) {
	txtalias.click();
	txtalias.sendKeys(dato);
}
public void ValidacionCrearCuenta() {
	validate.isPresent();
}
}
