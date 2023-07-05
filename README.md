# Project README: PSP Automation

## Overview
This project involves automating the website www.psp.ge for PSP, the first Georgian company to offer medicines of European guaranteed quality since 1994. The company serves as a distributor for over 100 leading pharmaceutical manufacturers worldwide, providing the population of Georgia with a diverse range of modern medicines and guaranteed quality parapharmaceutical products.

The aim of this automation project is to ensure the quality of products and services offered by PSP through rigorous testing using TestNG, Java, Selenium, JavaFaker, and Allure report. This README file provides an overview of the project and its components, including the test cases implemented and the tools used.

## Table of Contents
- [Components](#components)
- [Test Cases](#test-cases)
- [Tools Used](#tools-used)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Reporting](#reporting)
- [Contributing](#contributing)
- [License](#license)

## Components
The project comprises several key components:
1. **TestNG**: A testing framework used to organize and execute test cases.
2. **Java**: The programming language used to write the automation scripts.
3. **Selenium**: A popular open-source web testing framework used for automating browser interactions.
4. **WebDriverManager**: A library used for automatic management of WebDriver binaries (e.g., ChromeDriver, GeckoDriver) required by Selenium.
5. **JavaFaker**: A library for generating fake test data, which can be used to simulate various scenarios during testing.
6. **Allure Report**: A flexible reporting framework that provides detailed reports with rich visualization for better test analysis.

## Test Cases
The project includes the following 10 test cases, each addressing a specific aspect of the PSP website's functionality:
1. Test Case 1: Verify successful login functionality.
2. Test Case 2: Verify Invalid Login Credentials.
3. Test Case 3: Verify Registration Functionality.
4. Test Case 4: Verify invalid registration functionality.
5. Test Case 5: Verify Password Reset Functionality.
6. Test Case 6: Verify Search Functionality.
7. Test Case 7: Verify the functionality of adding a medicine to the shopping cart
8. Test Case 8: Verify Cart Functionality (Perform operations like updating quantity, removing items, and applying discounts. Verify that the cart total is calculated accurately.)
9. Test Case 9: Verify Checkout Process.
10. Test Case 10: Website Footer Link Verification



## Getting Started
To get started with the PSP Automation project, follow these steps:
1. Clone the project repository from GitHub: [repository-link].
2. Install the necessary dependencies, including TestNG, WebdriverManager, Java, Selenium, JavaFaker, and Allure Report.
3. Set up the project structure and configuration files.
4. Configure the required browser drivers (e.g., ChromeDriver) for Selenium.
5. Update the test data and test cases as per the project requirements.
6. Customize any project-specific configurations or settings if needed.

## Usage
To run the automated tests and execute the test cases, follow these steps:
1. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
2. Locate the test suite or test class containing the desired test cases.
3. Right-click on the test suite or class and select "Run" or "Run withTestNG."
4. Monitor the execution progress and check for any test failures or errors.
5. Review the test reports generated by Allure Report for detailed test results.

## Reporting
This project utilizes Allure Report to generate detailed test reports with rich visualization. After running the test suite, the Allure Report generates an HTML-based report that can be accessed in the `target/site/allure-report` directory. Open the `index.html` file in a web browser to view the comprehensive test results, including test case status, logs, screenshots, and other relevant information.

## Contributing
Contributions to this project are welcome. If you have any suggestions, improvements, or bug fixes, please feel free to submit a pull request or open an issue in the project repository on GitHub.


