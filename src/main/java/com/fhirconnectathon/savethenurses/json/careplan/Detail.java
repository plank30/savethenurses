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
"prohibited",
"category",
"code",
"scheduledPeriod"
})
public class Detail {

@JsonProperty("prohibited")
private Boolean prohibited;
@JsonProperty("category")
private Category category;
@JsonProperty("code")
private Code code;
@JsonProperty("scheduledPeriod")
private ScheduledPeriod scheduledPeriod;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Detail() {
}

/**
* 
* @param category
* @param prohibited
* @param scheduledPeriod
* @param code
*/
public Detail(Boolean prohibited, Category category, Code code, ScheduledPeriod scheduledPeriod) {
this.prohibited = prohibited;
this.category = category;
this.code = code;
this.scheduledPeriod = scheduledPeriod;
}

/**
* 
* @return
* The prohibited
*/
@JsonProperty("prohibited")
public Boolean getProhibited() {
return prohibited;
}

/**
* 
* @param prohibited
* The prohibited
*/
@JsonProperty("prohibited")
public void setProhibited(Boolean prohibited) {
this.prohibited = prohibited;
}

/**
* 
* @return
* The category
*/
@JsonProperty("category")
public Category getCategory() {
return category;
}

/**
* 
* @param category
* The category
*/
@JsonProperty("category")
public void setCategory(Category category) {
this.category = category;
}

/**
* 
* @return
* The code
*/
@JsonProperty("code")
public Code getCode() {
return code;
}

/**
* 
* @param code
* The code
*/
@JsonProperty("code")
public void setCode(Code code) {
this.code = code;
}

/**
* 
* @return
* The scheduledPeriod
*/
@JsonProperty("scheduledPeriod")
public ScheduledPeriod getScheduledPeriod() {
return scheduledPeriod;
}

/**
* 
* @param scheduledPeriod
* The scheduledPeriod
*/
@JsonProperty("scheduledPeriod")
public void setScheduledPeriod(ScheduledPeriod scheduledPeriod) {
this.scheduledPeriod = scheduledPeriod;
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