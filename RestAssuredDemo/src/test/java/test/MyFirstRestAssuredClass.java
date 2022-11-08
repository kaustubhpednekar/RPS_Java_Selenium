package test;
import static io.restassured.RestAssured.*;
public class MyFirstRestAssuredClass {

	static String url = "https://reqres.in/api/users?page=2";
	
	public static void main(String[] args) 
	{
		getResponseBody();
		getResposeStatus();
		
	}
	
	public static void getResponseBody()
	{
		given().when().get(url).then().log().all();
		given().queryParam("page", "2").when().get("https://reqres.in/api/users.php").then().log().body();
//		given().queryParam("CUSTOMERID","68195")
//		.queryParam("PASSWORD", "1234!").queryParam("Account", "1")
//		.when().get("https://demo.guru99.com/V4/sinkministatement.php")
//		.then().log().body();
	}
	
	public static void getResposeStatus()
	{
		int statusCode = given().queryParam("page", "2").when().get("https://reqres.in/api/users.php").getStatusCode();
		System.out.println(statusCode);
	}

}
