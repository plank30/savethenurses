package com.fhirconnectathon.savethenurses.json.careplan;

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
"detail"
})
public class Activity {

@JsonProperty("detail")
private Detail detail;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Activity() {
}

/**
* 
* @param detail
*/
public Activity(Detail detail) {
this.detail = detail;
}

/**
* 
* @return
* The detail
*/
@JsonProperty("detail")
public Detail getDetail() {
return detail;
}

/**
* 
* @param detail
* The detail
*/
@JsonProperty("detail")
public void setDetail(Detail detail) {
this.detail = detail;
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