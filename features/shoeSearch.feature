@Regression
Feature: Shoe search validations
Scenario: Shoe search possitive scenarios
Given Open Chrome Browser with url
When Click on search button
And Select "<Acron>" from list
And Click on search
Then Validate Acron's shoes
