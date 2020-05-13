package baseClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.util.Properties;

public class Utils {

    public static RequestSpecification req;

    public static RequestSpecification requestSpecification(String request) throws IOException {
        if(req == null){
            PrintStream log = new PrintStream(new FileOutputStream("Logging.txt"));
            String baseURL;
            if(request.contains("GET")){
                baseURL = getProperty("baseUrl");
            }else{
                baseURL = getProperty("postBaseURL");
            }
            req = new RequestSpecBuilder().setBaseUri(baseURL).addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log)) //.setContentType(ContentType.TEXT)
                    .build();
            return req;
        }
        return req;
    }

    public static String getProperty(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream is = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
        prop.load(is);
        return prop.getProperty(key);
    }

    public String getJsonPath(Response response, String key){
        String res = response.toString();
        JsonPath js = new JsonPath(res);
        return js.get(key).toString();
    }

}
