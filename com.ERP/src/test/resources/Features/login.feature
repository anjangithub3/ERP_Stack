Feature: Checking login functionality of ERP application

Scenario: check login login functionality with valid Credentials

Given User on loginPage
When uesr enter the <username> and <passwore>
And user click on login button
Then user navigate to homepage