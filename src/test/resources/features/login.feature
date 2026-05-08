#Author: Rajvinder Kaur
@tag
Feature: Test login cases
@tag1
Scenario: Verify that user can login with correct credentials
Given: Chrome browser is opened And user is on url "https://the-internet.herokuapp.com/"
When:  user clicks on Login link
Then: user should land to Login page
When: user enters correct username "tomsmith" And correct password "SuperSecretPassword!" And enter Login button
Then: user should be successfully logged in


