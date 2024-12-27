Feature: Test the Login Functionality on web application

  @web
  Scenario: Test login web normal
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage

  @web
  Scenario: Test login web with locked out user
    Given open web login page
    And user inputs username "locked_out_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see error message "user has been locked out"

  @web
  Scenario: Test login web with an invalid username
    Given open web login page
    And user inputs username "standard_user123"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see error message "Username and password do not match"

  @web
  Scenario: Test login web with an invalid password
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce123"
    And user clicks login button
    Then user will see error message "Username and password do not match"

  @web
  Scenario: Test login web without a username
    Given open web login page
    And user inputs username ""
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see error message "Username is required"

  @web
  Scenario: Test login web without a password
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password ""
    And user clicks login button
    Then user will see error message "Password is required"

  @web
  Scenario: Test login web with a masked password
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    Then password will be masked


