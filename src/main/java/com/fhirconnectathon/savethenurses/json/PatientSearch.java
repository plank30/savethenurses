public class CareProvider
{
    @JsonProperty("display")
    public String getDisplay() { 
         return this.display 
    }
    public String setDisplay(String display) { 
         this.display = display 
    }
    String display;

    @JsonProperty("reference")
    public String getReference() { 
         return this.reference 
    }
    public String setReference(String reference) { 
         this.reference = reference 
    }
    String reference;

}

public class Name
{
    @JsonProperty("use")
    public String getUse() { 
         return this.use 
    }
    public String setUse(String use) { 
         this.use = use 
    }
    String use;

    @JsonProperty("family")
    public List<String> getFamily() { 
         return this.family 
    }
    public List<String> setFamily(List<String> family) { 
         this.family = family 
    }
    List<String> family;

    @JsonProperty("given")
    public List<String> getGiven() { 
         return this.given 
    }
    public List<String> setGiven(List<String> given) { 
         this.given = given 
    }
    List<String> given;

}

public class Identifier
{
    @JsonProperty("use")
    public String getUse() { 
         return this.use 
    }
    public String setUse(String use) { 
         this.use = use 
    }
    String use;

    @JsonProperty("system")
    public String getSystem() { 
         return this.system 
    }
    public String setSystem(String system) { 
         this.system = system 
    }
    String system;

    @JsonProperty("value")
    public String getValue() { 
         return this.value 
    }
    public String setValue(String value) { 
         this.value = value 
    }
    String value;

}

public class Address
{
    @JsonProperty("use")
    public String getUse() { 
         return this.use 
    }
    public String setUse(String use) { 
         this.use = use 
    }
    String use;

    @JsonProperty("line")
    public List<String> getLine() { 
         return this.line 
    }
    public List<String> setLine(List<String> line) { 
         this.line = line 
    }
    List<String> line;

    @JsonProperty("city")
    public String getCity() { 
         return this.city 
    }
    public String setCity(String city) { 
         this.city = city 
    }
    String city;

    @JsonProperty("state")
    public String getState() { 
         return this.state 
    }
    public String setState(String state) { 
         this.state = state 
    }
    String state;

    @JsonProperty("postalCode")
    public String getPostalCode() { 
         return this.postalCode 
    }
    public String setPostalCode(String postalCode) { 
         this.postalCode = postalCode 
    }
    String postalCode;

    @JsonProperty("country")
    public String getCountry() { 
         return this.country 
    }
    public String setCountry(String country) { 
         this.country = country 
    }
    String country;

}

public class Telecom
{
    @JsonProperty("system")
    public String getSystem() { 
         return this.system 
    }
    public String setSystem(String system) { 
         this.system = system 
    }
    String system;

    @JsonProperty("value")
    public String getValue() { 
         return this.value 
    }
    public String setValue(String value) { 
         this.value = value 
    }
    String value;

    @JsonProperty("use")
    public String getUse() { 
         return this.use 
    }
    public String setUse(String use) { 
         this.use = use 
    }
    String use;

}

public class MaritalStatus
{
    @JsonProperty("text")
    public String getText() { 
         return this.text 
    }
    public String setText(String text) { 
         this.text = text 
    }
    String text;

}

public class Coding
{
    @JsonProperty("system")
    public String getSystem() { 
         return this.system 
    }
    public String setSystem(String system) { 
         this.system = system 
    }
    String system;

    @JsonProperty("code")
    public String getCode() { 
         return this.code 
    }
    public String setCode(String code) { 
         this.code = code 
    }
    String code;

    @JsonProperty("display")
    public String getDisplay() { 
         return this.display 
    }
    public String setDisplay(String display) { 
         this.display = display 
    }
    String display;

}

public class Language
{
    @JsonProperty("text")
    public String getText() { 
         return this.text 
    }
    public String setText(String text) { 
         this.text = text 
    }
    String text;

    @JsonProperty("coding")
    public List<Coding> getCoding() { 
         return this.coding 
    }
    public List<Coding> setCoding(List<Coding> coding) { 
         this.coding = coding 
    }
    List<Coding> coding;

}

public class Communication
{
    @JsonProperty("preferred")
    public boolean getPreferred() { 
         return this.preferred 
    }
    public boolean setPreferred(boolean preferred) { 
         this.preferred = preferred 
    }
    boolean preferred;

    @JsonProperty("language")
    public Language getLanguage() { 
         return this.language 
    }
    public Language setLanguage(Language language) { 
         this.language = language 
    }
    Language language;

}

