Feature: End2End Test for ReqRes API

Scenario: User is able to add a new user and delete existing user
Given List of users are available
When I add a new User
Then new user is added
