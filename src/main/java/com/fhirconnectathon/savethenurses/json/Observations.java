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

public class ValueQuantity
{
    @JsonProperty("value")
    public double getValue() { 
         return this.value 
    }
    public double setValue(double value) { 
         this.value = value 
    }
    double value;

    @JsonProperty("unit")
    public String getUnit() { 
         return this.unit 
    }
    public String setUnit(String unit) { 
         this.unit = unit 
    }
    String unit;

    @JsonProperty("code")
    public String getCode() { 
         return this.code 
    }
    public String setCode(String code) { 
         this.code = code 
    }
    String code;

    @JsonProperty("system")
    public String getSystem() { 
         return this.system 
    }
    public String setSystem(String system) { 
         this.system = system 
    }
    String system;

}

public class Subject
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

    @JsonProperty("effectiveDateTime")
    public Date getEffectiveDateTime() { 
         return this.effectiveDateTime 
    }
    public Date setEffectiveDateTime(Date effectiveDateTime) { 
         this.effectiveDateTime = effectiveDateTime 
    }
    Date effectiveDateTime;

    @JsonProperty("status")
    public String getStatus() { 
         return this.status 
    }
    public String setStatus(String status) { 
         this.status = status 
    }
    String status;

    @JsonProperty("id")
    public String getId() { 
         return this.id 
    }
    public String setId(String id) { 
         this.id = id 
    }
    String id;

    @JsonProperty("code")
    public Code getCode() { 
         return this.code 
    }
    public Code setCode(Code code) { 
         this.code = code 
    }
    Code code;

    @JsonProperty("valueQuantity")
    public ValueQuantity getValueQuantity() { 
         return this.valueQuantity 
    }
    public ValueQuantity setValueQuantity(ValueQuantity valueQuantity) { 
         this.valueQuantity = valueQuantity 
    }
    ValueQuantity valueQuantity;

    @JsonProperty("subject")
    public Subject getSubject() { 
         return this.subject 
    }
    public Subject setSubject(Subject subject) { 
         this.subject = subject 
    }
    Subject subject;

}

public class Entry
{
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
