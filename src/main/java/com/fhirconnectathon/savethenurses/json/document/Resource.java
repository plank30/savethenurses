package com.fhirconnectathon.savethenurses.json.document;

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
"created",
"indexed",
"status",
"id",
"subject",
"class",
"type",
"content",
"masterIdentifier"
})
public class Resource {

@JsonProperty("resourceType")
private String resourceType;
@JsonProperty("created")
private String created;
@JsonProperty("indexed")
private String indexed;
@JsonProperty("status")
private String status;
@JsonProperty("id")
private String id;
@JsonProperty("subject")
private Subject subject;
@JsonProperty("class")
private Class _class;
@JsonProperty("type")
private Type type;
@JsonProperty("content")
private List<Content> content = new ArrayList<Content>();
@JsonProperty("masterIdentifier")
private MasterIdentifier masterIdentifier;
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
* @param content
* @param id
* @param _class
* @param status
* @param indexed
* @param created
* @param subject
* @param masterIdentifier
* @param type
* @param resourceType
*/
public Resource(String resourceType, String created, String indexed, String status, String id, Subject subject, Class _class, Type type, List<Content> content, MasterIdentifier masterIdentifier) {
this.resourceType = resourceType;
this.created = created;
this.indexed = indexed;
this.status = status;
this.id = id;
this.subject = subject;
this._class = _class;
this.type = type;
this.content = content;
this.masterIdentifier = masterIdentifier;
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
* The created
*/
@JsonProperty("created")
public String getCreated() {
return created;
}

/**
* 
* @param created
* The created
*/
@JsonProperty("created")
public void setCreated(String created) {
this.created = created;
}

/**
* 
* @return
* The indexed
*/
@JsonProperty("indexed")
public String getIndexed() {
return indexed;
}

/**
* 
* @param indexed
* The indexed
*/
@JsonProperty("indexed")
public void setIndexed(String indexed) {
this.indexed = indexed;
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
* The _class
*/
@JsonProperty("class")
public Class getClass_() {
return _class;
}

/**
* 
* @param _class
* The class
*/
@JsonProperty("class")
public void setClass_(Class _class) {
this._class = _class;
}

/**
* 
* @return
* The type
*/
@JsonProperty("type")
public Type getType() {
return type;
}

/**
* 
* @param type
* The type
*/
@JsonProperty("type")
public void setType(Type type) {
this.type = type;
}

/**
* 
* @return
* The content
*/
@JsonProperty("content")
public List<Content> getContent() {
return content;
}

/**
* 
* @param content
* The content
*/
@JsonProperty("content")
public void setContent(List<Content> content) {
this.content = content;
}

/**
* 
* @return
* The masterIdentifier
*/
@JsonProperty("masterIdentifier")
public MasterIdentifier getMasterIdentifier() {
return masterIdentifier;
}

/**
* 
* @param masterIdentifier
* The masterIdentifier
*/
@JsonProperty("masterIdentifier")
public void setMasterIdentifier(MasterIdentifier masterIdentifier) {
this.masterIdentifier = masterIdentifier;
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