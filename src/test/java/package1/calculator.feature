Feature: test Calculator

Scenario: Add two numbers
  Given I enter 50 in the calculator
  And I press add
  And I have entered 20 in calculator
  When I press equal symbol
  Then the result should be 70 on screen

Scenario: Add two numbers
  Given I enter 30 in the calculator
  And I press add
  And I have entered 10 in calculator
  When I press equal symbol
  Then the result should be 40 on screen
 