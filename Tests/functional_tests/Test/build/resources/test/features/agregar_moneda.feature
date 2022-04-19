#Autor: Alejandra Rosero
@stories
Feature: Criptomonedas test

  As a user, I want to perform the basic operations of the cryptocurrency application

  @AddMoney
  Scenario: Make currency exchange
    Given the user enters the cryptocurrency application

    When the user adds a new currency

    Then the user visualizes his new currency

  @DeleteMoney
  Scenario: Delete and edit a criptocurrency in application
    Given the user enters the cryptocurrency application

    When the user delete a new currency

    Then the user visualizes his currency is deleted

  @ViewMoneyForGestorasAndPaises
  Scenario: View Money For Gestoras And Paises
    Given the user enters the cryptocurrency application

    When the user want view your criptocurrencys in table Paises

    Then the user view criptocurrency for paises

    When the user want view your criptocurrencys in table Gestoras

    Then the user view criptocurrency for Gestoras