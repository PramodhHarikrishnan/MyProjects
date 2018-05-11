$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/resources/features/LoginDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Login details Module",
  "description": "Using data driven and cucumber, i am going to do login module",
  "id": "login-details-module",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login to analytics in details",
  "description": "",
  "id": "login-details-module;login-to-analytics-in-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open analytics website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter \u003cGroup_Name\u003e GroupName in login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter \u003cUser_Name\u003e UserName in login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \u003cPassword\u003e Password in login page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Log In button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see \u003cUser_Display\u003e User display name in default page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Click Logout button",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login-details-module;login-to-analytics-in-details;",
  "rows": [
    {
      "cells": [
        "Group_Name",
        "",
        "User_Name",
        "",
        "Password",
        "",
        "User_Display"
      ],
      "line": 14,
      "id": "login-details-module;login-to-analytics-in-details;;1"
    },
    {
      "cells": [
        "DP:GroupName",
        "",
        "DP:UserName",
        "",
        "DP:Password",
        "",
        "DP:DisplayText"
      ],
      "line": 15,
      "id": "login-details-module;login-to-analytics-in-details;;2"
    },
    {
      "cells": [
        "2DP:GroupName",
        "",
        "2DP:UserName",
        "",
        "2DP:Password",
        "",
        "2DP:DisplayText"
      ],
      "line": 16,
      "id": "login-details-module;login-to-analytics-in-details;;3"
    },
    {
      "cells": [
        "feqauk",
        "",
        "test_1",
        "",
        "2DP:Password",
        "",
        "3DP:DisplayText"
      ],
      "line": 17,
      "id": "login-details-module;login-to-analytics-in-details;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Login to analytics in details",
  "description": "",
  "id": "login-details-module;login-to-analytics-in-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open analytics website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter DP:GroupName GroupName in login page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter DP:UserName UserName in login page",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter DP:Password Password in login page",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Log In button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see DP:DisplayText User display name in default page",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Click Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_analytics_website()"
});
formatter.result({
  "duration": 1013901826,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:GroupName",
      "offset": 8
    }
  ],
  "location": "LoginDetailsSteps.I_Enter_GroupName(String)"
});
formatter.result({
  "duration": 2464502524,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:UserName",
      "offset": 8
    }
  ],
  "location": "LoginDetailsSteps.I_Enter_UserName(String)"
});
formatter.result({
  "duration": 234745160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:Password",
      "offset": 8
    }
  ],
  "location": "LoginDetailsSteps.I_Enter_Password(String)"
});
formatter.result({
  "duration": 197986914,
  "status": "passed"
});
formatter.match({
  "location": "LoginDetailsSteps.I_click_on_Log_In_button()"
});
formatter.result({
  "duration": 96885513,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:DisplayText",
      "offset": 6
    }
  ],
  "location": "LoginDetailsSteps.I_see_User_DisplayName_in_DefaultPage(String)"
});
formatter.result({
  "duration": 5334497152,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_logout_button()"
});
formatter.result({
  "duration": 130621635,
  "status": "passed"
});
formatter.after({
  "duration": 9683163247,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login to analytics in details",
  "description": "",
  "id": "login-details-module;login-to-analytics-in-details;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open analytics website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter 2DP:GroupName GroupName in login page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter 2DP:UserName UserName in login page",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter 2DP:Password Password in login page",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Log In button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see 2DP:DisplayText User display name in default page",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Click Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_analytics_website()"
});
formatter.result({
  "duration": 29701117,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2DP:GroupName",
      "offset": 8
    }
  ],
  "location": "LoginDetailsSteps.I_Enter_GroupName(String)"
});
formatter.result({
  "duration": 10568460190,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat cex.project.stepsdefinition.LoginDetailsSteps.I_Enter_GroupName(LoginDetailsSteps.java:24)\r\n\tat ✽.And I enter 2DP:GroupName GroupName in login page(test/resources/features/LoginDetails.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "2DP:UserName",
      "offset": 8
    }
  ],
  "location": "LoginDetailsSteps.I_Enter_UserName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2DP:Password",
      "offset": 8
    }
  ],
  "location": "LoginDetailsSteps.I_Enter_Password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginDetailsSteps.I_click_on_Log_In_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2DP:DisplayText",
      "offset": 6
    }
  ],
  "location": "LoginDetailsSteps.I_see_User_DisplayName_in_DefaultPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_click_logout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 631359889,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Login to analytics in details",
  "description": "",
  "id": "login-details-module;login-to-analytics-in-details;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open analytics website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter feqauk GroupName in login page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter test_1 UserName in login page",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter 2DP:Password Password in login page",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Log In button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see 3DP:DisplayText User display name in default page",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Click Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_analytics_website()"
});
formatter.result({
  "duration": 25735219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "feqauk",
      "offset": 8
    }
  ],
  "location": "LoginDetailsSteps.I_Enter_GroupName(String)"
});
