Feature: Add user details
  @AddUser
  Scenario Outline: Verify if user is able to add user details using POST method
    Given user has base URL "POST"
    When user calls "CreateUserAPI" with "POST" http request with "<Name>" "<Salary>" "<Age>" "<ID>"
    Then the API call got success with status code 200
    And verify status in response body is "HTTP/1.1 200 OK"
    And verify name salary age and id of user
    Examples:
      |Name  |Salary|Age|ID|
      |AMAZON|10000 |20 |1 |