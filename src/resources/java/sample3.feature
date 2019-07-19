Feature: Login Single
Scenario: Login using single credentials
Given User must be Registered
When Login using "abc" and "pass123"
Then User must be in Home page