package stepDefinition;

import java.util.List;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import api_Engine.EndPoints;
import apiEngine.model1.User;
import apiEngine.model.requests.*;
import apiEngine.modal.response.*;

public class Test_Steps {
    private static User user;
    private static Response response;
    String BaseUrl = "https://reqres.in/api";
    @Given("List of users are available")
    public void list_of_users_are_available() {
       
        //Response response = spec.get("/users?page=2");
//         response = spec.get("/users?page=2");
        response=EndPoints.getUsers();
        Users users = response.getBody().as(Users.class);
        user=users.data.get(0);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
    }
    
    @When("I add a new user")
    public void i_add_a_new_user() {
//        RestAssured.baseURI=BaseUrl;
//        RequestSpecification spec = RestAssured.given();
//        JSONObject requestParams= new JSONObject();
//          requestParams.put("name","Manoj");
//          requestParams.put("job", "Tester");
//          spec.header("Content-Type","application/json");
//          spec.body(requestParams.toJSONString());
//          Response response= spec.post("/users");
          AddUserRequest addUserRequest = new AddUserRequest("Manoj","Tester");
          response=EndPoints.addUser(addUserRequest);
          System.out.println("The response received is "+ response.statusLine());
          ResponseBody body = response.getBody();
         System.out.println(body.asString());
    }

    @When("a user is updated")
    public void a_user_is_updated() {
         RestAssured.baseURI="https://reqres.in/api/users";
          RequestSpecification request = RestAssured.given();
          JSONObject requestParams= new JSONObject();
          requestParams.put("name","Manoj");
          requestParams.put("job", "Tester");
          request.header("Content-Type","application/json");
          request.body(requestParams.toJSONString());
          Response response= request.put("/2");
          System.out.println("The response received is "+ response.statusLine());
          ResponseBody body = response.getBody();
         System.out.println(body.asString());
    }
    
    @When("new list of users is displayed")
    public void new_list_of_users_is_displayed() {
         RestAssured.baseURI=BaseUrl;
         RequestSpecification spec = RestAssured.given();
         Response response = spec.get("/users?page=2");
         JsonPath eval = response.jsonPath();
//         List<String> AllUsers= eval.getList("first_name");
//         for(String user:AllUsers)
//         {
//             System.out.println(user);
//         }
         User[] users = eval.getObject("data", User[].class);
         for(User user : users) {
             System.out.println("The first name is : " + user.first_name);
         }
    }

    @Then("existing user is deleted")
    public void existing_user_is_deleted() {
        RestAssured.baseURI=BaseUrl;
        RequestSpecification spec = RestAssured.given();
        JSONObject requestParams= new JSONObject();
         spec.header("Content-Type","application/json");
          spec.body(requestParams.toJSONString());
          Response response= spec.delete("/users/2");
          System.out.println("The response received is "+ response.statusLine());
          System.out.println(response.getStatusCode());
          System.out.println(response.getBody().asString());
       
    }

    
    
}