Feature: Rentomojo Cucumber
Description: This test is to check the functionality of the Rentomojo

Scenario: Functionality
Given User is on Rentomojo homepage
When User selects city
And User clicks on Login button
And User enters Number
And User clicks on Continue Button
And User enters Otp
And User clicks on Continue2 button

And User searches for a product
And User clicks enter
And User navigates back to homepage

And User selects furnitures in category
And User clicks on Bedroom Item


And User selects product
And User clicks on Add to cart button
And User clicks on View cart button
Then View Cart Page is displayed
