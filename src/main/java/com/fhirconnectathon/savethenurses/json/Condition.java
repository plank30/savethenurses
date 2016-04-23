public class Link
{
    @JsonProperty("relation")
    public String getRelation() { 
         return this.relation 
    }
    public String setRelation(String relation) { 
         this.relation = relation 
    }
    String relation;

    @JsonProperty("url")
    public String getUrl() { 
         return this.url 
    }
    public String setUrl(String url) { 
         this.url = url 
    }
    String url;

}

public class Link
{
    @JsonProperty("relation")
    public String getRelation() { 
         return this.relation 
    }
    public String setRelation(String relation) { 
         this.relation = relation 
    }
    String relation;

    @JsonProperty("url")
    public String getUrl() { 
         return this.url 
    }
    public String setUrl(String url) { 
         this.url = url 
    }
    String url;

}

public class Search
{
    @JsonProperty("mode")
    public String getMode() { 
         return this.mode 
    }
    public String setMode(String mode) { 
         this.mode = mode 
    }
    String mode;

}

public class Patient
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

public class Code
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

public class Category
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

public class Severity
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

public class Resource
{
    @JsonProperty("resourceType")
    public String getResourceType() { 
         return this.resourceType 
    }
    public String setResourceType(String resourceType) { 
         this.resourceType = resourceType 
    }
    String resourceType;

    @JsonProperty("dateRecorded")
    public Date getDateRecorded() { 
         return this.dateRecorded 
    }
    public Date setDateRecorded(Date dateRecorded) { 
         this.dateRecorded = dateRecorded 
    }
    Date dateRecorded;

    @JsonProperty("clinicalStatus")
    public String getClinicalStatus() { 
         return this.clinicalStatus 
    }
    public String setClinicalStatus(String clinicalStatus) { 
         this.clinicalStatus = clinicalStatus 
    }
    String clinicalStatus;

    @JsonProperty("onsetDateTime")
    public Date getOnsetDateTime() { 
         return this.onsetDateTime 
    }
    public Date setOnsetDateTime(Date onsetDateTime) { 
         this.onsetDateTime = onsetDateTime 
    }
    Date onsetDateTime;

    @JsonProperty("verificationStatus")
    public String getVerificationStatus() { 
         return this.verificationStatus 
    }
    public String setVerificationStatus(String verificationStatus) { 
         this.verificationStatus = verificationStatus 
    }
    String verificationStatus;

    @JsonProperty("id")
    public String getId() { 
         return this.id 
    }
    public String setId(String id) { 
         this.id = id 
    }
    String id;

    @JsonProperty("patient")
    public Patient getPatient() { 
         return this.patient 
    }
    public Patient setPatient(Patient patient) { 
         this.patient = patient 
    }
    Patient patient;

    @JsonProperty("code")
    public Code getCode() { 
         return this.code 
    }
    public Code setCode(Code code) { 
         this.code = code 
    }
    Code code;

    @JsonProperty("category")
    public Category getCategory() { 
         return this.category 
    }
    public Category setCategory(Category category) { 
         this.category = category 
    }
    Category category;

    @JsonProperty("severity")
    public Severity getSeverity() { 
         return this.severity 
    }
    public Severity setSeverity(Severity severity) { 
         this.severity = severity 
    }
    Severity severity;

}

public class Entry
{
    @JsonProperty("fullUrl")
    public String getFullUrl() { 
         return this.fullUrl 
    }
    public String setFullUrl(String fullUrl) { 
         this.fullUrl = fullUrl 
    }
    String fullUrl;

    @JsonProperty("link")
    public List<Link> getLink() { 
         return this.link 
    }
    public List<Link> setLink(List<Link> link) { 
         this.link = link 
    }
    List<Link> link;

    @JsonProperty("search")
    public Search getSearch() { 
         return this.search 
    }
    public Search setSearch(Search search) { 
         this.search = search 
    }
    Search search;

    @JsonProperty("resource")
    public Resource getResource() { 
         return this.resource 
    }
    public Resource setResource(Resource resource) { 
         this.resource = resource 
    }
    Resource resource;

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

    @JsonProperty("type")
    public String getType() { 
         return this.type 
    }
    public String setType(String type) { 
         this.type = type 
    }
    String type;

    @JsonProperty("total")
    public int getTotal() { 
         return this.total 
    }
    public int setTotal(int total) { 
         this.total = total 
    }
    int total;

    @JsonProperty("link")
    public List<Link> getLink() { 
         return this.link 
    }
    public List<Link> setLink(List<Link> link) { 
         this.link = link 
    }
    List<Link> link;

    @JsonProperty("entry")
    public List<Entry> getEntry() { 
         return this.entry 
    }
    public List<Entry> setEntry(List<Entry> entry) { 
         this.entry = entry 
    }
    List<Entry> entry;

}
