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
 * NewOcRoles
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class NewOcRoles   {
  @JsonProperty("role_shortname")
  private String roleShortname = null;

  @JsonProperty("role_description")
  private String roleDescription = null;

  @JsonProperty("roles_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> rolesMeta = null;

  @JsonProperty("role_id")
  private String roleId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcRoles roleShortname(String roleShortname) {
    this.roleShortname = roleShortname;
    return this;
  }

  /**
   * Get roleShortname
   * @return roleShortname
   **/
  @Schema(description = "")
  
    public String getRoleShortname() {
    return roleShortname;
  }

  public void setRoleShortname(String roleShortname) {
    this.roleShortname = roleShortname;
  }

  public NewOcRoles roleDescription(String roleDescription) {
    this.roleDescription = roleDescription;
    return this;
  }

  /**
   * Get roleDescription
   * @return roleDescription
   **/
  @Schema(description = "")
  
    public String getRoleDescription() {
    return roleDescription;
  }

  public void setRoleDescription(String roleDescription) {
    this.roleDescription = roleDescription;
  }

  public NewOcRoles rolesMeta(List<OcconsentpurposesConsentPurposesMeta> rolesMeta) {
    this.rolesMeta = rolesMeta;
    return this;
  }

  public NewOcRoles addRolesMetaItem(OcconsentpurposesConsentPurposesMeta rolesMetaItem) {
    if (this.rolesMeta == null) {
      this.rolesMeta = new ArrayList<OcconsentpurposesConsentPurposesMeta>();
    }
    this.rolesMeta.add(rolesMetaItem);
    return this;
  }

  /**
   * Get rolesMeta
   * @return rolesMeta
   **/
  @Schema(description = "")
      @Valid
    public List<OcconsentpurposesConsentPurposesMeta> getRolesMeta() {
    return rolesMeta;
  }

  public void setRolesMeta(List<OcconsentpurposesConsentPurposesMeta> rolesMeta) {
    this.rolesMeta = rolesMeta;
  }

  public NewOcRoles roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public NewOcRoles publishedAt(OffsetDateTime publishedAt) {
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

  public NewOcRoles createdBy(String createdBy) {
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

  public NewOcRoles updatedBy(String updatedBy) {
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
    NewOcRoles newOcRoles = (NewOcRoles) o;
    return Objects.equals(this.roleShortname, newOcRoles.roleShortname) &&
        Objects.equals(this.roleDescription, newOcRoles.roleDescription) &&
        Objects.equals(this.rolesMeta, newOcRoles.rolesMeta) &&
        Objects.equals(this.roleId, newOcRoles.roleId) &&
        Objects.equals(this.publishedAt, newOcRoles.publishedAt) &&
        Objects.equals(this.createdBy, newOcRoles.createdBy) &&
        Objects.equals(this.updatedBy, newOcRoles.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleShortname, roleDescription, rolesMeta, roleId, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcRoles {\n");
    
    sb.append("    roleShortname: ").append(toIndentedString(roleShortname)).append("\n");
    sb.append("    roleDescription: ").append(toIndentedString(roleDescription)).append("\n");
    sb.append("    rolesMeta: ").append(toIndentedString(rolesMeta)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
