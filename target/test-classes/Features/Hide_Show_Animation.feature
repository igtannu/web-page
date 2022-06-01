Feature: Hide and Show Animation buttons
@test
  Scenario: Hide of buttons Feature 
    Given Open Emulator and App
    When Choose Animation and Hide show animation
    And Click on buttons for hiding
    Then Check if Sucessfully hide buttons
@test
  Scenario: Show of buttons Feature
    Given Open Emulator and App
    When Choose Animation and Hide show animation
    And Click on buttons for hiding
    And Click on Show_button
    Then Check if buttons Displayed