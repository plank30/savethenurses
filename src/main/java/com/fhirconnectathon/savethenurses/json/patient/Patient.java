package com.fhirconnectathon.savethenurses.json.patient;

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
"birthDate",
"active",
"gender",
"deceasedBoolean",
"id",
"careProvider",
"name",
"identifier",
"address",
"telecom",
"maritalStatus",
"communication",
"extension"
})
public class Patient {

@JsonProperty("resourceType")
private String resourceType;
@JsonProperty("birthDate")
private String birthDate;
@JsonProperty("active")
private Boolean active;
@JsonProperty("gender")
private String gender;
@JsonProperty("deceasedBoolean")
private Boolean deceasedBoolean;
@JsonProperty("id")
private String id;
@JsonProperty("careProvider")
private List<CareProvider> careProvider = new ArrayList<CareProvider>();
@JsonProperty("name")
private List<Name> name = new ArrayList<Name>();
@JsonProperty("identifier")
private List<Identifier> identifier = new ArrayList<Identifier>();
@JsonProperty("address")
private List<Address> address = new ArrayList<Address>();
@JsonProperty("telecom")
private List<Telecom> telecom = new ArrayList<Telecom>();
@JsonProperty("maritalStatus")
private MaritalStatus maritalStatus;
@JsonProperty("communication")
private List<Communication> communication = new ArrayList<Communication>();
@JsonProperty("extension")
private List<Extension> extension = new ArrayList<Extension>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Patient() {
}

/**
* 
* @param communication
* @param deceasedBoolean
* @param maritalStatus
* @param resourceType
* @param extension
* @param id
* @param address
* @param name
* @param telecom
* @param active
* @param gender
* @param birthDate
* @param careProvider
* @param identifier
*/
public Patient(String resourceType, String birthDate, Boolean active, String gender, Boolean deceasedBoolean, String id, List<CareProvider> careProvider, List<Name> name, List<Identifier> identifier, List<Address> address, List<Telecom> telecom, MaritalStatus maritalStatus, List<Communication> communication, List<Extension> extension) {
this.resourceType = resourceType;
this.birthDate = birthDate;
this.active = active;
this.gender = gender;
this.deceasedBoolean = deceasedBoolean;
this.id = id;
this.careProvider = careProvider;
this.name = name;
this.identifier = identifier;
this.address = address;
this.telecom = telecom;
this.maritalStatus = maritalStatus;
this.communication = communication;
this.extension = extension;
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
* The birthDate
*/
@JsonProperty("birthDate")
public String getBirthDate() {
return birthDate;
}

/**
* 
* @param birthDate
* The birthDate
*/
@JsonProperty("birthDate")
public void setBirthDate(String birthDate) {
this.birthDate = birthDate;
}

/**
* 
* @return
* The active
*/
@JsonProperty("active")
public Boolean getActive() {
return active;
}

/**
* 
* @param active
* The active
*/
@JsonProperty("active")
public void setActive(Boolean active) {
this.active = active;
}

/**
* 
* @return
* The gender
*/
@JsonProperty("gender")
public String getGender() {
return gender;
}

/**
* 
* @param gender
* The gender
*/
@JsonProperty("gender")
public void setGender(String gender) {
this.gender = gender;
}

/**
* 
* @return
* The deceasedBoolean
*/
@JsonProperty("deceasedBoolean")
public Boolean getDeceasedBoolean() {
return deceasedBoolean;
}

/**
* 
* @param deceasedBoolean
* The deceasedBoolean
*/
@JsonProperty("deceasedBoolean")
public void setDeceasedBoolean(Boolean deceasedBoolean) {
this.deceasedBoolean = deceasedBoolean;
}

/**
* 
* @return
* The id
*/
@JsonProperty("id")
public String getId() {
return id;
}

/**
* 
* @param id
* The id
*/
@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

/**
* 
* @return
* The careProvider
*/
@JsonProperty("careProvider")
public List<CareProvider> getCareProvider() {
return careProvider;
}

/**
* 
* @param careProvider
* The careProvider
*/
@JsonProperty("careProvider")
public void setCareProvider(List<CareProvider> careProvider) {
this.careProvider = careProvider;
}

/**
* 
* @return
* The name
*/
@JsonProperty("name")
public List<Name> getName() {
return name;
}

/**
* 
* @param name
* The name
*/
@JsonProperty("name")
public void setName(List<Name> name) {
this.name = name;
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
* The address
*/
@JsonProperty("address")
public List<Address> getAddress() {
return address;
}

/**
* 
* @param address
* The address
*/
@JsonProperty("address")
public void setAddress(List<Address> address) {
this.address = address;
}

/**
* 
* @return
* The telecom
*/
@JsonProperty("telecom")
public List<Telecom> getTelecom() {
return telecom;
}

/**
* 
* @param telecom
* The telecom
*/
@JsonProperty("telecom")
public void setTelecom(List<Telecom> telecom) {
this.telecom = telecom;
}

/**
* 
* @return
* The maritalStatus
*/
@JsonProperty("maritalStatus")
public MaritalStatus getMaritalStatus() {
return maritalStatus;
}

/**
* 
* @param maritalStatus
* The maritalStatus
*/
@JsonProperty("maritalStatus")
public void setMaritalStatus(MaritalStatus maritalStatus) {
this.maritalStatus = maritalStatus;
}

/**
* 
* @return
* The communication
*/
@JsonProperty("communication")
public List<Communication> getCommunication() {
return communication;
}

/**
* 
* @param communication
* The communication
*/
@JsonProperty("communication")
public void setCommunication(List<Communication> communication) {
this.communication = communication;
}

/**
* 
* @return
* The extension
*/
@JsonProperty("extension")
public List<Extension> getExtension() {
return extension;
}

/**
* 
* @param extension
* The extension
*/
@JsonProperty("extension")
public void setExtension(List<Extension> extension) {
this.extension = extension;
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