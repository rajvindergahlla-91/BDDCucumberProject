#Author: Rajvinder kaur
@Regression
Feature: JS Alerts test


@Alerts
Scenario: Simple JS alert Validations
Given user is on url "https://the-internet.herokuapp.com/"
When user click on JavaScript Alerts link
Then user should land on JavaScript Alerts page
When user click on Click for JS Alert button
And user click on ok
Then result message should contain "You successfully clicked an alert"
  