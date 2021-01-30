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
 * UsersPermissionsRole
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class UsersPermissionsRole   {
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
  private List<UsersPermissionsRolePermissions> permissions = null;

  @JsonProperty("users")
  @Valid
  private List<UsersPermissionsRoleUsers> users = null;

  public UsersPermissionsRole id(String id) {
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

  public UsersPermissionsRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=3)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UsersPermissionsRole description(String description) {
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

  public UsersPermissionsRole type(String type) {
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

  public UsersPermissionsRole permissions(List<UsersPermissionsRolePermissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UsersPermissionsRole addPermissionsItem(UsersPermissionsRolePermissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<UsersPermissionsRolePermissions>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   **/
  @Schema(description = "")
      @Valid
    public List<UsersPermissionsRolePermissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<UsersPermissionsRolePermissions> permissions) {
    this.permissions = permissions;
  }

  public UsersPermissionsRole users(List<UsersPermissionsRoleUsers> users) {
    this.users = users;
    return this;
  }

  public UsersPermissionsRole addUsersItem(UsersPermissionsRoleUsers usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<UsersPermissionsRoleUsers>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   **/
  @Schema(description = "")
      @Valid
    public List<UsersPermissionsRoleUsers> getUsers() {
    return users;
  }

  public void setUsers(List<UsersPermissionsRoleUsers> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersPermissionsRole usersPermissionsRole = (UsersPermissionsRole) o;
    return Objects.equals(this.id, usersPermissionsRole.id) &&
        Objects.equals(this.name, usersPermissionsRole.name) &&
        Objects.equals(this.description, usersPermissionsRole.description) &&
        Objects.equals(this.type, usersPermissionsRole.type) &&
        Objects.equals(this.permissions, usersPermissionsRole.permissions) &&
        Objects.equals(this.users, usersPermissionsRole.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, type, permissions, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPermissionsRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
