@seleniumueasy03
  Feature: JS Alerts

    @TC0301
    Scenario: user is on the home page
      Given The user is on the page of "https://www.seleniumeasy.com/test/"
      Given The user clicks on the Start Practicing
      And The user clicks on Javascript Alerts

      @TC0302
      Scenario: user accept alert
        Given user clicks Click Me button
        Then user verify that "I am alert" message is displayed
        And user accepts alert

        @TC0303
          Scenario:  user cancel alert
          Given user clicks Click Me button
          And user clicks cancel button
          Then user verify that "You pressed Cancel!"second message is displayed


        @TC0304
        Scenario: user send keys to Prompt Box
          Given user clicks Click for Prompt Box button
          And user enter  "Hi this is me" to Prompt Box
          And user clicks OK button
          Then user verfy that "Hi this is me" is displayed

