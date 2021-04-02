@seleniumeasy02
Feature: Select List

  @TC001
  Scenario: user is on the home page
    Given The user is on the page of "https://www.seleniumeasy.com/test/"
    Given The user clicks on the Start Practicing
    And The user clicks on the on Select Dropdown List

  @TC002
  Scenario Outline: Kullanici, Select List Demo basligi altindaki Select a day (select one): dropDown'dan tum gunleri secebildilgini dogrulamalidir.
    Given Kullanici select "<day>"
    Then user Assert that the "<day>" has selected
    Examples:
      | day       |
      | Sunday    |
      | Monday    |
      | Tuesday   |
      | Wednesday |
      | Thursday  |
      | Friday    |
      | Saturday  |

    @TC003
    Scenario: User select a day
      Given User select "Friday"
      Then user Assert that the select day is "Friday"

      @TC004
      Scenario: User select from multi select list
        Given User select all citys
        And The user clicks on Get All Selected button
        Then user Assert that "Options selected are" message is displayed








