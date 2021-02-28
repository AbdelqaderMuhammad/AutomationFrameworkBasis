Feature: check google search functionality

  Scenario Outline: validate google search func.
    Given browser is open.
    And user is on google search page.
    When user enters a <sentence> in google search box.
    And hits enter.
    Then User will be directed to the result page where <sentence> resides.

    Examples:
      | sentence |
      | today matches |

