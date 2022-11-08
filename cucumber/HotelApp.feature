Feature: HotelApp login
Description: This test is to check the login functionality 

Scenario: Login Successful
Given User is on the HotelApp HomePage
When User enters the username details
And User enters the Password details
And User clicks the Loginbutton
Then Login is successful


