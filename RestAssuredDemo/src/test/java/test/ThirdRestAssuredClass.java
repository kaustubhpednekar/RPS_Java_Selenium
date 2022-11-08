package test;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;
public class ThirdRestAssuredClass {

	static String url = "https://reqres.in/api/unknown";
	public static void main(String[] args) 
	{
		getResponseBody();
		getResposeStatus();
		getResponseHeaders();
		getResponseTime();
	}
	
	public static void getResponseBody()
	{
		given().when().get("https://reqres.in/api/unknown").then().log().body();
	}
	
	public static void getResposeStatus()
	{
		int statusCode = given().when().get("https://reqres.in/api/unknown").getStatusCode();
		System.out.println(statusCode);
	}
	
	public static void getResponseHeaders()
	{
		//System.out.println("Headers from the response are "+ get(url).then().extract().headers());
		System.out.println("ContentType "+ get(url).then().extract().contentType());
	}
	
	public static void getResponseTime()
	{
		System.out.println("The time taken to fetch Response : "+ get(url).timeIn(TimeUnit.MILLISECONDS)+" MilliSec");
	}

}
