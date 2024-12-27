Feature: Test the Security on web application

  @web
  Scenario: Test the expired account login session
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
    And user is not active for 5 minutes
    Then user will be back to the login page