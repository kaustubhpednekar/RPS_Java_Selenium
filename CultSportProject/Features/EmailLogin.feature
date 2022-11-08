Feature: CultSport Login
Description: This module is created for Login into CultSport using Email.

Scenario: Email Login
Given User is on CultSport HomePage
When User clicks onto Login Option
And User selects the Email Option
And User sign in with Email Option
And User enter it's Email Address
And User clicks on the Continue 
And User clicks on Continue after passing OTP
Then User is logged in Successfully
