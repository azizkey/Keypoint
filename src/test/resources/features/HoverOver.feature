Feature: hover over the “Hover me to see” button and verify the “You Hovered Over the button” message then
         hover over the “Hover me to see” text field and verify “You hovered the text field” message.

  Background:
    Given user goes to "https://demoqa.com/" page

    Scenario: Hover over the “Hover me to see” button and verify
      And user clicks Widgets on the page
      And user clicks Tool tips under the Widgets menu
      When the user hover over to Hover me to see
      Then user should see You hovered over the Button text and verify the text
