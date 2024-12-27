# Swag Labs Web UI Automation Testing Framework

This repository contains the web UI automation test project for the Swag Labs e-commerce website. The project is built using Cucumber, Java, Gradle, and Selenium, and aims to ensure the functionality and security of the login page, product page, checkout page, and cart. The repository includes source code for the project, POM implementation, Gherkin test cases, and Cucumber implementation, along with sample test cases.

## Table of Contents

- Technologies Used
- Project Structure
- Requirements
- Dependencies
- Installation
- Configurations
- Running Tests
- Test Cases

## Technologies Used

- **Java**: The primary programming language for the project.
- **Cucumber**: A testing tool that supports Behavior Driven Development (BDD) for defining test cases in Gherkin syntax.
- **Gradle**: A build automation tool used to manage dependencies and build the project.
- **Selenium**: A web automation tool for interacting with web applications.

## Project Structure

Here is the breakdown of the project structure:
- **LoginWeb.feature**: Contains scenarios for testing the login functionality, including valid and invalid login attempts.
- **ProductWeb.feature**: Tests the product page, such as displaying available products and adding them to the cart.
- **CheckoutWeb.feature**: Scenarios that verify the checkout process, handling successful and empty cart scenarios.
- **CartWeb.feature**: Tests the shopping cart functionalities, including viewing items and removing products.
- **SecurityWeb.feature**: Ensures that the account is secured and will be automatically logged out after a certain period of inactivity.
- **Models**: Encapsulate the interactions with the UI elements on each page, providing methods to perform actions (like clicking buttons, entering text) and verify page content.
- **Utility**: This includes classes for managing the WebDriver instance, handling configuration settings, and providing reusable methods for various tasks.
- **WebPage**: Each class defines the elements on the page and the methods that encapsulate interactions with those elements. The methods within these classes are called by step definitions in the Cucumber tests.
- **WebStep**: Contains the step definition classes for Cucumber scenarios. Each class corresponds to a feature file and implements the methods that define how to interact with the web application during testing.
- **CucumberTest**: This is used to generate reports in HTML and JSON files.
- **Hooks**: These are blocks of code that run before or after each scenario. They allow us to set up any preconditions or perform clean-up tasks after tests.

## Requirements

- [Java 8 or above](https://www.oracle.com/java/technologies/javaese-downloads.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea) or another Java IDE
- [Gradle](https://www.gradle.org/install/) for dependency management and build automation
- [JUnit](https://junit.org/junit5/)
- [Maven Repository](https://mvnrepository.com)
- [Cucumber](https:cucumber.io)
- [Selenium Web Driver](https://www.selenium.dev/documentation/webdriver/)
- Browser: The latest version of Google Chrome with the latest version of the WebDriver installed

## Dependencies

The following dependencies are included in the project:

- testImplementation platform('org.junit:junit-bom:5.10.0')
- testImplementation 'org.junit.jupiter:junit-jupiter'
- testImplementation 'org.junit.vintage:junit-vintage-engine:5.7.2'
- implementation group: 'io.cucumber', name: 'cucumber-java', version: '7.20.1'
- implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.25.0'
- testImplementation group: 'junit', name: 'junit', version: '4.13.2'
- testImplementation("io.github.bonigarcia:webdrivermanager:5.9.2")
- testImplementation group: 'io.cucumber', name: 'cucumber-junit', version: '7.20.1'
- testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.9.0'
- testImplementation group: 'org.assertj', name: 'assertj-core', version: '3.26.3'

## Installation

1. Clone the repository:
   git clone https://github.com/vitrilukito/Swag-Labs-Web-UI-Automation-Testing-Framework
2. Install Gradle:
   Ensure you have Gradle installed on your machine. You can check if Gradle is installed by running: gradle -v. If not, you can install it by following the instructions on the [Gradle website](https://gradle.org/)
3. Install IntelliJIDEA.
4. Build the project on IntelliJIDEA.

## Configurations

To run this project, make sure you have the following configured:
1. **Java Development Kit (JDK)**: Install JDK 8 or higher on your machine. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) or use [OpenJDK](https://www.openjdk.java.net/install/).
2. **Gradle**: Ensure you have Gradle installed. You can install it following the instructions on the [Gradle website](https://gradle.org/install/).
3. **IntelliJ IDEA**: Use IntelliJ IDEA as your IDE for coding. You can download it from the [JetBrains website](https://jetbrains.com/idea/download/).
4. **Dependencies**: The project uses the following dependencies, which are included in the 'build.gradle' file:
   - JUnit
   - Selenium
   - Cucumber
   - Assertion 
  
After setting up these tools, you can run the tests and work on the project.

## Running Tests

You can run the tests in the project using the Gradle wrapper or directly from the IDE.

### Running via IDE

1. Navigate to the Runner class.
2. Right-click the class and select "Run" to execute the Cucumber feature.

### Running via Command Line
1. Use the Gradle command: ./gradlew test

## Test Cases

The project includes a total of 5 pages and 50 test cases categorized into:
- **Positive Test Cases**: Validate the successful execution of login page, product page, checkout page, cart, and security with valid inputs.

**Sample of positive test case:**


<img width="407" alt="image" src="https://github.com/user-attachments/assets/8b4e1d5b-2d5a-4666-9b5b-76fd80299fa5">


**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="706" alt="image" src="https://github.com/user-attachments/assets/b786f2e3-b1f8-4cc9-8833-fa8ec3854c24">


**Page Object:**
The WebPage class is used to interact with the login page:


<img width="492" alt="image" src="https://github.com/user-attachments/assets/debe37ea-e422-4814-9399-ae6823a943e3">


- **Negative Test Cases**: Verify the API's behavior with invalid inputs, invalid usernames, or missing required fields.

**Sample of negative test case:**


<img width="502" alt="image" src="https://github.com/user-attachments/assets/a39ec7d0-2db7-4819-a817-59317db7800d">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="888" alt="image" src="https://github.com/user-attachments/assets/ef290a3a-b4f2-4c5c-a577-9743018464e2">



**Page Object:**
The WebPage class of the above test case is as below:


<img width="966" alt="image" src="https://github.com/user-attachments/assets/c9e2d516-6b9f-42ed-9377-63feaf5ef562">



- **Boundary Test Cases**: Ensure correct handling of boundary values, including invalid inputs.

**Sample of boundary test case:**


<img width="580" alt="image" src="https://github.com/user-attachments/assets/5d105177-c5c5-4ced-b35c-defa757a5807">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="879" alt="image" src="https://github.com/user-attachments/assets/93d476d8-0923-40fe-83cc-0690d185e5ae">



**Page Object:**
The WebPage class of the above test case is as below:


<img width="973" alt="image" src="https://github.com/user-attachments/assets/5fd46380-b86a-411c-a0b1-bfa010ff591e">



The test cases are presented in 5 different files. You can view all the test cases here:
- [Cart.feature](src/test/resources/features/Cart.feature)
- [Checkout.feature](src/test/resources/features/Checkout.feature)
- [Login.feature](src/test/resources/features/Login.feature)
- [Product.feature](src/test/resources/features/Product.feature)
- [Security.feature](src/test/resources/features/Security.feature)

