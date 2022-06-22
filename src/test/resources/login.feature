Feature: FB login
  Scenario: user should be able to login to webpage

    When user opens page
    Given user in login page
    And user enters credentials
    Then user able to login