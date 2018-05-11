Feature: +Digital Filter

  Scenario: Filter functionality
    When I launch the <url> url
    And I enter <SearchText> SearchText in the search text box
    Then I validate the first result contains search text <SearchText>