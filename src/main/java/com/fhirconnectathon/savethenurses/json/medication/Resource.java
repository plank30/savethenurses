package com.fhirconnectathon.savethenurses.json.medication;

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
"dateWritten",
"status",
"identifier",
"patient",
"prescriber",
"medicationReference",
"dispenseRequest",
"dosageInstruction",
"substitution"
})
public class Resource {

@JsonProperty("resourceType")
private String resourceType;
@JsonProperty("dateWritten")
private String dateWritten;
@JsonProperty("status")
private String status;
@JsonProperty("identifier")
private List<Identifier> identifier = new ArrayList<Identifier>();
@JsonProperty("patient")
private Patient patient;
@JsonProperty("prescriber")
private Prescriber prescriber;
@JsonProperty("medicationReference")
private MedicationReference medicationReference;
@JsonProperty("dispenseRequest")
private DispenseRequest dispenseRequest;
@JsonProperty("dosageInstruction")
private List<DosageInstruction> dosageInstruction = new ArrayList<DosageInstruction>();
@JsonProperty("substitution")
private Substitution substitution;
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
* @param patient
* @param dispenseRequest
* @param medicationReference
* @param status
* @param dateWritten
* @param prescriber
* @param substitution
* @param identifier
* @param dosageInstruction
* @param resourceType
*/
public Resource(String resourceType, String dateWritten, String status, List<Identifier> identifier, Patient patient, Prescriber prescriber, MedicationReference medicationReference, DispenseRequest dispenseRequest, List<DosageInstruction> dosageInstruction, Substitution substitution) {
this.resourceType = resourceType;
this.dateWritten = dateWritten;
this.status = status;
this.identifier = identifier;
this.patient = patient;
this.prescriber = prescriber;
this.medicationReference = medicationReference;
this.dispenseRequest = dispenseRequest;
this.dosageInstruction = dosageInstruction;
this.substitution = substitution;
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
* The dateWritten
*/
@JsonProperty("dateWritten")
public String getDateWritten() {
return dateWritten;
}

/**
* 
* @param dateWritten
* The dateWritten
*/
@JsonProperty("dateWritten")
public void setDateWritten(String dateWritten) {
this.dateWritten = dateWritten;
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
* The identifier
*/
@JsonProperty("identifier")
public List<Identifier> getIdentifier() {
return identifier;
}

/**
* 
* @param identifier
* The identifier
*/
@JsonProperty("identifier")
public void setIdentifier(List<Identifier> identifier) {
this.identifier = identifier;
}

/**
* 
* @return
* The patient
*/
@JsonProperty("patient")
public Patient getPatient() {
return patient;
}

/**
* 
* @param patient
* The patient
*/
@JsonProperty("patient")
public void setPatient(Patient patient) {
this.patient = patient;
}

/**
* 
* @return
* The prescriber
*/
@JsonProperty("prescriber")
public Prescriber getPrescriber() {
return prescriber;
}

/**
* 
* @param prescriber
* The prescriber
*/
@JsonProperty("prescriber")
public void setPrescriber(Prescriber prescriber) {
this.prescriber = prescriber;
}

/**
* 
* @return
* The medicationReference
*/
@JsonProperty("medicationReference")
public MedicationReference getMedicationReference() {
return medicationReference;
}

/**
* 
* @param medicationReference
* The medicationReference
*/
@JsonProperty("medicationReference")
public void setMedicationReference(MedicationReference medicationReference) {
this.medicationReference = medicationReference;
}

/**
* 
* @return
* The dispenseRequest
*/
@JsonProperty("dispenseRequest")
public DispenseRequest getDispenseRequest() {
return dispenseRequest;
}

/**
* 
* @param dispenseRequest
* The dispenseRequest
*/
@JsonProperty("dispenseRequest")
public void setDispenseRequest(DispenseRequest dispenseRequest) {
this.dispenseRequest = dispenseRequest;
}

/**
* 
* @return
* The dosageInstruction
*/
@JsonProperty("dosageInstruction")
public List<DosageInstruction> getDosageInstruction() {
return dosageInstruction;
}

/**
* 
* @param dosageInstruction
* The dosageInstruction
*/
@JsonProperty("dosageInstruction")
public void setDosageInstruction(List<DosageInstruction> dosageInstruction) {
this.dosageInstruction = dosageInstruction;
}

/**
* 
* @return
* The substitution
*/
@JsonProperty("substitution")
public Substitution getSubstitution() {
return substitution;
}

/**
* 
* @param substitution
* The substitution
*/
@JsonProperty("substitution")
public void setSubstitution(Substitution substitution) {
this.substitution = substitution;
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