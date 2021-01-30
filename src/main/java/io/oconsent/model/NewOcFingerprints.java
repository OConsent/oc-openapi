package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewOcFingerprints
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class NewOcFingerprints   {
  @JsonProperty("consent_id")
  private String consentId = null;

  @JsonProperty("fingerprint_hash")
  private String fingerprintHash = null;

  /**
   * Gets or Sets fingerprintType
   */
  public enum FingerprintTypeEnum {
    LOCAL("local"),
    
    GLOBALETH("globalETH"),
    
    GLOBALBTC("globalBTC");

    private String value;

    FingerprintTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FingerprintTypeEnum fromValue(String text) {
      for (FingerprintTypeEnum b : FingerprintTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("fingerprint_type")
  private FingerprintTypeEnum fingerprintType = null;

  @JsonProperty("date_created")
  private OffsetDateTime dateCreated = null;

  @JsonProperty("fingerprint_id")
  private String fingerprintId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcFingerprints consentId(String consentId) {
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

  public NewOcFingerprints fingerprintHash(String fingerprintHash) {
    this.fingerprintHash = fingerprintHash;
    return this;
  }

  /**
   * Get fingerprintHash
   * @return fingerprintHash
   **/
  @Schema(description = "")
  
    public String getFingerprintHash() {
    return fingerprintHash;
  }

  public void setFingerprintHash(String fingerprintHash) {
    this.fingerprintHash = fingerprintHash;
  }

  public NewOcFingerprints fingerprintType(FingerprintTypeEnum fingerprintType) {
    this.fingerprintType = fingerprintType;
    return this;
  }

  /**
   * Get fingerprintType
   * @return fingerprintType
   **/
  @Schema(description = "")
  
    public FingerprintTypeEnum getFingerprintType() {
    return fingerprintType;
  }

  public void setFingerprintType(FingerprintTypeEnum fingerprintType) {
    this.fingerprintType = fingerprintType;
  }

  public NewOcFingerprints dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public NewOcFingerprints fingerprintId(String fingerprintId) {
    this.fingerprintId = fingerprintId;
    return this;
  }

  /**
   * Get fingerprintId
   * @return fingerprintId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getFingerprintId() {
    return fingerprintId;
  }

  public void setFingerprintId(String fingerprintId) {
    this.fingerprintId = fingerprintId;
  }

  public NewOcFingerprints publishedAt(OffsetDateTime publishedAt) {
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

  public NewOcFingerprints createdBy(String createdBy) {
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

  public NewOcFingerprints updatedBy(String updatedBy) {
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
    NewOcFingerprints newOcFingerprints = (NewOcFingerprints) o;
    return Objects.equals(this.consentId, newOcFingerprints.consentId) &&
        Objects.equals(this.fingerprintHash, newOcFingerprints.fingerprintHash) &&
        Objects.equals(this.fingerprintType, newOcFingerprints.fingerprintType) &&
        Objects.equals(this.dateCreated, newOcFingerprints.dateCreated) &&
        Objects.equals(this.fingerprintId, newOcFingerprints.fingerprintId) &&
        Objects.equals(this.publishedAt, newOcFingerprints.publishedAt) &&
        Objects.equals(this.createdBy, newOcFingerprints.createdBy) &&
        Objects.equals(this.updatedBy, newOcFingerprints.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, fingerprintHash, fingerprintType, dateCreated, fingerprintId, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcFingerprints {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    fingerprintHash: ").append(toIndentedString(fingerprintHash)).append("\n");
    sb.append("    fingerprintType: ").append(toIndentedString(fingerprintType)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    fingerprintId: ").append(toIndentedString(fingerprintId)).append("\n");
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
