
package com.ibm.generatedsources.asset;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SchemaType {

    @SerializedName("attributeCount")
    @Expose
    private long attributeCount;
    @SerializedName("calculatedValue")
    @Expose
    private boolean calculatedValue;
    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("classifications")
    @Expose
    private List<Classification__1> classifications = new ArrayList<Classification__1>();
    @SerializedName("extendedProperties")
    @Expose
    private ExtendedProperties__1 extendedProperties;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("headerVersion")
    @Expose
    private long headerVersion;
    @SerializedName("isDeprecated")
    @Expose
    private boolean isDeprecated;
    @SerializedName("type")
    @Expose
    private Type__1 type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SchemaType() {
    }

    /**
     * 
     * @param classifications
     * @param extendedProperties
     * @param isDeprecated
     * @param headerVersion
     * @param attributeCount
     * @param guid
     * @param calculatedValue
     * @param _class
     * @param type
     */
    public SchemaType(long attributeCount, boolean calculatedValue, String _class, List<Classification__1> classifications, ExtendedProperties__1 extendedProperties, String guid, long headerVersion, boolean isDeprecated, Type__1 type) {
        super();
        this.attributeCount = attributeCount;
        this.calculatedValue = calculatedValue;
        this._class = _class;
        this.classifications = classifications;
        this.extendedProperties = extendedProperties;
        this.guid = guid;
        this.headerVersion = headerVersion;
        this.isDeprecated = isDeprecated;
        this.type = type;
    }

    public long getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(long attributeCount) {
        this.attributeCount = attributeCount;
    }

    public SchemaType withAttributeCount(long attributeCount) {
        this.attributeCount = attributeCount;
        return this;
    }

    public boolean isCalculatedValue() {
        return calculatedValue;
    }

    public void setCalculatedValue(boolean calculatedValue) {
        this.calculatedValue = calculatedValue;
    }

    public SchemaType withCalculatedValue(boolean calculatedValue) {
        this.calculatedValue = calculatedValue;
        return this;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public SchemaType withClass(String _class) {
        this._class = _class;
        return this;
    }

    public List<Classification__1> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<Classification__1> classifications) {
        this.classifications = classifications;
    }

    public SchemaType withClassifications(List<Classification__1> classifications) {
        this.classifications = classifications;
        return this;
    }

    public ExtendedProperties__1 getExtendedProperties() {
        return extendedProperties;
    }

    public void setExtendedProperties(ExtendedProperties__1 extendedProperties) {
        this.extendedProperties = extendedProperties;
    }

    public SchemaType withExtendedProperties(ExtendedProperties__1 extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public SchemaType withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    public long getHeaderVersion() {
        return headerVersion;
    }

    public void setHeaderVersion(long headerVersion) {
        this.headerVersion = headerVersion;
    }

    public SchemaType withHeaderVersion(long headerVersion) {
        this.headerVersion = headerVersion;
        return this;
    }

    public boolean isIsDeprecated() {
        return isDeprecated;
    }

    public void setIsDeprecated(boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    public SchemaType withIsDeprecated(boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
        return this;
    }

    public Type__1 getType() {
        return type;
    }

    public void setType(Type__1 type) {
        this.type = type;
    }

    public SchemaType withType(Type__1 type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SchemaType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attributeCount");
        sb.append('=');
        sb.append(this.attributeCount);
        sb.append(',');
        sb.append("calculatedValue");
        sb.append('=');
        sb.append(this.calculatedValue);
        sb.append(',');
        sb.append("_class");
        sb.append('=');
        sb.append(((this._class == null)?"<null>":this._class));
        sb.append(',');
        sb.append("classifications");
        sb.append('=');
        sb.append(((this.classifications == null)?"<null>":this.classifications));
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
        sb.append("isDeprecated");
        sb.append('=');
        sb.append(this.isDeprecated);
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
        result = ((result* 31)+((this.classifications == null)? 0 :this.classifications.hashCode()));
        result = ((result* 31)+((this.extendedProperties == null)? 0 :this.extendedProperties.hashCode()));
        result = ((result* 31)+(this.isDeprecated? 1 : 0));
        result = ((result* 31)+((int)(this.headerVersion^(this.headerVersion >>> 32))));
        result = ((result* 31)+((int)(this.attributeCount^(this.attributeCount >>> 32))));
        result = ((result* 31)+((this.guid == null)? 0 :this.guid.hashCode()));
        result = ((result* 31)+(this.calculatedValue? 1 : 0));
        result = ((result* 31)+((this._class == null)? 0 :this._class.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchemaType) == false) {
            return false;
        }
        SchemaType rhs = ((SchemaType) other);
        return ((((((((((this.classifications == rhs.classifications)||((this.classifications!= null)&&this.classifications.equals(rhs.classifications)))&&((this.extendedProperties == rhs.extendedProperties)||((this.extendedProperties!= null)&&this.extendedProperties.equals(rhs.extendedProperties))))&&(this.isDeprecated == rhs.isDeprecated))&&(this.headerVersion == rhs.headerVersion))&&(this.attributeCount == rhs.attributeCount))&&((this.guid == rhs.guid)||((this.guid!= null)&&this.guid.equals(rhs.guid))))&&(this.calculatedValue == rhs.calculatedValue))&&((this._class == rhs._class)||((this._class!= null)&&this._class.equals(rhs._class))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
