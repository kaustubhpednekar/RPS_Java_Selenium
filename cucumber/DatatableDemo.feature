Feature: HotelApp login
Description: This test is to check the login functionality 

Scenario: Login Successful
Given User is on the HotelApp HomePage
When User enters Username and Password
| username | password |
| vasuvespag | vasu1234 |
| aryan1207 | Aryan@120799 |
And User clicks the Loginbutton
Then Login is successful


