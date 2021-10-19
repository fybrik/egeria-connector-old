
package com.ibm.generatedsources.asset;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtendedProperties__1 {

    @SerializedName("isDeprecated")
    @Expose
    private boolean isDeprecated;
    @SerializedName("qualifiedName")
    @Expose
    private String qualifiedName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtendedProperties__1() {
    }

    /**
     * 
     * @param isDeprecated
     * @param qualifiedName
     */
    public ExtendedProperties__1(boolean isDeprecated, String qualifiedName) {
        super();
        this.isDeprecated = isDeprecated;
        this.qualifiedName = qualifiedName;
    }

    public boolean isIsDeprecated() {
        return isDeprecated;
    }

    public void setIsDeprecated(boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    public ExtendedProperties__1 withIsDeprecated(boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
        return this;
    }

    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public ExtendedProperties__1 withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtendedProperties__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isDeprecated");
        sb.append('=');
        sb.append(this.isDeprecated);
        sb.append(',');
        sb.append("qualifiedName");
        sb.append('=');
        sb.append(((this.qualifiedName == null)?"<null>":this.qualifiedName));
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
        result = ((result* 31)+(this.isDeprecated? 1 : 0));
        result = ((result* 31)+((this.qualifiedName == null)? 0 :this.qualifiedName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtendedProperties__1) == false) {
            return false;
        }
        ExtendedProperties__1 rhs = ((ExtendedProperties__1) other);
        return ((this.isDeprecated == rhs.isDeprecated)&&((this.qualifiedName == rhs.qualifiedName)||((this.qualifiedName!= null)&&this.qualifiedName.equals(rhs.qualifiedName))));
    }

}
