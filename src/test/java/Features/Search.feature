Feature: Search Qtrip.com
  @SearchCity_TC_03
  Scenario: Check Search City
    Given User is on homepage
    When Click Toolbar
    When Write name the city "Cities"
    When Click name the city
    Then Check Adventure
