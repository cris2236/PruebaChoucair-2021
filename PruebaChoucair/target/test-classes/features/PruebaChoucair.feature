#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @OfficeLicencias
  Scenario: Crear cuenta
    Given Ingresar a la página
    When Ingresar a la seccion de login
    And Ingresar un correo electronico valido
    And Llenar todos lo campos de informacion personal
      | title | firstName | lastName | password    | dayDateOfBirth | monthDateOfBirth | yearDateOfBirth | signUpForOurNewsLetter | receiveSpecialOffers | firstName | lastName | company | address       | city       | state   | postalcode | country       | additionalInformation | homaPhone | mobilePhone | alias          |
      | Mr    | Prueba    | Choucair | Choucair123 |              1 |          January |            1999 | Si                     | Si                   | Prueba    | Choucair | prueba  | pruebaAddress | pruebaCity | Alabama |      10567 | United States | Prueba                |   1234567 |   987654321 | PruebaChoucair |
    Then Creacion de usuario atisfactorio

  @ScenarioCompraArticulos
  Scenario: Compra Articulos
    Given Ingresar a la página
    Given Login activo
    When Ingresar articulos al carro de compra
    Then Compra exitosa
