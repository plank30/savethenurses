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
"value",
"system"
})
public class Quantity {

@JsonProperty("value")
private Integer value;
@JsonProperty("system")
private String system;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Quantity() {
}

/**
* 
* @param system
* @param value
*/
public Quantity(Integer value, String system) {
this.value = value;
this.system = system;
}

/**
* 
* @return
* The value
*/
@JsonProperty("value")
public Integer getValue() {
return value;
}

/**
* 
* @param value
* The value
*/
@JsonProperty("value")
public void setValue(Integer value) {
this.value = value;
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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}