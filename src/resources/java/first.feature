Feature: login Functionality

Background: user login
Given Browse must be installed by the user
When User Enter AUT URL in browser
Then user must be in Home Page

Scenario: Login
Given User must be in AUT login Page
When User enters the credentials
Then user must be in Home Page

Scenario: Search
Given Home Page must be open
When user enters the Product to search
Then Product details must be displayed to the user