package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OcProofs
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class OcProofs   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("fingerprint_local_id")
  private String fingerprintLocalId = null;

  @JsonProperty("fingerprint_global_id")
  private String fingerprintGlobalId = null;

  @JsonProperty("timestamp_id")
  private String timestampId = null;

  @JsonProperty("consent_id")
  private String consentId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  public OcProofs id(String id) {
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

  public OcProofs fingerprintLocalId(String fingerprintLocalId) {
    this.fingerprintLocalId = fingerprintLocalId;
    return this;
  }

  /**
   * Get fingerprintLocalId
   * @return fingerprintLocalId
   **/
  @Schema(description = "")
  
    public String getFingerprintLocalId() {
    return fingerprintLocalId;
  }

  public void setFingerprintLocalId(String fingerprintLocalId) {
    this.fingerprintLocalId = fingerprintLocalId;
  }

  public OcProofs fingerprintGlobalId(String fingerprintGlobalId) {
    this.fingerprintGlobalId = fingerprintGlobalId;
    return this;
  }

  /**
   * Get fingerprintGlobalId
   * @return fingerprintGlobalId
   **/
  @Schema(description = "")
  
    public String getFingerprintGlobalId() {
    return fingerprintGlobalId;
  }

  public void setFingerprintGlobalId(String fingerprintGlobalId) {
    this.fingerprintGlobalId = fingerprintGlobalId;
  }

  public OcProofs timestampId(String timestampId) {
    this.timestampId = timestampId;
    return this;
  }

  /**
   * Get timestampId
   * @return timestampId
   **/
  @Schema(description = "")
  
    public String getTimestampId() {
    return timestampId;
  }

  public void setTimestampId(String timestampId) {
    this.timestampId = timestampId;
  }

  public OcProofs consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Get consentId
   * @return consentId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OcProofs publishedAt(OffsetDateTime publishedAt) {
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
    OcProofs ocProofs = (OcProofs) o;
    return Objects.equals(this.id, ocProofs.id) &&
        Objects.equals(this.fingerprintLocalId, ocProofs.fingerprintLocalId) &&
        Objects.equals(this.fingerprintGlobalId, ocProofs.fingerprintGlobalId) &&
        Objects.equals(this.timestampId, ocProofs.timestampId) &&
        Objects.equals(this.consentId, ocProofs.consentId) &&
        Objects.equals(this.publishedAt, ocProofs.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fingerprintLocalId, fingerprintGlobalId, timestampId, consentId, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcProofs {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fingerprintLocalId: ").append(toIndentedString(fingerprintLocalId)).append("\n");
    sb.append("    fingerprintGlobalId: ").append(toIndentedString(fingerprintGlobalId)).append("\n");
    sb.append("    timestampId: ").append(toIndentedString(timestampId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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
