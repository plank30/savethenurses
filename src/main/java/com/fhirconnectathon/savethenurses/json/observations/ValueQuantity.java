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
"value",
"unit",
"code",
"system"
})
public class ValueQuantity {

@JsonProperty("value")
private Double value;
@JsonProperty("unit")
private String unit;
@JsonProperty("code")
private String code;
@JsonProperty("system")
private String system;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public ValueQuantity() {
}

/**
* 
* @param unit
* @param system
* @param value
* @param code
*/
public ValueQuantity(Double value, String unit, String code, String system) {
this.value = value;
this.unit = unit;
this.code = code;
this.system = system;
}

/**
* 
* @return
* The value
*/
@JsonProperty("value")
public Double getValue() {
return value;
}

/**
* 
* @param value
* The value
*/
@JsonProperty("value")
public void setValue(Double value) {
this.value = value;
}

/**
* 
* @return
* The unit
*/
@JsonProperty("unit")
public String getUnit() {
return unit;
}

/**
* 
* @param unit
* The unit
*/
@JsonProperty("unit")
public void setUnit(String unit) {
this.unit = unit;
}

/**
* 
* @return
* The code
*/
@JsonProperty("code")
public String getCode() {
return code;
}

/**
* 
* @param code
* The code
*/
@JsonProperty("code")
public void setCode(String code) {
this.code = code;
}

/**
* 
* @return
* The system
*/
@JsonProperty("system")
public String getSystem() {
return system;
}

/**
* 
* @param system
* The system
*/
@JsonProperty("system")
public void setSystem(String system) {
this.system = system;
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