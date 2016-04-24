package com.fhirconnectathon.savethenurses.json.familyhistory;

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
"date",
"name",
"deceasedBoolean",
"patient",
"relationship",
"condition"
})
public class Resource {

@JsonProperty("resourceType")
private String resourceType;
@JsonProperty("date")
private String date;
@JsonProperty("name")
private String name;
@JsonProperty("deceasedBoolean")
private Boolean deceasedBoolean;
@JsonProperty("patient")
private Patient patient;
@JsonProperty("relationship")
private Relationship relationship;
@JsonProperty("condition")
private List<Condition> condition = new ArrayList<Condition>();
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
* @param relationship
* @param patient
* @param condition
* @param name
* @param deceasedBoolean
* @param date
* @param resourceType
*/
public Resource(String resourceType, String date, String name, Boolean deceasedBoolean, Patient patient, Relationship relationship, List<Condition> condition) {
this.resourceType = resourceType;
this.date = date;
this.name = name;
this.deceasedBoolean = deceasedBoolean;
this.patient = patient;
this.relationship = relationship;
this.condition = condition;
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
* The date
*/
@JsonProperty("date")
public String getDate() {
return date;
}

/**
* 
* @param date
* The date
*/
@JsonProperty("date")
public void setDate(String date) {
this.date = date;
}

/**
* 
* @return
* The name
*/
@JsonProperty("name")
public String getName() {
return name;
}

/**
* 
* @param name
* The name
*/
@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

/**
* 
* @return
* The deceasedBoolean
*/
@JsonProperty("deceasedBoolean")
public Boolean getDeceasedBoolean() {
return deceasedBoolean;
}

/**
* 
* @param deceasedBoolean
* The deceasedBoolean
*/
@JsonProperty("deceasedBoolean")
public void setDeceasedBoolean(Boolean deceasedBoolean) {
this.deceasedBoolean = deceasedBoolean;
}

/**
* 
* @return
* The patient
*/
@JsonProperty("patient")
public Patient getPatient() {
return patient;
}

/**
* 
* @param patient
* The patient
*/
@JsonProperty("patient")
public void setPatient(Patient patient) {
this.patient = patient;
}

/**
* 
* @return
* The relationship
*/
@JsonProperty("relationship")
public Relationship getRelationship() {
return relationship;
}

/**
* 
* @param relationship
* The relationship
*/
@JsonProperty("relationship")
public void setRelationship(Relationship relationship) {
this.relationship = relationship;
}

/**
* 
* @return
* The condition
*/
@JsonProperty("condition")
public List<Condition> getCondition() {
return condition;
}

/**
* 
* @param condition
* The condition
*/
@JsonProperty("condition")
public void setCondition(List<Condition> condition) {
this.condition = condition;
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