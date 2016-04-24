package com.fhirconnectathon.savethenurses.json.careplan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"resourceType",
"id",
"subject",
"addresses",
"goal",
"activity",
"category"
})
public class Resource {

@JsonProperty("resourceType")
private String resourceType;
@JsonProperty("id")
private String id;
@JsonProperty("subject")
private Subject subject;
@JsonProperty("addresses")
private List<Address> addresses = new ArrayList<Address>();
@JsonProperty("goal")
private List<Goal> goal = new ArrayList<Goal>();
@JsonProperty("activity")
private List<Activity> activity = new ArrayList<Activity>();
@JsonProperty("category")
private List<Category_> category = new ArrayList<Category_>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Resource() {
}

/**
* 
* @param id
* @param category
* @param subject
* @param addresses
* @param activity
* @param goal
* @param resourceType
*/
public Resource(String resourceType, String id, Subject subject, List<Address> addresses, List<Goal> goal, List<Activity> activity, List<Category_> category) {
this.resourceType = resourceType;
this.id = id;
this.subject = subject;
this.addresses = addresses;
this.goal = goal;
this.activity = activity;
this.category = category;
}

/**
* 
* @return
* The resourceType
*/
@JsonProperty("resourceType")
public String getResourceType() {
return resourceType;
}

/**
* 
* @param resourceType
* The resourceType
*/
@JsonProperty("resourceType")
public void setResourceType(String resourceType) {
this.resourceType = resourceType;
}

/**
* 
* @return
* The id
*/
@JsonProperty("id")
public String getId() {
return id;
}

/**
* 
* @param id
* The id
*/
@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

/**
* 
* @return
* The subject
*/
@JsonProperty("subject")
public Subject getSubject() {
return subject;
}

/**
* 
* @param subject
* The subject
*/
@JsonProperty("subject")
public void setSubject(Subject subject) {
this.subject = subject;
}

/**
* 
* @return
* The addresses
*/
@JsonProperty("addresses")
public List<Address> getAddresses() {
return addresses;
}

/**
* 
* @param addresses
* The addresses
*/
@JsonProperty("addresses")
public void setAddresses(List<Address> addresses) {
this.addresses = addresses;
}

/**
* 
* @return
* The goal
*/
@JsonProperty("goal")
public List<Goal> getGoal() {
return goal;
}

/**
* 
* @param goal
* The goal
*/
@JsonProperty("goal")
public void setGoal(List<Goal> goal) {
this.goal = goal;
}

/**
* 
* @return
* The activity
*/
@JsonProperty("activity")
public List<Activity> getActivity() {
return activity;
}

/**
* 
* @param activity
* The activity
*/
@JsonProperty("activity")
public void setActivity(List<Activity> activity) {
this.activity = activity;
}

/**
* 
* @return
* The category
*/
@JsonProperty("category")
public List<Category_> getCategory() {
return category;
}

/**
* 
* @param category
* The category
*/
@JsonProperty("category")
public void setCategory(List<Category_> category) {
this.category = category;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}