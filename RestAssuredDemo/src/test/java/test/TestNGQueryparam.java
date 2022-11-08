package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TestNGQueryparam {
  @Test
  public void getReqResUserList() 
  {
	  RestAssured.baseURI = "https://reqres.in/api";
	  RequestSpecification httpRequest = RestAssured.given();
	  Response response = httpRequest.queryParam("page", "2").get("/users");
	  int statusCode = response.getStatusCode();
	  System.out.println(statusCode);
	  
	  Assert.assertEquals(statusCode, 200);
  }
}
