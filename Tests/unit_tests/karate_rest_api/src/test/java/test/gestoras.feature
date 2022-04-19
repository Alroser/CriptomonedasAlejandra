Feature: Gestoras
  Background:
    * url 'http://localhost:3000/api/gestoras'

  Scenario: GET listar moneda por gestora 200
    * def expectedOutPut = read('resultGestoras.json')
    Given path 'list-moneda-gestora-pais-usuario/400'
    When method GET
    Then status 200
    Then print response
    And match response == expectedOutPut[0]