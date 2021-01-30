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
 * OcConsentPurposes
 */
@Validated


public class OcConsentPurposes   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("purpose_short_desc")
  private String purposeShortDesc = null;

  @JsonProperty("purpose_long_desc")
  private String purposeLongDesc = null;

  @JsonProperty("consent_purposes_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> consentPurposesMeta = null;

  @JsonProperty("purpose_id")
  private String purposeId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  public OcConsentPurposes id(String id) {
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

  public OcConsentPurposes purposeShortDesc(String purposeShortDesc) {
    this.purposeShortDesc = purposeShortDesc;
    return this;
  }

  /**
   * Get purposeShortDesc
   * @return purposeShortDesc
   **/
  @Schema(description = "")
  
    public String getPurposeShortDesc() {
    return purposeShortDesc;
  }

  public void setPurposeShortDesc(String purposeShortDesc) {
    this.purposeShortDesc = purposeShortDesc;
  }

  public OcConsentPurposes purposeLongDesc(String purposeLongDesc) {
    this.purposeLongDesc = purposeLongDesc;
    return this;
  }

  /**
   * Get purposeLongDesc
   * @return purposeLongDesc
   **/
  @Schema(description = "")
  
    public String getPurposeLongDesc() {
    return purposeLongDesc;
  }

  public void setPurposeLongDesc(String purposeLongDesc) {
    this.purposeLongDesc = purposeLongDesc;
  }

  public OcConsentPurposes consentPurposesMeta(List<OcconsentpurposesConsentPurposesMeta> consentPurposesMeta) {
    this.consentPurposesMeta = consentPurposesMeta;
    return this;
  }

  public OcConsentPurposes addConsentPurposesMetaItem(OcconsentpurposesConsentPurposesMeta consentPurposesMetaItem) {
    if (this.consentPurposesMeta == null) {
      this.consentPurposesMeta = new ArrayList<OcconsentpurposesConsentPurposesMeta>();
    }
    this.consentPurposesMeta.add(consentPurposesMetaItem);
    return this;
  }

  /**
   * Get consentPurposesMeta
   * @return consentPurposesMeta
   **/
  @Schema(description = "")
      @Valid
    public List<OcconsentpurposesConsentPurposesMeta> getConsentPurposesMeta() {
    return consentPurposesMeta;
  }

  public void setConsentPurposesMeta(List<OcconsentpurposesConsentPurposesMeta> consentPurposesMeta) {
    this.consentPurposesMeta = consentPurposesMeta;
  }

  public OcConsentPurposes purposeId(String purposeId) {
    this.purposeId = purposeId;
    return this;
  }

  /**
   * Get purposeId
   * @return purposeId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPurposeId() {
    return purposeId;
  }

  public void setPurposeId(String purposeId) {
    this.purposeId = purposeId;
  }

  public OcConsentPurposes publishedAt(OffsetDateTime publishedAt) {
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
    OcConsentPurposes ocConsentPurposes = (OcConsentPurposes) o;
    return Objects.equals(this.id, ocConsentPurposes.id) &&
        Objects.equals(this.purposeShortDesc, ocConsentPurposes.purposeShortDesc) &&
        Objects.equals(this.purposeLongDesc, ocConsentPurposes.purposeLongDesc) &&
        Objects.equals(this.consentPurposesMeta, ocConsentPurposes.consentPurposesMeta) &&
        Objects.equals(this.purposeId, ocConsentPurposes.purposeId) &&
        Objects.equals(this.publishedAt, ocConsentPurposes.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, purposeShortDesc, purposeLongDesc, consentPurposesMeta, purposeId, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcConsentPurposes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    purposeShortDesc: ").append(toIndentedString(purposeShortDesc)).append("\n");
    sb.append("    purposeLongDesc: ").append(toIndentedString(purposeLongDesc)).append("\n");
    sb.append("    consentPurposesMeta: ").append(toIndentedString(consentPurposesMeta)).append("\n");
    sb.append("    purposeId: ").append(toIndentedString(purposeId)).append("\n");
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
