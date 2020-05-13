Feature: Get pets details
  @Regression
  Scenario: Verify if user is able to get pets details using GET method
    Given user has base URL "GET"
    When user calls "GetPetAPI" with "GET" http request
    Then the API call got success with status code 200
    And verify status in response body is "HTTP/1.1 200 OK"
    And verify pets ID type and price of pets


  @Smoke
  Scenario: Verify if user is able to get pets details using GET method
    Given user has base URL "GET"
    When user calls "GetPetAPI" with "GET" http request
    Then the API call got success with status code 200
    And verify status in response body is "HTTP/1.1 200 OK"
    And verify pets ID type and price of pets