Feature: Home Page

  @navigate
  Scenario: Check Home Component is displayed
    Given User launches Chrome Browser
    When User opens PhoneBook Home Page
    Then User verifies Home Component Form is displayed
    And User quites browser