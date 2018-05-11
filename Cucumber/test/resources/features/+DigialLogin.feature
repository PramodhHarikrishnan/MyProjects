Feature: +Digital Login

  Scenario Outline: Login to +Digital
    When I launch the url
    And I enter <Group_Name> GroupName in login page
    And I enter <User_Name> UserName in login page
    And I enter <Password> Password in login page
    And I click on Log In button
    Then I see the logged in page
      
       Examples:
      |Group_Name|  	|User_Name|  	|Password|
      |Finex|  			|demo| 			|p4ssw0rD|