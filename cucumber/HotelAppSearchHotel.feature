Feature: HotelApp 
Description: This test is to check the SearchHotel functionality 
Background: user is logged in
Given User is on the HotelApp HomePage
When User enters the username details
And User enters the Password details
And User clicks the Loginbutton


Scenario: SearchHotel Successful
When User selects location from the dropdown
And User clicks on search button
Then The List of Hotels is displayed

Scenario: Select Hotel
When User selects location from the dropdown
And User clicks on search button
And User selects a radio button
And User clicks on continue button
Then The Book a Hotel  page is displayed
