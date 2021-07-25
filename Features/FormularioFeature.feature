Feature: Registry dates

  Scenario: Diligence Formulary
    Given Open Chrome
    When Enter URL
    Then Go To Form
    And User Enter Password "Colom2021!" And Email "pruebas" And Dominio "gmail"
    And Check Terms y Conditions
    And Click on Next
    Then View Page of This is me
    And Choose Three interests
    And Upload Image

