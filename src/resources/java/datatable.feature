Feature: Login
Scenario: Login with data table
Given User Must be registered
When login using below credentials
|username||password|
|abc123||abc123|
|xyz12||xyz12|
Then User must be in home page