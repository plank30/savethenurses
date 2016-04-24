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
"preferred",
"language"
})
public class Communication {

@JsonProperty("preferred")
private Boolean preferred;
@JsonProperty("language")
private Language language;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Communication() {
}

/**
* 
* @param language
* @param preferred
*/
public Communication(Boolean preferred, Language language) {
this.preferred = preferred;
this.language = language;
}

/**
* 
* @return
* The preferred
*/
@JsonProperty("preferred")
public Boolean getPreferred() {
return preferred;
}

/**
* 
* @param preferred
* The preferred
*/
@JsonProperty("preferred")
public void setPreferred(Boolean preferred) {
this.preferred = preferred;
}

/**
* 
* @return
* The language
*/
@JsonProperty("language")
public Language getLanguage() {
return language;
}

/**
* 
* @param language
* The language
*/
@JsonProperty("language")
public void setLanguage(Language language) {
this.language = language;
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