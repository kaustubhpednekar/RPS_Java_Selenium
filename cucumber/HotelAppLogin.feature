Feature: HotelApp login
Description: This test is to check the login functionality 

Scenario: Login Successful
Given User is on the HotelApp HomePage
When User enters the username as "vasuvespag" details
And User enters the password as "vasu1234" details
And User clicks the Loginbutton
Then Login is successful


