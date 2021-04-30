@allMesage
Feature: Account profile page

  Scenario: : user goes hyrai homepage
    Given user goes to hyrai homepage "https://hyrai.com/"
    And   user goes to signIn page
    And   user logs in with the valid mail "nexima00@gmail.com"
    And   user logs in with the valid password "123456"
    Then  user click signIn button

    Scenario: user message
      Given user click message
      And user click button