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
 * OcConversations
 */
@Validated


public class OcConversations   {
  @JsonProperty("id")
  private String id = null;

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

  public OcConversations id(String id) {
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

  public OcConversations threadId(String threadId) {
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

  public OcConversations conversationType(ConversationTypeEnum conversationType) {
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

  public OcConversations fromEntityId(String fromEntityId) {
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

  public OcConversations toEntityIdsCsv(String toEntityIdsCsv) {
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

  public OcConversations conversationScope(ConversationScopeEnum conversationScope) {
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

  public OcConversations messageTime(OffsetDateTime messageTime) {
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

  public OcConversations messageId(String messageId) {
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

  public OcConversations publishedAt(OffsetDateTime publishedAt) {
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
    OcConversations ocConversations = (OcConversations) o;
    return Objects.equals(this.id, ocConversations.id) &&
        Objects.equals(this.threadId, ocConversations.threadId) &&
        Objects.equals(this.conversationType, ocConversations.conversationType) &&
        Objects.equals(this.fromEntityId, ocConversations.fromEntityId) &&
        Objects.equals(this.toEntityIdsCsv, ocConversations.toEntityIdsCsv) &&
        Objects.equals(this.conversationScope, ocConversations.conversationScope) &&
        Objects.equals(this.messageTime, ocConversations.messageTime) &&
        Objects.equals(this.messageId, ocConversations.messageId) &&
        Objects.equals(this.publishedAt, ocConversations.publishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, threadId, conversationType, fromEntityId, toEntityIdsCsv, conversationScope, messageTime, messageId, publishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcConversations {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    conversationType: ").append(toIndentedString(conversationType)).append("\n");
    sb.append("    fromEntityId: ").append(toIndentedString(fromEntityId)).append("\n");
    sb.append("    toEntityIdsCsv: ").append(toIndentedString(toEntityIdsCsv)).append("\n");
    sb.append("    conversationScope: ").append(toIndentedString(conversationScope)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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
