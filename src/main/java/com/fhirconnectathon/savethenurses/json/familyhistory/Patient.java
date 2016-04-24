package com.fhirconnectathon.savethenurses.json.familyhistory;

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
"display",
"reference"
})
public class Patient {

@JsonProperty("display")
private String display;
@JsonProperty("reference")
private String reference;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Patient() {
}

/**
* 
* @param display
* @param reference
*/
public Patient(String display, String reference) {
this.display = display;
this.reference = reference;
}

/**
* 
* @return
* The display
*/
@JsonProperty("display")
public String getDisplay() {
return display;
}

/**
* 
* @param display
* The display
*/
@JsonProperty("display")
public void setDisplay(String display) {
this.display = display;
}

/**
* 
* @return
* The reference
*/
@JsonProperty("reference")
public String getReference() {
return reference;
}

/**
* 
* @param reference
* The reference
*/
@JsonProperty("reference")
public void setReference(String reference) {
this.reference = reference;
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