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
"family",
"given"
})
public class Name {

@JsonProperty("use")
private String use;
@JsonProperty("family")
private List<String> family = new ArrayList<String>();
@JsonProperty("given")
private List<String> given = new ArrayList<String>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Name() {
}

/**
* 
* @param given
* @param family
* @param use
*/
public Name(String use, List<String> family, List<String> given) {
this.use = use;
this.family = family;
this.given = given;
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
* The family
*/
@JsonProperty("family")
public List<String> getFamily() {
return family;
}

/**
* 
* @param family
* The family
*/
@JsonProperty("family")
public void setFamily(List<String> family) {
this.family = family;
}

/**
* 
* @return
* The given
*/
@JsonProperty("given")
public List<String> getGiven() {
return given;
}

/**
* 
* @param given
* The given
*/
@JsonProperty("given")
public void setGiven(List<String> given) {
this.given = given;
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