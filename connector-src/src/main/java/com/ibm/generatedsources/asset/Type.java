
package com.ibm.generatedsources.asset;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Type {

    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("elementCreatedBy")
    @Expose
    private String elementCreatedBy;
    @SerializedName("elementCreateTime")
    @Expose
    private String elementCreateTime;
    @SerializedName("elementMetadataCollectionId")
    @Expose
    private String elementMetadataCollectionId;
    @SerializedName("elementMetadataCollectionName")
    @Expose
    private String elementMetadataCollectionName;
    @SerializedName("elementOrigin")
    @Expose
    private String elementOrigin;
    @SerializedName("elementSourceServer")
    @Expose
    private String elementSourceServer;
    @SerializedName("elementSuperTypeNames")
    @Expose
    private List<String> elementSuperTypeNames = new ArrayList<String>();
    @SerializedName("elementTypeDescription")
    @Expose
    private String elementTypeDescription;
    @SerializedName("elementTypeId")
    @Expose
    private String elementTypeId;
    @SerializedName("elementTypeName")
    @Expose
    private String elementTypeName;
    @SerializedName("elementTypeVersion")
    @Expose
    private long elementTypeVersion;
    @SerializedName("elementUpdatedBy")
    @Expose
    private String elementUpdatedBy;
    @SerializedName("elementUpdateTime")
    @Expose
    private String elementUpdateTime;
    @SerializedName("elementVersion")
    @Expose
    private long elementVersion;
    @SerializedName("headerVersion")
    @Expose
    private long headerVersion;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Type() {
    }

    /**
     * 
     * @param elementCreatedBy
     * @param elementCreateTime
     * @param elementSourceServer
     * @param elementTypeDescription
     * @param elementVersion
     * @param elementTypeName
     * @param elementMetadataCollectionId
     * @param elementTypeVersion
     * @param elementUpdateTime
     * @param elementMetadataCollectionName
     * @param headerVersion
     * @param elementTypeId
     * @param _class
     * @param elementUpdatedBy
     * @param elementSuperTypeNames
     * @param elementOrigin
     * @param status
     */
    public Type(String _class, String elementCreatedBy, String elementCreateTime, String elementMetadataCollectionId, String elementMetadataCollectionName, String elementOrigin, String elementSourceServer, List<String> elementSuperTypeNames, String elementTypeDescription, String elementTypeId, String elementTypeName, long elementTypeVersion, String elementUpdatedBy, String elementUpdateTime, long elementVersion, long headerVersion, String status) {
        super();
        this._class = _class;
        this.elementCreatedBy = elementCreatedBy;
        this.elementCreateTime = elementCreateTime;
        this.elementMetadataCollectionId = elementMetadataCollectionId;
        this.elementMetadataCollectionName = elementMetadataCollectionName;
        this.elementOrigin = elementOrigin;
        this.elementSourceServer = elementSourceServer;
        this.elementSuperTypeNames = elementSuperTypeNames;
        this.elementTypeDescription = elementTypeDescription;
        this.elementTypeId = elementTypeId;
        this.elementTypeName = elementTypeName;
        this.elementTypeVersion = elementTypeVersion;
        this.elementUpdatedBy = elementUpdatedBy;
        this.elementUpdateTime = elementUpdateTime;
        this.elementVersion = elementVersion;
        this.headerVersion = headerVersion;
        this.status = status;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public Type withClass(String _class) {
        this._class = _class;
        return this;
    }

    public String getElementCreatedBy() {
        return elementCreatedBy;
    }

    public void setElementCreatedBy(String elementCreatedBy) {
        this.elementCreatedBy = elementCreatedBy;
    }

    public Type withElementCreatedBy(String elementCreatedBy) {
        this.elementCreatedBy = elementCreatedBy;
        return this;
    }

    public String getElementCreateTime() {
        return elementCreateTime;
    }

    public void setElementCreateTime(String elementCreateTime) {
        this.elementCreateTime = elementCreateTime;
    }

    public Type withElementCreateTime(String elementCreateTime) {
        this.elementCreateTime = elementCreateTime;
        return this;
    }

    public String getElementMetadataCollectionId() {
        return elementMetadataCollectionId;
    }

    public void setElementMetadataCollectionId(String elementMetadataCollectionId) {
        this.elementMetadataCollectionId = elementMetadataCollectionId;
    }

    public Type withElementMetadataCollectionId(String elementMetadataCollectionId) {
        this.elementMetadataCollectionId = elementMetadataCollectionId;
        return this;
    }

    public String getElementMetadataCollectionName() {
        return elementMetadataCollectionName;
    }

    public void setElementMetadataCollectionName(String elementMetadataCollectionName) {
        this.elementMetadataCollectionName = elementMetadataCollectionName;
    }

    public Type withElementMetadataCollectionName(String elementMetadataCollectionName) {
        this.elementMetadataCollectionName = elementMetadataCollectionName;
        return this;
    }

    public String getElementOrigin() {
        return elementOrigin;
    }

    public void setElementOrigin(String elementOrigin) {
        this.elementOrigin = elementOrigin;
    }

    public Type withElementOrigin(String elementOrigin) {
        this.elementOrigin = elementOrigin;
        return this;
    }

    public String getElementSourceServer() {
        return elementSourceServer;
    }

    public void setElementSourceServer(String elementSourceServer) {
        this.elementSourceServer = elementSourceServer;
    }

    public Type withElementSourceServer(String elementSourceServer) {
        this.elementSourceServer = elementSourceServer;
        return this;
    }

    public List<String> getElementSuperTypeNames() {
        return elementSuperTypeNames;
    }

    public void setElementSuperTypeNames(List<String> elementSuperTypeNames) {
        this.elementSuperTypeNames = elementSuperTypeNames;
    }

    public Type withElementSuperTypeNames(List<String> elementSuperTypeNames) {
        this.elementSuperTypeNames = elementSuperTypeNames;
        return this;
    }

    public String getElementTypeDescription() {
        return elementTypeDescription;
    }

    public void setElementTypeDescription(String elementTypeDescription) {
        this.elementTypeDescription = elementTypeDescription;
    }

    public Type withElementTypeDescription(String elementTypeDescription) {
        this.elementTypeDescription = elementTypeDescription;
        return this;
    }

    public String getElementTypeId() {
        return elementTypeId;
    }

    public void setElementTypeId(String elementTypeId) {
        this.elementTypeId = elementTypeId;
    }

    public Type withElementTypeId(String elementTypeId) {
        this.elementTypeId = elementTypeId;
        return this;
    }

    public String getElementTypeName() {
        return elementTypeName;
    }

    public void setElementTypeName(String elementTypeName) {
        this.elementTypeName = elementTypeName;
    }

    public Type withElementTypeName(String elementTypeName) {
        this.elementTypeName = elementTypeName;
        return this;
    }

    public long getElementTypeVersion() {
        return elementTypeVersion;
    }

    public void setElementTypeVersion(long elementTypeVersion) {
        this.elementTypeVersion = elementTypeVersion;
    }

    public Type withElementTypeVersion(long elementTypeVersion) {
        this.elementTypeVersion = elementTypeVersion;
        return this;
    }

    public String getElementUpdatedBy() {
        return elementUpdatedBy;
    }

    public void setElementUpdatedBy(String elementUpdatedBy) {
        this.elementUpdatedBy = elementUpdatedBy;
    }

    public Type withElementUpdatedBy(String elementUpdatedBy) {
        this.elementUpdatedBy = elementUpdatedBy;
        return this;
    }

    public String getElementUpdateTime() {
        return elementUpdateTime;
    }

    public void setElementUpdateTime(String elementUpdateTime) {
        this.elementUpdateTime = elementUpdateTime;
    }

    public Type withElementUpdateTime(String elementUpdateTime) {
        this.elementUpdateTime = elementUpdateTime;
        return this;
    }

    public long getElementVersion() {
        return elementVersion;
    }

    public void setElementVersion(long elementVersion) {
        this.elementVersion = elementVersion;
    }

    public Type withElementVersion(long elementVersion) {
        this.elementVersion = elementVersion;
        return this;
    }

    public long getHeaderVersion() {
        return headerVersion;
    }

    public void setHeaderVersion(long headerVersion) {
        this.headerVersion = headerVersion;
    }

    public Type withHeaderVersion(long headerVersion) {
        this.headerVersion = headerVersion;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Type withStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Type.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_class");
        sb.append('=');
        sb.append(((this._class == null)?"<null>":this._class));
        sb.append(',');
        sb.append("elementCreatedBy");
        sb.append('=');
        sb.append(((this.elementCreatedBy == null)?"<null>":this.elementCreatedBy));
        sb.append(',');
        sb.append("elementCreateTime");
        sb.append('=');
        sb.append(((this.elementCreateTime == null)?"<null>":this.elementCreateTime));
        sb.append(',');
        sb.append("elementMetadataCollectionId");
        sb.append('=');
        sb.append(((this.elementMetadataCollectionId == null)?"<null>":this.elementMetadataCollectionId));
        sb.append(',');
        sb.append("elementMetadataCollectionName");
        sb.append('=');
        sb.append(((this.elementMetadataCollectionName == null)?"<null>":this.elementMetadataCollectionName));
        sb.append(',');
        sb.append("elementOrigin");
        sb.append('=');
        sb.append(((this.elementOrigin == null)?"<null>":this.elementOrigin));
        sb.append(',');
        sb.append("elementSourceServer");
        sb.append('=');
        sb.append(((this.elementSourceServer == null)?"<null>":this.elementSourceServer));
        sb.append(',');
        sb.append("elementSuperTypeNames");
        sb.append('=');
        sb.append(((this.elementSuperTypeNames == null)?"<null>":this.elementSuperTypeNames));
        sb.append(',');
        sb.append("elementTypeDescription");
        sb.append('=');
        sb.append(((this.elementTypeDescription == null)?"<null>":this.elementTypeDescription));
        sb.append(',');
        sb.append("elementTypeId");
        sb.append('=');
        sb.append(((this.elementTypeId == null)?"<null>":this.elementTypeId));
        sb.append(',');
        sb.append("elementTypeName");
        sb.append('=');
        sb.append(((this.elementTypeName == null)?"<null>":this.elementTypeName));
        sb.append(',');
        sb.append("elementTypeVersion");
        sb.append('=');
        sb.append(this.elementTypeVersion);
        sb.append(',');
        sb.append("elementUpdatedBy");
        sb.append('=');
        sb.append(((this.elementUpdatedBy == null)?"<null>":this.elementUpdatedBy));
        sb.append(',');
        sb.append("elementUpdateTime");
        sb.append('=');
        sb.append(((this.elementUpdateTime == null)?"<null>":this.elementUpdateTime));
        sb.append(',');
        sb.append("elementVersion");
        sb.append('=');
        sb.append(this.elementVersion);
        sb.append(',');
        sb.append("headerVersion");
        sb.append('=');
        sb.append(this.headerVersion);
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.elementCreatedBy == null)? 0 :this.elementCreatedBy.hashCode()));
        result = ((result* 31)+((this.elementCreateTime == null)? 0 :this.elementCreateTime.hashCode()));
        result = ((result* 31)+((this.elementSourceServer == null)? 0 :this.elementSourceServer.hashCode()));
        result = ((result* 31)+((this.elementTypeDescription == null)? 0 :this.elementTypeDescription.hashCode()));
        result = ((result* 31)+((int)(this.elementVersion^(this.elementVersion >>> 32))));
        result = ((result* 31)+((this.elementTypeName == null)? 0 :this.elementTypeName.hashCode()));
        result = ((result* 31)+((this.elementMetadataCollectionId == null)? 0 :this.elementMetadataCollectionId.hashCode()));
        result = ((result* 31)+((int)(this.elementTypeVersion^(this.elementTypeVersion >>> 32))));
        result = ((result* 31)+((this.elementUpdateTime == null)? 0 :this.elementUpdateTime.hashCode()));
        result = ((result* 31)+((this.elementMetadataCollectionName == null)? 0 :this.elementMetadataCollectionName.hashCode()));
        result = ((result* 31)+((int)(this.headerVersion^(this.headerVersion >>> 32))));
        result = ((result* 31)+((this.elementTypeId == null)? 0 :this.elementTypeId.hashCode()));
        result = ((result* 31)+((this._class == null)? 0 :this._class.hashCode()));
        result = ((result* 31)+((this.elementUpdatedBy == null)? 0 :this.elementUpdatedBy.hashCode()));
        result = ((result* 31)+((this.elementSuperTypeNames == null)? 0 :this.elementSuperTypeNames.hashCode()));
        result = ((result* 31)+((this.elementOrigin == null)? 0 :this.elementOrigin.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type) == false) {
            return false;
        }
        Type rhs = ((Type) other);
        return ((((((((((((((((((this.elementCreatedBy == rhs.elementCreatedBy)||((this.elementCreatedBy!= null)&&this.elementCreatedBy.equals(rhs.elementCreatedBy)))&&((this.elementCreateTime == rhs.elementCreateTime)||((this.elementCreateTime!= null)&&this.elementCreateTime.equals(rhs.elementCreateTime))))&&((this.elementSourceServer == rhs.elementSourceServer)||((this.elementSourceServer!= null)&&this.elementSourceServer.equals(rhs.elementSourceServer))))&&((this.elementTypeDescription == rhs.elementTypeDescription)||((this.elementTypeDescription!= null)&&this.elementTypeDescription.equals(rhs.elementTypeDescription))))&&(this.elementVersion == rhs.elementVersion))&&((this.elementTypeName == rhs.elementTypeName)||((this.elementTypeName!= null)&&this.elementTypeName.equals(rhs.elementTypeName))))&&((this.elementMetadataCollectionId == rhs.elementMetadataCollectionId)||((this.elementMetadataCollectionId!= null)&&this.elementMetadataCollectionId.equals(rhs.elementMetadataCollectionId))))&&(this.elementTypeVersion == rhs.elementTypeVersion))&&((this.elementUpdateTime == rhs.elementUpdateTime)||((this.elementUpdateTime!= null)&&this.elementUpdateTime.equals(rhs.elementUpdateTime))))&&((this.elementMetadataCollectionName == rhs.elementMetadataCollectionName)||((this.elementMetadataCollectionName!= null)&&this.elementMetadataCollectionName.equals(rhs.elementMetadataCollectionName))))&&(this.headerVersion == rhs.headerVersion))&&((this.elementTypeId == rhs.elementTypeId)||((this.elementTypeId!= null)&&this.elementTypeId.equals(rhs.elementTypeId))))&&((this._class == rhs._class)||((this._class!= null)&&this._class.equals(rhs._class))))&&((this.elementUpdatedBy == rhs.elementUpdatedBy)||((this.elementUpdatedBy!= null)&&this.elementUpdatedBy.equals(rhs.elementUpdatedBy))))&&((this.elementSuperTypeNames == rhs.elementSuperTypeNames)||((this.elementSuperTypeNames!= null)&&this.elementSuperTypeNames.equals(rhs.elementSuperTypeNames))))&&((this.elementOrigin == rhs.elementOrigin)||((this.elementOrigin!= null)&&this.elementOrigin.equals(rhs.elementOrigin))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
