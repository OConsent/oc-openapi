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
 * NewOcContractTemplates
 */
@Validated


public class NewOcContractTemplates   {
  /**
   * Gets or Sets domain
   */
  public enum DomainEnum {
    BANKING("banking"),
    
    ECOMMERCE("ecommerce"),
    
    SOCIAL("social");

    private String value;

    DomainEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DomainEnum fromValue(String text) {
      for (DomainEnum b : DomainEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("domain")
  private DomainEnum domain = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("is_platform_generated")
  private Boolean isPlatformGenerated = true;

  @JsonProperty("owner")
  private String owner = "oc_platform";

  @JsonProperty("contract_templates_meta")
  @Valid
  private List<OcconsentpurposesConsentPurposesMeta> contractTemplatesMeta = null;

  @JsonProperty("template_id")
  private String templateId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcContractTemplates domain(DomainEnum domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
   **/
  @Schema(description = "")
  
    public DomainEnum getDomain() {
    return domain;
  }

  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }

  public NewOcContractTemplates country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @Schema(description = "")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public NewOcContractTemplates content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @Schema(description = "")
  
    public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public NewOcContractTemplates isPlatformGenerated(Boolean isPlatformGenerated) {
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

  public NewOcContractTemplates owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public NewOcContractTemplates contractTemplatesMeta(List<OcconsentpurposesConsentPurposesMeta> contractTemplatesMeta) {
    this.contractTemplatesMeta = contractTemplatesMeta;
    return this;
  }

  public NewOcContractTemplates addContractTemplatesMetaItem(OcconsentpurposesConsentPurposesMeta contractTemplatesMetaItem) {
    if (this.contractTemplatesMeta == null) {
      this.contractTemplatesMeta = new ArrayList<OcconsentpurposesConsentPurposesMeta>();
    }
    this.contractTemplatesMeta.add(contractTemplatesMetaItem);
    return this;
  }

  /**
   * Get contractTemplatesMeta
   * @return contractTemplatesMeta
   **/
  @Schema(description = "")
      @Valid
    public List<OcconsentpurposesConsentPurposesMeta> getContractTemplatesMeta() {
    return contractTemplatesMeta;
  }

  public void setContractTemplatesMeta(List<OcconsentpurposesConsentPurposesMeta> contractTemplatesMeta) {
    this.contractTemplatesMeta = contractTemplatesMeta;
  }

  public NewOcContractTemplates templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Get templateId
   * @return templateId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public NewOcContractTemplates publishedAt(OffsetDateTime publishedAt) {
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

  public NewOcContractTemplates createdBy(String createdBy) {
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

  public NewOcContractTemplates updatedBy(String updatedBy) {
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
    NewOcContractTemplates newOcContractTemplates = (NewOcContractTemplates) o;
    return Objects.equals(this.domain, newOcContractTemplates.domain) &&
        Objects.equals(this.country, newOcContractTemplates.country) &&
        Objects.equals(this.content, newOcContractTemplates.content) &&
        Objects.equals(this.isPlatformGenerated, newOcContractTemplates.isPlatformGenerated) &&
        Objects.equals(this.owner, newOcContractTemplates.owner) &&
        Objects.equals(this.contractTemplatesMeta, newOcContractTemplates.contractTemplatesMeta) &&
        Objects.equals(this.templateId, newOcContractTemplates.templateId) &&
        Objects.equals(this.publishedAt, newOcContractTemplates.publishedAt) &&
        Objects.equals(this.createdBy, newOcContractTemplates.createdBy) &&
        Objects.equals(this.updatedBy, newOcContractTemplates.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, country, content, isPlatformGenerated, owner, contractTemplatesMeta, templateId, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcContractTemplates {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    isPlatformGenerated: ").append(toIndentedString(isPlatformGenerated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    contractTemplatesMeta: ").append(toIndentedString(contractTemplatesMeta)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
