package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * NewOcDataPrivacy
 */
@Validated


public class NewOcDataPrivacy   {
  @JsonProperty("dataset_id")
  private String datasetId = null;

  @JsonProperty("attribute_name")
  private String attributeName = null;

  @JsonProperty("attribute_type")
  private String attributeType = null;

  /**
   * Gets or Sets protectionType
   */
  public enum ProtectionTypeEnum {
    ENCRYPTION("encryption"),
    
    TOKENIZATION("tokenization"),
    
    ZEROKNOWLEDGE("zeroKnowledge"),
    
    REDACTION("redaction");

    private String value;

    ProtectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProtectionTypeEnum fromValue(String text) {
      for (ProtectionTypeEnum b : ProtectionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("protection_type")
  private ProtectionTypeEnum protectionType = null;

  @JsonProperty("data_privacy_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> dataPrivacyMeta = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcDataPrivacy datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * Get datasetId
   * @return datasetId
   **/
  @Schema(description = "")
  
    public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public NewOcDataPrivacy attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * Get attributeName
   * @return attributeName
   **/
  @Schema(description = "")
  
    public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  public NewOcDataPrivacy attributeType(String attributeType) {
    this.attributeType = attributeType;
    return this;
  }

  /**
   * Get attributeType
   * @return attributeType
   **/
  @Schema(description = "")
  
    public String getAttributeType() {
    return attributeType;
  }

  public void setAttributeType(String attributeType) {
    this.attributeType = attributeType;
  }

  public NewOcDataPrivacy protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }

  /**
   * Get protectionType
   * @return protectionType
   **/
  @Schema(description = "")
  
    public ProtectionTypeEnum getProtectionType() {
    return protectionType;
  }

  public void setProtectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
  }

  public NewOcDataPrivacy dataPrivacyMeta(List<OcconsentpurposesConsentPurposesMeta> dataPrivacyMeta) {
    this.dataPrivacyMeta = dataPrivacyMeta;
    return this;
  }

  public NewOcDataPrivacy addDataPrivacyMetaItem(OcconsentpurposesConsentPurposesMeta dataPrivacyMetaItem) {
    if (this.dataPrivacyMeta == null) {
      this.dataPrivacyMeta = new ArrayList<OcconsentpurposesConsentPurposesMeta>();
    }
    this.dataPrivacyMeta.add(dataPrivacyMetaItem);
    return this;
  }

  /**
   * Get dataPrivacyMeta
   * @return dataPrivacyMeta
   **/
  @Schema(description = "")
      @Valid
    public List<OcconsentpurposesConsentPurposesMeta> getDataPrivacyMeta() {
    return dataPrivacyMeta;
  }

  public void setDataPrivacyMeta(List<OcconsentpurposesConsentPurposesMeta> dataPrivacyMeta) {
    this.dataPrivacyMeta = dataPrivacyMeta;
  }

  public NewOcDataPrivacy publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Get publishedAt
   * @return publishedAt
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public NewOcDataPrivacy createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   **/
  @Schema(description = "")
  
    public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public NewOcDataPrivacy updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
   **/
  @Schema(description = "")
  
    public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewOcDataPrivacy newOcDataPrivacy = (NewOcDataPrivacy) o;
    return Objects.equals(this.datasetId, newOcDataPrivacy.datasetId) &&
        Objects.equals(this.attributeName, newOcDataPrivacy.attributeName) &&
        Objects.equals(this.attributeType, newOcDataPrivacy.attributeType) &&
        Objects.equals(this.protectionType, newOcDataPrivacy.protectionType) &&
        Objects.equals(this.dataPrivacyMeta, newOcDataPrivacy.dataPrivacyMeta) &&
        Objects.equals(this.publishedAt, newOcDataPrivacy.publishedAt) &&
        Objects.equals(this.createdBy, newOcDataPrivacy.createdBy) &&
        Objects.equals(this.updatedBy, newOcDataPrivacy.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetId, attributeName, attributeType, protectionType, dataPrivacyMeta, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcDataPrivacy {\n");
    
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    dataPrivacyMeta: ").append(toIndentedString(dataPrivacyMeta)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
