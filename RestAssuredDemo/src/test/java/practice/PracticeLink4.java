package practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PracticeLink4 
{
    public static void main(String[] args) {
        post();
    }
    
    public static void post() {
          RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
          RequestSpecification httpRequest = RestAssured.given();
          JSONObject requestParams = new JSONObject();
          requestParams.put("userid", "Krishna");
          requestParams.put("title", "Director");
          requestParams.put("body", "Testing the user id and title");
          httpRequest.header("Content-Type", "application/json");
          httpRequest.body(requestParams.toJSONString());
          Response response = httpRequest.post("/posts");
          System.out.println("The response recived is : " + response.statusLine());
          ResponseBody body = response.getBody();
          System.out.println(body.asString());
    }
}
