package practice;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PracticeLink2 
{
	@Test
	public void headerStatusCode()
	{
		RestAssured.baseURI = "https://bikewise.org/api/v2/incidents/";
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		Response response = req.get("");
		
		int statusCode = response.getStatusCode();
		System.out.println("Status code :"+statusCode);
		System.out.println("Header :"+ response.getHeaders());
	}
	
}