public class Coding
{
    @JsonProperty("system")
    public String getSystem() { 
         return this.system 
    }
    public String setSystem(String system) { 
         this.system = system 
    }
    String system;

    @JsonProperty("code")
    public String getCode() { 
         return this.code 
    }
    public String setCode(String code) { 
         this.code = code 
    }
    String code;

    @JsonProperty("display")
    public String getDisplay() { 
         return this.display 
    }
    public String setDisplay(String display) { 
         this.display = display 
    }
    String display;

}

public class ValueCodeableConcept
{
    @JsonProperty("text")
    public String getText() { 
         return this.text 
    }
    public String setText(String text) { 
         this.text = text 
    }
    String text;

    @JsonProperty("coding")
    public List<Coding> getCoding() { 
         return this.coding 
    }
    public List<Coding> setCoding(List<Coding> coding) { 
         this.coding = coding 
    }
    List<Coding> coding;

}

public class Extension
{
    @JsonProperty("url")
    public String getUrl() { 
         return this.url 
    }
    public String setUrl(String url) { 
         this.url = url 
    }
    String url;

    @JsonProperty("valueCodeableConcept")
    public ValueCodeableConcept getValueCodeableConcept() { 
         return this.valueCodeableConcept 
    }
    public ValueCodeableConcept setValueCodeableConcept(ValueCodeableConcept valueCodeableConcept) { 
         this.valueCodeableConcept = valueCodeableConcept 
    }
    ValueCodeableConcept valueCodeableConcept;

}

public class Example
{
    @JsonProperty("resourceType")
    public String getResourceType() { 
         return this.resourceType 
    }
    public String setResourceType(String resourceType) { 
         this.resourceType = resourceType 
    }
    String resourceType;

    @JsonProperty("birthDate")
    public Date getBirthDate() { 
         return this.birthDate 
    }
    public Date setBirthDate(Date birthDate) { 
         this.birthDate = birthDate 
    }
    Date birthDate;

    @JsonProperty("active")
    public boolean getActive() { 
         return this.active 
    }
    public boolean setActive(boolean active) { 
         this.active = active 
    }
    boolean active;

    @JsonProperty("gender")
    public String getGender() { 
         return this.gender 
    }
    public String setGender(String gender) { 
         this.gender = gender 
    }
    String gender;

    @JsonProperty("deceasedBoolean")
    public boolean getDeceasedBoolean() { 
         return this.deceasedBoolean 
    }
    public boolean setDeceasedBoolean(boolean deceasedBoolean) { 
         this.deceasedBoolean = deceasedBoolean 
    }
    boolean deceasedBoolean;

    @JsonProperty("id")
    public String getId() { 
         return this.id 
    }
    public String setId(String id) { 
         this.id = id 
    }
    String id;

    @JsonProperty("careProvider")
    public List<CareProvider> getCareProvider() { 
         return this.careProvider 
    }
    public List<CareProvider> setCareProvider(List<CareProvider> careProvider) { 
         this.careProvider = careProvider 
    }
    List<CareProvider> careProvider;

    @JsonProperty("name")
    public List<Name> getName() { 
         return this.name 
    }
    public List<Name> setName(List<Name> name) { 
         this.name = name 
    }
    List<Name> name;

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() { 
         return this.identifier 
    }
    public List<Identifier> setIdentifier(List<Identifier> identifier) { 
         this.identifier = identifier 
    }
    List<Identifier> identifier;

    @JsonProperty("address")
    public List<Address> getAddress() { 
         return this.address 
    }
    public List<Address> setAddress(List<Address> address) { 
         this.address = address 
    }
    List<Address> address;

    @JsonProperty("telecom")
    public List<Telecom> getTelecom() { 
         return this.telecom 
    }
    public List<Telecom> setTelecom(List<Telecom> telecom) { 
         this.telecom = telecom 
    }
    List<Telecom> telecom;

    @JsonProperty("maritalStatus")
    public MaritalStatus getMaritalStatus() { 
         return this.maritalStatus 
    }
    public MaritalStatus setMaritalStatus(MaritalStatus maritalStatus) { 
         this.maritalStatus = maritalStatus 
    }
    MaritalStatus maritalStatus;

    @JsonProperty("communication")
    public List<Communication> getCommunication() { 
         return this.communication 
    }
    public List<Communication> setCommunication(List<Communication> communication) { 
         this.communication = communication 
    }
    List<Communication> communication;

    @JsonProperty("extension")
    public List<Extension> getExtension() { 
         return this.extension 
    }
    public List<Extension> setExtension(List<Extension> extension) { 
         this.extension = extension 
    }
    List<Extension> extension;

}
