
package com.ibm.generatedsources.asset;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassificationProperties {

    @SerializedName("attachmentGUID")
    @Expose
    private String attachmentGUID;
    @SerializedName("attachmentType")
    @Expose
    private String attachmentType;
    @SerializedName("changeAction")
    @Expose
    private Object changeAction;
    @SerializedName("changeTarget")
    @Expose
    private Object changeTarget;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("relationshipType")
    @Expose
    private String relationshipType;
    @SerializedName("user")
    @Expose
    private String user;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClassificationProperties() {
    }

    /**
     * 
     * @param relationshipType
     * @param attachmentType
     * @param changeTarget
     * @param description
     * @param attachmentGUID
     * @param user
     * @param changeAction
     */
    public ClassificationProperties(String attachmentGUID, String attachmentType, Object changeAction, Object changeTarget, String description, String relationshipType, String user) {
        super();
        this.attachmentGUID = attachmentGUID;
        this.attachmentType = attachmentType;
        this.changeAction = changeAction;
        this.changeTarget = changeTarget;
        this.description = description;
        this.relationshipType = relationshipType;
        this.user = user;
    }

    public String getAttachmentGUID() {
        return attachmentGUID;
    }

    public void setAttachmentGUID(String attachmentGUID) {
        this.attachmentGUID = attachmentGUID;
    }

    public ClassificationProperties withAttachmentGUID(String attachmentGUID) {
        this.attachmentGUID = attachmentGUID;
        return this;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public ClassificationProperties withAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    public Object getChangeAction() {
        return changeAction;
    }

    public void setChangeAction(Object changeAction) {
        this.changeAction = changeAction;
    }

    public ClassificationProperties withChangeAction(Object changeAction) {
        this.changeAction = changeAction;
        return this;
    }

    public Object getChangeTarget() {
        return changeTarget;
    }

    public void setChangeTarget(Object changeTarget) {
        this.changeTarget = changeTarget;
    }

    public ClassificationProperties withChangeTarget(Object changeTarget) {
        this.changeTarget = changeTarget;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClassificationProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    public ClassificationProperties withRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ClassificationProperties withUser(String user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClassificationProperties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attachmentGUID");
        sb.append('=');
        sb.append(((this.attachmentGUID == null)?"<null>":this.attachmentGUID));
        sb.append(',');
        sb.append("attachmentType");
        sb.append('=');
        sb.append(((this.attachmentType == null)?"<null>":this.attachmentType));
        sb.append(',');
        sb.append("changeAction");
        sb.append('=');
        sb.append(((this.changeAction == null)?"<null>":this.changeAction));
        sb.append(',');
        sb.append("changeTarget");
        sb.append('=');
        sb.append(((this.changeTarget == null)?"<null>":this.changeTarget));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("relationshipType");
        sb.append('=');
        sb.append(((this.relationshipType == null)?"<null>":this.relationshipType));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.relationshipType == null)? 0 :this.relationshipType.hashCode()));
        result = ((result* 31)+((this.attachmentType == null)? 0 :this.attachmentType.hashCode()));
        result = ((result* 31)+((this.changeTarget == null)? 0 :this.changeTarget.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.attachmentGUID == null)? 0 :this.attachmentGUID.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.changeAction == null)? 0 :this.changeAction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassificationProperties) == false) {
            return false;
        }
        ClassificationProperties rhs = ((ClassificationProperties) other);
        return ((((((((this.relationshipType == rhs.relationshipType)||((this.relationshipType!= null)&&this.relationshipType.equals(rhs.relationshipType)))&&((this.attachmentType == rhs.attachmentType)||((this.attachmentType!= null)&&this.attachmentType.equals(rhs.attachmentType))))&&((this.changeTarget == rhs.changeTarget)||((this.changeTarget!= null)&&this.changeTarget.equals(rhs.changeTarget))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.attachmentGUID == rhs.attachmentGUID)||((this.attachmentGUID!= null)&&this.attachmentGUID.equals(rhs.attachmentGUID))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.changeAction == rhs.changeAction)||((this.changeAction!= null)&&this.changeAction.equals(rhs.changeAction))));
    }

}
