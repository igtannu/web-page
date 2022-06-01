Feature: Search With data Example given
  I Used feature for outline in this Feature
@test
  Scenario Outline: Search Query
    Given Open Emulator and App
    When Choose App and Search
    And Choose Invoke Search
    When Enter Prefill Query <Prefill_Query>
    And Enter  App Data <App_Data>
    And Click on OnSearchRequest button
    Then User is on Search Page
    
    Examples: 
      | Prefill_Query | App_Data |
      | Photo         | Animal   |
      | Human         | Girl     |
