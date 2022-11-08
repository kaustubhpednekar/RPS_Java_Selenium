Feature: HotelApp login
Description: This test is to check the login functionality 

Scenario Outline: Login Successful
Given User is on the HotelApp HomePage
When User enters the username as <"<username>"> details
And User enters the Password as <"<password>"> details
And User clicks the Loginbutton
Then Login is successful

Examples:
| username | password |
| vasuvespag | vasu1234 |
| aryan1207 | Aryan@120799 |


