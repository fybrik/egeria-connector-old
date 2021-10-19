
package com.ibm.generatedsources.asset;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassificationProperties__1 {

    @SerializedName("anchorGUID")
    @Expose
    private String anchorGUID;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClassificationProperties__1() {
    }

    /**
     * 
     * @param anchorGUID
     */
    public ClassificationProperties__1(String anchorGUID) {
        super();
        this.anchorGUID = anchorGUID;
    }

    public String getAnchorGUID() {
        return anchorGUID;
    }

    public void setAnchorGUID(String anchorGUID) {
        this.anchorGUID = anchorGUID;
    }

    public ClassificationProperties__1 withAnchorGUID(String anchorGUID) {
        this.anchorGUID = anchorGUID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClassificationProperties__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchorGUID");
        sb.append('=');
        sb.append(((this.anchorGUID == null)?"<null>":this.anchorGUID));
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
        result = ((result* 31)+((this.anchorGUID == null)? 0 :this.anchorGUID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassificationProperties__1) == false) {
            return false;
        }
        ClassificationProperties__1 rhs = ((ClassificationProperties__1) other);
        return ((this.anchorGUID == rhs.anchorGUID)||((this.anchorGUID!= null)&&this.anchorGUID.equals(rhs.anchorGUID)));
    }

}
