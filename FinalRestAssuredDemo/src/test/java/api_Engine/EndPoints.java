package api_Engine;

import apiEngine.model.requests.AddUserRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EndPoints {
    public static String BaseUrl="https://reqres.in/";
    
    public static Response getUsers(){
        RestAssured.baseURI=BaseUrl;
        RequestSpecification spec= RestAssured.given();
        spec.header("Content-Type","application/json");
        Response response = spec.get("/api/users");
        return response;
    }
    
    public static Response addUser(AddUserRequest addUserRequest){
        RestAssured.baseURI=BaseUrl;
        RequestSpecification spec= RestAssured.given();
        spec.header("Content-Type","application/json");
        Response response = spec.body(addUserRequest).post("/api/users");
        return response;
    }
    public static Response deleteUser(){
        RestAssured.baseURI=BaseUrl;
        RequestSpecification spec= RestAssured.given();
        spec.header("Content-Type","application/json");
        Response response = spec.delete("/api/users");
        return response;
    }
}

 

