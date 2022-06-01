Feature: WebView Feature
@test
  Scenario: Web View Features
    Given Open Emulator and App
    When Choose Views and Scroll down
    And Click on Webview
    And Click on link
    Then Check if Sucessfully reached Webview Page
