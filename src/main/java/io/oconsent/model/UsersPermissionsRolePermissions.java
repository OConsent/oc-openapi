package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * UsersPermissionsRolePermissions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class UsersPermissionsRolePermissions   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("controller")
  private String controller = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("policy")
  private String policy = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public UsersPermissionsRolePermissions id(String id) {
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

  public UsersPermissionsRolePermissions type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UsersPermissionsRolePermissions controller(String controller) {
    this.controller = controller;
    return this;
  }

  /**
   * Get controller
   * @return controller
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getController() {
    return controller;
  }

  public void setController(String controller) {
    this.controller = controller;
  }

  public UsersPermissionsRolePermissions action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public UsersPermissionsRolePermissions enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UsersPermissionsRolePermissions policy(String policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   * @return policy
   **/
  @Schema(description = "")
  
    public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public UsersPermissionsRolePermissions role(String role) {
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

  public UsersPermissionsRolePermissions createdBy(String createdBy) {
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

  public UsersPermissionsRolePermissions updatedBy(String updatedBy) {
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
    UsersPermissionsRolePermissions usersPermissionsRolePermissions = (UsersPermissionsRolePermissions) o;
    return Objects.equals(this.id, usersPermissionsRolePermissions.id) &&
        Objects.equals(this.type, usersPermissionsRolePermissions.type) &&
        Objects.equals(this.controller, usersPermissionsRolePermissions.controller) &&
        Objects.equals(this.action, usersPermissionsRolePermissions.action) &&
        Objects.equals(this.enabled, usersPermissionsRolePermissions.enabled) &&
        Objects.equals(this.policy, usersPermissionsRolePermissions.policy) &&
        Objects.equals(this.role, usersPermissionsRolePermissions.role) &&
        Objects.equals(this.createdBy, usersPermissionsRolePermissions.createdBy) &&
        Objects.equals(this.updatedBy, usersPermissionsRolePermissions.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, controller, action, enabled, policy, role, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPermissionsRolePermissions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
