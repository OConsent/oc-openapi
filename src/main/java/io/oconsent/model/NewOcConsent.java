package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewOcConsent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class NewOcConsent   {
  @JsonProperty("purpose_id")
  private String purposeId = null;

  @JsonProperty("consent_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> consentMeta = null;

  @JsonProperty("data_subject_name")
  private String dataSubjectName = null;

  @JsonProperty("data_subject_id")
  private String dataSubjectId = null;

  @JsonProperty("data_controller_name")
  private String dataControllerName = null;

  @JsonProperty("data_controller_id")
  private String dataControllerId = null;

  @JsonProperty("data_processor_name")
  private String dataProcessorName = null;

  @JsonProperty("data_processor_id")
  private String dataProcessorId = null;

  @JsonProperty("dataset_ids")
  private String datasetIds = null;

  @JsonProperty("notes")
  private String notes = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    INITIATED("initiated"),
    
    WITHDS("withDS"),
    
    WITHDP("withDP"),
    
    WITHDC("withDC"),
    
    LOCKED("locked"),
    
    PLATFORMVALIDATING("platformValidating"),
    
    ACTIVE("active"),
    
    SUSPENDED("suspended"),
    
    EXPIRED("expired");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("is_monetization_enabled")
  private Boolean isMonetizationEnabled = false;

  @JsonProperty("contract_terms")
  private Object contractTerms = null;

  @JsonProperty("is_transferrable")
  private Boolean isTransferrable = false;

  @JsonProperty("is_recurring")
  private Boolean isRecurring = false;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("version")
  private BigDecimal version = new BigDecimal(1);

  @JsonProperty("contract_envelope_hash")
  private String contractEnvelopeHash = null;

  @JsonProperty("enabled_proofs_csv")
  private String enabledProofsCsv = null;

  @JsonProperty("consent_id")
  private String consentId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcConsent purposeId(String purposeId) {
    this.purposeId = purposeId;
    return this;
  }

  /**
   * Get purposeId
   * @return purposeId
   **/
  @Schema(description = "")
  
    public String getPurposeId() {
    return purposeId;
  }

  public void setPurposeId(String purposeId) {
    this.purposeId = purposeId;
  }

  public NewOcConsent consentMeta(List<OcconsentpurposesConsentPurposesMeta> consentMeta) {
    this.consentMeta = consentMeta;
    return this;
  }

  public NewOcConsent addConsentMetaItem(OcconsentpurposesConsentPurposesMeta consentMetaItem) {
    if (this.consentMeta == null) {
      this.consentMeta = new ArrayList<OcconsentpurposesConsentPurposesMeta>();
    }
    this.consentMeta.add(consentMetaItem);
    return this;
  }

  /**
   * Get consentMeta
   * @return consentMeta
   **/
  @Schema(description = "")
      @Valid
    public List<OcconsentpurposesConsentPurposesMeta> getConsentMeta() {
    return consentMeta;
  }

  public void setConsentMeta(List<OcconsentpurposesConsentPurposesMeta> consentMeta) {
    this.consentMeta = consentMeta;
  }

  public NewOcConsent dataSubjectName(String dataSubjectName) {
    this.dataSubjectName = dataSubjectName;
    return this;
  }

  /**
   * Get dataSubjectName
   * @return dataSubjectName
   **/
  @Schema(description = "")
  
    public String getDataSubjectName() {
    return dataSubjectName;
  }

  public void setDataSubjectName(String dataSubjectName) {
    this.dataSubjectName = dataSubjectName;
  }

  public NewOcConsent dataSubjectId(String dataSubjectId) {
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

  public NewOcConsent dataControllerName(String dataControllerName) {
    this.dataControllerName = dataControllerName;
    return this;
  }

  /**
   * Get dataControllerName
   * @return dataControllerName
   **/
  @Schema(description = "")
  
    public String getDataControllerName() {
    return dataControllerName;
  }

  public void setDataControllerName(String dataControllerName) {
    this.dataControllerName = dataControllerName;
  }

  public NewOcConsent dataControllerId(String dataControllerId) {
    this.dataControllerId = dataControllerId;
    return this;
  }

  /**
   * Get dataControllerId
   * @return dataControllerId
   **/
  @Schema(description = "")
  
    public String getDataControllerId() {
    return dataControllerId;
  }

  public void setDataControllerId(String dataControllerId) {
    this.dataControllerId = dataControllerId;
  }

  public NewOcConsent dataProcessorName(String dataProcessorName) {
    this.dataProcessorName = dataProcessorName;
    return this;
  }

  /**
   * Get dataProcessorName
   * @return dataProcessorName
   **/
  @Schema(description = "")
  
    public String getDataProcessorName() {
    return dataProcessorName;
  }

  public void setDataProcessorName(String dataProcessorName) {
    this.dataProcessorName = dataProcessorName;
  }

  public NewOcConsent dataProcessorId(String dataProcessorId) {
    this.dataProcessorId = dataProcessorId;
    return this;
  }

  /**
   * Get dataProcessorId
   * @return dataProcessorId
   **/
  @Schema(description = "")
  
    public String getDataProcessorId() {
    return dataProcessorId;
  }

  public void setDataProcessorId(String dataProcessorId) {
    this.dataProcessorId = dataProcessorId;
  }

  public NewOcConsent datasetIds(String datasetIds) {
    this.datasetIds = datasetIds;
    return this;
  }

  /**
   * Get datasetIds
   * @return datasetIds
   **/
  @Schema(description = "")
  
    public String getDatasetIds() {
    return datasetIds;
  }

  public void setDatasetIds(String datasetIds) {
    this.datasetIds = datasetIds;
  }

  public NewOcConsent notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(description = "")
  
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public NewOcConsent status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public NewOcConsent isMonetizationEnabled(Boolean isMonetizationEnabled) {
    this.isMonetizationEnabled = isMonetizationEnabled;
    return this;
  }

  /**
   * Get isMonetizationEnabled
   * @return isMonetizationEnabled
   **/
  @Schema(description = "")
  
    public Boolean isIsMonetizationEnabled() {
    return isMonetizationEnabled;
  }

  public void setIsMonetizationEnabled(Boolean isMonetizationEnabled) {
    this.isMonetizationEnabled = isMonetizationEnabled;
  }

  public NewOcConsent contractTerms(Object contractTerms) {
    this.contractTerms = contractTerms;
    return this;
  }

  /**
   * Get contractTerms
   * @return contractTerms
   **/
  @Schema(description = "")
  
    public Object getContractTerms() {
    return contractTerms;
  }

  public void setContractTerms(Object contractTerms) {
    this.contractTerms = contractTerms;
  }

  public NewOcConsent isTransferrable(Boolean isTransferrable) {
    this.isTransferrable = isTransferrable;
    return this;
  }

  /**
   * Get isTransferrable
   * @return isTransferrable
   **/
  @Schema(description = "")
  
    public Boolean isIsTransferrable() {
    return isTransferrable;
  }

  public void setIsTransferrable(Boolean isTransferrable) {
    this.isTransferrable = isTransferrable;
  }

  public NewOcConsent isRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
    return this;
  }

  /**
   * Get isRecurring
   * @return isRecurring
   **/
  @Schema(description = "")
  
    public Boolean isIsRecurring() {
    return isRecurring;
  }

  public void setIsRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
  }

  public NewOcConsent startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public NewOcConsent endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public NewOcConsent version(BigDecimal version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public NewOcConsent contractEnvelopeHash(String contractEnvelopeHash) {
    this.contractEnvelopeHash = contractEnvelopeHash;
    return this;
  }

  /**
   * Get contractEnvelopeHash
   * @return contractEnvelopeHash
   **/
  @Schema(description = "")
  
    public String getContractEnvelopeHash() {
    return contractEnvelopeHash;
  }

  public void setContractEnvelopeHash(String contractEnvelopeHash) {
    this.contractEnvelopeHash = contractEnvelopeHash;
  }

  public NewOcConsent enabledProofsCsv(String enabledProofsCsv) {
    this.enabledProofsCsv = enabledProofsCsv;
    return this;
  }

  /**
   * Get enabledProofsCsv
   * @return enabledProofsCsv
   **/
  @Schema(description = "")
  
    public String getEnabledProofsCsv() {
    return enabledProofsCsv;
  }

  public void setEnabledProofsCsv(String enabledProofsCsv) {
    this.enabledProofsCsv = enabledProofsCsv;
  }

  public NewOcConsent consentId(String consentId) {
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

  public NewOcConsent publishedAt(OffsetDateTime publishedAt) {
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

  public NewOcConsent createdBy(String createdBy) {
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

  public NewOcConsent updatedBy(String updatedBy) {
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
    NewOcConsent newOcConsent = (NewOcConsent) o;
    return Objects.equals(this.purposeId, newOcConsent.purposeId) &&
        Objects.equals(this.consentMeta, newOcConsent.consentMeta) &&
        Objects.equals(this.dataSubjectName, newOcConsent.dataSubjectName) &&
        Objects.equals(this.dataSubjectId, newOcConsent.dataSubjectId) &&
        Objects.equals(this.dataControllerName, newOcConsent.dataControllerName) &&
        Objects.equals(this.dataControllerId, newOcConsent.dataControllerId) &&
        Objects.equals(this.dataProcessorName, newOcConsent.dataProcessorName) &&
        Objects.equals(this.dataProcessorId, newOcConsent.dataProcessorId) &&
        Objects.equals(this.datasetIds, newOcConsent.datasetIds) &&
        Objects.equals(this.notes, newOcConsent.notes) &&
        Objects.equals(this.status, newOcConsent.status) &&
        Objects.equals(this.isMonetizationEnabled, newOcConsent.isMonetizationEnabled) &&
        Objects.equals(this.contractTerms, newOcConsent.contractTerms) &&
        Objects.equals(this.isTransferrable, newOcConsent.isTransferrable) &&
        Objects.equals(this.isRecurring, newOcConsent.isRecurring) &&
        Objects.equals(this.startDate, newOcConsent.startDate) &&
        Objects.equals(this.endDate, newOcConsent.endDate) &&
        Objects.equals(this.version, newOcConsent.version) &&
        Objects.equals(this.contractEnvelopeHash, newOcConsent.contractEnvelopeHash) &&
        Objects.equals(this.enabledProofsCsv, newOcConsent.enabledProofsCsv) &&
        Objects.equals(this.consentId, newOcConsent.consentId) &&
        Objects.equals(this.publishedAt, newOcConsent.publishedAt) &&
        Objects.equals(this.createdBy, newOcConsent.createdBy) &&
        Objects.equals(this.updatedBy, newOcConsent.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purposeId, consentMeta, dataSubjectName, dataSubjectId, dataControllerName, dataControllerId, dataProcessorName, dataProcessorId, datasetIds, notes, status, isMonetizationEnabled, contractTerms, isTransferrable, isRecurring, startDate, endDate, version, contractEnvelopeHash, enabledProofsCsv, consentId, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcConsent {\n");
    
    sb.append("    purposeId: ").append(toIndentedString(purposeId)).append("\n");
    sb.append("    consentMeta: ").append(toIndentedString(consentMeta)).append("\n");
    sb.append("    dataSubjectName: ").append(toIndentedString(dataSubjectName)).append("\n");
    sb.append("    dataSubjectId: ").append(toIndentedString(dataSubjectId)).append("\n");
    sb.append("    dataControllerName: ").append(toIndentedString(dataControllerName)).append("\n");
    sb.append("    dataControllerId: ").append(toIndentedString(dataControllerId)).append("\n");
    sb.append("    dataProcessorName: ").append(toIndentedString(dataProcessorName)).append("\n");
    sb.append("    dataProcessorId: ").append(toIndentedString(dataProcessorId)).append("\n");
    sb.append("    datasetIds: ").append(toIndentedString(datasetIds)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isMonetizationEnabled: ").append(toIndentedString(isMonetizationEnabled)).append("\n");
    sb.append("    contractTerms: ").append(toIndentedString(contractTerms)).append("\n");
    sb.append("    isTransferrable: ").append(toIndentedString(isTransferrable)).append("\n");
    sb.append("    isRecurring: ").append(toIndentedString(isRecurring)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    contractEnvelopeHash: ").append(toIndentedString(contractEnvelopeHash)).append("\n");
    sb.append("    enabledProofsCsv: ").append(toIndentedString(enabledProofsCsv)).append("\n");
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
