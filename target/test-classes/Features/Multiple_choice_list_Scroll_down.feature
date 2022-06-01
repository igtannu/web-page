Feature: Multiple choice Options with Scroll Down Function
I Used Scroll Down function in this Feature file
@test
  Scenario: Multiple Selection Option
    Given Open Emulator and App
    When Choose Views and Scroll
    And Choose List and Multiple choice list
    And Choose Multiple Options
    Then Check if Options are Selected
