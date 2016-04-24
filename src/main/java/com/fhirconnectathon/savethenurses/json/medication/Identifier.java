package com.fhirconnectathon.savethenurses.json.medication;

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
"use",
"system",
"value"
})
public class Identifier {

@JsonProperty("use")
private String use;
@JsonProperty("system")
private String system;
@JsonProperty("value")
private String value;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Identifier() {
}

/**
* 
* @param system
* @param value
* @param use
*/
public Identifier(String use, String system, String value) {
this.use = use;
this.system = system;
this.value = value;
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
* The system
*/
@JsonProperty("system")
public String getSystem() {
return system;
}

/**
* 
* @param system
* The system
*/
@JsonProperty("system")
public void setSystem(String system) {
this.system = system;
}

/**
* 
* @return
* The value
*/
@JsonProperty("value")
public String getValue() {
return value;
}

/**
* 
* @param value
* The value
*/
@JsonProperty("value")
public void setValue(String value) {
this.value = value;
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