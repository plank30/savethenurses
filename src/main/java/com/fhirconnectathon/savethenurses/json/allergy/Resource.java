
package com.fhirconnectathon.savethenurses.json.allergy;

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
        "issue"
})
public class Resource {

    @JsonProperty("resourceType")
    private String resourceType;
    @JsonProperty("issue")
    private List<Issue> issue = new ArrayList<Issue>();
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
     * @param issue
     * @param resourceType
     */
    public Resource(String resourceType, List<Issue> issue) {
        this.resourceType = resourceType;
        this.issue = issue;
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

    public Resource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *
     * @return
     * The issue
     */
    @JsonProperty("issue")
    public List<Issue> getIssue() {
        return issue;
    }

    /**
     *
     * @param issue
     * The issue
     */
    @JsonProperty("issue")
    public void setIssue(List<Issue> issue) {
        this.issue = issue;
    }

    public Resource withIssue(List<Issue> issue) {
        this.issue = issue;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Resource withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}