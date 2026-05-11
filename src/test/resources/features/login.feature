#Author: Rajvinder kaur
@Regression
Feature: Test login cases


Background: 
Given  user is on url "https://the-internet.herokuapp.com/"
When user clicks on Form Authentication link
Then user should land to Login page


@Login
Scenario Outline: Login Validations
When user enters username "<username>"
And user enters password "<password>"
And enter Login button
Then user should see "<result>"

Examples:
|username         | password            |  result            |
|tomsmith         | SuperSecretPassword!|  success           |
|admin            | SuperSecretPassword!|  error             |
|tomsmith         | super               |  error             |
|raj              | class               |  error             |
|                 | admin123            | username required  |
|minarv           |                     | password required  |
