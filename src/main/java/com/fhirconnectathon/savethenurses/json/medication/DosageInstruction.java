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
"text",
"asNeededBoolean",
"route",
"method",
"timing",
"doseQuantity"
})
public class DosageInstruction {

@JsonProperty("text")
private String text;
@JsonProperty("asNeededBoolean")
private Boolean asNeededBoolean;
@JsonProperty("route")
private Route route;
@JsonProperty("method")
private Method method;
@JsonProperty("timing")
private Timing timing;
@JsonProperty("doseQuantity")
private DoseQuantity doseQuantity;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public DosageInstruction() {
}

/**
* 
* @param text
* @param doseQuantity
* @param route
* @param method
* @param timing
* @param asNeededBoolean
*/
public DosageInstruction(String text, Boolean asNeededBoolean, Route route, Method method, Timing timing, DoseQuantity doseQuantity) {
this.text = text;
this.asNeededBoolean = asNeededBoolean;
this.route = route;
this.method = method;
this.timing = timing;
this.doseQuantity = doseQuantity;
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
* The asNeededBoolean
*/
@JsonProperty("asNeededBoolean")
public Boolean getAsNeededBoolean() {
return asNeededBoolean;
}

/**
* 
* @param asNeededBoolean
* The asNeededBoolean
*/
@JsonProperty("asNeededBoolean")
public void setAsNeededBoolean(Boolean asNeededBoolean) {
this.asNeededBoolean = asNeededBoolean;
}

/**
* 
* @return
* The route
*/
@JsonProperty("route")
public Route getRoute() {
return route;
}

/**
* 
* @param route
* The route
*/
@JsonProperty("route")
public void setRoute(Route route) {
this.route = route;
}

/**
* 
* @return
* The method
*/
@JsonProperty("method")
public Method getMethod() {
return method;
}

/**
* 
* @param method
* The method
*/
@JsonProperty("method")
public void setMethod(Method method) {
this.method = method;
}

/**
* 
* @return
* The timing
*/
@JsonProperty("timing")
public Timing getTiming() {
return timing;
}

/**
* 
* @param timing
* The timing
*/
@JsonProperty("timing")
public void setTiming(Timing timing) {
this.timing = timing;
}

/**
* 
* @return
* The doseQuantity
*/
@JsonProperty("doseQuantity")
public DoseQuantity getDoseQuantity() {
return doseQuantity;
}

/**
* 
* @param doseQuantity
* The doseQuantity
*/
@JsonProperty("doseQuantity")
public void setDoseQuantity(DoseQuantity doseQuantity) {
this.doseQuantity = doseQuantity;
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