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
 * OcContractTemplates
 */
@Validated


public class OcContractTemplates   {
  @JsonProperty("id")
  private String id = null;

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

  @JsonProperty("media")
  @Valid
  private List<OccontracttemplatesMedia> media = null;

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

  public OcContractTemplates id(String id) {
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

  public OcContractTemplates domain(DomainEnum domain) {
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

  public OcContractTemplates country(String country) {
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

  public OcContractTemplates content(String content) {
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

  public OcContractTemplates media(List<OccontracttemplatesMedia> media) {
    this.media = media;
    return this;
  }

  public OcContractTemplates addMediaItem(OccontracttemplatesMedia mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<OccontracttemplatesMedia>();
    }
    this.media.add(mediaItem);
    return this;
  }

  /**
   * Get media
   * @return media
   **/
  @Schema(description = "")
      @Valid
    public List<OccontracttemplatesMedia> getMedia() {
    return media;
  }

  public void setMedia(List<OccontracttemplatesMedia> media) {
    this.media = media;
  }

  public OcContractTemplates isPlatformGenerated(Boolean isPlatformGenerated) {
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

  public OcContractTemplates owner(String owner) {
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

  public OcContractTemplates contractTemplatesMeta(List<OcconsentpurposesConsentPurposesMeta> contractTemplatesMeta) {
    this.contractTemplatesMeta = contractTemplatesMeta;
    return this;
  }

  public OcContractTemplates addContractTemplatesMetaItem(OcconsentpurposesConsentPurposesMeta contractTemplatesMetaItem) {
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

  public OcContractTemplates templateId(String templateId) {
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

  public OcContractTemplates publishedAt(OffsetDateTime publishedAt) {
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
    OcContractTemplates ocContractTemplates = (OcContractTemplates) o;
    return Objects.equals(this.id, ocContractTemplates.id) &&
        Objects.equals(this.domain, ocContractTemplates.domain) &&
        Objects.equals(this.country, ocContractTemplates.country) &&
        Objects.equals(this.content, ocContractTemplates.content) &&
        Objects.equals(this.media, ocContractTemplates.media) &&
        Objects.equals(this.isPlatformGenerated, ocContractTemplates.isPlatformGenerated) &&
        Objects.equals(this.owner, ocContractTemplates.owner) &&
        Objects.equals(this.contractTemplatesMeta, ocContractTemplates.contractTemplatesMeta) &&
        Objects.equals(this.templateId, ocContractTemplates.templateId) &&
        Objects.equals(this.publishedAt, ocContractTemplates.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domain, country, content, media, isPlatformGenerated, owner, contractTemplatesMeta, templateId, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcContractTemplates {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    isPlatformGenerated: ").append(toIndentedString(isPlatformGenerated)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    contractTemplatesMeta: ").append(toIndentedString(contractTemplatesMeta)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
