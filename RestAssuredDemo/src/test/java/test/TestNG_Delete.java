package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestNG_Delete {
  @Test
  public void goRestDelete() 
  {
		String token = "d9376e6d605ab10c338cc49fced6c09d75c77620b7f4cfdc0586592a2e99c6d9";

	  //public/v2/users/19
	  RestAssured.baseURI = "https://gorest.co.in/";
	  RequestSpecification httpRequest = RestAssured.given().header("Authorization","Bearer "+token)
			  .header("Content-Type","application/json");
	  
	  JSONObject requestParam = new JSONObject();
	
	  httpRequest.body(requestParam.toJSONString());
	  
	  Response response = httpRequest.delete("/public/v2/users/4441");
	  System.out.println("The Response received is "+ response.statusLine());
	  
	  System.out.println(response.getBody().asString());
  }
}
