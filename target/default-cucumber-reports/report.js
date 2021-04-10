$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Hyrai02.feature");
formatter.feature({
  "name": "Account profile page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@allModuleSettings"
    }
  ]
});
formatter.scenario({
  "name": ": user goes hyrai homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@allModuleSettings"
    }
  ]
});
formatter.step({
  "name": "user goes to hyrai homepage \"https://hyrai.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "UI_tests.HyriaResumeStepDef.user_goes_to_hyrai_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes to signIn page",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaResumeStepDef.user_goes_to_signIn_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with the valid mail \"nexima00@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaResumeStepDef.user_logs_in_with_the_valid_mail(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with the valid password \"123456\"",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaResumeStepDef.user_logs_in_with_the_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click signIn button",
  "keyword": "Then "
});
formatter.match({
  "location": "UI_tests.HyriaResumeStepDef.user_click_signIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "users should be able to view update and add information in the user edit settings other module",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@allModuleSettings"
    },
    {
      "name": "@settingsOther"
    }
  ]
});
formatter.step({
  "name": "user click settings",
  "keyword": "Given "
});
formatter.match({
  "location": "UI_tests.HyriaSettingsStepDef.user_click_settings()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click other button",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaSettingsStepDef.user_click_other_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change employment type",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaSettingsStepDef.user_change_employment_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change salary expectation",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaSettingsStepDef.user_change_salary_expectation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change technologies experience",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaSettingsStepDef.user_change_technologies_experience()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change years of experience",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaSettingsStepDef.user_change_years_of_experience()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change years of remote experience",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaSettingsStepDef.user_change_years_of_remote_experience()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change type of engineering experience",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaSettingsStepDef.user_change_type_of_engineering_experience()"
});
formatter.result({
  "status": "passed"
});
});