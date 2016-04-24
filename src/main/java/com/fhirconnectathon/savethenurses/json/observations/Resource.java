package com.fhirconnectathon.savethenurses.json.observations;

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
"effectiveDateTime",
"status",
"id",
"code",
"valueQuantity",
"subject"
})
public class Resource {

@JsonProperty("resourceType")
private String resourceType;
@JsonProperty("effectiveDateTime")
private String effectiveDateTime;
@JsonProperty("status")
private String status;
@JsonProperty("id")
private String id;
@JsonProperty("code")
private Code code;
@JsonProperty("valueQuantity")
private ValueQuantity valueQuantity;
@JsonProperty("subject")
private Subject subject;
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
* @param effectiveDateTime
* @param status
* @param subject
* @param code
* @param valueQuantity
* @param resourceType
*/
public Resource(String resourceType, String effectiveDateTime, String status, String id, Code code, ValueQuantity valueQuantity, Subject subject) {
this.resourceType = resourceType;
this.effectiveDateTime = effectiveDateTime;
this.status = status;
this.id = id;
this.code = code;
this.valueQuantity = valueQuantity;
this.subject = subject;
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
* The effectiveDateTime
*/
@JsonProperty("effectiveDateTime")
public String getEffectiveDateTime() {
return effectiveDateTime;
}

/**
* 
* @param effectiveDateTime
* The effectiveDateTime
*/
@JsonProperty("effectiveDateTime")
public void setEffectiveDateTime(String effectiveDateTime) {
this.effectiveDateTime = effectiveDateTime;
}

/**
* 
* @return
* The status
*/
@JsonProperty("status")
public String getStatus() {
return status;
}

/**
* 
* @param status
* The status
*/
@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
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
* The valueQuantity
*/
@JsonProperty("valueQuantity")
public ValueQuantity getValueQuantity() {
return valueQuantity;
}

/**
* 
* @param valueQuantity
* The valueQuantity
*/
@JsonProperty("valueQuantity")
public void setValueQuantity(ValueQuantity valueQuantity) {
this.valueQuantity = valueQuantity;
}

/**
* 
* @return
* The subject
*/
@JsonProperty("subject")
public Subject getSubject() {
return subject;
}

/**
* 
* @param subject
* The subject
*/
@JsonProperty("subject")
public void setSubject(Subject subject) {
this.subject = subject;
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