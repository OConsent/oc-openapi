package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * UsersPermissionsRoleUsers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class UsersPermissionsRoleUsers   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("resetPasswordToken")
  private String resetPasswordToken = null;

  @JsonProperty("confirmationToken")
  private String confirmationToken = null;

  @JsonProperty("confirmed")
  private Boolean confirmed = null;

  @JsonProperty("blocked")
  private Boolean blocked = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public UsersPermissionsRoleUsers id(String id) {
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

  public UsersPermissionsRoleUsers username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UsersPermissionsRoleUsers email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UsersPermissionsRoleUsers provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
   **/
  @Schema(description = "")
  
    public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public UsersPermissionsRoleUsers password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @Schema(description = "")
  
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UsersPermissionsRoleUsers resetPasswordToken(String resetPasswordToken) {
    this.resetPasswordToken = resetPasswordToken;
    return this;
  }

  /**
   * Get resetPasswordToken
   * @return resetPasswordToken
   **/
  @Schema(description = "")
  
    public String getResetPasswordToken() {
    return resetPasswordToken;
  }

  public void setResetPasswordToken(String resetPasswordToken) {
    this.resetPasswordToken = resetPasswordToken;
  }

  public UsersPermissionsRoleUsers confirmationToken(String confirmationToken) {
    this.confirmationToken = confirmationToken;
    return this;
  }

  /**
   * Get confirmationToken
   * @return confirmationToken
   **/
  @Schema(description = "")
  
    public String getConfirmationToken() {
    return confirmationToken;
  }

  public void setConfirmationToken(String confirmationToken) {
    this.confirmationToken = confirmationToken;
  }

  public UsersPermissionsRoleUsers confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

  /**
   * Get confirmed
   * @return confirmed
   **/
  @Schema(description = "")
  
    public Boolean isConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public UsersPermissionsRoleUsers blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Get blocked
   * @return blocked
   **/
  @Schema(description = "")
  
    public Boolean isBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public UsersPermissionsRoleUsers role(String role) {
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

  public UsersPermissionsRoleUsers createdBy(String createdBy) {
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

  public UsersPermissionsRoleUsers updatedBy(String updatedBy) {
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
    UsersPermissionsRoleUsers usersPermissionsRoleUsers = (UsersPermissionsRoleUsers) o;
    return Objects.equals(this.id, usersPermissionsRoleUsers.id) &&
        Objects.equals(this.username, usersPermissionsRoleUsers.username) &&
        Objects.equals(this.email, usersPermissionsRoleUsers.email) &&
        Objects.equals(this.provider, usersPermissionsRoleUsers.provider) &&
        Objects.equals(this.password, usersPermissionsRoleUsers.password) &&
        Objects.equals(this.resetPasswordToken, usersPermissionsRoleUsers.resetPasswordToken) &&
        Objects.equals(this.confirmationToken, usersPermissionsRoleUsers.confirmationToken) &&
        Objects.equals(this.confirmed, usersPermissionsRoleUsers.confirmed) &&
        Objects.equals(this.blocked, usersPermissionsRoleUsers.blocked) &&
        Objects.equals(this.role, usersPermissionsRoleUsers.role) &&
        Objects.equals(this.createdBy, usersPermissionsRoleUsers.createdBy) &&
        Objects.equals(this.updatedBy, usersPermissionsRoleUsers.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, email, provider, password, resetPasswordToken, confirmationToken, confirmed, blocked, role, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPermissionsRoleUsers {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    resetPasswordToken: ").append(toIndentedString(resetPasswordToken)).append("\n");
    sb.append("    confirmationToken: ").append(toIndentedString(confirmationToken)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
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
