/*
 * wallee
 * JAVA SDK
 *
 * OpenAPI spec version: 2.0.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.SubscriptionSuspensionAction;
import com.wallee.sdk.model.SubscriptionSuspensionReason;
import com.wallee.sdk.model.SubscriptionSuspensionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class SubscriptionSuspension {
  
  @SerializedName("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @SerializedName("effectiveEndDate")
  protected OffsetDateTime effectiveEndDate = null;

  
  @SerializedName("endAction")
  protected SubscriptionSuspensionAction endAction = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("language")
  protected String language = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("note")
  protected String note = null;

  
  @SerializedName("periodBill")
  protected Long periodBill = null;

  
  @SerializedName("plannedEndDate")
  protected OffsetDateTime plannedEndDate = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("reason")
  protected SubscriptionSuspensionReason reason = null;

  
  @SerializedName("state")
  protected SubscriptionSuspensionState state = null;

  
  @SerializedName("subscription")
  protected Long subscription = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return effectiveEndDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEffectiveEndDate() {
    return effectiveEndDate;
  }

  
   /**
   * When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date.
   * @return endAction
  **/
  @ApiModelProperty(value = "When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date.")
  public SubscriptionSuspensionAction getEndAction() {
    return endAction;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The note may contain some internal information for the suspension. The note will not be disclosed to the subscriber.
   * @return note
  **/
  @ApiModelProperty(value = "The note may contain some internal information for the suspension. The note will not be disclosed to the subscriber.")
  public String getNote() {
    return note;
  }

  
   /**
   * 
   * @return periodBill
  **/
  @ApiModelProperty(value = "")
  public Long getPeriodBill() {
    return periodBill;
  }

  
   /**
   * The planned end date of the suspension identifies the date on which the suspension will be ended automatically.
   * @return plannedEndDate
  **/
  @ApiModelProperty(value = "The planned end date of the suspension identifies the date on which the suspension will be ended automatically.")
  public OffsetDateTime getPlannedEndDate() {
    return plannedEndDate;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The suspension reason indicates why a suspension has been created.
   * @return reason
  **/
  @ApiModelProperty(value = "The suspension reason indicates why a suspension has been created.")
  public SubscriptionSuspensionReason getReason() {
    return reason;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public SubscriptionSuspensionState getState() {
    return state;
  }

  
   /**
   * 
   * @return subscription
  **/
  @ApiModelProperty(value = "")
  public Long getSubscription() {
    return subscription;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSuspension subscriptionSuspension = (SubscriptionSuspension) o;
    return Objects.equals(this.createdOn, subscriptionSuspension.createdOn) &&
        Objects.equals(this.effectiveEndDate, subscriptionSuspension.effectiveEndDate) &&
        Objects.equals(this.endAction, subscriptionSuspension.endAction) &&
        Objects.equals(this.id, subscriptionSuspension.id) &&
        Objects.equals(this.language, subscriptionSuspension.language) &&
        Objects.equals(this.linkedSpaceId, subscriptionSuspension.linkedSpaceId) &&
        Objects.equals(this.note, subscriptionSuspension.note) &&
        Objects.equals(this.periodBill, subscriptionSuspension.periodBill) &&
        Objects.equals(this.plannedEndDate, subscriptionSuspension.plannedEndDate) &&
        Objects.equals(this.plannedPurgeDate, subscriptionSuspension.plannedPurgeDate) &&
        Objects.equals(this.reason, subscriptionSuspension.reason) &&
        Objects.equals(this.state, subscriptionSuspension.state) &&
        Objects.equals(this.subscription, subscriptionSuspension.subscription) &&
        Objects.equals(this.version, subscriptionSuspension.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, effectiveEndDate, endAction, id, language, linkedSpaceId, note, periodBill, plannedEndDate, plannedPurgeDate, reason, state, subscription, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSuspension {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    endAction: ").append(toIndentedString(endAction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    periodBill: ").append(toIndentedString(periodBill)).append("\n");
    sb.append("    plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

