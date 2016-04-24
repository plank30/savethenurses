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
"text",
"coding"
})
public class Language {

@JsonProperty("text")
private String text;
@JsonProperty("coding")
private List<Coding> coding = new ArrayList<Coding>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Language() {
}

/**
* 
* @param text
* @param coding
*/
public Language(String text, List<Coding> coding) {
this.text = text;
this.coding = coding;
}

/**
* 
* @return
* The text
*/
@JsonProperty("text")
public String getText() {
return text;
}

/**
* 
* @param text
* The text
*/
@JsonProperty("text")
public void setText(String text) {
this.text = text;
}

/**
* 
* @return
* The coding
*/
@JsonProperty("coding")
public List<Coding> getCoding() {
return coding;
}

/**
* 
* @param coding
* The coding
*/
@JsonProperty("coding")
public void setCoding(List<Coding> coding) {
this.coding = coding;
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