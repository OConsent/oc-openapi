package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewOcConversations
 */
@Validated


public class NewOcConversations   {
  @JsonProperty("thread_id")
  private String threadId = null;

  /**
   * Gets or Sets conversationType
   */
  public enum ConversationTypeEnum {
    REGULAR("regular"),
    
    CONTRACT_NEOGTIATIONS("contract_neogtiations"),
    
    PLATFORM("platform");

    private String value;

    ConversationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConversationTypeEnum fromValue(String text) {
      for (ConversationTypeEnum b : ConversationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("conversation_type")
  private ConversationTypeEnum conversationType = null;

  @JsonProperty("from_entity_id")
  private String fromEntityId = null;

  @JsonProperty("to_entity_ids_csv")
  private String toEntityIdsCsv = null;

  /**
   * Gets or Sets conversationScope
   */
  public enum ConversationScopeEnum {
    PRIVATE("private"),
    
    GROUP("group");

    private String value;

    ConversationScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConversationScopeEnum fromValue(String text) {
      for (ConversationScopeEnum b : ConversationScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("conversation_scope")
  private ConversationScopeEnum conversationScope = null;

  @JsonProperty("message_time")
  private OffsetDateTime messageTime = null;

  @JsonProperty("message_id")
  private String messageId = null;

  @JsonProperty("published_at")
  private OffsetDateTime publishedAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("updated_by")
  private String updatedBy = null;

  public NewOcConversations threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  /**
   * Get threadId
   * @return threadId
   **/
  @Schema(description = "")
  
    public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public NewOcConversations conversationType(ConversationTypeEnum conversationType) {
    this.conversationType = conversationType;
    return this;
  }

  /**
   * Get conversationType
   * @return conversationType
   **/
  @Schema(description = "")
  
    public ConversationTypeEnum getConversationType() {
    return conversationType;
  }

  public void setConversationType(ConversationTypeEnum conversationType) {
    this.conversationType = conversationType;
  }

  public NewOcConversations fromEntityId(String fromEntityId) {
    this.fromEntityId = fromEntityId;
    return this;
  }

  /**
   * Get fromEntityId
   * @return fromEntityId
   **/
  @Schema(description = "")
  
    public String getFromEntityId() {
    return fromEntityId;
  }

  public void setFromEntityId(String fromEntityId) {
    this.fromEntityId = fromEntityId;
  }

  public NewOcConversations toEntityIdsCsv(String toEntityIdsCsv) {
    this.toEntityIdsCsv = toEntityIdsCsv;
    return this;
  }

  /**
   * Get toEntityIdsCsv
   * @return toEntityIdsCsv
   **/
  @Schema(description = "")
  
    public String getToEntityIdsCsv() {
    return toEntityIdsCsv;
  }

  public void setToEntityIdsCsv(String toEntityIdsCsv) {
    this.toEntityIdsCsv = toEntityIdsCsv;
  }

  public NewOcConversations conversationScope(ConversationScopeEnum conversationScope) {
    this.conversationScope = conversationScope;
    return this;
  }

  /**
   * Get conversationScope
   * @return conversationScope
   **/
  @Schema(description = "")
  
    public ConversationScopeEnum getConversationScope() {
    return conversationScope;
  }

  public void setConversationScope(ConversationScopeEnum conversationScope) {
    this.conversationScope = conversationScope;
  }

  public NewOcConversations messageTime(OffsetDateTime messageTime) {
    this.messageTime = messageTime;
    return this;
  }

  /**
   * Get messageTime
   * @return messageTime
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getMessageTime() {
    return messageTime;
  }

  public void setMessageTime(OffsetDateTime messageTime) {
    this.messageTime = messageTime;
  }

  public NewOcConversations messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Get messageId
   * @return messageId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public NewOcConversations publishedAt(OffsetDateTime publishedAt) {
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

  public NewOcConversations createdBy(String createdBy) {
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

  public NewOcConversations updatedBy(String updatedBy) {
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
    NewOcConversations newOcConversations = (NewOcConversations) o;
    return Objects.equals(this.threadId, newOcConversations.threadId) &&
        Objects.equals(this.conversationType, newOcConversations.conversationType) &&
        Objects.equals(this.fromEntityId, newOcConversations.fromEntityId) &&
        Objects.equals(this.toEntityIdsCsv, newOcConversations.toEntityIdsCsv) &&
        Objects.equals(this.conversationScope, newOcConversations.conversationScope) &&
        Objects.equals(this.messageTime, newOcConversations.messageTime) &&
        Objects.equals(this.messageId, newOcConversations.messageId) &&
        Objects.equals(this.publishedAt, newOcConversations.publishedAt) &&
        Objects.equals(this.createdBy, newOcConversations.createdBy) &&
        Objects.equals(this.updatedBy, newOcConversations.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadId, conversationType, fromEntityId, toEntityIdsCsv, conversationScope, messageTime, messageId, publishedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOcConversations {\n");
    
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    conversationType: ").append(toIndentedString(conversationType)).append("\n");
    sb.append("    fromEntityId: ").append(toIndentedString(fromEntityId)).append("\n");
    sb.append("    toEntityIdsCsv: ").append(toIndentedString(toEntityIdsCsv)).append("\n");
    sb.append("    conversationScope: ").append(toIndentedString(conversationScope)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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
