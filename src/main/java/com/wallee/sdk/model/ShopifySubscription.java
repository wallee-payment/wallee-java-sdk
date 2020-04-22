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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.ShopifySubscriber;
import com.wallee.sdk.model.ShopifySubscriptionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T15:39:51.189+02:00")
public class ShopifySubscription {
  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("initialTransaction")
  protected Long initialTransaction = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("orderRecurrenceNumber")
  protected Integer orderRecurrenceNumber = null;

  
  @JsonProperty("shop")
  protected Long shop = null;

  
  @JsonProperty("state")
  protected ShopifySubscriptionState state = null;

  
  @JsonProperty("subscriber")
  protected ShopifySubscriber subscriber = null;

  
  @JsonProperty("terminatedBy")
  protected Long terminatedBy = null;

  
  @JsonProperty("terminatedOn")
  protected OffsetDateTime terminatedOn = null;

  
  @JsonProperty("terminationRequestDate")
  protected OffsetDateTime terminationRequestDate = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * @return initialTransaction
  **/
  @ApiModelProperty(value = "")
  public Long getInitialTransaction() {
    return initialTransaction;
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
   * 
   * @return orderRecurrenceNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderRecurrenceNumber() {
    return orderRecurrenceNumber;
  }

  
   /**
   * 
   * @return shop
  **/
  @ApiModelProperty(value = "")
  public Long getShop() {
    return shop;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionState getState() {
    return state;
  }

  
   /**
   * 
   * @return subscriber
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriber getSubscriber() {
    return subscriber;
  }

  
   /**
   * 
   * @return terminatedBy
  **/
  @ApiModelProperty(value = "")
  public Long getTerminatedBy() {
    return terminatedBy;
  }

  
   /**
   * 
   * @return terminatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminatedOn() {
    return terminatedOn;
  }

  
   /**
   * 
   * @return terminationRequestDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminationRequestDate() {
    return terminationRequestDate;
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
    ShopifySubscription shopifySubscription = (ShopifySubscription) o;
    return Objects.equals(this.createdBy, shopifySubscription.createdBy) &&
        Objects.equals(this.createdOn, shopifySubscription.createdOn) &&
        Objects.equals(this.id, shopifySubscription.id) &&
        Objects.equals(this.initialTransaction, shopifySubscription.initialTransaction) &&
        Objects.equals(this.language, shopifySubscription.language) &&
        Objects.equals(this.linkedSpaceId, shopifySubscription.linkedSpaceId) &&
        Objects.equals(this.orderRecurrenceNumber, shopifySubscription.orderRecurrenceNumber) &&
        Objects.equals(this.shop, shopifySubscription.shop) &&
        Objects.equals(this.state, shopifySubscription.state) &&
        Objects.equals(this.subscriber, shopifySubscription.subscriber) &&
        Objects.equals(this.terminatedBy, shopifySubscription.terminatedBy) &&
        Objects.equals(this.terminatedOn, shopifySubscription.terminatedOn) &&
        Objects.equals(this.terminationRequestDate, shopifySubscription.terminationRequestDate) &&
        Objects.equals(this.version, shopifySubscription.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, id, initialTransaction, language, linkedSpaceId, orderRecurrenceNumber, shop, state, subscriber, terminatedBy, terminatedOn, terminationRequestDate, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscription {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initialTransaction: ").append(toIndentedString(initialTransaction)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    orderRecurrenceNumber: ").append(toIndentedString(orderRecurrenceNumber)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    terminatedBy: ").append(toIndentedString(terminatedBy)).append("\n");
    sb.append("    terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
    sb.append("    terminationRequestDate: ").append(toIndentedString(terminationRequestDate)).append("\n");
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
