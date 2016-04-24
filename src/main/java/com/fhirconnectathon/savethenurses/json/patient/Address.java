
package com.fhirconnectathon.savethenurses.json.patient;

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
"use",
"line",
"city",
"state",
"postalCode",
"country"
})
public class Address {

@JsonProperty("use")
private String use;
@JsonProperty("line")
private List<String> line = new ArrayList<String>();
@JsonProperty("city")
private String city;
@JsonProperty("state")
private String state;
@JsonProperty("postalCode")
private String postalCode;
@JsonProperty("country")
private String country;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Address() {
}

/**
* 
* @param postalCode
* @param state
* @param line
* @param use
* @param country
* @param city
*/
public Address(String use, List<String> line, String city, String state, String postalCode, String country) {
this.use = use;
this.line = line;
this.city = city;
this.state = state;
this.postalCode = postalCode;
this.country = country;
}

/**
* 
* @return
* The use
*/
@JsonProperty("use")
public String getUse() {
return use;
}

/**
* 
* @param use
* The use
*/
@JsonProperty("use")
public void setUse(String use) {
this.use = use;
}

/**
* 
* @return
* The line
*/
@JsonProperty("line")
public List<String> getLine() {
return line;
}

/**
* 
* @param line
* The line
*/
@JsonProperty("line")
public void setLine(List<String> line) {
this.line = line;
}

/**
* 
* @return
* The city
*/
@JsonProperty("city")
public String getCity() {
return city;
}

/**
* 
* @param city
* The city
*/
@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

/**
* 
* @return
* The state
*/
@JsonProperty("state")
public String getState() {
return state;
}

/**
* 
* @param state
* The state
*/
@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

/**
* 
* @return
* The postalCode
*/
@JsonProperty("postalCode")
public String getPostalCode() {
return postalCode;
}

/**
* 
* @param postalCode
* The postalCode
*/
@JsonProperty("postalCode")
public void setPostalCode(String postalCode) {
this.postalCode = postalCode;
}

/**
* 
* @return
* The country
*/
@JsonProperty("country")
public String getCountry() {
return country;
}

/**
* 
* @param country
* The country
*/
@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
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
