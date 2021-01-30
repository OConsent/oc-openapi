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
 * NewOcEntities
 */
@Validated


public class NewOcEntities   {
  @JsonProperty("entities_meta")
  private OcconsentpurposesConsentPurposesMeta entitiesMeta = null;

  @JsonProperty("current_address")
  @Valid
  private List<OcentitiesCurrentAddress> currentAddress = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("linked_id")
  private String linkedId = null;

  @JsonProperty("legal_full_name")
  private String legalFullName = null;

  @JsonProperty("web_address")
  private String webAddress = null;

  @JsonProperty("registered_address")
  @Valid
  private List<OcentitiesCurrentAddress> registeredAddress = null;

  @JsonProperty("primary_email_address")
  private String primaryEmailAddress = null;

  @JsonProperty("secondary_email_address")
  private String secondaryEmailAddress = null;

  @JsonProperty("is_individual")
  private Boolean isIndividual = true;

  @JsonProperty("entity_type")
  private String entityType = null;

  @JsonProperty("is_anonymous")
  private Boolean isAnonymous = false;

  @JsonProperty("official_id_number")
  private String officialIdNumber = null;

  /**
   * Gets or Sets officialIdType
   */
  public enum OfficialIdTypeEnum {
    PASSPORT("Passport"),
    
    NRIC("NRIC"),
    
    SSN("SSN"),
    
    AADHAR("Aadhar");

    private String value;

    OfficialIdTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OfficialIdTypeEnum fromValue(String text) {
      for (OfficialIdTypeEnum b : OfficialIdTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("official_id_type")
  private OfficialIdTypeEnum officialIdType = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("is_validated")
  private Boolean isValidated = null;

  @JsonProperty("validation_date")
  private OffsetDateTime validationDate = null;

  @JsonProperty("entity_id")
  private String entityId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcEntities entitiesMeta(OcconsentpurposesConsentPurposesMeta entitiesMeta) {
    this.entitiesMeta = entitiesMeta;
    return this;
  }

  /**
   * Get entitiesMeta
   * @return entitiesMeta
   **/
  @Schema(description = "")
  
    @Valid
    public OcconsentpurposesConsentPurposesMeta getEntitiesMeta() {
    return entitiesMeta;
  }

  public void setEntitiesMeta(OcconsentpurposesConsentPurposesMeta entitiesMeta) {
    this.entitiesMeta = entitiesMeta;
  }

  public NewOcEntities currentAddress(List<OcentitiesCurrentAddress> currentAddress) {
    this.currentAddress = currentAddress;
    return this;
  }

  public NewOcEntities addCurrentAddressItem(OcentitiesCurrentAddress currentAddressItem) {
    if (this.currentAddress == null) {
      this.currentAddress = new ArrayList<OcentitiesCurrentAddress>();
    }
    this.currentAddress.add(currentAddressItem);
    return this;
  }

  /**
   * Get currentAddress
   * @return currentAddress
   **/
  @Schema(description = "")
      @Valid
    public List<OcentitiesCurrentAddress> getCurrentAddress() {
    return currentAddress;
  }

  public void setCurrentAddress(List<OcentitiesCurrentAddress> currentAddress) {
    this.currentAddress = currentAddress;
  }

  public NewOcEntities displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   **/
  @Schema(description = "")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public NewOcEntities linkedId(String linkedId) {
    this.linkedId = linkedId;
    return this;
  }

  /**
   * Get linkedId
   * @return linkedId
   **/
  @Schema(description = "")
  
    public String getLinkedId() {
    return linkedId;
  }

  public void setLinkedId(String linkedId) {
    this.linkedId = linkedId;
  }

  public NewOcEntities legalFullName(String legalFullName) {
    this.legalFullName = legalFullName;
    return this;
  }

  /**
   * Get legalFullName
   * @return legalFullName
   **/
  @Schema(description = "")
  
    public String getLegalFullName() {
    return legalFullName;
  }

  public void setLegalFullName(String legalFullName) {
    this.legalFullName = legalFullName;
  }

  public NewOcEntities webAddress(String webAddress) {
    this.webAddress = webAddress;
    return this;
  }

  /**
   * Get webAddress
   * @return webAddress
   **/
  @Schema(description = "")
  
    public String getWebAddress() {
    return webAddress;
  }

  public void setWebAddress(String webAddress) {
    this.webAddress = webAddress;
  }

  public NewOcEntities registeredAddress(List<OcentitiesCurrentAddress> registeredAddress) {
    this.registeredAddress = registeredAddress;
    return this;
  }

  public NewOcEntities addRegisteredAddressItem(OcentitiesCurrentAddress registeredAddressItem) {
    if (this.registeredAddress == null) {
      this.registeredAddress = new ArrayList<OcentitiesCurrentAddress>();
    }
    this.registeredAddress.add(registeredAddressItem);
    return this;
  }

  /**
   * Get registeredAddress
   * @return registeredAddress
   **/
  @Schema(description = "")
      @Valid
    public List<OcentitiesCurrentAddress> getRegisteredAddress() {
    return registeredAddress;
  }

  public void setRegisteredAddress(List<OcentitiesCurrentAddress> registeredAddress) {
    this.registeredAddress = registeredAddress;
  }

  public NewOcEntities primaryEmailAddress(String primaryEmailAddress) {
    this.primaryEmailAddress = primaryEmailAddress;
    return this;
  }

  /**
   * Get primaryEmailAddress
   * @return primaryEmailAddress
   **/
  @Schema(description = "")
  
    public String getPrimaryEmailAddress() {
    return primaryEmailAddress;
  }

  public void setPrimaryEmailAddress(String primaryEmailAddress) {
    this.primaryEmailAddress = primaryEmailAddress;
  }

  public NewOcEntities secondaryEmailAddress(String secondaryEmailAddress) {
    this.secondaryEmailAddress = secondaryEmailAddress;
    return this;
  }

  /**
   * Get secondaryEmailAddress
   * @return secondaryEmailAddress
   **/
  @Schema(description = "")
  
    public String getSecondaryEmailAddress() {
    return secondaryEmailAddress;
  }

  public void setSecondaryEmailAddress(String secondaryEmailAddress) {
    this.secondaryEmailAddress = secondaryEmailAddress;
  }

  public NewOcEntities isIndividual(Boolean isIndividual) {
    this.isIndividual = isIndividual;
    return this;
  }

  /**
   * Get isIndividual
   * @return isIndividual
   **/
  @Schema(description = "")
  
    public Boolean isIsIndividual() {
    return isIndividual;
  }

  public void setIsIndividual(Boolean isIndividual) {
    this.isIndividual = isIndividual;
  }

  public NewOcEntities entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   **/
  @Schema(description = "")
  
    public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public NewOcEntities isAnonymous(Boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
    return this;
  }

  /**
   * Get isAnonymous
   * @return isAnonymous
   **/
  @Schema(description = "")
  
    public Boolean isIsAnonymous() {
    return isAnonymous;
  }

  public void setIsAnonymous(Boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
  }

  public NewOcEntities officialIdNumber(String officialIdNumber) {
    this.officialIdNumber = officialIdNumber;
    return this;
  }

  /**
   * Get officialIdNumber
   * @return officialIdNumber
   **/
  @Schema(description = "")
  
    public String getOfficialIdNumber() {
    return officialIdNumber;
  }

  public void setOfficialIdNumber(String officialIdNumber) {
    this.officialIdNumber = officialIdNumber;
  }

  public NewOcEntities officialIdType(OfficialIdTypeEnum officialIdType) {
    this.officialIdType = officialIdType;
    return this;
  }

  /**
   * Get officialIdType
   * @return officialIdType
   **/
  @Schema(description = "")
  
    public OfficialIdTypeEnum getOfficialIdType() {
    return officialIdType;
  }

  public void setOfficialIdType(OfficialIdTypeEnum officialIdType) {
    this.officialIdType = officialIdType;
  }

  public NewOcEntities role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   **/
  @Schema(description = "")
  
    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public NewOcEntities isValidated(Boolean isValidated) {
    this.isValidated = isValidated;
    return this;
  }

  /**
   * Get isValidated
   * @return isValidated
   **/
  @Schema(description = "")
  
    public Boolean isIsValidated() {
    return isValidated;
  }

  public void setIsValidated(Boolean isValidated) {
    this.isValidated = isValidated;
  }

  public NewOcEntities validationDate(OffsetDateTime validationDate) {
    this.validationDate = validationDate;
    return this;
  }

  /**
   * Get validationDate
   * @return validationDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getValidationDate() {
    return validationDate;
  }

  public void setValidationDate(OffsetDateTime validationDate) {
    this.validationDate = validationDate;
  }

  public NewOcEntities entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public NewOcEntities publishedAt(OffsetDateTime publishedAt) {
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

  public NewOcEntities createdBy(String createdBy) {
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

  public NewOcEntities updatedBy(String updatedBy) {
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
    NewOcEntities newOcEntities = (NewOcEntities) o;
    return Objects.equals(this.entitiesMeta, newOcEntities.entitiesMeta) &&
        Objects.equals(this.currentAddress, newOcEntities.currentAddress) &&
        Objects.equals(this.displayName, newOcEntities.displayName) &&
        Objects.equals(this.linkedId, newOcEntities.linkedId) &&
        Objects.equals(this.legalFullName, newOcEntities.legalFullName) &&
        Objects.equals(this.webAddress, newOcEntities.webAddress) &&
        Objects.equals(this.registeredAddress, newOcEntities.registeredAddress) &&
        Objects.equals(this.primaryEmailAddress, newOcEntities.primaryEmailAddress) &&
        Objects.equals(this.secondaryEmailAddress, newOcEntities.secondaryEmailAddress) &&
        Objects.equals(this.isIndividual, newOcEntities.isIndividual) &&
        Objects.equals(this.entityType, newOcEntities.entityType) &&
        Objects.equals(this.isAnonymous, newOcEntities.isAnonymous) &&
        Objects.equals(this.officialIdNumber, newOcEntities.officialIdNumber) &&
        Objects.equals(this.officialIdType, newOcEntities.officialIdType) &&
        Objects.equals(this.role, newOcEntities.role) &&
        Objects.equals(this.isValidated, newOcEntities.isValidated) &&
        Objects.equals(this.validationDate, newOcEntities.validationDate) &&
        Objects.equals(this.entityId, newOcEntities.entityId) &&
        Objects.equals(this.publishedAt, newOcEntities.publishedAt) &&
        Objects.equals(this.createdBy, newOcEntities.createdBy) &&
        Objects.equals(this.updatedBy, newOcEntities.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesMeta, currentAddress, displayName, linkedId, legalFullName, webAddress, registeredAddress, primaryEmailAddress, secondaryEmailAddress, isIndividual, entityType, isAnonymous, officialIdNumber, officialIdType, role, isValidated, validationDate, entityId, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcEntities {\n");
    
    sb.append("    entitiesMeta: ").append(toIndentedString(entitiesMeta)).append("\n");
    sb.append("    currentAddress: ").append(toIndentedString(currentAddress)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    linkedId: ").append(toIndentedString(linkedId)).append("\n");
    sb.append("    legalFullName: ").append(toIndentedString(legalFullName)).append("\n");
    sb.append("    webAddress: ").append(toIndentedString(webAddress)).append("\n");
    sb.append("    registeredAddress: ").append(toIndentedString(registeredAddress)).append("\n");
    sb.append("    primaryEmailAddress: ").append(toIndentedString(primaryEmailAddress)).append("\n");
    sb.append("    secondaryEmailAddress: ").append(toIndentedString(secondaryEmailAddress)).append("\n");
    sb.append("    isIndividual: ").append(toIndentedString(isIndividual)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    isAnonymous: ").append(toIndentedString(isAnonymous)).append("\n");
    sb.append("    officialIdNumber: ").append(toIndentedString(officialIdNumber)).append("\n");
    sb.append("    officialIdType: ").append(toIndentedString(officialIdType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    isValidated: ").append(toIndentedString(isValidated)).append("\n");
    sb.append("    validationDate: ").append(toIndentedString(validationDate)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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
