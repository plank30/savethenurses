package com.fhirconnectathon.savethenurses.json.device;

import java.util.HashMap;
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
"model",
"expiry",
"id",
"type"
})
public class Resource {

@JsonProperty("resourceType")
private String resourceType;
@JsonProperty("model")
private String model;
@JsonProperty("expiry")
private String expiry;
@JsonProperty("id")
private String id;
@JsonProperty("type")
private Type type;
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
* @param model
* @param type
* @param expiry
* @param resourceType
*/
public Resource(String resourceType, String model, String expiry, String id, Type type) {
this.resourceType = resourceType;
this.model = model;
this.expiry = expiry;
this.id = id;
this.type = type;
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
* The model
*/
@JsonProperty("model")
public String getModel() {
return model;
}

/**
* 
* @param model
* The model
*/
@JsonProperty("model")
public void setModel(String model) {
this.model = model;
}

/**
* 
* @return
* The expiry
*/
@JsonProperty("expiry")
public String getExpiry() {
return expiry;
}

/**
* 
* @param expiry
* The expiry
*/
@JsonProperty("expiry")
public void setExpiry(String expiry) {
this.expiry = expiry;
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
* The type
*/
@JsonProperty("type")
public Type getType() {
return type;
}

/**
* 
* @param type
* The type
*/
@JsonProperty("type")
public void setType(Type type) {
this.type = type;
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