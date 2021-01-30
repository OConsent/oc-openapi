package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OcconsentpurposesConsentPurposesMeta
 */
@Validated


public class OcconsentpurposesConsentPurposesMeta   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("change_id")
  private String changeId = "NONE";

  @JsonProperty("is_active")
  private Boolean isActive = false;

  @JsonProperty("date_created")
  private OffsetDateTime dateCreated = null;

  @JsonProperty("update_date")
  private OffsetDateTime updateDate = null;

  public OcconsentpurposesConsentPurposesMeta id(String id) {
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

  public OcconsentpurposesConsentPurposesMeta changeId(String changeId) {
    this.changeId = changeId;
    return this;
  }

  /**
   * Get changeId
   * @return changeId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getChangeId() {
    return changeId;
  }

  public void setChangeId(String changeId) {
    this.changeId = changeId;
  }

  public OcconsentpurposesConsentPurposesMeta isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public OcconsentpurposesConsentPurposesMeta dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public OcconsentpurposesConsentPurposesMeta updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcconsentpurposesConsentPurposesMeta occonsentpurposesConsentPurposesMeta = (OcconsentpurposesConsentPurposesMeta) o;
    return Objects.equals(this.id, occonsentpurposesConsentPurposesMeta.id) &&
        Objects.equals(this.changeId, occonsentpurposesConsentPurposesMeta.changeId) &&
        Objects.equals(this.isActive, occonsentpurposesConsentPurposesMeta.isActive) &&
        Objects.equals(this.dateCreated, occonsentpurposesConsentPurposesMeta.dateCreated) &&
        Objects.equals(this.updateDate, occonsentpurposesConsentPurposesMeta.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, changeId, isActive, dateCreated, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcconsentpurposesConsentPurposesMeta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    changeId: ").append(toIndentedString(changeId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
