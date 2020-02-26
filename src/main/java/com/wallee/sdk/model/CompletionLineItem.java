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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class CompletionLineItem {
  
  @SerializedName("amount")
  protected BigDecimal amount = null;

  
  @SerializedName("quantity")
  protected BigDecimal quantity = null;

  
  @SerializedName("uniqueId")
  protected String uniqueId = null;

  
  
   /**
   * The total amount of the line item including any tax.
   * @return amount
  **/
  @ApiModelProperty(value = "The total amount of the line item including any tax.")
  public BigDecimal getAmount() {
    return amount;
  }

  
   /**
   * The quantity of the line item which should be completed.
   * @return quantity
  **/
  @ApiModelProperty(value = "The quantity of the line item which should be completed.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  
   /**
   * The unique id identifies the line item on which the capture is applied on.
   * @return uniqueId
  **/
  @ApiModelProperty(value = "The unique id identifies the line item on which the capture is applied on.")
  public String getUniqueId() {
    return uniqueId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionLineItem completionLineItem = (CompletionLineItem) o;
    return Objects.equals(this.amount, completionLineItem.amount) &&
        Objects.equals(this.quantity, completionLineItem.quantity) &&
        Objects.equals(this.uniqueId, completionLineItem.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, quantity, uniqueId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionLineItem {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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

