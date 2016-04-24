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
        "type",
        "total",
        "link",
        "entry"
})
public class Allergy {

    @JsonProperty("resourceType")
    private String resourceType;
    @JsonProperty("type")
    private String type;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("link")
    private List<Link> link = new ArrayList<Link>();
    @JsonProperty("entry")
    private List<Entry> entry = new ArrayList<Entry>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Allergy() {
    }

    /**
     *
     * @param total
     * @param entry
     * @param link
     * @param type
     * @param resourceType
     */
    public Allergy(String resourceType, String type, Integer total, List<Link> link, List<Entry> entry) {
        this.resourceType = resourceType;
        this.type = type;
        this.total = total;
        this.link = link;
        this.entry = entry;
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

    public Allergy withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *
     * @return
     * The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Allergy withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     * The total
     */
    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    /**
     *
     * @param total
     * The total
     */
    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Allergy withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     *
     * @return
     * The link
     */
    @JsonProperty("link")
    public List<Link> getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    @JsonProperty("link")
    public void setLink(List<Link> link) {
        this.link = link;
    }

    public Allergy withLink(List<Link> link) {
        this.link = link;
        return this;
    }

    /**
     *
     * @return
     * The entry
     */
    @JsonProperty("entry")
    public List<Entry> getEntry() {
        return entry;
    }

    /**
     *
     * @param entry
     * The entry
     */
    @JsonProperty("entry")
    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

    public Allergy withEntry(List<Entry> entry) {
        this.entry = entry;
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

    public Allergy withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}