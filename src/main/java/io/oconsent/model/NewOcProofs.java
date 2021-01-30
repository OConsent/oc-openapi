package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewOcProofs
 */
@Validated


public class NewOcProofs   {
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

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcProofs fingerprintLocalId(String fingerprintLocalId) {
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

  public NewOcProofs fingerprintGlobalId(String fingerprintGlobalId) {
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

  public NewOcProofs timestampId(String timestampId) {
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

  public NewOcProofs consentId(String consentId) {
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

  public NewOcProofs publishedAt(OffsetDateTime publishedAt) {
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

  public NewOcProofs createdBy(String createdBy) {
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

  public NewOcProofs updatedBy(String updatedBy) {
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
    NewOcProofs newOcProofs = (NewOcProofs) o;
    return Objects.equals(this.fingerprintLocalId, newOcProofs.fingerprintLocalId) &&
        Objects.equals(this.fingerprintGlobalId, newOcProofs.fingerprintGlobalId) &&
        Objects.equals(this.timestampId, newOcProofs.timestampId) &&
        Objects.equals(this.consentId, newOcProofs.consentId) &&
        Objects.equals(this.publishedAt, newOcProofs.publishedAt) &&
        Objects.equals(this.createdBy, newOcProofs.createdBy) &&
        Objects.equals(this.updatedBy, newOcProofs.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerprintLocalId, fingerprintGlobalId, timestampId, consentId, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcProofs {\n");
    
    sb.append("    fingerprintLocalId: ").append(toIndentedString(fingerprintLocalId)).append("\n");
    sb.append("    fingerprintGlobalId: ").append(toIndentedString(fingerprintGlobalId)).append("\n");
    sb.append("    timestampId: ").append(toIndentedString(timestampId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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
