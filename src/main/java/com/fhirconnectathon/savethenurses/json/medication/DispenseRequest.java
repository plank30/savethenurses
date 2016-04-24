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
"numberOfRepeatsAllowed",
"expectedSupplyDuration",
"quantity",
"validityPeriod"
})
public class DispenseRequest {

@JsonProperty("numberOfRepeatsAllowed")
private Integer numberOfRepeatsAllowed;
@JsonProperty("expectedSupplyDuration")
private ExpectedSupplyDuration expectedSupplyDuration;
@JsonProperty("quantity")
private Quantity quantity;
@JsonProperty("validityPeriod")
private ValidityPeriod validityPeriod;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public DispenseRequest() {
}

/**
* 
* @param numberOfRepeatsAllowed
* @param validityPeriod
* @param expectedSupplyDuration
* @param quantity
*/
public DispenseRequest(Integer numberOfRepeatsAllowed, ExpectedSupplyDuration expectedSupplyDuration, Quantity quantity, ValidityPeriod validityPeriod) {
this.numberOfRepeatsAllowed = numberOfRepeatsAllowed;
this.expectedSupplyDuration = expectedSupplyDuration;
this.quantity = quantity;
this.validityPeriod = validityPeriod;
}

/**
* 
* @return
* The numberOfRepeatsAllowed
*/
@JsonProperty("numberOfRepeatsAllowed")
public Integer getNumberOfRepeatsAllowed() {
return numberOfRepeatsAllowed;
}

/**
* 
* @param numberOfRepeatsAllowed
* The numberOfRepeatsAllowed
*/
@JsonProperty("numberOfRepeatsAllowed")
public void setNumberOfRepeatsAllowed(Integer numberOfRepeatsAllowed) {
this.numberOfRepeatsAllowed = numberOfRepeatsAllowed;
}

/**
* 
* @return
* The expectedSupplyDuration
*/
@JsonProperty("expectedSupplyDuration")
public ExpectedSupplyDuration getExpectedSupplyDuration() {
return expectedSupplyDuration;
}

/**
* 
* @param expectedSupplyDuration
* The expectedSupplyDuration
*/
@JsonProperty("expectedSupplyDuration")
public void setExpectedSupplyDuration(ExpectedSupplyDuration expectedSupplyDuration) {
this.expectedSupplyDuration = expectedSupplyDuration;
}

/**
* 
* @return
* The quantity
*/
@JsonProperty("quantity")
public Quantity getQuantity() {
return quantity;
}

/**
* 
* @param quantity
* The quantity
*/
@JsonProperty("quantity")
public void setQuantity(Quantity quantity) {
this.quantity = quantity;
}

/**
* 
* @return
* The validityPeriod
*/
@JsonProperty("validityPeriod")
public ValidityPeriod getValidityPeriod() {
return validityPeriod;
}

/**
* 
* @param validityPeriod
* The validityPeriod
*/
@JsonProperty("validityPeriod")
public void setValidityPeriod(ValidityPeriod validityPeriod) {
this.validityPeriod = validityPeriod;
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