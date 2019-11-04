/*
 * wallee
 * JAVA SDK
 *
 * OpenAPI spec version: 2.0.3
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * AbstractTokenUpdate
 */
public class AbstractTokenUpdate {
  
  @SerializedName("customerEmailAddress")
  protected String customerEmailAddress = null;

  
  @SerializedName("customerId")
  protected String customerId = null;

  
  @SerializedName("enabledForOneClickPayment")
  protected Boolean enabledForOneClickPayment = null;

  
  @SerializedName("language")
  protected String language = null;

  
  @SerializedName("timeZone")
  protected String timeZone = null;

  
  @SerializedName("tokenReference")
  protected String tokenReference = null;

  
  
  public AbstractTokenUpdate customerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
    return this;
  }

   /**
   * The customer email address is the email address of the customer.
   * @return customerEmailAddress
  **/
  @ApiModelProperty(value = "The customer email address is the email address of the customer.")
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }

  public void setCustomerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  
  public AbstractTokenUpdate customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * The customer ID identifies the customer in the merchant system. In case the customer ID has been provided it has to correspond with the customer ID provided on the transaction. The customer ID will not be changed automatically. The merchant system has to provide it.
   * @return customerId
  **/
  @ApiModelProperty(value = "The customer ID identifies the customer in the merchant system. In case the customer ID has been provided it has to correspond with the customer ID provided on the transaction. The customer ID will not be changed automatically. The merchant system has to provide it.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public AbstractTokenUpdate enabledForOneClickPayment(Boolean enabledForOneClickPayment) {
    this.enabledForOneClickPayment = enabledForOneClickPayment;
    return this;
  }

   /**
   * When a token is enabled for one-click payments the buyer will be able to select the token within the iFrame or on the payment page to pay with the token. The usage of the token will reduce the number of steps the buyer has to go through. The buyer is linked via the customer ID on the transaction with the token. Means the token will be visible for buyers with the same customer ID. Additionally the payment method has to be configured to allow the one-click payments.
   * @return enabledForOneClickPayment
  **/
  @ApiModelProperty(value = "When a token is enabled for one-click payments the buyer will be able to select the token within the iFrame or on the payment page to pay with the token. The usage of the token will reduce the number of steps the buyer has to go through. The buyer is linked via the customer ID on the transaction with the token. Means the token will be visible for buyers with the same customer ID. Additionally the payment method has to be configured to allow the one-click payments.")
  public Boolean isEnabledForOneClickPayment() {
    return enabledForOneClickPayment;
  }

  public void setEnabledForOneClickPayment(Boolean enabledForOneClickPayment) {
    this.enabledForOneClickPayment = enabledForOneClickPayment;
  }

  
  public AbstractTokenUpdate language(String language) {
    this.language = language;
    return this;
  }

   /**
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public AbstractTokenUpdate timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The time zone defines in which time zone the customer is located in. The time zone may affects how dates are formatted when interacting with the customer.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone defines in which time zone the customer is located in. The time zone may affects how dates are formatted when interacting with the customer.")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  public AbstractTokenUpdate tokenReference(String tokenReference) {
    this.tokenReference = tokenReference;
    return this;
  }

   /**
   * Use something that it is easy to identify and may help you find the token (e.g. customer id, email address).
   * @return tokenReference
  **/
  @ApiModelProperty(value = "Use something that it is easy to identify and may help you find the token (e.g. customer id, email address).")
  public String getTokenReference() {
    return tokenReference;
  }

  public void setTokenReference(String tokenReference) {
    this.tokenReference = tokenReference;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractTokenUpdate abstractTokenUpdate = (AbstractTokenUpdate) o;
    return Objects.equals(this.customerEmailAddress, abstractTokenUpdate.customerEmailAddress) &&
        Objects.equals(this.customerId, abstractTokenUpdate.customerId) &&
        Objects.equals(this.enabledForOneClickPayment, abstractTokenUpdate.enabledForOneClickPayment) &&
        Objects.equals(this.language, abstractTokenUpdate.language) &&
        Objects.equals(this.timeZone, abstractTokenUpdate.timeZone) &&
        Objects.equals(this.tokenReference, abstractTokenUpdate.tokenReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerEmailAddress, customerId, enabledForOneClickPayment, language, timeZone, tokenReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractTokenUpdate {\n");
    
    sb.append("    customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    enabledForOneClickPayment: ").append(toIndentedString(enabledForOneClickPayment)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    tokenReference: ").append(toIndentedString(tokenReference)).append("\n");
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

