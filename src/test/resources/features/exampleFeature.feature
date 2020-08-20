@RunnerTags
Feature: Example of a feature

  @Action
  Scenario: Example of a scenario to work with

    Given That User wants to take an action
      |userExample|passwordExample|
      |John       |123456         |
    When he Enters the data to take the action
      |nameExample|lastNameExample|address  |date      |
      |John       |Doe            |123 south|2020/12/31|
    Then he verifies the message "success"


  @Option
  Scenario: Alternative flux

