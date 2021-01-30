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
 * OcDatasetTypes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class OcDatasetTypes   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("dataset_type_name")
  private String datasetTypeName = null;

  @JsonProperty("dataset_type_description")
  private String datasetTypeDescription = null;

  @JsonProperty("dataset_types_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> datasetTypesMeta = null;

  @JsonProperty("dataset_type_id")
  private String datasetTypeId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  public OcDatasetTypes id(String id) {
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

  public OcDatasetTypes datasetTypeName(String datasetTypeName) {
    this.datasetTypeName = datasetTypeName;
    return this;
  }

  /**
   * Get datasetTypeName
   * @return datasetTypeName
   **/
  @Schema(description = "")
  
    public String getDatasetTypeName() {
    return datasetTypeName;
  }

  public void setDatasetTypeName(String datasetTypeName) {
    this.datasetTypeName = datasetTypeName;
  }

  public OcDatasetTypes datasetTypeDescription(String datasetTypeDescription) {
    this.datasetTypeDescription = datasetTypeDescription;
    return this;
  }

  /**
   * Get datasetTypeDescription
   * @return datasetTypeDescription
   **/
  @Schema(description = "")
  
    public String getDatasetTypeDescription() {
    return datasetTypeDescription;
  }

  public void setDatasetTypeDescription(String datasetTypeDescription) {
    this.datasetTypeDescription = datasetTypeDescription;
  }

  public OcDatasetTypes datasetTypesMeta(List<OcconsentpurposesConsentPurposesMeta> datasetTypesMeta) {
    this.datasetTypesMeta = datasetTypesMeta;
    return this;
  }

  public OcDatasetTypes addDatasetTypesMetaItem(OcconsentpurposesConsentPurposesMeta datasetTypesMetaItem) {
    if (this.datasetTypesMeta == null) {
      this.datasetTypesMeta = new ArrayList<OcconsentpurposesConsentPurposesMeta>();
    }
    this.datasetTypesMeta.add(datasetTypesMetaItem);
    return this;
  }

  /**
   * Get datasetTypesMeta
   * @return datasetTypesMeta
   **/
  @Schema(description = "")
      @Valid
    public List<OcconsentpurposesConsentPurposesMeta> getDatasetTypesMeta() {
    return datasetTypesMeta;
  }

  public void setDatasetTypesMeta(List<OcconsentpurposesConsentPurposesMeta> datasetTypesMeta) {
    this.datasetTypesMeta = datasetTypesMeta;
  }

  public OcDatasetTypes datasetTypeId(String datasetTypeId) {
    this.datasetTypeId = datasetTypeId;
    return this;
  }

  /**
   * Get datasetTypeId
   * @return datasetTypeId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDatasetTypeId() {
    return datasetTypeId;
  }

  public void setDatasetTypeId(String datasetTypeId) {
    this.datasetTypeId = datasetTypeId;
  }

  public OcDatasetTypes publishedAt(OffsetDateTime publishedAt) {
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
    OcDatasetTypes ocDatasetTypes = (OcDatasetTypes) o;
    return Objects.equals(this.id, ocDatasetTypes.id) &&
        Objects.equals(this.datasetTypeName, ocDatasetTypes.datasetTypeName) &&
        Objects.equals(this.datasetTypeDescription, ocDatasetTypes.datasetTypeDescription) &&
        Objects.equals(this.datasetTypesMeta, ocDatasetTypes.datasetTypesMeta) &&
        Objects.equals(this.datasetTypeId, ocDatasetTypes.datasetTypeId) &&
        Objects.equals(this.publishedAt, ocDatasetTypes.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, datasetTypeName, datasetTypeDescription, datasetTypesMeta, datasetTypeId, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcDatasetTypes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    datasetTypeName: ").append(toIndentedString(datasetTypeName)).append("\n");
    sb.append("    datasetTypeDescription: ").append(toIndentedString(datasetTypeDescription)).append("\n");
    sb.append("    datasetTypesMeta: ").append(toIndentedString(datasetTypesMeta)).append("\n");
    sb.append("    datasetTypeId: ").append(toIndentedString(datasetTypeId)).append("\n");
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
