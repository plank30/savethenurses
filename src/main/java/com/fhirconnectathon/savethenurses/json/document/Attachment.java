package com.fhirconnectathon.savethenurses.json.document;

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
"contentType",
"url"
})
public class Attachment {

@JsonProperty("contentType")
private String contentType;
@JsonProperty("url")
private String url;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Attachment() {
}

/**
* 
* @param contentType
* @param url
*/
public Attachment(String contentType, String url) {
this.contentType = contentType;
this.url = url;
}

/**
* 
* @return
* The contentType
*/
@JsonProperty("contentType")
public String getContentType() {
return contentType;
}

/**
* 
* @param contentType
* The contentType
*/
@JsonProperty("contentType")
public void setContentType(String contentType) {
this.contentType = contentType;
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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}