Feature: Verify all alert on the link down below

  Background:
    Given user goes to "https://demoqa.com/alerts" page

  Scenario: Handle the first alert
    And click Click Me Button to see alert button
    Then click alert ok button to hadle alert

  Scenario: Handle the 5 seconds delay alert
    And user clicks second alert box
    And click alert ok button to hadle alert

  Scenario: Handle the conformation alert
    And user clicks third alert box
    Then confirm the alert

  Scenario: Handle the prompt alert and verify it
    And user clicks prompt button alert box
    And user enters input into JS alert box
    Then verify the alert input


