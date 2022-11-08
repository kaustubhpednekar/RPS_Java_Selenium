Feature: Cart Opening
Description: This module shows what's inside the cart

Scenario: Cart Opened Successfully
Given User can see cart icon
When User open cart 
And User clicks on book now
Then Cart is Opened Successfully