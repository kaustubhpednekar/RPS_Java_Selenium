package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestNG_Put1 {
  @Test
  public void requestPut() 
  {
	  RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification spec = RestAssured.given();
		  JSONObject requestParam = new JSONObject();
		  requestParam.put("name", "Ruhi");
		  requestParam.put("job", "Manager");
		  spec.header("Content-Type","application/json");
		  spec.body(requestParam.toString());
		  Response response = spec.put("2");

		  System.out.println("The Response received is "+ response.statusLine());
		  System.out.println(response.getBody().asString());
		  System.out.println(response.getStatusCode());
  }
}
