Feature: Paises
  Background:
    * url 'http://localhost:3000/api/paises'

  Scenario: GET listar moneda por pais 200
    * def expectedOutPut = read('resultPaises.json')
    Given path 'list-moneda-pais/2'
    When method GET
    Then status 200
    Then print response
    And match response == expectedOutPut[0]

  Scenario: GET listar moneda por pais por usuario 200
    * def expectedOutPut = read('resultPaises.json')
    Given path 'list-moneda-pais-usuario/101'
    When method GET
    Then status 200
    Then print response
    And match response == expectedOutPut[1]