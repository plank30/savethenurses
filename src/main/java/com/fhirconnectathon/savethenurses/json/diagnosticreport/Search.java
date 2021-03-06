package com.fhirconnectathon.savethenurses.json.diagnosticreport;

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
"mode"
})
public class Search {

@JsonProperty("mode")
private String mode;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Search() {
}

/**
* 
* @param mode
*/
public Search(String mode) {
this.mode = mode;
}

/**
* 
* @return
* The mode
*/
@JsonProperty("mode")
public String getMode() {
return mode;
}

/**
* 
* @param mode
* The mode
*/
@JsonProperty("mode")
public void setMode(String mode) {
this.mode = mode;
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
