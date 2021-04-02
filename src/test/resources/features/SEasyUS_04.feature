@seleniumueasy04
Feature: Bootstrap List

  Background: user is on the home page
    Given The user is on the page of "https://www.seleniumeasy.com/test/"
    Given The user clicks on the Start Practicing


    @TC0403
    Scenario: the user fill Ajax form
      Given The user clicks on Input Forms button
      And The user clicks on Ajax form submit box button
      Given the user enter name "Garry"
      And the user enter Comment "Hi I'm here"
      And the user clicks submit button
      Then the user verify that succes message displayed

      @TC0404
      Scenario: the user changes the items
        Given user clicks List Box button
        And user clicks Bootstrap List Box
        And user moves the item bootstrap-duallist to the right
        And user moves the item Cras justo odio to the left
        Then user assert that movement is succesfull






