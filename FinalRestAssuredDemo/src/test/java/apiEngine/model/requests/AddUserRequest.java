package apiEngine.model.requests;

//import javax.annotation.Generated;

//@Generated("jsonschema2pojo")
public class AddUserRequest {

public String name;
public String job;

/**
* No args constructor for use in serialization
*
*/
public AddUserRequest() {
}

/**
*
* @param name
* @param job
*/
public AddUserRequest(String name, String job) {
super();
this.name = name;
this.job = job;
}

}