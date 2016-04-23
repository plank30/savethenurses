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

public class Substance
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

public class Manifestation
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

public class Note
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

public class Reaction
{
    @JsonProperty("certainty")
    public String getCertainty() { 
         return this.certainty 
    }
    public String setCertainty(String certainty) { 
         this.certainty = certainty 
    }
    String certainty;

    @JsonProperty("onset")
    public Date getOnset() { 
         return this.onset 
    }
    public Date setOnset(Date onset) { 
         this.onset = onset 
    }
    Date onset;

    @JsonProperty("manifestation")
    public List<Manifestation> getManifestation() { 
         return this.manifestation 
    }
    public List<Manifestation> setManifestation(List<Manifestation> manifestation) { 
         this.manifestation = manifestation 
    }
    List<Manifestation> manifestation;

    @JsonProperty("note")
    public Note getNote() { 
         return this.note 
    }
    public Note setNote(Note note) { 
         this.note = note 
    }
    Note note;

}

public class Issue
{
    @JsonProperty("severity")
    public String getSeverity() { 
         return this.severity 
    }
    public String setSeverity(String severity) { 
         this.severity = severity 
    }
    String severity;

    @JsonProperty("code")
    public String getCode() { 
         return this.code 
    }
    public String setCode(String code) { 
         this.code = code 
    }
    String code;

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

    @JsonProperty("recordedDate")
    public Date getRecordedDate() { 
         return this.recordedDate 
    }
    public Date setRecordedDate(Date recordedDate) { 
         this.recordedDate = recordedDate 
    }
    Date recordedDate;

    @JsonProperty("status")
    public String getStatus() { 
         return this.status 
    }
    public String setStatus(String status) { 
         this.status = status 
    }
    String status;

    @JsonProperty("criticality")
    public String getCriticality() { 
         return this.criticality 
    }
    public String setCriticality(String criticality) { 
         this.criticality = criticality 
    }
    String criticality;

    @JsonProperty("onset")
    public Date getOnset() { 
         return this.onset 
    }
    public Date setOnset(Date onset) { 
         this.onset = onset 
    }
    Date onset;

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

    @JsonProperty("substance")
    public Substance getSubstance() { 
         return this.substance 
    }
    public Substance setSubstance(Substance substance) { 
         this.substance = substance 
    }
    Substance substance;

    @JsonProperty("reaction")
    public List<Reaction> getReaction() { 
         return this.reaction 
    }
    public List<Reaction> setReaction(List<Reaction> reaction) { 
         this.reaction = reaction 
    }
    List<Reaction> reaction;

    @JsonProperty("note")
    public  getNote() { 
         return this.note 
    }
    public  setNote( note) { 
         this.note = note 
    }
     note;

    @JsonProperty("issue")
    public List<Issue> getIssue() { 
         return this.issue 
    }
    public List<Issue> setIssue(List<Issue> issue) { 
         this.issue = issue 
    }
    List<Issue> issue;

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
