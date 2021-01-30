package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * OcentitiesCurrentAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class OcentitiesCurrentAddress   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("Country")
  private String country = "Singapore";

  @JsonProperty("City")
  private String city = "Singapore";

  public OcentitiesCurrentAddress id(String id) {
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

  public OcentitiesCurrentAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OcentitiesCurrentAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcentitiesCurrentAddress ocentitiesCurrentAddress = (OcentitiesCurrentAddress) o;
    return Objects.equals(this.id, ocentitiesCurrentAddress.id) &&
        Objects.equals(this.country, ocentitiesCurrentAddress.country) &&
        Objects.equals(this.city, ocentitiesCurrentAddress.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, country, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcentitiesCurrentAddress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
