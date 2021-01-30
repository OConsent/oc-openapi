package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewOcDatasets
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class NewOcDatasets   {
  @JsonProperty("data_subject_id")
  private String dataSubjectId = null;

  @JsonProperty("is_shared_owner")
  private Boolean isSharedOwner = false;

  /**
   * Gets or Sets datasetType
   */
  public enum DatasetTypeEnum {
    SOCIAL("social"),
    
    FINANCIAL("financial"),
    
    DEMOGRAPHIC("demographic"),
    
    BEHAVIORAL("behavioral"),
    
    OTHER("other");

    private String value;

    DatasetTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DatasetTypeEnum fromValue(String text) {
      for (DatasetTypeEnum b : DatasetTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("dataset_type")
  private DatasetTypeEnum datasetType = null;

  @JsonProperty("owner_parties_id_csv")
  private String ownerPartiesIdCsv = null;

  @JsonProperty("data_store_location")
  private String dataStoreLocation = "s3://<BUCKET_LOCATION>";

  @JsonProperty("datasets_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> datasetsMeta = null;

  @JsonProperty("dak_id")
  private String dakId = null;

  @JsonProperty("consent_id")
  private String consentId = null;

  @JsonProperty("dataset_id")
  private String datasetId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcDatasets dataSubjectId(String dataSubjectId) {
    this.dataSubjectId = dataSubjectId;
    return this;
  }

  /**
   * Get dataSubjectId
   * @return dataSubjectId
   **/
  @Schema(description = "")
  
    public String getDataSubjectId() {
    return dataSubjectId;
  }

  public void setDataSubjectId(String dataSubjectId) {
    this.dataSubjectId = dataSubjectId;
  }

  public NewOcDatasets isSharedOwner(Boolean isSharedOwner) {
    this.isSharedOwner = isSharedOwner;
    return this;
  }

  /**
   * Get isSharedOwner
   * @return isSharedOwner
   **/
  @Schema(description = "")
  
    public Boolean isIsSharedOwner() {
    return isSharedOwner;
  }

  public void setIsSharedOwner(Boolean isSharedOwner) {
    this.isSharedOwner = isSharedOwner;
  }

  public NewOcDatasets datasetType(DatasetTypeEnum datasetType) {
    this.datasetType = datasetType;
    return this;
  }

  /**
   * Get datasetType
   * @return datasetType
   **/
  @Schema(description = "")
  
    public DatasetTypeEnum getDatasetType() {
    return datasetType;
  }

  public void setDatasetType(DatasetTypeEnum datasetType) {
    this.datasetType = datasetType;
  }

  public NewOcDatasets ownerPartiesIdCsv(String ownerPartiesIdCsv) {
    this.ownerPartiesIdCsv = ownerPartiesIdCsv;
    return this;
  }

  /**
   * Get ownerPartiesIdCsv
   * @return ownerPartiesIdCsv
   **/
  @Schema(description = "")
  
    public String getOwnerPartiesIdCsv() {
    return ownerPartiesIdCsv;
  }

  public void setOwnerPartiesIdCsv(String ownerPartiesIdCsv) {
    this.ownerPartiesIdCsv = ownerPartiesIdCsv;
  }

  public NewOcDatasets dataStoreLocation(String dataStoreLocation) {
    this.dataStoreLocation = dataStoreLocation;
    return this;
  }

  /**
   * Get dataStoreLocation
   * @return dataStoreLocation
   **/
  @Schema(description = "")
  
    public String getDataStoreLocation() {
    return dataStoreLocation;
  }

  public void setDataStoreLocation(String dataStoreLocation) {
    this.dataStoreLocation = dataStoreLocation;
  }

  public NewOcDatasets datasetsMeta(List<OcconsentpurposesConsentPurposesMeta> datasetsMeta) {
    this.datasetsMeta = datasetsMeta;
    return this;
  }

  public NewOcDatasets addDatasetsMetaItem(OcconsentpurposesConsentPurposesMeta datasetsMetaItem) {
    if (this.datasetsMeta == null) {
      this.datasetsMeta = new ArrayList<OcconsentpurposesConsentPurposesMeta>();
    }
    this.datasetsMeta.add(datasetsMetaItem);
    return this;
  }

  /**
   * Get datasetsMeta
   * @return datasetsMeta
   **/
  @Schema(description = "")
      @Valid
    public List<OcconsentpurposesConsentPurposesMeta> getDatasetsMeta() {
    return datasetsMeta;
  }

  public void setDatasetsMeta(List<OcconsentpurposesConsentPurposesMeta> datasetsMeta) {
    this.datasetsMeta = datasetsMeta;
  }

  public NewOcDatasets dakId(String dakId) {
    this.dakId = dakId;
    return this;
  }

  /**
   * Get dakId
   * @return dakId
   **/
  @Schema(description = "")
  
    public String getDakId() {
    return dakId;
  }

  public void setDakId(String dakId) {
    this.dakId = dakId;
  }

  public NewOcDatasets consentId(String consentId) {
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

  public NewOcDatasets datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * Get datasetId
   * @return datasetId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public NewOcDatasets publishedAt(OffsetDateTime publishedAt) {
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

  public NewOcDatasets createdBy(String createdBy) {
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

  public NewOcDatasets updatedBy(String updatedBy) {
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
    NewOcDatasets newOcDatasets = (NewOcDatasets) o;
    return Objects.equals(this.dataSubjectId, newOcDatasets.dataSubjectId) &&
        Objects.equals(this.isSharedOwner, newOcDatasets.isSharedOwner) &&
        Objects.equals(this.datasetType, newOcDatasets.datasetType) &&
        Objects.equals(this.ownerPartiesIdCsv, newOcDatasets.ownerPartiesIdCsv) &&
        Objects.equals(this.dataStoreLocation, newOcDatasets.dataStoreLocation) &&
        Objects.equals(this.datasetsMeta, newOcDatasets.datasetsMeta) &&
        Objects.equals(this.dakId, newOcDatasets.dakId) &&
        Objects.equals(this.consentId, newOcDatasets.consentId) &&
        Objects.equals(this.datasetId, newOcDatasets.datasetId) &&
        Objects.equals(this.publishedAt, newOcDatasets.publishedAt) &&
        Objects.equals(this.createdBy, newOcDatasets.createdBy) &&
        Objects.equals(this.updatedBy, newOcDatasets.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSubjectId, isSharedOwner, datasetType, ownerPartiesIdCsv, dataStoreLocation, datasetsMeta, dakId, consentId, datasetId, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcDatasets {\n");
    
    sb.append("    dataSubjectId: ").append(toIndentedString(dataSubjectId)).append("\n");
    sb.append("    isSharedOwner: ").append(toIndentedString(isSharedOwner)).append("\n");
    sb.append("    datasetType: ").append(toIndentedString(datasetType)).append("\n");
    sb.append("    ownerPartiesIdCsv: ").append(toIndentedString(ownerPartiesIdCsv)).append("\n");
    sb.append("    dataStoreLocation: ").append(toIndentedString(dataStoreLocation)).append("\n");
    sb.append("    datasetsMeta: ").append(toIndentedString(datasetsMeta)).append("\n");
    sb.append("    dakId: ").append(toIndentedString(dakId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
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
