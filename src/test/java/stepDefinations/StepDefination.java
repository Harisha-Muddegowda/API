package stepDefinations;

import baseClass.APIResources;
import baseClass.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;
import pojo.GetUserData;
import pojo.Pets;
import pojo.User;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.*;
import static org.junit.Assert.assertEquals;

public class StepDefination extends Utils {
    RequestSpecification res;
    ResponseSpecification resspec;
    Response response;
    String name;
    Double salary;
    int age;
    int id;

    @Given("user has base URL {string}")
    public void user_has_base_URL(String request) throws IOException {
        res = given().spec(requestSpecification(request));
    }

    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String resource, String method) throws IOException {
//        APIResources resourceAPI=APIResources.valueOf(resource);
//        System.out.println(resourceAPI.getResource());
        resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(JSON).build();
        response = res.when().get(getProperty("GetPetAPI"));
    }

    @When("user calls {string} with {string} http request with {string} {string} {string} {string}")
    public void user_calls_with_http_request_with(String resource, String method, String name, String salary, String age, String id) throws IOException {
        resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(JSON).build();
        User usr = new User();
        this.name=name;
        this.salary= Double.parseDouble(salary);
        this.age= Integer.parseInt(age);
        this.id= Integer.parseInt(id);
        usr.setName(name);
        usr.setSalary(Double.valueOf(salary));
        usr.setAge(Integer.parseInt(age));
        usr.setId(Integer.parseInt(id));
        response =res.when().body(usr).post(getProperty("CreateUserAPI"));
    }

    @Then("the API call got success with status code {int}")
    public void the_API_call_got_success_with_status_code(Integer int1) {
        assertEquals(response.getStatusCode(),200);
    }

    @Then("verify status in response body is {string}")
    public void in_response_body_is(String Expectedvalue) {
        assertEquals(response.getStatusLine(), Expectedvalue);
    }

    @Then("verify pets ID type and price of pets")
    public void verify_pets_ID_type_and_price_of_pets() {
        List<Pets> ps = Arrays.asList(response.as(Pets[].class));
        System.out.println(ps.toString());
        for(int i=0; i<ps.size(); i++){
            System.out.println("ID: " +ps.get(i).getId());
            System.out.println("Type: " +ps.get(i).getType());
            System.out.println("Price: " +ps.get(i).getPrice());
            System.out.println("==============================");
        }
    }

    @Then("verify name salary age and id of user")
    public void verify_name_salary_age_and_id_of_user() {
        List<GetUserData> us = Arrays.asList(response.as(GetUserData.class));
        System.out.println("Status========= "+us.get(0).getStatus());
        System.out.println(response.getStatusLine());
        for(int i=0; i<us.size(); i++) {
            Assert.assertEquals(us.get(i).getStatus(), "success");
            Assert.assertEquals(us.get(i).getData().getName(), name);
            Assert.assertEquals(us.get(i).getData().getSalary(), salary);
            Assert.assertEquals(us.get(i).getData().getAge(), age);
        }
    }
}
