@allModuleSettings
Feature: Account profile page

  Scenario: : user goes hyrai homepage
    Given user goes to hyrai homepage "https://hyrai.com/"
    And   user goes to signIn page
    And   user logs in with the valid mail "nexima00@gmail.com"
    And   user logs in with the valid password "123456"
    Then  user click signIn button


  @settingsOther
  Scenario: users should be able to view update and add information in the user edit settings other module
    Given user click settings
    And   user click other button
    And   user change employment type
    And   user change salary expectation
    And   user change technologies experience
    And   user change years of experience
    And   user change years of remote experience
    And   user change type of engineering experience