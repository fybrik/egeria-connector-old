
package com.ibm.generatedsources.asset;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Classification__1 {

    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("classificationName")
    @Expose
    private String classificationName;
    @SerializedName("classificationOrigin")
    @Expose
    private String classificationOrigin;
    @SerializedName("classificationProperties")
    @Expose
    private ClassificationProperties__1 classificationProperties;
    @SerializedName("classificationTypeVersion")
    @Expose
    private long classificationTypeVersion;
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
    public Classification__1() {
    }

    /**
     * 
     * @param classificationTypeVersion
     * @param elementCreatedBy
     * @param elementCreateTime
     * @param classificationProperties
     * @param elementSourceServer
     * @param elementVersion
     * @param elementMetadataCollectionId
     * @param classificationName
     * @param elementMetadataCollectionName
     * @param headerVersion
     * @param _class
     * @param classificationOrigin
     * @param elementOrigin
     * @param status
     */
    public Classification__1(String _class, String classificationName, String classificationOrigin, ClassificationProperties__1 classificationProperties, long classificationTypeVersion, String elementCreatedBy, String elementCreateTime, String elementMetadataCollectionId, String elementMetadataCollectionName, String elementOrigin, String elementSourceServer, long elementVersion, long headerVersion, String status) {
        super();
        this._class = _class;
        this.classificationName = classificationName;
        this.classificationOrigin = classificationOrigin;
        this.classificationProperties = classificationProperties;
        this.classificationTypeVersion = classificationTypeVersion;
        this.elementCreatedBy = elementCreatedBy;
        this.elementCreateTime = elementCreateTime;
        this.elementMetadataCollectionId = elementMetadataCollectionId;
        this.elementMetadataCollectionName = elementMetadataCollectionName;
        this.elementOrigin = elementOrigin;
        this.elementSourceServer = elementSourceServer;
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

    public Classification__1 withClass(String _class) {
        this._class = _class;
        return this;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public Classification__1 withClassificationName(String classificationName) {
        this.classificationName = classificationName;
        return this;
    }

    public String getClassificationOrigin() {
        return classificationOrigin;
    }

    public void setClassificationOrigin(String classificationOrigin) {
        this.classificationOrigin = classificationOrigin;
    }

    public Classification__1 withClassificationOrigin(String classificationOrigin) {
        this.classificationOrigin = classificationOrigin;
        return this;
    }

    public ClassificationProperties__1 getClassificationProperties() {
        return classificationProperties;
    }

    public void setClassificationProperties(ClassificationProperties__1 classificationProperties) {
        this.classificationProperties = classificationProperties;
    }

    public Classification__1 withClassificationProperties(ClassificationProperties__1 classificationProperties) {
        this.classificationProperties = classificationProperties;
        return this;
    }

    public long getClassificationTypeVersion() {
        return classificationTypeVersion;
    }

    public void setClassificationTypeVersion(long classificationTypeVersion) {
        this.classificationTypeVersion = classificationTypeVersion;
    }

    public Classification__1 withClassificationTypeVersion(long classificationTypeVersion) {
        this.classificationTypeVersion = classificationTypeVersion;
        return this;
    }

    public String getElementCreatedBy() {
        return elementCreatedBy;
    }

    public void setElementCreatedBy(String elementCreatedBy) {
        this.elementCreatedBy = elementCreatedBy;
    }

    public Classification__1 withElementCreatedBy(String elementCreatedBy) {
        this.elementCreatedBy = elementCreatedBy;
        return this;
    }

    public String getElementCreateTime() {
        return elementCreateTime;
    }

    public void setElementCreateTime(String elementCreateTime) {
        this.elementCreateTime = elementCreateTime;
    }

    public Classification__1 withElementCreateTime(String elementCreateTime) {
        this.elementCreateTime = elementCreateTime;
        return this;
    }

    public String getElementMetadataCollectionId() {
        return elementMetadataCollectionId;
    }

    public void setElementMetadataCollectionId(String elementMetadataCollectionId) {
        this.elementMetadataCollectionId = elementMetadataCollectionId;
    }

    public Classification__1 withElementMetadataCollectionId(String elementMetadataCollectionId) {
        this.elementMetadataCollectionId = elementMetadataCollectionId;
        return this;
    }

    public String getElementMetadataCollectionName() {
        return elementMetadataCollectionName;
    }

    public void setElementMetadataCollectionName(String elementMetadataCollectionName) {
        this.elementMetadataCollectionName = elementMetadataCollectionName;
    }

    public Classification__1 withElementMetadataCollectionName(String elementMetadataCollectionName) {
        this.elementMetadataCollectionName = elementMetadataCollectionName;
        return this;
    }

    public String getElementOrigin() {
        return elementOrigin;
    }

    public void setElementOrigin(String elementOrigin) {
        this.elementOrigin = elementOrigin;
    }

    public Classification__1 withElementOrigin(String elementOrigin) {
        this.elementOrigin = elementOrigin;
        return this;
    }

    public String getElementSourceServer() {
        return elementSourceServer;
    }

    public void setElementSourceServer(String elementSourceServer) {
        this.elementSourceServer = elementSourceServer;
    }

    public Classification__1 withElementSourceServer(String elementSourceServer) {
        this.elementSourceServer = elementSourceServer;
        return this;
    }

    public long getElementVersion() {
        return elementVersion;
    }

    public void setElementVersion(long elementVersion) {
        this.elementVersion = elementVersion;
    }

    public Classification__1 withElementVersion(long elementVersion) {
        this.elementVersion = elementVersion;
        return this;
    }

    public long getHeaderVersion() {
        return headerVersion;
    }

    public void setHeaderVersion(long headerVersion) {
        this.headerVersion = headerVersion;
    }

    public Classification__1 withHeaderVersion(long headerVersion) {
        this.headerVersion = headerVersion;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Classification__1 withStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Classification__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_class");
        sb.append('=');
        sb.append(((this._class == null)?"<null>":this._class));
        sb.append(',');
        sb.append("classificationName");
        sb.append('=');
        sb.append(((this.classificationName == null)?"<null>":this.classificationName));
        sb.append(',');
        sb.append("classificationOrigin");
        sb.append('=');
        sb.append(((this.classificationOrigin == null)?"<null>":this.classificationOrigin));
        sb.append(',');
        sb.append("classificationProperties");
        sb.append('=');
        sb.append(((this.classificationProperties == null)?"<null>":this.classificationProperties));
        sb.append(',');
        sb.append("classificationTypeVersion");
        sb.append('=');
        sb.append(this.classificationTypeVersion);
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
        result = ((result* 31)+((int)(this.classificationTypeVersion^(this.classificationTypeVersion >>> 32))));
        result = ((result* 31)+((this.elementCreatedBy == null)? 0 :this.elementCreatedBy.hashCode()));
        result = ((result* 31)+((this.elementCreateTime == null)? 0 :this.elementCreateTime.hashCode()));
        result = ((result* 31)+((this.classificationProperties == null)? 0 :this.classificationProperties.hashCode()));
        result = ((result* 31)+((this.elementSourceServer == null)? 0 :this.elementSourceServer.hashCode()));
        result = ((result* 31)+((int)(this.elementVersion^(this.elementVersion >>> 32))));
        result = ((result* 31)+((this.elementMetadataCollectionId == null)? 0 :this.elementMetadataCollectionId.hashCode()));
        result = ((result* 31)+((this.classificationName == null)? 0 :this.classificationName.hashCode()));
        result = ((result* 31)+((this.elementMetadataCollectionName == null)? 0 :this.elementMetadataCollectionName.hashCode()));
        result = ((result* 31)+((int)(this.headerVersion^(this.headerVersion >>> 32))));
        result = ((result* 31)+((this._class == null)? 0 :this._class.hashCode()));
        result = ((result* 31)+((this.classificationOrigin == null)? 0 :this.classificationOrigin.hashCode()));
        result = ((result* 31)+((this.elementOrigin == null)? 0 :this.elementOrigin.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Classification__1) == false) {
            return false;
        }
        Classification__1 rhs = ((Classification__1) other);
        return ((((((((((((((this.classificationTypeVersion == rhs.classificationTypeVersion)&&((this.elementCreatedBy == rhs.elementCreatedBy)||((this.elementCreatedBy!= null)&&this.elementCreatedBy.equals(rhs.elementCreatedBy))))&&((this.elementCreateTime == rhs.elementCreateTime)||((this.elementCreateTime!= null)&&this.elementCreateTime.equals(rhs.elementCreateTime))))&&((this.classificationProperties == rhs.classificationProperties)||((this.classificationProperties!= null)&&this.classificationProperties.equals(rhs.classificationProperties))))&&((this.elementSourceServer == rhs.elementSourceServer)||((this.elementSourceServer!= null)&&this.elementSourceServer.equals(rhs.elementSourceServer))))&&(this.elementVersion == rhs.elementVersion))&&((this.elementMetadataCollectionId == rhs.elementMetadataCollectionId)||((this.elementMetadataCollectionId!= null)&&this.elementMetadataCollectionId.equals(rhs.elementMetadataCollectionId))))&&((this.classificationName == rhs.classificationName)||((this.classificationName!= null)&&this.classificationName.equals(rhs.classificationName))))&&((this.elementMetadataCollectionName == rhs.elementMetadataCollectionName)||((this.elementMetadataCollectionName!= null)&&this.elementMetadataCollectionName.equals(rhs.elementMetadataCollectionName))))&&(this.headerVersion == rhs.headerVersion))&&((this._class == rhs._class)||((this._class!= null)&&this._class.equals(rhs._class))))&&((this.classificationOrigin == rhs.classificationOrigin)||((this.classificationOrigin!= null)&&this.classificationOrigin.equals(rhs.classificationOrigin))))&&((this.elementOrigin == rhs.elementOrigin)||((this.elementOrigin!= null)&&this.elementOrigin.equals(rhs.elementOrigin))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
