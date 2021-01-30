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
import javax.validation.constraints.*;

/**
 * OcDataPrivacy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class OcDataPrivacy   {
  @JsonProperty("id")
  private String id = null;

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

  public OcDataPrivacy id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OcDataPrivacy datasetId(String datasetId) {
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

  public OcDataPrivacy attributeName(String attributeName) {
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

  public OcDataPrivacy attributeType(String attributeType) {
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

  public OcDataPrivacy protectionType(ProtectionTypeEnum protectionType) {
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

  public OcDataPrivacy dataPrivacyMeta(List<OcconsentpurposesConsentPurposesMeta> dataPrivacyMeta) {
    this.dataPrivacyMeta = dataPrivacyMeta;
    return this;
  }

  public OcDataPrivacy addDataPrivacyMetaItem(OcconsentpurposesConsentPurposesMeta dataPrivacyMetaItem) {
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

  public OcDataPrivacy publishedAt(OffsetDateTime publishedAt) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcDataPrivacy ocDataPrivacy = (OcDataPrivacy) o;
    return Objects.equals(this.id, ocDataPrivacy.id) &&
        Objects.equals(this.datasetId, ocDataPrivacy.datasetId) &&
        Objects.equals(this.attributeName, ocDataPrivacy.attributeName) &&
        Objects.equals(this.attributeType, ocDataPrivacy.attributeType) &&
        Objects.equals(this.protectionType, ocDataPrivacy.protectionType) &&
        Objects.equals(this.dataPrivacyMeta, ocDataPrivacy.dataPrivacyMeta) &&
        Objects.equals(this.publishedAt, ocDataPrivacy.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, datasetId, attributeName, attributeType, protectionType, dataPrivacyMeta, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcDataPrivacy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    dataPrivacyMeta: ").append(toIndentedString(dataPrivacyMeta)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
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
