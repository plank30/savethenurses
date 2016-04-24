package com.fhirconnectathon.savethenurses.json.patient;

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
"url",
"valueCodeableConcept"
})
public class Extension {

@JsonProperty("url")
private String url;
@JsonProperty("valueCodeableConcept")
private ValueCodeableConcept valueCodeableConcept;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Extension() {
}

/**
* 
* @param valueCodeableConcept
* @param url
*/
public Extension(String url, ValueCodeableConcept valueCodeableConcept) {
this.url = url;
this.valueCodeableConcept = valueCodeableConcept;
}

/**
* 
* @return
* The url
*/
@JsonProperty("url")
public String getUrl() {
return url;
}

/**
* 
* @param url
* The url
*/
@JsonProperty("url")
public void setUrl(String url) {
this.url = url;
}

/**
* 
* @return
* The valueCodeableConcept
*/
@JsonProperty("valueCodeableConcept")
public ValueCodeableConcept getValueCodeableConcept() {
return valueCodeableConcept;
}

/**
* 
* @param valueCodeableConcept
* The valueCodeableConcept
*/
@JsonProperty("valueCodeableConcept")
public void setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept) {
this.valueCodeableConcept = valueCodeableConcept;
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