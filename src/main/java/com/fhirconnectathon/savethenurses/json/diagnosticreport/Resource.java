package com.fhirconnectathon.savethenurses.json.diagnosticreport;

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
"resourceType",
"status",
"effectiveDateTime",
"issued",
"id",
"identifier",
"code",
"subject",
"performer",
"result"
})
public class Resource {

@JsonProperty("resourceType")
private String resourceType;
@JsonProperty("status")
private String status;
@JsonProperty("effectiveDateTime")
private String effectiveDateTime;
@JsonProperty("issued")
private String issued;
@JsonProperty("id")
private String id;
@JsonProperty("identifier")
private List<Identifier> identifier = new ArrayList<Identifier>();
@JsonProperty("code")
private Code code;
@JsonProperty("subject")
private Subject subject;
@JsonProperty("performer")
private Performer performer;
@JsonProperty("result")
private List<Result> result = new ArrayList<Result>();
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
* @param result
* @param effectiveDateTime
* @param status
* @param subject
* @param issued
* @param performer
* @param code
* @param identifier
* @param resourceType
*/
public Resource(String resourceType, String status, String effectiveDateTime, String issued, String id, List<Identifier> identifier, Code code, Subject subject, Performer performer, List<Result> result) {
this.resourceType = resourceType;
this.status = status;
this.effectiveDateTime = effectiveDateTime;
this.issued = issued;
this.id = id;
this.identifier = identifier;
this.code = code;
this.subject = subject;
this.performer = performer;
this.result = result;
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
* The issued
*/
@JsonProperty("issued")
public String getIssued() {
return issued;
}

/**
* 
* @param issued
* The issued
*/
@JsonProperty("issued")
public void setIssued(String issued) {
this.issued = issued;
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
* The identifier
*/
@JsonProperty("identifier")
public List<Identifier> getIdentifier() {
return identifier;
}

/**
* 
* @param identifier
* The identifier
*/
@JsonProperty("identifier")
public void setIdentifier(List<Identifier> identifier) {
this.identifier = identifier;
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

/**
* 
* @return
* The performer
*/
@JsonProperty("performer")
public Performer getPerformer() {
return performer;
}

/**
* 
* @param performer
* The performer
*/
@JsonProperty("performer")
public void setPerformer(Performer performer) {
this.performer = performer;
}

/**
* 
* @return
* The result
*/
@JsonProperty("result")
public List<Result> getResult() {
return result;
}

/**
* 
* @param result
* The result
*/
@JsonProperty("result")
public void setResult(List<Result> result) {
this.result = result;
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