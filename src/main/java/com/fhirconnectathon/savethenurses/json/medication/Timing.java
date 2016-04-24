package com.fhirconnectathon.savethenurses.json.medication;

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
"repeat"
})
public class Timing {

@JsonProperty("repeat")
private Repeat repeat;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Timing() {
}

/**
* 
* @param repeat
*/
public Timing(Repeat repeat) {
this.repeat = repeat;
}

/**
* 
* @return
* The repeat
*/
@JsonProperty("repeat")
public Repeat getRepeat() {
return repeat;
}

/**
* 
* @param repeat
* The repeat
*/
@JsonProperty("repeat")
public void setRepeat(Repeat repeat) {
this.repeat = repeat;
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