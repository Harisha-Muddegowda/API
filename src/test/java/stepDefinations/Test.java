/*
package stepDefinations;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class Test {

    public static void main(String[] args){
//        RestAssured.baseURI= "http://petstore-demo-endpoint.execute-api.com";
        String aKey = "";
        String sKey = "";
        given().
                config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                .headers("x-amz-header1", "",
                        "x-amz-security-token",sKey,
                        "AWSAccessKeyId",aKey,
//                        "x-amz-header6","",
//                        "x-amz-header5","",
                        "Content-Type","application/octet-stream")
                .body("")
                .when()
                .post("");

//        method2();
    }

    public static void get(String empID){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        Response response = null;
        try {
            response = RestAssured.given()
                    .when()
                    .get("/employees/"+empID);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
        System.out.println("Does Reponse contains 'employee_salary'? :" + response.asString().contains("employee_salary"));
        assertEquals(200, response.getStatusCode());
    }

    public static void method1(){
        RestAssured.baseURI= "https://rahulshettyacademy.com";
        String addPlaceBody="{\r\n" +
        "  \"location\": {\r\n" +
                "    \"lat\": -38.383494,\r\n" +
                "    \"lng\": 33.427362\r\n" +
                "  },\r\n" +
                "  \"accuracy\": 50,\r\n" +
                "  \"name\": \"Harish\",\r\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\r\n" +
                "  \"address\": \"29, side layout, cohen 09\",\r\n" +
                "  \"types\": [\r\n" +
                "    \"shoe park\",\r\n" +
                "    \"shop\"\r\n" +
                "  ],\r\n" +
                "  \"website\": \"http://rahulshettyacademy.com\",\r\n" +
                "  \"language\": \"French-IN\"\r\n" +
                "}";
        String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
                .body(addPlaceBody)
                .when().post("maps/api/place/add/json")
                .then().assertThat().statusCode(200)
                .header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();

        System.out.println(response);
        JsonPath js=new JsonPath(response); //for parsing Json
        String placeId=js.getString("place_id");
        System.out.println("==============   "+js.getString("name"));

        System.out.println(placeId);

        //Update Place
        String newAddress = "Summer Walk, Africa";

        given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
                .body("{\r\n" +
                        "\"place_id\":\""+placeId+"\",\r\n" +
                        "\"address\":\""+newAddress+"\",\r\n" +
                        "\"key\":\"qaclick123\"\r\n" +
                        "}").
                when().put("maps/api/place/update/json")
                .then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));

        //Get Place

        String getPlaceResponse=	given().log().all().queryParam("key", "qaclick123")
                .queryParam("place_id",placeId)
                .when().get("maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200).extract().response().asString();
        JsonPath js1 =new JsonPath(response);
//        JsonPath js1=js2.rawToJson(getPlaceResponse);
        String actualAddress =js1.getString("address");
        System.out.println("actualAddress ================ "+actualAddress);
        Assert.assertEquals(actualAddress, "Pacific ocean");
    }

    public static void method2(){
        RestAssured.baseURI= "http://dummy.restapiexample.com/api/v1"; // "https://jsonplaceholder.typicode.com"; //  http://dummy.restapiexample.com/api/v1
        String requestBody = "{\n" +
                "        \"name\": \"test\",\n" +
                "        \"salary\": \"123\",\n" +
                "        \"age\": \"23\",\n" +
                "        \"id\": 25\n" +
                "    }";
        Response response = null;
        try {
            response = RestAssured.given()
                    .contentType(ContentType.JSON)
//                    .queryParam("userId", "2") //a1bcdefgh
                    .body(requestBody)
                    .post("/create");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
        System.out.println("Status line :" + response.getStatusLine());
//        System.out.println("Does Reponse contains 'tammy'? :" + response.asString().contains("Harisha"));
//        assertEquals(200, response.getStatusCode());
        System.out.println(response.body().toString());
    }
}
*/
