
package com.ibm.generatedsources.asset;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Asset {

    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("classifications")
    @Expose
    private List<Classification> classifications = new ArrayList<Classification>();
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("extendedProperties")
    @Expose
    private ExtendedProperties extendedProperties;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("headerVersion")
    @Expose
    private long headerVersion;
    @SerializedName("ownerType")
    @Expose
    private String ownerType;
    @SerializedName("qualifiedName")
    @Expose
    private String qualifiedName;
    @SerializedName("referenceData")
    @Expose
    private boolean referenceData;
    @SerializedName("type")
    @Expose
    private Type type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Asset() {
    }

    /**
     * 
     * @param ownerType
     * @param referenceData
     * @param classifications
     * @param extendedProperties
     * @param displayName
     * @param qualifiedName
     * @param headerVersion
     * @param description
     * @param guid
     * @param _class
     * @param type
     */
    public Asset(String _class, List<Classification> classifications, String description, String displayName, ExtendedProperties extendedProperties, String guid, long headerVersion, String ownerType, String qualifiedName, boolean referenceData, Type type) {
        super();
        this._class = _class;
        this.classifications = classifications;
        this.description = description;
        this.displayName = displayName;
        this.extendedProperties = extendedProperties;
        this.guid = guid;
        this.headerVersion = headerVersion;
        this.ownerType = ownerType;
        this.qualifiedName = qualifiedName;
        this.referenceData = referenceData;
        this.type = type;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public Asset withClass(String _class) {
        this._class = _class;
        return this;
    }

    public List<Classification> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<Classification> classifications) {
        this.classifications = classifications;
    }

    public Asset withClassifications(List<Classification> classifications) {
        this.classifications = classifications;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Asset withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Asset withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public ExtendedProperties getExtendedProperties() {
        return extendedProperties;
    }

    public void setExtendedProperties(ExtendedProperties extendedProperties) {
        this.extendedProperties = extendedProperties;
    }

    public Asset withExtendedProperties(ExtendedProperties extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Asset withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    public long getHeaderVersion() {
        return headerVersion;
    }

    public void setHeaderVersion(long headerVersion) {
        this.headerVersion = headerVersion;
    }

    public Asset withHeaderVersion(long headerVersion) {
        this.headerVersion = headerVersion;
        return this;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public Asset withOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public Asset withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    public boolean isReferenceData() {
        return referenceData;
    }

    public void setReferenceData(boolean referenceData) {
        this.referenceData = referenceData;
    }

    public Asset withReferenceData(boolean referenceData) {
        this.referenceData = referenceData;
        return this;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Asset withType(Type type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Asset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_class");
        sb.append('=');
        sb.append(((this._class == null)?"<null>":this._class));
        sb.append(',');
        sb.append("classifications");
        sb.append('=');
        sb.append(((this.classifications == null)?"<null>":this.classifications));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("extendedProperties");
        sb.append('=');
        sb.append(((this.extendedProperties == null)?"<null>":this.extendedProperties));
        sb.append(',');
        sb.append("guid");
        sb.append('=');
        sb.append(((this.guid == null)?"<null>":this.guid));
        sb.append(',');
        sb.append("headerVersion");
        sb.append('=');
        sb.append(this.headerVersion);
        sb.append(',');
        sb.append("ownerType");
        sb.append('=');
        sb.append(((this.ownerType == null)?"<null>":this.ownerType));
        sb.append(',');
        sb.append("qualifiedName");
        sb.append('=');
        sb.append(((this.qualifiedName == null)?"<null>":this.qualifiedName));
        sb.append(',');
        sb.append("referenceData");
        sb.append('=');
        sb.append(this.referenceData);
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.ownerType == null)? 0 :this.ownerType.hashCode()));
        result = ((result* 31)+(this.referenceData? 1 : 0));
        result = ((result* 31)+((this.classifications == null)? 0 :this.classifications.hashCode()));
        result = ((result* 31)+((this.extendedProperties == null)? 0 :this.extendedProperties.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.qualifiedName == null)? 0 :this.qualifiedName.hashCode()));
        result = ((result* 31)+((int)(this.headerVersion^(this.headerVersion >>> 32))));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.guid == null)? 0 :this.guid.hashCode()));
        result = ((result* 31)+((this._class == null)? 0 :this._class.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Asset) == false) {
            return false;
        }
        Asset rhs = ((Asset) other);
        return ((((((((((((this.ownerType == rhs.ownerType)||((this.ownerType!= null)&&this.ownerType.equals(rhs.ownerType)))&&(this.referenceData == rhs.referenceData))&&((this.classifications == rhs.classifications)||((this.classifications!= null)&&this.classifications.equals(rhs.classifications))))&&((this.extendedProperties == rhs.extendedProperties)||((this.extendedProperties!= null)&&this.extendedProperties.equals(rhs.extendedProperties))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.qualifiedName == rhs.qualifiedName)||((this.qualifiedName!= null)&&this.qualifiedName.equals(rhs.qualifiedName))))&&(this.headerVersion == rhs.headerVersion))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.guid == rhs.guid)||((this.guid!= null)&&this.guid.equals(rhs.guid))))&&((this._class == rhs._class)||((this._class!= null)&&this._class.equals(rhs._class))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
