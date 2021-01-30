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
 * OcTimestamps
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class OcTimestamps   {
  @JsonProperty("id")
  private String id = null;

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

  public OcTimestamps id(String id) {
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

  public OcTimestamps consentId(String consentId) {
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

  public OcTimestamps hash(String hash) {
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

  public OcTimestamps authorityId(String authorityId) {
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

  public OcTimestamps timestampsMeta(List<OcconsentpurposesConsentPurposesMeta> timestampsMeta) {
    this.timestampsMeta = timestampsMeta;
    return this;
  }

  public OcTimestamps addTimestampsMetaItem(OcconsentpurposesConsentPurposesMeta timestampsMetaItem) {
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

  public OcTimestamps timestampId(String timestampId) {
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

  public OcTimestamps publishedAt(OffsetDateTime publishedAt) {
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
    OcTimestamps ocTimestamps = (OcTimestamps) o;
    return Objects.equals(this.id, ocTimestamps.id) &&
        Objects.equals(this.consentId, ocTimestamps.consentId) &&
        Objects.equals(this.hash, ocTimestamps.hash) &&
        Objects.equals(this.authorityId, ocTimestamps.authorityId) &&
        Objects.equals(this.timestampsMeta, ocTimestamps.timestampsMeta) &&
        Objects.equals(this.timestampId, ocTimestamps.timestampId) &&
        Objects.equals(this.publishedAt, ocTimestamps.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, consentId, hash, authorityId, timestampsMeta, timestampId, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcTimestamps {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    authorityId: ").append(toIndentedString(authorityId)).append("\n");
    sb.append("    timestampsMeta: ").append(toIndentedString(timestampsMeta)).append("\n");
    sb.append("    timestampId: ").append(toIndentedString(timestampId)).append("\n");
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
