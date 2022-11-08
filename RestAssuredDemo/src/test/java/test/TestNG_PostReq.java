package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TestNG_PostReq {
  @Test
  public void postReqResUser() 
  {
	  RestAssured.baseURI = "https://reqres.in/api";
	  RequestSpecification httpRequest = RestAssured.given();
	  JSONObject requestParam = new JSONObject();
	  requestParam.put("name", "Rahul");
	  requestParam.put("job", "CEO");
	  httpRequest.header("Content-Type","application/json");
	  httpRequest.body(requestParam.toString());
	  
	  Response response = httpRequest.post("/users");
	  System.out.println("The Response received is "+ response.statusLine());
	  
	  ResponseBody body = response.getBody();
	//System.out.println(body.asString());
	  
	  JsonResponse responseBody = body.as(JsonResponse.class);
	  System.out.println(responseBody.id);
	  System.out.println(responseBody.name);
	  System.out.println(responseBody.job);
	  System.out.println(responseBody.createdAt);
	  
//	  int statusCode = response.getStatusCode();
//	  System.out.println(statusCode);
  }
  
}
