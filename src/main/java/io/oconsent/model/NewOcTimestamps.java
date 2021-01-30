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
 * NewOcTimestamps
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class NewOcTimestamps   {
  @JsonProperty("consent_id")
  private String consentId = null;

  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("authority_id")
  private String authorityId = null;

  @JsonProperty("timestamps_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> timestampsMeta = null;

  @JsonProperty("timestamp_id")
  private String timestampId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcTimestamps consentId(String consentId) {
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

  public NewOcTimestamps hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
   **/
  @Schema(description = "")
  
    public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public NewOcTimestamps authorityId(String authorityId) {
    this.authorityId = authorityId;
    return this;
  }

  /**
   * Get authorityId
   * @return authorityId
   **/
  @Schema(description = "")
  
    public String getAuthorityId() {
    return authorityId;
  }

  public void setAuthorityId(String authorityId) {
    this.authorityId = authorityId;
  }

  public NewOcTimestamps timestampsMeta(List<OcconsentpurposesConsentPurposesMeta> timestampsMeta) {
    this.timestampsMeta = timestampsMeta;
    return this;
  }

  public NewOcTimestamps addTimestampsMetaItem(OcconsentpurposesConsentPurposesMeta timestampsMetaItem) {
    if (this.timestampsMeta == null) {
      this.timestampsMeta = new ArrayList<OcconsentpurposesConsentPurposesMeta>();
    }
    this.timestampsMeta.add(timestampsMetaItem);
    return this;
  }

  /**
   * Get timestampsMeta
   * @return timestampsMeta
   **/
  @Schema(description = "")
      @Valid
    public List<OcconsentpurposesConsentPurposesMeta> getTimestampsMeta() {
    return timestampsMeta;
  }

  public void setTimestampsMeta(List<OcconsentpurposesConsentPurposesMeta> timestampsMeta) {
    this.timestampsMeta = timestampsMeta;
  }

  public NewOcTimestamps timestampId(String timestampId) {
    this.timestampId = timestampId;
    return this;
  }

  /**
   * Get timestampId
   * @return timestampId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getTimestampId() {
    return timestampId;
  }

  public void setTimestampId(String timestampId) {
    this.timestampId = timestampId;
  }

  public NewOcTimestamps publishedAt(OffsetDateTime publishedAt) {
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

  public NewOcTimestamps createdBy(String createdBy) {
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

  public NewOcTimestamps updatedBy(String updatedBy) {
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
    NewOcTimestamps newOcTimestamps = (NewOcTimestamps) o;
    return Objects.equals(this.consentId, newOcTimestamps.consentId) &&
        Objects.equals(this.hash, newOcTimestamps.hash) &&
        Objects.equals(this.authorityId, newOcTimestamps.authorityId) &&
        Objects.equals(this.timestampsMeta, newOcTimestamps.timestampsMeta) &&
        Objects.equals(this.timestampId, newOcTimestamps.timestampId) &&
        Objects.equals(this.publishedAt, newOcTimestamps.publishedAt) &&
        Objects.equals(this.createdBy, newOcTimestamps.createdBy) &&
        Objects.equals(this.updatedBy, newOcTimestamps.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, hash, authorityId, timestampsMeta, timestampId, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcTimestamps {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    authorityId: ").append(toIndentedString(authorityId)).append("\n");
    sb.append("    timestampsMeta: ").append(toIndentedString(timestampsMeta)).append("\n");
    sb.append("    timestampId: ").append(toIndentedString(timestampId)).append("\n");
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
