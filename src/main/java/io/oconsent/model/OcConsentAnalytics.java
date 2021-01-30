package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OcConsentAnalytics
 */
@Validated


public class OcConsentAnalytics   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("analytics_property")
  private String analyticsProperty = null;

  @JsonProperty("update_date")
  private OffsetDateTime updateDate = null;

  @JsonProperty("consent_id")
  private String consentId = null;

  @JsonProperty("dataset_id")
  private String datasetId = null;

  @JsonProperty("analytics_value")
  private String analyticsValue = null;

  @JsonProperty("analytics_property_id")
  private String analyticsPropertyId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  public OcConsentAnalytics id(String id) {
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

  public OcConsentAnalytics analyticsProperty(String analyticsProperty) {
    this.analyticsProperty = analyticsProperty;
    return this;
  }

  /**
   * Get analyticsProperty
   * @return analyticsProperty
   **/
  @Schema(description = "")
  
    public String getAnalyticsProperty() {
    return analyticsProperty;
  }

  public void setAnalyticsProperty(String analyticsProperty) {
    this.analyticsProperty = analyticsProperty;
  }

  public OcConsentAnalytics updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public OcConsentAnalytics consentId(String consentId) {
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

  public OcConsentAnalytics datasetId(String datasetId) {
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

  public OcConsentAnalytics analyticsValue(String analyticsValue) {
    this.analyticsValue = analyticsValue;
    return this;
  }

  /**
   * Get analyticsValue
   * @return analyticsValue
   **/
  @Schema(description = "")
  
    public String getAnalyticsValue() {
    return analyticsValue;
  }

  public void setAnalyticsValue(String analyticsValue) {
    this.analyticsValue = analyticsValue;
  }

  public OcConsentAnalytics analyticsPropertyId(String analyticsPropertyId) {
    this.analyticsPropertyId = analyticsPropertyId;
    return this;
  }

  /**
   * Get analyticsPropertyId
   * @return analyticsPropertyId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAnalyticsPropertyId() {
    return analyticsPropertyId;
  }

  public void setAnalyticsPropertyId(String analyticsPropertyId) {
    this.analyticsPropertyId = analyticsPropertyId;
  }

  public OcConsentAnalytics publishedAt(OffsetDateTime publishedAt) {
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
    OcConsentAnalytics ocConsentAnalytics = (OcConsentAnalytics) o;
    return Objects.equals(this.id, ocConsentAnalytics.id) &&
        Objects.equals(this.analyticsProperty, ocConsentAnalytics.analyticsProperty) &&
        Objects.equals(this.updateDate, ocConsentAnalytics.updateDate) &&
        Objects.equals(this.consentId, ocConsentAnalytics.consentId) &&
        Objects.equals(this.datasetId, ocConsentAnalytics.datasetId) &&
        Objects.equals(this.analyticsValue, ocConsentAnalytics.analyticsValue) &&
        Objects.equals(this.analyticsPropertyId, ocConsentAnalytics.analyticsPropertyId) &&
        Objects.equals(this.publishedAt, ocConsentAnalytics.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, analyticsProperty, updateDate, consentId, datasetId, analyticsValue, analyticsPropertyId, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcConsentAnalytics {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    analyticsProperty: ").append(toIndentedString(analyticsProperty)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    analyticsValue: ").append(toIndentedString(analyticsValue)).append("\n");
    sb.append("    analyticsPropertyId: ").append(toIndentedString(analyticsPropertyId)).append("\n");
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
