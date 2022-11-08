package stepDefinations;
import static org.testng.Assert.assertEquals;
import org.json.simple.JSONObject;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Steps 
{
	String BaseUrl = "https://reqres.in/api";
	int postStatus;
	int getStatus;
	int putStatus;
	int delStatus;
	@Given("List of users are available")
	public void list_of_users_are_available() {
		RestAssured.baseURI = BaseUrl;
		RequestSpecification spec = RestAssured.given();
	Response response = spec.get("/users?page=2");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
	
	}
	
	@When("I get list of users")
	public void i_get_list_of_users() {
		  RestAssured.baseURI = BaseUrl;
		  RequestSpecification spec = RestAssured.given();
		  Response response = spec.get("/users?page=2");
		  System.out.println(response.body().asString());
		  JsonPath eval = response.jsonPath();
		  getStatus = response.getStatusCode();
//		  List<String> allUsers = eval.getList("first_name");
//		  for(String user: allUsers)
//		  {
//			  System.out.println(user);
//		  }
		  
		  //User[] user = response.jsonPath().getObject("data", User[].class);
		  User[] users = eval.getObject("data", User[].class);
		  for(User user : users)
		  {
			  System.out.println("The First name is : "+user.first_name);
		  }
		
	}

	@Then("Display the list of users")
	public void display_the_list_of_users() {
		assertEquals(getStatus, 200);
	}

	@When("I add a new User")
	public void i_add_a_new_user() {
		RestAssured.baseURI = BaseUrl;
		RequestSpecification spec = RestAssured.given();
		  JSONObject requestParam = new JSONObject();
		  requestParam.put("name", "Manoj");
		  requestParam.put("job", "CEO");
		  spec.header("Content-Type","application/json");
		  spec.body(requestParam.toString());
		  
		  Response response = spec.post("/users");
		  postStatus = response.getStatusCode();
		  System.out.println("The Response received is "+ response.statusLine());
		  System.out.println(response.getBody().asString());
		  System.out.println(postStatus);
		  
		
	}

	@Then("new user is added")
	public void new_user_is_added() {
		assertEquals(postStatus, 201);
	}

	@When("Update a User")
	public void update_a_user() {
		RestAssured.baseURI = BaseUrl;
		RequestSpecification spec = RestAssured.given();
		  JSONObject requestParam = new JSONObject();
		  requestParam.put("name", "Ruhi");
		  requestParam.put("job", "Manager");
		  spec.header("Content-Type","application/json");
		  spec.body(requestParam.toString());
		  Response response = spec.put("/users/2");
		  putStatus = response.getStatusCode();
		  System.out.println(response.getBody().asString());
		  System.out.println("The Response received is "+ response.statusLine());
		  System.out.println(putStatus);
	}

	@Then("User is updated")
	public void user_is_updated() {
		assertEquals(putStatus, 200);
	}
	
	@When("I delete a User")
	public void i_delete_a_User() {
			RestAssured.baseURI = BaseUrl;
		  RequestSpecification httpRequest = RestAssured.given();
		  JSONObject requestParam = new JSONObject();
		  httpRequest.body(requestParam.toJSONString());
		  
		  Response response = httpRequest.delete("/users/2");
		  delStatus = response.getStatusCode();
		  System.out.println("The Response received is "+ response.statusLine());
		  System.out.println(response.getBody().asString());
		  System.out.println(delStatus);
	}
	
	@Then("One user is deleted")
	public void one_user_is_deleted() {
		assertEquals(delStatus, 204);
	}
}
