Feature: RA_Demo Test for ReqRes API

Scenario: User is able to add a new user and delete existing user
Given List of users are available
When I add a new user
When a user is updated
When new list of users is displayed
Then existing user is deleted