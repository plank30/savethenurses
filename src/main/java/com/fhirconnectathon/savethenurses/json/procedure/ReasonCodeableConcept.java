
package com.fhirconnectathon.savethenurses.json.procedure;

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
@JsonPropertyOrder({ "coding" })
public class ReasonCodeableConcept {

	@JsonProperty("coding")
	private List<Object> coding = new ArrayList<Object>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ReasonCodeableConcept() {
	}

	/**
	 * 
	 * @param coding
	 */
	public ReasonCodeableConcept(List<Object> coding) {
		this.coding = coding;
	}

	/**
	 * 
	 * @return The coding
	 */
	@JsonProperty("coding")
	public List<Object> getCoding() {
		return coding;
	}

	/**
	 * 
	 * @param coding
	 *            The coding
	 */
	@JsonProperty("coding")
	public void setCoding(List<Object> coding) {
		this.coding = coding;
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