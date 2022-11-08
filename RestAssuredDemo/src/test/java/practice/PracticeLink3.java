package practice;

import static io.restassured.RestAssured.*;
//import io.restassured.response.Response;
//import io.restassured.response.ResponseBody;
//import io.restassured.specification.RequestSpecification;
//import org.testng.annotations.Test;
public class PracticeLink3 
{
//    @Test
//    public static void getResponseBody() 
//    {
//    	RestAssured.baseURI = "https://openlibrary.org/";
//        RequestSpecification httpReq = RestAssured.given();
//        Response response = httpReq.post("/search");
//        
//        ResponseBody body = response.getBody();
//        System.out.println(body.asString());
//        //given().when().get("https://openlibrary.org/search.json?q=the+lord+of+the+rings").then().log().body();
//    }
static String url = "https://openlibrary.org/search.json?q=the+lord+of+the+rings";
    
    public static void main(String[] args) {
        getResponseBody();
    }
    
    public static void getResponseBody() {
        
        given().when().get("https://openlibrary.org/search.json?q=the+lord+of+the+rings").then().log().body();
    }
}
