package apiEngine.model1;

//import javax.annotation.Generated;


public class User {

public Integer id;
public String email;
public String first_name;
public String last_name;
public String avatar;

/**
* No args constructor for use in serialization
*
*/
public User() {
}

/**
*
* @param firstName
* @param lastName
* @param id
* @param avatar
* @param email
*/
public User(Integer id, String email, String firstName, String lastName, String avatar) {
super();
this.id = id;
this.email = email;
this.first_name = firstName;
this.last_name = lastName;
this.avatar = avatar;
}

}

