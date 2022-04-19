Feature: Usuarios
  Background: 
    * url 'http://localhost:3000/api/usuarios'

  Scenario: GET listar usuarios 200
    * def expectedOutPut = read('result.json')
    Given path 'listar-monedas-disponibles-usuario/101'
    When method GET
    Then status 200
    Then print response
    And match response == expectedOutPut[0]

  Scenario: GET listar usuarios 403
    * def expectedOutPut = read('result.json')
    Given path 'listar-monedas-disponibles-usuario/dfsf'
    When method GET
    Then status 403
    Then print response
    And match response == expectedOutPut[1]
