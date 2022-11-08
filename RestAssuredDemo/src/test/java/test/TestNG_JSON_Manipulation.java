package test;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestNG_JSON_Manipulation {
  @Test
  public void jsonManipulation() 
  {
	  RestAssured.baseURI = "https://gorest.co.in/public/v2/users/";
	  RequestSpecification spec = RestAssured.given();
	  Response response = spec.get("");
	  JsonPath eval = response.jsonPath();
	  List<String> allUsers = eval.getList("name");
	  for(String user: allUsers)
	  {
		  System.out.println(user);
	  }
		  
	  
  }
}
