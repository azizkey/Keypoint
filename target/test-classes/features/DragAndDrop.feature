Feature: Drag and Drop element on the Droppale page and verify that is droped

Scenario: Drag and drop and verify
  Given user goes to "https://demoqa.com/droppable" page
  And drag element to the drop field
  Then verify that is dropped