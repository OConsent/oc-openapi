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
 * OcDak
 */
@Validated


public class OcDak   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("consent_id")
  private String consentId = null;

  @JsonProperty("dak_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> dakMeta = null;

  @JsonProperty("dak_id")
  private String dakId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  public OcDak id(String id) {
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

  public OcDak consentId(String consentId) {
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

  public OcDak dakMeta(List<OcconsentpurposesConsentPurposesMeta> dakMeta) {
    this.dakMeta = dakMeta;
    return this;
  }

  public OcDak addDakMetaItem(OcconsentpurposesConsentPurposesMeta dakMetaItem) {
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

  public OcDak dakId(String dakId) {
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

  public OcDak publishedAt(OffsetDateTime publishedAt) {
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
    OcDak ocDak = (OcDak) o;
    return Objects.equals(this.id, ocDak.id) &&
        Objects.equals(this.consentId, ocDak.consentId) &&
        Objects.equals(this.dakMeta, ocDak.dakMeta) &&
        Objects.equals(this.dakId, ocDak.dakId) &&
        Objects.equals(this.publishedAt, ocDak.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, consentId, dakMeta, dakId, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcDak {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    dakMeta: ").append(toIndentedString(dakMeta)).append("\n");
    sb.append("    dakId: ").append(toIndentedString(dakId)).append("\n");
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
