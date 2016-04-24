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
"frequency",
"period",
"periodUnits",
"boundsPeriod"
})
public class Repeat {

@JsonProperty("frequency")
private Integer frequency;
@JsonProperty("period")
private Integer period;
@JsonProperty("periodUnits")
private String periodUnits;
@JsonProperty("boundsPeriod")
private BoundsPeriod boundsPeriod;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Repeat() {
}

/**
* 
* @param periodUnits
* @param boundsPeriod
* @param frequency
* @param period
*/
public Repeat(Integer frequency, Integer period, String periodUnits, BoundsPeriod boundsPeriod) {
this.frequency = frequency;
this.period = period;
this.periodUnits = periodUnits;
this.boundsPeriod = boundsPeriod;
}

/**
* 
* @return
* The frequency
*/
@JsonProperty("frequency")
public Integer getFrequency() {
return frequency;
}

/**
* 
* @param frequency
* The frequency
*/
@JsonProperty("frequency")
public void setFrequency(Integer frequency) {
this.frequency = frequency;
}

/**
* 
* @return
* The period
*/
@JsonProperty("period")
public Integer getPeriod() {
return period;
}

/**
* 
* @param period
* The period
*/
@JsonProperty("period")
public void setPeriod(Integer period) {
this.period = period;
}

/**
* 
* @return
* The periodUnits
*/
@JsonProperty("periodUnits")
public String getPeriodUnits() {
return periodUnits;
}

/**
* 
* @param periodUnits
* The periodUnits
*/
@JsonProperty("periodUnits")
public void setPeriodUnits(String periodUnits) {
this.periodUnits = periodUnits;
}

/**
* 
* @return
* The boundsPeriod
*/
@JsonProperty("boundsPeriod")
public BoundsPeriod getBoundsPeriod() {
return boundsPeriod;
}

/**
* 
* @param boundsPeriod
* The boundsPeriod
*/
@JsonProperty("boundsPeriod")
public void setBoundsPeriod(BoundsPeriod boundsPeriod) {
this.boundsPeriod = boundsPeriod;
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