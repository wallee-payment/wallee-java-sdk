/**
*  SDK
*
* This library allows to interact with the  payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class Charge extends TransactionAwareEntity {
  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn;

  
  @JsonProperty("failureReason")
  protected FailureReason failureReason;

  
  @JsonProperty("language")
  protected String language;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId;

  
  @JsonProperty("state")
  protected ChargeState state;

  
  @JsonProperty("timeZone")
  protected String timeZone;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn;

  
  @JsonProperty("transaction")
  protected Transaction transaction;

  
  @JsonProperty("type")
  protected ChargeType type;

  
  @JsonProperty("userFailureMessage")
  protected String userFailureMessage;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * The date on which the charge was created on.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date on which the charge was created on.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return failureReason
  **/
  @ApiModelProperty(value = "")
  public FailureReason getFailureReason() {
    return failureReason;
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
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public ChargeState getState() {
    return state;
  }

  
   /**
   * 
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  
   /**
   * 
   * @return timeoutOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }

  
   /**
   * 
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getTransaction() {
    return transaction;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ChargeType getType() {
    return type;
  }

  
   /**
   * The failure message describes for an end user why the charge is failed in the language of the user. This is only provided when the charge is marked as failed.
   * @return userFailureMessage
  **/
  @ApiModelProperty(value = "The failure message describes for an end user why the charge is failed in the language of the user. This is only provided when the charge is marked as failed.")
  public String getUserFailureMessage() {
    return userFailureMessage;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.id, charge.id) &&
        Objects.equals(this.linkedSpaceId, charge.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, charge.linkedTransaction) &&
        Objects.equals(this.createdOn, charge.createdOn) &&
        Objects.equals(this.failureReason, charge.failureReason) &&
        Objects.equals(this.language, charge.language) &&
        Objects.equals(this.plannedPurgeDate, charge.plannedPurgeDate) &&
        Objects.equals(this.spaceViewId, charge.spaceViewId) && this.state == charge.state &&
        Objects.equals(this.timeZone, charge.timeZone) &&
        Objects.equals(this.timeoutOn, charge.timeoutOn) &&
        Objects.equals(this.transaction, charge.transaction) && this.type == charge.type &&
        Objects.equals(this.userFailureMessage, charge.userFailureMessage) &&
        Objects.equals(this.version, charge.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, createdOn, failureReason, language, plannedPurgeDate, spaceViewId, state, timeZone, timeoutOn, transaction, type, userFailureMessage, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userFailureMessage: ").append(toIndentedString(userFailureMessage)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

}

