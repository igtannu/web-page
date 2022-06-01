Feature: Swipe Feature in Gallery
  I want to use Swipe function in Gallery options
 @test
  Scenario: Gallery_Swipe
    Given Open Emulator and App
    When Click on Views and Gallery
    And Click on photos
    And Swipe images
    Then Check Sucessfully Swipped
  