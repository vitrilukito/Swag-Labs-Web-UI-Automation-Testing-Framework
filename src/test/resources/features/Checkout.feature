Feature: Test the Checkout Functionality on web application

  @web
  Scenario: Test the Cancel button functionality
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
    And user adds items to cart
    Then verify that the items in the cart matches "1"
    And user will click on the cart icon
    Then user will see the order details page
    And user will click the Checkout button
    Then user will be directed to fill in their data
    And user will click the Cancel button
    Then user will see the order details page

  @web
  Scenario: Test the Continue button functionality
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
    And user adds items to cart
    Then verify that the items in the cart matches "1"
    And user will click on the cart icon
    Then user will see the order details page
    And user will click the Checkout button
    Then user will be directed to fill in their data
    And user will fill in "Vitri" in first name
    And user will fill in "Lukito" in last name
    And user will fill in "12345" in zip code
    And user will click the Continue button
    Then user will be directed to the order confirmation page

  @web
  Scenario: Test to checkout without filling in names
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
    And user adds items to cart
    Then verify that the items in the cart matches "1"
    And user will click on the cart icon
    Then user will see the order details page
    And user will click the Checkout button
    Then user will be directed to fill in their data
    And user will fill in "" in first name
    And user will fill in "" in last name
    And user will fill in "12345" in zip code
    And user will click the Continue button
    Then user will see error message "First Name is required"

  @web
  Scenario: Test to checkout without filling in zip code
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
    And user adds items to cart
    Then verify that the items in the cart matches "1"
    And user will click on the cart icon
    Then user will see the order details page
    And user will click the Checkout button
    Then user will be directed to fill in their data
    And user will fill in "Vitri" in first name
    And user will fill in "Lukito" in last name
    And user will fill in "" in zip code
    And user will click the Continue button
    Then user will see error message "Postal Code is required"

  @web
  Scenario: Test the Finish button functionality
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
    And user adds items to cart
    Then verify that the items in the cart matches "1"
    And user will click on the cart icon
    Then user will see the order details page
    And user will click the Checkout button
    Then user will be directed to fill in their data
    And user will fill in "Vitri" in first name
    And user will fill in "Lukito" in last name
    And user will fill in "12345" in zip code
    And user will click the Continue button
    Then user will be directed to the order confirmation page
    And user will click the Finish button
    Then user will be directed to the successful purchase page

  @web
  Scenario: Test the Back Home button
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
    And user adds items to cart
    Then verify that the items in the cart matches "1"
    And user will click on the cart icon
    Then user will see the order details page
    And user will click the Checkout button
    Then user will be directed to fill in their data
    And user will fill in "Vitri" in first name
    And user will fill in "Lukito" in last name
    And user will fill in "12345" in zip code
    And user will click the Continue button
    Then user will be directed to the order confirmation page
    And user will click the Finish button
    Then user will be directed to the successful purchase page
    And user clicks the Back Home button
    Then user will be directed to the product display page