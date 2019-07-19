Feature: Login Functionality

Scenario Outline: Login Functionality

Given User must be registered
When login using <username> and <password>
Then User must be in home page

Examples:
|username||password|
|abc123||abc123|
|xyz12||xyz12|