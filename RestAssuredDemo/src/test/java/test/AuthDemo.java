package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthDemo 
{
	@Test
	public void authentication()
	{
		RestAssured.baseURI="https://api.imgur.com/3/account/me/images";
//		RequestSpecification spec = RestAssured.given().auth().basic("postman", "password");
		RequestSpecification spec = RestAssured.given().auth().oauth2("");
		Response response = spec.get();//hiouehjroiwhr8ureowqirhiwehehiufdhsffe
		System.out.println(response.getStatusCode());
		System.out.println(response.body().asString());
		
	}

}
