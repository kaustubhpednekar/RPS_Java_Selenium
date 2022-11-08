package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestNG_RestAssured2 {
  @Test
  public void getReqResSingleUser() 
  {
	  RestAssured.baseURI = "https://reqres.in/api/users/2";
	  RequestSpecification httpRequest = RestAssured.given();
	  
	  Response response = httpRequest.get("");
	  int statusCode = response.getStatusCode();
	  System.out.println(statusCode);
	  
	  Assert.assertEquals(statusCode, 200);
	  
	  System.out.println(response.timeIn(TimeUnit.MILLISECONDS) +" MilliSec");
  }
}
