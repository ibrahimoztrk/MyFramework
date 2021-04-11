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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027ant-message-custom-content ant-message-success\u0027]\"}\n  (Session info: chrome\u003d89.0.4389.114)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-JUNIQM5\u0027, ip: \u0027192.168.0.10\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.114, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\ibrahim\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:60708}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5aca2f128fe9fbccd55a023382401231\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027ant-message-custom-content ant-message-success\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat UI_tests.HyriaSettingsStepDef.user_change_years_of_experience(HyriaSettingsStepDef.java:84)\r\n\tat ✽.user change years of experience(file:///C:/Users/ibrahim/IdeaProjects/MyFramework01/src/test/resources/features/Hyrai02.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user change years of remote experience",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaSettingsStepDef.user_change_years_of_remote_experience()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user change type of engineering experience",
  "keyword": "And "
});
formatter.match({
  "location": "UI_tests.HyriaSettingsStepDef.user_change_type_of_engineering_experience()"
});
formatter.result({
  "status": "skipped"
});
});