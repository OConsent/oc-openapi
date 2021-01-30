package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewOcDak
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class NewOcDak   {
  @JsonProperty("consent_id")
  private String consentId = null;

  @JsonProperty("dak_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> dakMeta = null;

  @JsonProperty("dak_id")
  private String dakId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcDak consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Get consentId
   * @return consentId
   **/
  @Schema(description = "")
  
    public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public NewOcDak dakMeta(List<OcconsentpurposesConsentPurposesMeta> dakMeta) {
    this.dakMeta = dakMeta;
    return this;
  }

  public NewOcDak addDakMetaItem(OcconsentpurposesConsentPurposesMeta dakMetaItem) {
    if (this.dakMeta == null) {
      this.dakMeta = new ArrayList<OcconsentpurposesConsentPurposesMeta>();
    }
    this.dakMeta.add(dakMetaItem);
    return this;
  }

  /**
   * Get dakMeta
   * @return dakMeta
   **/
  @Schema(description = "")
      @Valid
    public List<OcconsentpurposesConsentPurposesMeta> getDakMeta() {
    return dakMeta;
  }

  public void setDakMeta(List<OcconsentpurposesConsentPurposesMeta> dakMeta) {
    this.dakMeta = dakMeta;
  }

  public NewOcDak dakId(String dakId) {
    this.dakId = dakId;
    return this;
  }

  /**
   * Get dakId
   * @return dakId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDakId() {
    return dakId;
  }

  public void setDakId(String dakId) {
    this.dakId = dakId;
  }

  public NewOcDak publishedAt(OffsetDateTime publishedAt) {
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

  public NewOcDak createdBy(String createdBy) {
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

  public NewOcDak updatedBy(String updatedBy) {
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
    NewOcDak newOcDak = (NewOcDak) o;
    return Objects.equals(this.consentId, newOcDak.consentId) &&
        Objects.equals(this.dakMeta, newOcDak.dakMeta) &&
        Objects.equals(this.dakId, newOcDak.dakId) &&
        Objects.equals(this.publishedAt, newOcDak.publishedAt) &&
        Objects.equals(this.createdBy, newOcDak.createdBy) &&
        Objects.equals(this.updatedBy, newOcDak.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, dakMeta, dakId, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcDak {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    dakMeta: ").append(toIndentedString(dakMeta)).append("\n");
    sb.append("    dakId: ").append(toIndentedString(dakId)).append("\n");
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
