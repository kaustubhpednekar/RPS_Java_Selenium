package apiEngine.modal.response;

import java.util.List;
//import javax.annotation.Generated;

import apiEngine.model1.User;

//@Generated("jsonschema2pojo")
public class Users {

public Integer page;
public Integer per_page;
public Integer total;
public Integer total_pages;
public List<User> data = null;
public Support support;

/**
* No args constructor for use in serialization
*
*/
public Users() {
}

/**
*
* @param total
* @param perPage
* @param data
* @param totalPages
* @param page
* @param support
*/
public Users(Integer page, Integer perPage, Integer total, Integer totalPages, List<User> data, Support support) {
super();
this.page = page;
this.per_page = perPage;
this.total = total;
this.total_pages = totalPages;
this.data = data;
this.support = support;
}

}
