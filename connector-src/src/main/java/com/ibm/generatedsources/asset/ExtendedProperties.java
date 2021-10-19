
package com.ibm.generatedsources.asset;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtendedProperties {

    @SerializedName("delimiterCharacter")
    @Expose
    private String delimiterCharacter;
    @SerializedName("fileType")
    @Expose
    private String fileType;
    @SerializedName("quoteCharacter")
    @Expose
    private String quoteCharacter;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtendedProperties() {
    }

    /**
     * 
     * @param delimiterCharacter
     * @param quoteCharacter
     * @param fileType
     */
    public ExtendedProperties(String delimiterCharacter, String fileType, String quoteCharacter) {
        super();
        this.delimiterCharacter = delimiterCharacter;
        this.fileType = fileType;
        this.quoteCharacter = quoteCharacter;
    }

    public String getDelimiterCharacter() {
        return delimiterCharacter;
    }

    public void setDelimiterCharacter(String delimiterCharacter) {
        this.delimiterCharacter = delimiterCharacter;
    }

    public ExtendedProperties withDelimiterCharacter(String delimiterCharacter) {
        this.delimiterCharacter = delimiterCharacter;
        return this;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public ExtendedProperties withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    public String getQuoteCharacter() {
        return quoteCharacter;
    }

    public void setQuoteCharacter(String quoteCharacter) {
        this.quoteCharacter = quoteCharacter;
    }

    public ExtendedProperties withQuoteCharacter(String quoteCharacter) {
        this.quoteCharacter = quoteCharacter;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtendedProperties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("delimiterCharacter");
        sb.append('=');
        sb.append(((this.delimiterCharacter == null)?"<null>":this.delimiterCharacter));
        sb.append(',');
        sb.append("fileType");
        sb.append('=');
        sb.append(((this.fileType == null)?"<null>":this.fileType));
        sb.append(',');
        sb.append("quoteCharacter");
        sb.append('=');
        sb.append(((this.quoteCharacter == null)?"<null>":this.quoteCharacter));
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
        result = ((result* 31)+((this.quoteCharacter == null)? 0 :this.quoteCharacter.hashCode()));
        result = ((result* 31)+((this.delimiterCharacter == null)? 0 :this.delimiterCharacter.hashCode()));
        result = ((result* 31)+((this.fileType == null)? 0 :this.fileType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtendedProperties) == false) {
            return false;
        }
        ExtendedProperties rhs = ((ExtendedProperties) other);
        return ((((this.quoteCharacter == rhs.quoteCharacter)||((this.quoteCharacter!= null)&&this.quoteCharacter.equals(rhs.quoteCharacter)))&&((this.delimiterCharacter == rhs.delimiterCharacter)||((this.delimiterCharacter!= null)&&this.delimiterCharacter.equals(rhs.delimiterCharacter))))&&((this.fileType == rhs.fileType)||((this.fileType!= null)&&this.fileType.equals(rhs.fileType))));
    }

}
