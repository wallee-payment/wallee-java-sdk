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
import com.wallee.sdk.model.AbstractRefundCommentActive;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class RefundCommentCreate extends AbstractRefundCommentActive {
  
  @SerializedName("refund")
  protected Long refund = null;

  
  
  public RefundCommentCreate refund(Long refund) {
    this.refund = refund;
    return this;
  }

   /**
   * 
   * @return refund
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getRefund() {
    return refund;
  }

  public void setRefund(Long refund) {
    this.refund = refund;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundCommentCreate refundCommentCreate = (RefundCommentCreate) o;
    return Objects.equals(this.content, refundCommentCreate.content) &&
        Objects.equals(this.refund, refundCommentCreate.refund) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, refund, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundCommentCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
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
