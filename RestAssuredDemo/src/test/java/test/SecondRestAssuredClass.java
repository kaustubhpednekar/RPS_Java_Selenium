package test;
import static io.restassured.RestAssured.*;
public class SecondRestAssuredClass {

	static String url = "https://reqres.in/api/users/2";
	
	public static void main(String[] args) 
	{
		getResponseBody();
		getResposeStatus();
		
	}
	
	public static void getResponseBody()
	{
//		given().when().get(url).then().log().all();
		given().when().get("https://reqres.in/api/users/22").then().log().body();
	}
	
	public static void getResposeStatus()
	{
		int statusCode = given().when().get("https://reqres.in/api/users/22").getStatusCode();
		System.out.println(statusCode);
	}

}
