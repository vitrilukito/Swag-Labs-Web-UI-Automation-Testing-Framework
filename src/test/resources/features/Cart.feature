Feature: Test the Cart Functionality on web application

  @web
  Scenario: Test the Remove button functionality
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
    And user adds items to cart
    Then verify that the items in the cart matches "1"
    And user will click on the cart icon
    Then user will see the order details page
    And user will click the Remove button
    Then the order detail of the product will disappear

  @web
  Scenario: Test the Continue Shopping button functionality
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
    And user adds items to cart
    Then verify that the items in the cart matches "1"
    And user will click on the cart icon
    Then user will see the order details page
    And user will click the Continue Shopping button
    Then user will be directed to the product display page

  @web
  Scenario: Test the Checkout button functionality
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