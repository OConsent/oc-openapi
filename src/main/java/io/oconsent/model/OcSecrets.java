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
 * OcSecrets
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class OcSecrets   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("entity_id")
  private String entityId = null;

  @JsonProperty("public_key")
  private String publicKey = null;

  /**
   * Gets or Sets publicKeyType
   */
  public enum PublicKeyTypeEnum {
    RSA4096("rsa4096"),
    
    RSA2048("rsa2048"),
    
    RSA1024("rsa1024");

    private String value;

    PublicKeyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PublicKeyTypeEnum fromValue(String text) {
      for (PublicKeyTypeEnum b : PublicKeyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("public_key_type")
  private PublicKeyTypeEnum publicKeyType = null;

  @JsonProperty("secrets_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> secretsMeta = null;

  @JsonProperty("is_platform_generated")
  private Boolean isPlatformGenerated = null;

  @JsonProperty("max_usage_limit")
  private Integer maxUsageLimit = -1;

  @JsonProperty("is_autorotate")
  private Boolean isAutorotate = false;

  @JsonProperty("secret_id")
  private String secretId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  public OcSecrets id(String id) {
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

  public OcSecrets entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   **/
  @Schema(description = "")
  
    public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public OcSecrets publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Get publicKey
   * @return publicKey
   **/
  @Schema(description = "")
  
    public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public OcSecrets publicKeyType(PublicKeyTypeEnum publicKeyType) {
    this.publicKeyType = publicKeyType;
    return this;
  }

  /**
   * Get publicKeyType
   * @return publicKeyType
   **/
  @Schema(description = "")
  
    public PublicKeyTypeEnum getPublicKeyType() {
    return publicKeyType;
  }

  public void setPublicKeyType(PublicKeyTypeEnum publicKeyType) {
    this.publicKeyType = publicKeyType;
  }

  public OcSecrets secretsMeta(List<OcconsentpurposesConsentPurposesMeta> secretsMeta) {
    this.secretsMeta = secretsMeta;
    return this;
  }

  public OcSecrets addSecretsMetaItem(OcconsentpurposesConsentPurposesMeta secretsMetaItem) {
    if (this.secretsMeta == null) {
      this.secretsMeta = new ArrayList<OcconsentpurposesConsentPurposesMeta>();
    }
    this.secretsMeta.add(secretsMetaItem);
    return this;
  }

  /**
   * Get secretsMeta
   * @return secretsMeta
   **/
  @Schema(description = "")
      @Valid
    public List<OcconsentpurposesConsentPurposesMeta> getSecretsMeta() {
    return secretsMeta;
  }

  public void setSecretsMeta(List<OcconsentpurposesConsentPurposesMeta> secretsMeta) {
    this.secretsMeta = secretsMeta;
  }

  public OcSecrets isPlatformGenerated(Boolean isPlatformGenerated) {
    this.isPlatformGenerated = isPlatformGenerated;
    return this;
  }

  /**
   * Get isPlatformGenerated
   * @return isPlatformGenerated
   **/
  @Schema(description = "")
  
    public Boolean isIsPlatformGenerated() {
    return isPlatformGenerated;
  }

  public void setIsPlatformGenerated(Boolean isPlatformGenerated) {
    this.isPlatformGenerated = isPlatformGenerated;
  }

  public OcSecrets maxUsageLimit(Integer maxUsageLimit) {
    this.maxUsageLimit = maxUsageLimit;
    return this;
  }

  /**
   * Get maxUsageLimit
   * @return maxUsageLimit
   **/
  @Schema(description = "")
  
    public Integer getMaxUsageLimit() {
    return maxUsageLimit;
  }

  public void setMaxUsageLimit(Integer maxUsageLimit) {
    this.maxUsageLimit = maxUsageLimit;
  }

  public OcSecrets isAutorotate(Boolean isAutorotate) {
    this.isAutorotate = isAutorotate;
    return this;
  }

  /**
   * Get isAutorotate
   * @return isAutorotate
   **/
  @Schema(description = "")
  
    public Boolean isIsAutorotate() {
    return isAutorotate;
  }

  public void setIsAutorotate(Boolean isAutorotate) {
    this.isAutorotate = isAutorotate;
  }

  public OcSecrets secretId(String secretId) {
    this.secretId = secretId;
    return this;
  }

  /**
   * Get secretId
   * @return secretId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getSecretId() {
    return secretId;
  }

  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }

  public OcSecrets publishedAt(OffsetDateTime publishedAt) {
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
    OcSecrets ocSecrets = (OcSecrets) o;
    return Objects.equals(this.id, ocSecrets.id) &&
        Objects.equals(this.entityId, ocSecrets.entityId) &&
        Objects.equals(this.publicKey, ocSecrets.publicKey) &&
        Objects.equals(this.publicKeyType, ocSecrets.publicKeyType) &&
        Objects.equals(this.secretsMeta, ocSecrets.secretsMeta) &&
        Objects.equals(this.isPlatformGenerated, ocSecrets.isPlatformGenerated) &&
        Objects.equals(this.maxUsageLimit, ocSecrets.maxUsageLimit) &&
        Objects.equals(this.isAutorotate, ocSecrets.isAutorotate) &&
        Objects.equals(this.secretId, ocSecrets.secretId) &&
        Objects.equals(this.publishedAt, ocSecrets.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entityId, publicKey, publicKeyType, secretsMeta, isPlatformGenerated, maxUsageLimit, isAutorotate, secretId, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcSecrets {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    publicKeyType: ").append(toIndentedString(publicKeyType)).append("\n");
    sb.append("    secretsMeta: ").append(toIndentedString(secretsMeta)).append("\n");
    sb.append("    isPlatformGenerated: ").append(toIndentedString(isPlatformGenerated)).append("\n");
    sb.append("    maxUsageLimit: ").append(toIndentedString(maxUsageLimit)).append("\n");
    sb.append("    isAutorotate: ").append(toIndentedString(isAutorotate)).append("\n");
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
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
