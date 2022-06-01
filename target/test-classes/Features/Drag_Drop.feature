Feature: Drag and Drop Feature 
  I want to use this Feature as fig Dropped
 
 @test
  Scenario: Drag and Drop Feature
    Given Open Emulator and App
    When Click on Views and Drag_Drop
    And Drag First circle to Second
    Then Sucessfully Dropped and get it Written
