@allModuleResume
Feature: Account profile page

  Background: user goes hyrai homepage
    Given user goes to hyrai homepage "https://hyrai.com/"
    And   user goes to signIn page
    And   user logs in with the valid mail "nexima00@gmail.com"
    And   user logs in with the valid password "198546"
    Then  user click signIn button

  Scenario: users should be able to upload or delete resume
    And  user click resume
    And  user click selectFile button
    And  user click upload resume
    And  user delete resume

