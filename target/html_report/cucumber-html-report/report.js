$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addUser.feature");
formatter.feature({
  "name": "Add user details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify if user is able to add user details using POST method",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddUser"
    }
  ]
});
formatter.step({
  "name": "user has base URL \"POST\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"CreateUserAPI\" with \"POST\" http request with \"\u003cName\u003e\" \"\u003cSalary\u003e\" \"\u003cAge\u003e\" \"\u003cID\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "verify status in response body is \"HTTP/1.1 200 OK\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify name salary age and id of user",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Salary",
        "Age",
        "ID"
      ]
    },
    {
      "cells": [
        "AMAZON",
        "10000",
        "20",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if user is able to add user details using POST method",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddUser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has base URL \"POST\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_has_base_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"CreateUserAPI\" with \"POST\" http request with \"AMAZON\" \"10000\" \"20\" \"1\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request_with(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify status in response body is \"HTTP/1.1 200 OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify name salary age and id of user",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.verify_name_salary_age_and_id_of_user()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/petDetails.feature");
formatter.feature({
  "name": "Get pets details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify if user is able to get pets details using GET method",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has base URL \"GET\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_has_base_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"GetPetAPI\" with \"GET\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c404\u003e but was:\u003c200\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:555)\r\n\tat org.junit.Assert.assertEquals(Assert.java:542)\r\n\tat stepDefinations.StepDefination.the_API_call_got_success_with_status_code(StepDefination.java:64)\r\n\tat ✽.the API call got success with status code 200(file:src/test/resources/features/petDetails.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify status in response body is \"HTTP/1.1 200 OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify pets ID type and price of pets",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.verify_pets_ID_type_and_price_of_pets()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if user is able to get pets details using GET method",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has base URL \"GET\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_has_base_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"GetPetAPI\" with \"GET\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify status in response body is \"HTTP/1.1 200 OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify pets ID type and price of pets",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.verify_pets_ID_type_and_price_of_pets()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});