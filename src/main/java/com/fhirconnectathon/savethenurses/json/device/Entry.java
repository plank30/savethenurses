package com.fhirconnectathon.savethenurses.json.device;

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
"link",
"search",
"resource"
})
public class Entry {

@JsonProperty("link")
private List<Link_> link = new ArrayList<Link_>();
@JsonProperty("search")
private Search search;
@JsonProperty("resource")
private Resource resource;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Entry() {
}

/**
* 
* @param search
* @param link
* @param resource
*/
public Entry(List<Link_> link, Search search, Resource resource) {
this.link = link;
this.search = search;
this.resource = resource;
}

/**
* 
* @return
* The link
*/
@JsonProperty("link")
public List<Link_> getLink() {
return link;
}

/**
* 
* @param link
* The link
*/
@JsonProperty("link")
public void setLink(List<Link_> link) {
this.link = link;
}

/**
* 
* @return
* The search
*/
@JsonProperty("search")
public Search getSearch() {
return search;
}

/**
* 
* @param search
* The search
*/
@JsonProperty("search")
public void setSearch(Search search) {
this.search = search;
}

/**
* 
* @return
* The resource
*/
@JsonProperty("resource")
public Resource getResource() {
return resource;
}

/**
* 
* @param resource
* The resource
*/
@JsonProperty("resource")
public void setResource(Resource resource) {
this.resource = resource;
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