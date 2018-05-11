$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/resources/features/PerformanceTable.feature");
formatter.feature({
  "line": 1,
  "name": "Performace Table Module",
  "description": "Validate Performace Table page",
  "id": "performace-table-module",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#  Scenario Outline: Validate Performace Table page"
    },
    {
      "line": 5,
      "value": "#    When I open analytics website"
    },
    {
      "line": 6,
      "value": "#\tAnd I see analytics default page"
    },
    {
      "line": 7,
      "value": "#\tAnd I select \u003cUniverse\u003e Universe"
    },
    {
      "line": 8,
      "value": "#\tAnd I select \u003cFundGroup\u003e Fund Group"
    },
    {
      "line": 9,
      "value": "#\tAnd I select \u003cFundName\u003e Fund Name"
    },
    {
      "line": 10,
      "value": "#    And I Add fund in Active List"
    },
    {
      "line": 11,
      "value": "#    And I Open performace table page"
    },
    {
      "line": 12,
      "value": "#    And I see perfromace table Title"
    },
    {
      "line": 13,
      "value": "#    And I close the perfromance page"
    },
    {
      "line": 14,
      "value": "#    Then I Click Logout button"
    },
    {
      "line": 15,
      "value": "#"
    },
    {
      "line": 16,
      "value": "#     Examples:"
    },
    {
      "line": 17,
      "value": "#      |Universe |      |FundGroup    |            |FundName |"
    },
    {
      "line": 18,
      "value": "#      |DP:Universe  |  |DP:FundGroup |            |DP:FundName |"
    },
    {
      "line": 19,
      "value": "#      |2DP:Universe |  |7IM Investment Funds |    |AAP Adventurous A Acc - Mar 08 (BFB7)|"
    },
    {
      "line": 20,
      "value": "#      |3DP:Universe |  |3DP:FundGroup |           |3DP:FundName |"
    }
  ],
  "line": 22,
  "name": "Validate Performace Table page in diff input",
  "description": "",
  "id": "performace-table-module;validate-performace-table-page-in-diff-input",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "I open analytics website",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I enter \u003cGroup_Name\u003e GroupName in login page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter \u003cUser_Name\u003e UserName in login page",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter \u003cPassword\u003e Password in login page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on Log In button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I see \u003cUser_Display\u003e User display name in default page",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select \u003cUniverse\u003e Universe",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select \u003cFundGroup\u003e Fund Group",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I select \u003cFundName\u003e Fund Name",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I Add fund in Active List",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Open performace table page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I see perfromace table Title",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I close the perfromance page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I Click Logout button",
  "keyword": "Then "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "performace-table-module;validate-performace-table-page-in-diff-input;",
  "rows": [
    {
      "cells": [
        "Universe",
        "",
        "FundGroup",
        "",
        "FundName",
        "",
        "Group_Name",
        "",
        "User_Name",
        "",
        "Password",
        "",
        "User_Display"
      ],
      "line": 39,
      "id": "performace-table-module;validate-performace-table-page-in-diff-input;;1"
    },
    {
      "cells": [
        "3DP:Universe",
        "",
        "3DP:FundGroup",
        "",
        "3DP:FundName",
        "",
        "2DP:GroupName",
        "",
        "2DP:UserName",
        "",
        "DP:Password",
        "",
        "DP:DisplayText"
      ],
      "line": 40,
      "id": "performace-table-module;validate-performace-table-page-in-diff-input;;2"
    },
    {
      "cells": [
        "2DP:Universe",
        "",
        "7IM Investment Funds",
        "",
        "AAP Adventurous A Acc - Mar 08 (BFB7)",
        "",
        "1DP:GroupName",
        "",
        "1DP:UserName",
        "",
        "2DP:Password",
        "",
        "2DP:DisplayText"
      ],
      "line": 41,
      "id": "performace-table-module;validate-performace-table-page-in-diff-input;;3"
    },
    {
      "cells": [
        "DP:Universe",
        "",
        "DP:FundGroup",
        "",
        "DP:FundName",
        "",
        "feqauk",
        "",
        "test_1",
        "",
        "2DP:Password",
        "",
        "3DP:DisplayText"
      ],
      "line": 42,
      "id": "performace-table-module;validate-performace-table-page-in-diff-input;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 40,
  "name": "Validate Performace Table page in diff input",
  "description": "",
  "id": "performace-table-module;validate-performace-table-page-in-diff-input;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "I open analytics website",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I enter 2DP:GroupName GroupName in login page",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter 2DP:UserName UserName in login page",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter DP:Password Password in login page",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on Log In button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I see DP:DisplayText User display name in default page",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select 3DP:Universe Universe",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select 3DP:FundGroup Fund Group",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I select 3DP:FundName Fund Name",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I Add fund in Active List",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Open performace table page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I see perfromace table Title",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I close the perfromance page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I Click Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_analytics_website()"
});
formatter.result({
  "duration": 1288272575,
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
  "duration": 2710290841,
  "status": "passed"
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
  "duration": 408856476,
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
  "duration": 348814765,
  "status": "passed"
});
formatter.match({
  "location": "LoginDetailsSteps.I_click_on_Log_In_button()"
});
formatter.result({
  "duration": 254992204,
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
  "duration": 7035413700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3DP:Universe",
      "offset": 9
    }
  ],
  "location": "PerformanceTableSteps.i_select_Universe(String)"
});
formatter.result({
  "duration": 452881147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3DP:FundGroup",
      "offset": 9
    }
  ],
  "location": "PerformanceTableSteps.i_select_Fund_Group(String)"
});
formatter.result({
  "duration": 1386223981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3DP:FundName",
      "offset": 9
    }
  ],
  "location": "PerformanceTableSteps.i_select_Fund_Name(String)"
});
formatter.result({
  "duration": 498650883,
  "status": "passed"
});
formatter.match({
  "location": "PerformanceTableSteps.i_Add_fund_in_ActiveList()"
});
formatter.result({
  "duration": 203344720,
  "status": "passed"
});
formatter.match({
  "location": "PerformanceTableSteps.i_Open_performaceTable_page()"
});
formatter.result({
  "duration": 707321673,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat cex.project.stepsdefinition.PerformanceTableSteps.i_Open_performaceTable_page(PerformanceTableSteps.java:48)\r\n\tat ✽.And I Open performace table page(test/resources/features/PerformanceTable.feature:33)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PerformanceTableSteps.i_see_perfromaceTable_Title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PerformanceTableSteps.i_close_perfromance_page()"
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
  "duration": 1507287027,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Validate Performace Table page in diff input",
  "description": "",
  "id": "performace-table-module;validate-performace-table-page-in-diff-input;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "I open analytics website",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I enter 1DP:GroupName GroupName in login page",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter 1DP:UserName UserName in login page",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter 2DP:Password Password in login page",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on Log In button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I see 2DP:DisplayText User display name in default page",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select 2DP:Universe Universe",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select 7IM Investment Funds Fund Group",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I select AAP Adventurous A Acc - Mar 08 (BFB7) Fund Name",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I Add fund in Active List",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Open performace table page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I see perfromace table Title",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I close the perfromance page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I Click Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_analytics_website()"
});
formatter.result({
  "duration": 143599541,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1DP:GroupName",
      "offset": 8
    }
  ],
  "location": "LoginDetailsSteps.I_Enter_GroupName(String)"
});
formatter.result({
  "duration": 2433995206,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1DP:UserName",
      "offset": 8
    }
  ],
  "location": "LoginDetailsSteps.I_Enter_UserName(String)"
});
formatter.result({
  "duration": 290213905,
  "status": "passed"
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
  "duration": 271038685,
  "status": "passed"
});
formatter.match({
  "location": "LoginDetailsSteps.I_click_on_Log_In_button()"
});
formatter.result({
  "duration": 133717106,
  "status": "passed"
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
  "duration": 2920728882,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2DP:Universe",
      "offset": 9
    }
  ],
  "location": "PerformanceTableSteps.i_select_Universe(String)"
});
formatter.result({
  "duration": 328359120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7IM Investment Funds",
      "offset": 9
    }
  ],
  "location": "PerformanceTableSteps.i_select_Fund_Group(String)"
});
formatter.result({
  "duration": 1411619564,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAP Adventurous A Acc - Mar 08 (BFB7)",
      "offset": 9
    }
  ],
  "location": "PerformanceTableSteps.i_select_Fund_Name(String)"
});
formatter.result({
  "duration": 400955903,
  "status": "passed"
});
formatter.match({
  "location": "PerformanceTableSteps.i_Add_fund_in_ActiveList()"
});
formatter.result({
  "duration": 199248726,
  "status": "passed"
});
formatter.match({
  "location": "PerformanceTableSteps.i_Open_performaceTable_page()"
});
formatter.result({
  "duration": 531570719,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat cex.project.stepsdefinition.PerformanceTableSteps.i_Open_performaceTable_page(PerformanceTableSteps.java:48)\r\n\tat ✽.And I Open performace table page(test/resources/features/PerformanceTable.feature:33)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PerformanceTableSteps.i_see_perfromaceTable_Title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PerformanceTableSteps.i_close_perfromance_page()"
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
  "duration": 1327658108,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Validate Performace Table page in diff input",
  "description": "",
  "id": "performace-table-module;validate-performace-table-page-in-diff-input;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "I open analytics website",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I enter feqauk GroupName in login page",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter test_1 UserName in login page",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter 2DP:Password Password in login page",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on Log In button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I see 3DP:DisplayText User display name in default page",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select DP:Universe Universe",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select DP:FundGroup Fund Group",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I select DP:FundName Fund Name",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I Add fund in Active List",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Open performace table page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I see perfromace table Title",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I close the perfromance page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I Click Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_analytics_website()"
});
formatter.result({
  "duration": 40888250,
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
formatter.result({
  "duration": 2384928623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test_1",
      "offset": 8
    }
  ],
  "location": "LoginDetailsSteps.I_Enter_UserName(String)"
});
formatter.result({
  "duration": 315258342,
  "status": "passed"
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
  "duration": 553394683,
  "status": "passed"
});
formatter.match({
  "location": "LoginDetailsSteps.I_click_on_Log_In_button()"
});
formatter.result({
  "duration": 148182787,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3DP:DisplayText",
      "offset": 6
    }
  ],
  "location": "LoginDetailsSteps.I_see_User_DisplayName_in_DefaultPage(String)"
});
formatter.result({
  "duration": 2675030315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:Universe",
      "offset": 9
    }
  ],
  "location": "PerformanceTableSteps.i_select_Universe(String)"
});
formatter.result({
  "duration": 566023140,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:FundGroup",
      "offset": 9
    }
  ],
  "location": "PerformanceTableSteps.i_select_Fund_Group(String)"
});
formatter.result({
  "duration": 1614757351,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:FundName",
      "offset": 9
    }
  ],
  "location": "PerformanceTableSteps.i_select_Fund_Name(String)"
});
formatter.result({
  "duration": 250490026,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat cex.project.stepsdefinition.PerformanceTableSteps.i_select_Fund_Name(PerformanceTableSteps.java:34)\r\n\tat ✽.And I select DP:FundName Fund Name(test/resources/features/PerformanceTable.feature:31)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PerformanceTableSteps.i_Add_fund_in_ActiveList()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PerformanceTableSteps.i_Open_performaceTable_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PerformanceTableSteps.i_see_perfromaceTable_Title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PerformanceTableSteps.i_close_perfromance_page()"
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
  "duration": 1083919644,
  "status": "passed"
});
});