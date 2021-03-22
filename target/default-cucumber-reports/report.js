$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/seleniuleasy02.feature");
formatter.feature({
  "name": "Select List",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@seleniumeasy02"
    }
  ]
});
formatter.scenario({
  "name": "user is on the home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@seleniumeasy02"
    },
    {
      "name": "@TC001"
    }
  ]
});
formatter.step({
  "name": "The user is on the page of \"https://www.seleniumeasy.com/test/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SEasyStepDef01.the_user_is_on_the_page_of(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on the Start Practicing",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SEasyStepDef01.the_user_clicks_on_the_Start_Practicing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on the on Select Dropdown List",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.the_user_clicks_on_the_on_Select_Dropdown_List()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Kullanici, Select List Demo basligi altindaki Select a day (select one): dropDown\u0027dan tum gunleri secebildilgini dogrulamalidir.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "Kullanici select \"\u003cday\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user Assert that the \"\u003cday\u003e\" has selected",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "day"
      ]
    },
    {
      "cells": [
        "Sunday"
      ]
    },
    {
      "cells": [
        "Monday"
      ]
    },
    {
      "cells": [
        "Tuesday"
      ]
    },
    {
      "cells": [
        "Wednesday"
      ]
    },
    {
      "cells": [
        "Thursday"
      ]
    },
    {
      "cells": [
        "Friday"
      ]
    },
    {
      "cells": [
        "Saturday"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Kullanici, Select List Demo basligi altindaki Select a day (select one): dropDown\u0027dan tum gunleri secebildilgini dogrulamalidir.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@seleniumeasy02"
    },
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "Kullanici select \"Sunday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.kullanici_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Assert that the \"Sunday\" has selected",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.userAssertThatTheHasSelected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Kullanici, Select List Demo basligi altindaki Select a day (select one): dropDown\u0027dan tum gunleri secebildilgini dogrulamalidir.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@seleniumeasy02"
    },
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "Kullanici select \"Monday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.kullanici_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Assert that the \"Monday\" has selected",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.userAssertThatTheHasSelected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Kullanici, Select List Demo basligi altindaki Select a day (select one): dropDown\u0027dan tum gunleri secebildilgini dogrulamalidir.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@seleniumeasy02"
    },
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "Kullanici select \"Tuesday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.kullanici_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Assert that the \"Tuesday\" has selected",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.userAssertThatTheHasSelected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Kullanici, Select List Demo basligi altindaki Select a day (select one): dropDown\u0027dan tum gunleri secebildilgini dogrulamalidir.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@seleniumeasy02"
    },
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "Kullanici select \"Wednesday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.kullanici_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Assert that the \"Wednesday\" has selected",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.userAssertThatTheHasSelected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Kullanici, Select List Demo basligi altindaki Select a day (select one): dropDown\u0027dan tum gunleri secebildilgini dogrulamalidir.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@seleniumeasy02"
    },
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "Kullanici select \"Thursday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.kullanici_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Assert that the \"Thursday\" has selected",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.userAssertThatTheHasSelected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Kullanici, Select List Demo basligi altindaki Select a day (select one): dropDown\u0027dan tum gunleri secebildilgini dogrulamalidir.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@seleniumeasy02"
    },
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "Kullanici select \"Friday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.kullanici_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Assert that the \"Friday\" has selected",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.userAssertThatTheHasSelected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Kullanici, Select List Demo basligi altindaki Select a day (select one): dropDown\u0027dan tum gunleri secebildilgini dogrulamalidir.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@seleniumeasy02"
    },
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "Kullanici select \"Saturday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.kullanici_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Assert that the \"Saturday\" has selected",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.userAssertThatTheHasSelected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User select a day",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@seleniumeasy02"
    },
    {
      "name": "@TC003"
    }
  ]
});
formatter.step({
  "name": "User select \"Friday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.user_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Assert that the select day is \"Friday\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SelectStepDef.user_Assert_that_the_select_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});