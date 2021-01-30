package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * NewUsersPermissionsUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class NewUsersPermissionsUser   {
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
  private Boolean confirmed = false;

  @JsonProperty("blocked")
  private Boolean blocked = false;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewUsersPermissionsUser username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=3)   public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public NewUsersPermissionsUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=6)   public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public NewUsersPermissionsUser provider(String provider) {
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

  public NewUsersPermissionsUser password(String password) {
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

  public NewUsersPermissionsUser resetPasswordToken(String resetPasswordToken) {
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

  public NewUsersPermissionsUser confirmationToken(String confirmationToken) {
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

  public NewUsersPermissionsUser confirmed(Boolean confirmed) {
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

  public NewUsersPermissionsUser blocked(Boolean blocked) {
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

  public NewUsersPermissionsUser role(String role) {
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

  public NewUsersPermissionsUser createdBy(String createdBy) {
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

  public NewUsersPermissionsUser updatedBy(String updatedBy) {
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
    NewUsersPermissionsUser newUsersPermissionsUser = (NewUsersPermissionsUser) o;
    return Objects.equals(this.username, newUsersPermissionsUser.username) &&
        Objects.equals(this.email, newUsersPermissionsUser.email) &&
        Objects.equals(this.provider, newUsersPermissionsUser.provider) &&
        Objects.equals(this.password, newUsersPermissionsUser.password) &&
        Objects.equals(this.resetPasswordToken, newUsersPermissionsUser.resetPasswordToken) &&
        Objects.equals(this.confirmationToken, newUsersPermissionsUser.confirmationToken) &&
        Objects.equals(this.confirmed, newUsersPermissionsUser.confirmed) &&
        Objects.equals(this.blocked, newUsersPermissionsUser.blocked) &&
        Objects.equals(this.role, newUsersPermissionsUser.role) &&
        Objects.equals(this.createdBy, newUsersPermissionsUser.createdBy) &&
        Objects.equals(this.updatedBy, newUsersPermissionsUser.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, email, provider, password, resetPasswordToken, confirmationToken, confirmed, blocked, role, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUsersPermissionsUser {\n");
    
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
