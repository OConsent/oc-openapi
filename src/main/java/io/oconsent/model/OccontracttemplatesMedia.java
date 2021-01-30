package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OccontracttemplatesMedia
 */
@Validated


public class OccontracttemplatesMedia   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("alternativeText")
  private String alternativeText = null;

  @JsonProperty("caption")
  private String caption = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("formats")
  private Object formats = null;

  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("ext")
  private String ext = null;

  @JsonProperty("mime")
  private String mime = null;

  @JsonProperty("size")
  private BigDecimal size = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("previewUrl")
  private String previewUrl = null;

  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("provider_metadata")
  private Object providerMetadata = null;

  @JsonProperty("related")
  private String related = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public OccontracttemplatesMedia id(String id) {
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

  public OccontracttemplatesMedia name(String name) {
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

  public OccontracttemplatesMedia alternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
    return this;
  }

  /**
   * Get alternativeText
   * @return alternativeText
   **/
  @Schema(description = "")
  
    public String getAlternativeText() {
    return alternativeText;
  }

  public void setAlternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
  }

  public OccontracttemplatesMedia caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Get caption
   * @return caption
   **/
  @Schema(description = "")
  
    public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public OccontracttemplatesMedia width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   **/
  @Schema(description = "")
  
    public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public OccontracttemplatesMedia height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   **/
  @Schema(description = "")
  
    public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public OccontracttemplatesMedia formats(Object formats) {
    this.formats = formats;
    return this;
  }

  /**
   * Get formats
   * @return formats
   **/
  @Schema(description = "")
  
    public Object getFormats() {
    return formats;
  }

  public void setFormats(Object formats) {
    this.formats = formats;
  }

  public OccontracttemplatesMedia hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public OccontracttemplatesMedia ext(String ext) {
    this.ext = ext;
    return this;
  }

  /**
   * Get ext
   * @return ext
   **/
  @Schema(description = "")
  
    public String getExt() {
    return ext;
  }

  public void setExt(String ext) {
    this.ext = ext;
  }

  public OccontracttemplatesMedia mime(String mime) {
    this.mime = mime;
    return this;
  }

  /**
   * Get mime
   * @return mime
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getMime() {
    return mime;
  }

  public void setMime(String mime) {
    this.mime = mime;
  }

  public OccontracttemplatesMedia size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public OccontracttemplatesMedia url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OccontracttemplatesMedia previewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

  /**
   * Get previewUrl
   * @return previewUrl
   **/
  @Schema(description = "")
  
    public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }

  public OccontracttemplatesMedia provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public OccontracttemplatesMedia providerMetadata(Object providerMetadata) {
    this.providerMetadata = providerMetadata;
    return this;
  }

  /**
   * Get providerMetadata
   * @return providerMetadata
   **/
  @Schema(description = "")
  
    public Object getProviderMetadata() {
    return providerMetadata;
  }

  public void setProviderMetadata(Object providerMetadata) {
    this.providerMetadata = providerMetadata;
  }

  public OccontracttemplatesMedia related(String related) {
    this.related = related;
    return this;
  }

  /**
   * Get related
   * @return related
   **/
  @Schema(description = "")
  
    public String getRelated() {
    return related;
  }

  public void setRelated(String related) {
    this.related = related;
  }

  public OccontracttemplatesMedia createdBy(String createdBy) {
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

  public OccontracttemplatesMedia updatedBy(String updatedBy) {
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
    OccontracttemplatesMedia occontracttemplatesMedia = (OccontracttemplatesMedia) o;
    return Objects.equals(this.id, occontracttemplatesMedia.id) &&
        Objects.equals(this.name, occontracttemplatesMedia.name) &&
        Objects.equals(this.alternativeText, occontracttemplatesMedia.alternativeText) &&
        Objects.equals(this.caption, occontracttemplatesMedia.caption) &&
        Objects.equals(this.width, occontracttemplatesMedia.width) &&
        Objects.equals(this.height, occontracttemplatesMedia.height) &&
        Objects.equals(this.formats, occontracttemplatesMedia.formats) &&
        Objects.equals(this.hash, occontracttemplatesMedia.hash) &&
        Objects.equals(this.ext, occontracttemplatesMedia.ext) &&
        Objects.equals(this.mime, occontracttemplatesMedia.mime) &&
        Objects.equals(this.size, occontracttemplatesMedia.size) &&
        Objects.equals(this.url, occontracttemplatesMedia.url) &&
        Objects.equals(this.previewUrl, occontracttemplatesMedia.previewUrl) &&
        Objects.equals(this.provider, occontracttemplatesMedia.provider) &&
        Objects.equals(this.providerMetadata, occontracttemplatesMedia.providerMetadata) &&
        Objects.equals(this.related, occontracttemplatesMedia.related) &&
        Objects.equals(this.createdBy, occontracttemplatesMedia.createdBy) &&
        Objects.equals(this.updatedBy, occontracttemplatesMedia.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, alternativeText, caption, width, height, formats, hash, ext, mime, size, url, previewUrl, provider, providerMetadata, related, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OccontracttemplatesMedia {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternativeText: ").append(toIndentedString(alternativeText)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    providerMetadata: ").append(toIndentedString(providerMetadata)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
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
