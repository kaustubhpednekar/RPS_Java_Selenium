package apiEngine.modal.response;

//import javax.annotation.Generated;

//@Generated("jsonschema2pojo")
public class AddUserResponse {

public String name;
public String job;
public String id;
public String createdAt;

/**
* No args constructor for use in serialization
*
*/
public AddUserResponse() {
}

/**
*
* @param createdAt
* @param name
* @param id
* @param job
*/
public AddUserResponse(String name, String job, String id, String createdAt) {
super();
this.name = name;
this.job = job;
this.id = id;
this.createdAt = createdAt;
}

}