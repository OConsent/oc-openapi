package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UsersPermissionsUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class UsersPermissionsUser   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("confirmed")
  private Boolean confirmed = false;

  @JsonProperty("blocked")
  private Boolean blocked = false;

  @JsonProperty("role")
  private UsersPermissionsUserRole role = null;

  public UsersPermissionsUser id(String id) {
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

  public UsersPermissionsUser username(String username) {
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

  public UsersPermissionsUser email(String email) {
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

  public UsersPermissionsUser provider(String provider) {
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

  public UsersPermissionsUser confirmed(Boolean confirmed) {
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

  public UsersPermissionsUser blocked(Boolean blocked) {
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

  public UsersPermissionsUser role(UsersPermissionsUserRole role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   **/
  @Schema(description = "")
  
    @Valid
    public UsersPermissionsUserRole getRole() {
    return role;
  }

  public void setRole(UsersPermissionsUserRole role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersPermissionsUser usersPermissionsUser = (UsersPermissionsUser) o;
    return Objects.equals(this.id, usersPermissionsUser.id) &&
        Objects.equals(this.username, usersPermissionsUser.username) &&
        Objects.equals(this.email, usersPermissionsUser.email) &&
        Objects.equals(this.provider, usersPermissionsUser.provider) &&
        Objects.equals(this.confirmed, usersPermissionsUser.confirmed) &&
        Objects.equals(this.blocked, usersPermissionsUser.blocked) &&
        Objects.equals(this.role, usersPermissionsUser.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, email, provider, confirmed, blocked, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPermissionsUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
