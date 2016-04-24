
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
@JsonPropertyOrder({ "resourceType", "status", "notPerformed", "subject", "code", "reasonCodeableConcept",
		"performer" })
public class Resource {

	@JsonProperty("resourceType")
	private String resourceType;
	@JsonProperty("status")
	private String status;
	@JsonProperty("notPerformed")
	private Boolean notPerformed;
	@JsonProperty("subject")
	private Subject subject;
	@JsonProperty("code")
	private Code code;
	@JsonProperty("reasonCodeableConcept")
	private ReasonCodeableConcept reasonCodeableConcept;
	@JsonProperty("performer")
	private List<Object> performer = new ArrayList<Object>();
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
	 * @param notPerformed
	 * @param status
	 * @param subject
	 * @param performer
	 * @param code
	 * @param reasonCodeableConcept
	 * @param resourceType
	 */
	public Resource(String resourceType, String status, Boolean notPerformed, Subject subject, Code code,
			ReasonCodeableConcept reasonCodeableConcept, List<Object> performer) {
		this.resourceType = resourceType;
		this.status = status;
		this.notPerformed = notPerformed;
		this.subject = subject;
		this.code = code;
		this.reasonCodeableConcept = reasonCodeableConcept;
		this.performer = performer;
	}

	/**
	 * 
	 * @return The resourceType
	 */
	@JsonProperty("resourceType")
	public String getResourceType() {
		return resourceType;
	}

	/**
	 * 
	 * @param resourceType
	 *            The resourceType
	 */
	@JsonProperty("resourceType")
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	/**
	 * 
	 * @return The status
	 */
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status
	 *            The status
	 */
	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 
	 * @return The notPerformed
	 */
	@JsonProperty("notPerformed")
	public Boolean getNotPerformed() {
		return notPerformed;
	}

	/**
	 * 
	 * @param notPerformed
	 *            The notPerformed
	 */
	@JsonProperty("notPerformed")
	public void setNotPerformed(Boolean notPerformed) {
		this.notPerformed = notPerformed;
	}

	/**
	 * 
	 * @return The subject
	 */
	@JsonProperty("subject")
	public Subject getSubject() {
		return subject;
	}

	/**
	 * 
	 * @param subject
	 *            The subject
	 */
	@JsonProperty("subject")
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
	 * 
	 * @return The code
	 */
	@JsonProperty("code")
	public Code getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 *            The code
	 */
	@JsonProperty("code")
	public void setCode(Code code) {
		this.code = code;
	}

	/**
	 * 
	 * @return The reasonCodeableConcept
	 */
	@JsonProperty("reasonCodeableConcept")
	public ReasonCodeableConcept getReasonCodeableConcept() {
		return reasonCodeableConcept;
	}

	/**
	 * 
	 * @param reasonCodeableConcept
	 *            The reasonCodeableConcept
	 */
	@JsonProperty("reasonCodeableConcept")
	public void setReasonCodeableConcept(ReasonCodeableConcept reasonCodeableConcept) {
		this.reasonCodeableConcept = reasonCodeableConcept;
	}

	/**
	 * 
	 * @return The performer
	 */
	@JsonProperty("performer")
	public List<Object> getPerformer() {
		return performer;
	}

	/**
	 * 
	 * @param performer
	 *            The performer
	 */
	@JsonProperty("performer")
	public void setPerformer(List<Object> performer) {
		this.performer = performer;
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