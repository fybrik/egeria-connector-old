
package com.ibm.generatedsources.asset;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AssetMetadata {

    @SerializedName("asset")
    @Expose
    private Asset asset;
    @SerializedName("certificationCount")
    @Expose
    private long certificationCount;
    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("commentCount")
    @Expose
    private long commentCount;
    @SerializedName("connectionCount")
    @Expose
    private long connectionCount;
    @SerializedName("externalIdentifierCount")
    @Expose
    private long externalIdentifierCount;
    @SerializedName("externalReferencesCount")
    @Expose
    private long externalReferencesCount;
    @SerializedName("informalTagCount")
    @Expose
    private long informalTagCount;
    @SerializedName("keywordCount")
    @Expose
    private long keywordCount;
    @SerializedName("knownLocationsCount")
    @Expose
    private long knownLocationsCount;
    @SerializedName("licenseCount")
    @Expose
    private long licenseCount;
    @SerializedName("likeCount")
    @Expose
    private long likeCount;
    @SerializedName("noteLogsCount")
    @Expose
    private long noteLogsCount;
    @SerializedName("ratingsCount")
    @Expose
    private long ratingsCount;
    @SerializedName("relatedAssetCount")
    @Expose
    private long relatedAssetCount;
    @SerializedName("relatedHTTPCode")
    @Expose
    private long relatedHTTPCode;
    @SerializedName("relatedMediaReferenceCount")
    @Expose
    private long relatedMediaReferenceCount;
    @SerializedName("schemaType")
    @Expose
    private SchemaType schemaType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AssetMetadata() {
    }

    /**
     * 
     * @param relatedHTTPCode
     * @param connectionCount
     * @param externalIdentifierCount
     * @param relatedAssetCount
     * @param externalReferencesCount
     * @param likeCount
     * @param noteLogsCount
     * @param commentCount
     * @param relatedMediaReferenceCount
     * @param keywordCount
     * @param informalTagCount
     * @param schemaType
     * @param ratingsCount
     * @param _class
     * @param knownLocationsCount
     * @param asset
     * @param certificationCount
     * @param licenseCount
     */
    public AssetMetadata(Asset asset, long certificationCount, String _class, long commentCount, long connectionCount, long externalIdentifierCount, long externalReferencesCount, long informalTagCount, long keywordCount, long knownLocationsCount, long licenseCount, long likeCount, long noteLogsCount, long ratingsCount, long relatedAssetCount, long relatedHTTPCode, long relatedMediaReferenceCount, SchemaType schemaType) {
        super();
        this.asset = asset;
        this.certificationCount = certificationCount;
        this._class = _class;
        this.commentCount = commentCount;
        this.connectionCount = connectionCount;
        this.externalIdentifierCount = externalIdentifierCount;
        this.externalReferencesCount = externalReferencesCount;
        this.informalTagCount = informalTagCount;
        this.keywordCount = keywordCount;
        this.knownLocationsCount = knownLocationsCount;
        this.licenseCount = licenseCount;
        this.likeCount = likeCount;
        this.noteLogsCount = noteLogsCount;
        this.ratingsCount = ratingsCount;
        this.relatedAssetCount = relatedAssetCount;
        this.relatedHTTPCode = relatedHTTPCode;
        this.relatedMediaReferenceCount = relatedMediaReferenceCount;
        this.schemaType = schemaType;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public AssetMetadata withAsset(Asset asset) {
        this.asset = asset;
        return this;
    }

    public long getCertificationCount() {
        return certificationCount;
    }

    public void setCertificationCount(long certificationCount) {
        this.certificationCount = certificationCount;
    }

    public AssetMetadata withCertificationCount(long certificationCount) {
        this.certificationCount = certificationCount;
        return this;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public AssetMetadata withClass(String _class) {
        this._class = _class;
        return this;
    }

    public long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }

    public AssetMetadata withCommentCount(long commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    public long getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(long connectionCount) {
        this.connectionCount = connectionCount;
    }

    public AssetMetadata withConnectionCount(long connectionCount) {
        this.connectionCount = connectionCount;
        return this;
    }

    public long getExternalIdentifierCount() {
        return externalIdentifierCount;
    }

    public void setExternalIdentifierCount(long externalIdentifierCount) {
        this.externalIdentifierCount = externalIdentifierCount;
    }

    public AssetMetadata withExternalIdentifierCount(long externalIdentifierCount) {
        this.externalIdentifierCount = externalIdentifierCount;
        return this;
    }

    public long getExternalReferencesCount() {
        return externalReferencesCount;
    }

    public void setExternalReferencesCount(long externalReferencesCount) {
        this.externalReferencesCount = externalReferencesCount;
    }

    public AssetMetadata withExternalReferencesCount(long externalReferencesCount) {
        this.externalReferencesCount = externalReferencesCount;
        return this;
    }

    public long getInformalTagCount() {
        return informalTagCount;
    }

    public void setInformalTagCount(long informalTagCount) {
        this.informalTagCount = informalTagCount;
    }

    public AssetMetadata withInformalTagCount(long informalTagCount) {
        this.informalTagCount = informalTagCount;
        return this;
    }

    public long getKeywordCount() {
        return keywordCount;
    }

    public void setKeywordCount(long keywordCount) {
        this.keywordCount = keywordCount;
    }

    public AssetMetadata withKeywordCount(long keywordCount) {
        this.keywordCount = keywordCount;
        return this;
    }

    public long getKnownLocationsCount() {
        return knownLocationsCount;
    }

    public void setKnownLocationsCount(long knownLocationsCount) {
        this.knownLocationsCount = knownLocationsCount;
    }

    public AssetMetadata withKnownLocationsCount(long knownLocationsCount) {
        this.knownLocationsCount = knownLocationsCount;
        return this;
    }

    public long getLicenseCount() {
        return licenseCount;
    }

    public void setLicenseCount(long licenseCount) {
        this.licenseCount = licenseCount;
    }

    public AssetMetadata withLicenseCount(long licenseCount) {
        this.licenseCount = licenseCount;
        return this;
    }

    public long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }

    public AssetMetadata withLikeCount(long likeCount) {
        this.likeCount = likeCount;
        return this;
    }

    public long getNoteLogsCount() {
        return noteLogsCount;
    }

    public void setNoteLogsCount(long noteLogsCount) {
        this.noteLogsCount = noteLogsCount;
    }

    public AssetMetadata withNoteLogsCount(long noteLogsCount) {
        this.noteLogsCount = noteLogsCount;
        return this;
    }

    public long getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(long ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public AssetMetadata withRatingsCount(long ratingsCount) {
        this.ratingsCount = ratingsCount;
        return this;
    }

    public long getRelatedAssetCount() {
        return relatedAssetCount;
    }

    public void setRelatedAssetCount(long relatedAssetCount) {
        this.relatedAssetCount = relatedAssetCount;
    }

    public AssetMetadata withRelatedAssetCount(long relatedAssetCount) {
        this.relatedAssetCount = relatedAssetCount;
        return this;
    }

    public long getRelatedHTTPCode() {
        return relatedHTTPCode;
    }

    public void setRelatedHTTPCode(long relatedHTTPCode) {
        this.relatedHTTPCode = relatedHTTPCode;
    }

    public AssetMetadata withRelatedHTTPCode(long relatedHTTPCode) {
        this.relatedHTTPCode = relatedHTTPCode;
        return this;
    }

    public long getRelatedMediaReferenceCount() {
        return relatedMediaReferenceCount;
    }

    public void setRelatedMediaReferenceCount(long relatedMediaReferenceCount) {
        this.relatedMediaReferenceCount = relatedMediaReferenceCount;
    }

    public AssetMetadata withRelatedMediaReferenceCount(long relatedMediaReferenceCount) {
        this.relatedMediaReferenceCount = relatedMediaReferenceCount;
        return this;
    }

    public SchemaType getSchemaType() {
        return schemaType;
    }

    public void setSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType;
    }

    public AssetMetadata withSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AssetMetadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("asset");
        sb.append('=');
        sb.append(((this.asset == null)?"<null>":this.asset));
        sb.append(',');
        sb.append("certificationCount");
        sb.append('=');
        sb.append(this.certificationCount);
        sb.append(',');
        sb.append("_class");
        sb.append('=');
        sb.append(((this._class == null)?"<null>":this._class));
        sb.append(',');
        sb.append("commentCount");
        sb.append('=');
        sb.append(this.commentCount);
        sb.append(',');
        sb.append("connectionCount");
        sb.append('=');
        sb.append(this.connectionCount);
        sb.append(',');
        sb.append("externalIdentifierCount");
        sb.append('=');
        sb.append(this.externalIdentifierCount);
        sb.append(',');
        sb.append("externalReferencesCount");
        sb.append('=');
        sb.append(this.externalReferencesCount);
        sb.append(',');
        sb.append("informalTagCount");
        sb.append('=');
        sb.append(this.informalTagCount);
        sb.append(',');
        sb.append("keywordCount");
        sb.append('=');
        sb.append(this.keywordCount);
        sb.append(',');
        sb.append("knownLocationsCount");
        sb.append('=');
        sb.append(this.knownLocationsCount);
        sb.append(',');
        sb.append("licenseCount");
        sb.append('=');
        sb.append(this.licenseCount);
        sb.append(',');
        sb.append("likeCount");
        sb.append('=');
        sb.append(this.likeCount);
        sb.append(',');
        sb.append("noteLogsCount");
        sb.append('=');
        sb.append(this.noteLogsCount);
        sb.append(',');
        sb.append("ratingsCount");
        sb.append('=');
        sb.append(this.ratingsCount);
        sb.append(',');
        sb.append("relatedAssetCount");
        sb.append('=');
        sb.append(this.relatedAssetCount);
        sb.append(',');
        sb.append("relatedHTTPCode");
        sb.append('=');
        sb.append(this.relatedHTTPCode);
        sb.append(',');
        sb.append("relatedMediaReferenceCount");
        sb.append('=');
        sb.append(this.relatedMediaReferenceCount);
        sb.append(',');
        sb.append("schemaType");
        sb.append('=');
        sb.append(((this.schemaType == null)?"<null>":this.schemaType));
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
        result = ((result* 31)+((int)(this.relatedHTTPCode^(this.relatedHTTPCode >>> 32))));
        result = ((result* 31)+((int)(this.connectionCount^(this.connectionCount >>> 32))));
        result = ((result* 31)+((int)(this.externalIdentifierCount^(this.externalIdentifierCount >>> 32))));
        result = ((result* 31)+((int)(this.relatedAssetCount^(this.relatedAssetCount >>> 32))));
        result = ((result* 31)+((int)(this.externalReferencesCount^(this.externalReferencesCount >>> 32))));
        result = ((result* 31)+((int)(this.likeCount^(this.likeCount >>> 32))));
        result = ((result* 31)+((int)(this.noteLogsCount^(this.noteLogsCount >>> 32))));
        result = ((result* 31)+((int)(this.commentCount^(this.commentCount >>> 32))));
        result = ((result* 31)+((int)(this.relatedMediaReferenceCount^(this.relatedMediaReferenceCount >>> 32))));
        result = ((result* 31)+((int)(this.keywordCount^(this.keywordCount >>> 32))));
        result = ((result* 31)+((int)(this.informalTagCount^(this.informalTagCount >>> 32))));
        result = ((result* 31)+((this.schemaType == null)? 0 :this.schemaType.hashCode()));
        result = ((result* 31)+((int)(this.ratingsCount^(this.ratingsCount >>> 32))));
        result = ((result* 31)+((this._class == null)? 0 :this._class.hashCode()));
        result = ((result* 31)+((int)(this.knownLocationsCount^(this.knownLocationsCount >>> 32))));
        result = ((result* 31)+((this.asset == null)? 0 :this.asset.hashCode()));
        result = ((result* 31)+((int)(this.certificationCount^(this.certificationCount >>> 32))));
        result = ((result* 31)+((int)(this.licenseCount^(this.licenseCount >>> 32))));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetMetadata) == false) {
            return false;
        }
        AssetMetadata rhs = ((AssetMetadata) other);
        return ((((((((((((((((((this.relatedHTTPCode == rhs.relatedHTTPCode)&&(this.connectionCount == rhs.connectionCount))&&(this.externalIdentifierCount == rhs.externalIdentifierCount))&&(this.relatedAssetCount == rhs.relatedAssetCount))&&(this.externalReferencesCount == rhs.externalReferencesCount))&&(this.likeCount == rhs.likeCount))&&(this.noteLogsCount == rhs.noteLogsCount))&&(this.commentCount == rhs.commentCount))&&(this.relatedMediaReferenceCount == rhs.relatedMediaReferenceCount))&&(this.keywordCount == rhs.keywordCount))&&(this.informalTagCount == rhs.informalTagCount))&&((this.schemaType == rhs.schemaType)||((this.schemaType!= null)&&this.schemaType.equals(rhs.schemaType))))&&(this.ratingsCount == rhs.ratingsCount))&&((this._class == rhs._class)||((this._class!= null)&&this._class.equals(rhs._class))))&&(this.knownLocationsCount == rhs.knownLocationsCount))&&((this.asset == rhs.asset)||((this.asset!= null)&&this.asset.equals(rhs.asset))))&&(this.certificationCount == rhs.certificationCount))&&(this.licenseCount == rhs.licenseCount));
    }

}
