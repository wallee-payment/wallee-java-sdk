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
import com.wallee.sdk.model.PersistableCurrencyAmount;
import com.wallee.sdk.model.ProductMeteredFee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class ProductMeteredTierFee {
  
  @SerializedName("fee")
  protected List<PersistableCurrencyAmount> fee = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("meteredFee")
  protected ProductMeteredFee meteredFee = null;

  
  @SerializedName("startRange")
  protected BigDecimal startRange = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * The fee determines the amount which is charged. The consumed metric is multiplied by the defined fee. The resulting amount is charged at the end of the period.
   * @return fee
  **/
  @ApiModelProperty(value = "The fee determines the amount which is charged. The consumed metric is multiplied by the defined fee. The resulting amount is charged at the end of the period.")
  public List<PersistableCurrencyAmount> getFee() {
    return fee;
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
   * @return meteredFee
  **/
  @ApiModelProperty(value = "")
  public ProductMeteredFee getMeteredFee() {
    return meteredFee;
  }

  
   /**
   * The start range defines the metered consumption of the metric from which on the defined fee gets applied. This means when a subscription consumes a value of 10 or more and the start range is set to 10 the fee defined on the tier will be applied.
   * @return startRange
  **/
  @ApiModelProperty(value = "The start range defines the metered consumption of the metric from which on the defined fee gets applied. This means when a subscription consumes a value of 10 or more and the start range is set to 10 the fee defined on the tier will be applied.")
  public BigDecimal getStartRange() {
    return startRange;
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
    ProductMeteredTierFee productMeteredTierFee = (ProductMeteredTierFee) o;
    return Objects.equals(this.fee, productMeteredTierFee.fee) &&
        Objects.equals(this.id, productMeteredTierFee.id) &&
        Objects.equals(this.meteredFee, productMeteredTierFee.meteredFee) &&
        Objects.equals(this.startRange, productMeteredTierFee.startRange) &&
        Objects.equals(this.version, productMeteredTierFee.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, id, meteredFee, startRange, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMeteredTierFee {\n");
    
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meteredFee: ").append(toIndentedString(meteredFee)).append("\n");
    sb.append("    startRange: ").append(toIndentedString(startRange)).append("\n");
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

