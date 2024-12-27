Feature: Test the Product Page Usability and Functionality on web application

# FOR standard_user

  @web
  Scenario: Test the product display page for standard user
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
    Then verify that the details of the first product are displayed correctly
    Then verify that the details of the second product are displayed correctly
    Then verify that the details of the third product are displayed correctly
    Then verify that the details of the fourth product are displayed correctly
    Then verify that the details of the fifth product are displayed correctly
    Then verify that the details of the sixth product are displayed correctly

  @web
  Scenario: Test the functionality of add to cart button
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user adds items to cart
    And user adds items to cart
    And user adds items to cart
    And user adds items to cart
    Then verify that the items in the cart matches "4"

  @web
  Scenario: Test the functionality of remove button
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user adds items to cart
    And user adds items to cart
    And user adds items to cart
    And user adds items to cart
    Then verify that the items in the cart matches "4"
    And user removes item from cart
    Then verify that the items in the cart matches "3"

  @web
  Scenario: Test the functionality of the social media buttons
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the social media buttons
    Then user will be directed to each social media page

  @web
  Scenario: Test the functionality of the three lines on the sidebar
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the three lines on the sidebar
    Then user will see the Logout menu

  @web
  Scenario: Test the functionality of the "All Items" menu on the sidebar
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the three lines on the sidebar
    And user will see the Logout menu
    And user will click All Items
    Then user will be directed to the product display page

  @web
  Scenario: Test the functionality of the "About" menu on the sidebar
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the three lines on the sidebar
    And user will see the Logout menu
    And user will click About
    Then user will be directed to the About page

  @web
  Scenario: Test the functionality of the "Reset App State" menu on the sidebar
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user adds items to cart
    And user adds items to cart
    And user will click the three lines on the sidebar
    And user will see the Logout menu
    And user will click Reset App State
    Then the cart will be reset

  @web
  Scenario: Test the functionality of the "Logout" menu on the sidebar
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the three lines on the sidebar
    And user will see the Logout menu
    And user will click Logout
    Then user will be back to the login page

  @web
  Scenario: Test the functionality of the A-Z sort menu
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will choose to sort the products from A-Z
    Then products will be displayed in ascending alphabetical order

  @web
  Scenario: Test the functionality of the Z-A sort menu
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will choose to sort the products from Z-A
    Then products will be displayed in descending alphabetical order

  @web
  Scenario: Test the functionality of the "Price low to high" menu
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will choose to sort the products based on price, from low to high
    Then products will be sorted from the lowest to the highest price

  @web
  Scenario: Test the functionality of the "Price high to low" menu
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will choose to sort the products based on price, from high to low
    Then products will be sorted from the highest to the lowest price

  @web
  Scenario: Test "Sauce Labs Backpack" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Backpack
    Then user will see Sauce Labs Backpack photo, description and image

  @web
  Scenario: Test the functionality of the "Add to cart" button in "Sauce Labs Backpack" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Backpack
    Then user will see Sauce Labs Backpack photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"

  @web
  Scenario: Test the functionality of the "Remove" button in "Sauce Labs Backpack" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Backpack
    Then user will see Sauce Labs Backpack photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"
    And user will click Remove
    Then verify that the cart is empty

  @web
  Scenario: Test the product details of "Sauce Labs Bike Light"
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Bike Light
    Then user will see Sauce Labs Bike Light photo, description and image

  @web
  Scenario: Test the functionality of the "Add to cart" button in "Sauce Labs Bike Light" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Bike Light
    Then user will see Sauce Labs Bike Light photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"

  @web
  Scenario: Test the functionality of the "Remove" button in "Sauce Labs Bike Light" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Bike Light
    Then user will see Sauce Labs Bike Light photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"
    And user will click Remove
    Then verify that the cart is empty

  @web
  Scenario: Test the product details of "Sauce Labs Bolt T-Shirt"
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Bolt T-Shirt
    Then user will see Sauce Labs Bolt T-Shirt photo, description and image

  @web
  Scenario: Test the functionality of the "Add to cart" button in "Sauce Labs Bolt T-Shirt" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Bolt T-Shirt
    Then user will see Sauce Labs Bolt T-Shirt photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"

  @web
  Scenario: Test the functionality of the "Remove" button in "Sauce Labs Bolt T-Shirt" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Bolt T-Shirt
    Then user will see Sauce Labs Bolt T-Shirt photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"
    And user will click Remove
    Then verify that the cart is empty

  @web
  Scenario: Test the product details of "Sauce Labs Fleece Jacket"
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Fleece Jacket
    Then user will see Sauce Labs Fleece Jacket photo, description and image

  @web
  Scenario: Test the functionality of the "Add to cart" button in "Sauce Labs Fleece Jacket" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Fleece Jacket
    Then user will see Sauce Labs Fleece Jacket photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"

  @web
  Scenario: Test the functionality of the "Remove" button in "Sauce Labs Fleece Jacket" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Fleece Jacket
    Then user will see Sauce Labs Fleece Jacket photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"
    And user will click Remove
    Then verify that the cart is empty

  @web
  Scenario: Test the product details of "Sauce Labs Onesie"
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Onesie
    Then user will see Sauce Labs Fleece Onesie photo, description and image

  @web
  Scenario: Test the functionality of the "Add to cart" button in "Sauce Labs Onesie" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Onesie
    Then user will see Sauce Labs Fleece Onesie photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"

  @web
  Scenario: Test the functionality of the "Remove" button in "Sauce Labs Onesie" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Sauce Labs Onesie
    Then user will see Sauce Labs Fleece Onesie photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"
    And user will click Remove
    Then verify that the cart is empty

  @web
  Scenario: Test the product details of "Test.allTheThings() T-Shirt (Red)"
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Test allTheThings T-Shirt Red
    Then user will see Test allTheThings T-Shirt Red photo, description and image

  @web
  Scenario: Test the functionality of the "Add to cart" button in "Test.allTheThings() T-Shirt (Red)" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Test allTheThings T-Shirt Red
    Then user will see Test allTheThings T-Shirt Red photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"

  @web
  Scenario: Test the functionality of the "Remove" button in "Test.allTheThings() T-Shirt (Red)" display page
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    And user will click the title of Test allTheThings T-Shirt Red
    Then user will see Test allTheThings T-Shirt Red photo, description and image
    And user will click Add to cart
    Then verify that the items in the cart matches "1"
    And user will click Remove
    Then verify that the cart is empty

# FOR problem_user

  @web
  Scenario: Test the product display page for problem user
    Given open web login page
    And user inputs username "problem_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    Then the images for all products are displayed incorrectly

# FOR visual_user

  @web
  Scenario: Test the product display page for visual user
    Given open web login page
    And user inputs username "visual_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    And user will see the cart icon in the homepage
    Then the image for Sauce Labs Backpack is incorrectly displayed
    Then the prices of all products are incorrectly displayed