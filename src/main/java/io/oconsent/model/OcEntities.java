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
 * OcEntities
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class OcEntities   {
  @JsonProperty("id")
  private String id = null;

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

  public OcEntities id(String id) {
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

  public OcEntities entitiesMeta(OcconsentpurposesConsentPurposesMeta entitiesMeta) {
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

  public OcEntities currentAddress(List<OcentitiesCurrentAddress> currentAddress) {
    this.currentAddress = currentAddress;
    return this;
  }

  public OcEntities addCurrentAddressItem(OcentitiesCurrentAddress currentAddressItem) {
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

  public OcEntities displayName(String displayName) {
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

  public OcEntities linkedId(String linkedId) {
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

  public OcEntities legalFullName(String legalFullName) {
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

  public OcEntities webAddress(String webAddress) {
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

  public OcEntities registeredAddress(List<OcentitiesCurrentAddress> registeredAddress) {
    this.registeredAddress = registeredAddress;
    return this;
  }

  public OcEntities addRegisteredAddressItem(OcentitiesCurrentAddress registeredAddressItem) {
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

  public OcEntities primaryEmailAddress(String primaryEmailAddress) {
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

  public OcEntities secondaryEmailAddress(String secondaryEmailAddress) {
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

  public OcEntities isIndividual(Boolean isIndividual) {
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

  public OcEntities entityType(String entityType) {
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

  public OcEntities isAnonymous(Boolean isAnonymous) {
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

  public OcEntities officialIdNumber(String officialIdNumber) {
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

  public OcEntities officialIdType(OfficialIdTypeEnum officialIdType) {
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

  public OcEntities role(String role) {
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

  public OcEntities isValidated(Boolean isValidated) {
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

  public OcEntities validationDate(OffsetDateTime validationDate) {
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

  public OcEntities entityId(String entityId) {
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

  public OcEntities publishedAt(OffsetDateTime publishedAt) {
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
    OcEntities ocEntities = (OcEntities) o;
    return Objects.equals(this.id, ocEntities.id) &&
        Objects.equals(this.entitiesMeta, ocEntities.entitiesMeta) &&
        Objects.equals(this.currentAddress, ocEntities.currentAddress) &&
        Objects.equals(this.displayName, ocEntities.displayName) &&
        Objects.equals(this.linkedId, ocEntities.linkedId) &&
        Objects.equals(this.legalFullName, ocEntities.legalFullName) &&
        Objects.equals(this.webAddress, ocEntities.webAddress) &&
        Objects.equals(this.registeredAddress, ocEntities.registeredAddress) &&
        Objects.equals(this.primaryEmailAddress, ocEntities.primaryEmailAddress) &&
        Objects.equals(this.secondaryEmailAddress, ocEntities.secondaryEmailAddress) &&
        Objects.equals(this.isIndividual, ocEntities.isIndividual) &&
        Objects.equals(this.entityType, ocEntities.entityType) &&
        Objects.equals(this.isAnonymous, ocEntities.isAnonymous) &&
        Objects.equals(this.officialIdNumber, ocEntities.officialIdNumber) &&
        Objects.equals(this.officialIdType, ocEntities.officialIdType) &&
        Objects.equals(this.role, ocEntities.role) &&
        Objects.equals(this.isValidated, ocEntities.isValidated) &&
        Objects.equals(this.validationDate, ocEntities.validationDate) &&
        Objects.equals(this.entityId, ocEntities.entityId) &&
        Objects.equals(this.publishedAt, ocEntities.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entitiesMeta, currentAddress, displayName, linkedId, legalFullName, webAddress, registeredAddress, primaryEmailAddress, secondaryEmailAddress, isIndividual, entityType, isAnonymous, officialIdNumber, officialIdType, role, isValidated, validationDate, entityId, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcEntities {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
