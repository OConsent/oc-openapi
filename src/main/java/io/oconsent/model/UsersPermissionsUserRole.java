package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UsersPermissionsUserRole
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class UsersPermissionsUserRole   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("permissions")
  @Valid
  private List<String> permissions = null;

  @JsonProperty("users")
  @Valid
  private List<String> users = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public UsersPermissionsUserRole id(String id) {
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

  public UsersPermissionsUserRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UsersPermissionsUserRole description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UsersPermissionsUserRole type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UsersPermissionsUserRole permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UsersPermissionsUserRole addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<String>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   **/
  @Schema(description = "")
  
    public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public UsersPermissionsUserRole users(List<String> users) {
    this.users = users;
    return this;
  }

  public UsersPermissionsUserRole addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   **/
  @Schema(description = "")
  
    public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }

  public UsersPermissionsUserRole createdBy(String createdBy) {
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

  public UsersPermissionsUserRole updatedBy(String updatedBy) {
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
    UsersPermissionsUserRole usersPermissionsUserRole = (UsersPermissionsUserRole) o;
    return Objects.equals(this.id, usersPermissionsUserRole.id) &&
        Objects.equals(this.name, usersPermissionsUserRole.name) &&
        Objects.equals(this.description, usersPermissionsUserRole.description) &&
        Objects.equals(this.type, usersPermissionsUserRole.type) &&
        Objects.equals(this.permissions, usersPermissionsUserRole.permissions) &&
        Objects.equals(this.users, usersPermissionsUserRole.users) &&
        Objects.equals(this.createdBy, usersPermissionsUserRole.createdBy) &&
        Objects.equals(this.updatedBy, usersPermissionsUserRole.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, type, permissions, users, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPermissionsUserRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
