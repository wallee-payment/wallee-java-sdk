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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class PaymentMethodBrand {
  
  @SerializedName("description")
  protected Map<String, String> description = null;

  
  @SerializedName("grayImagePath")
  protected String grayImagePath = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("imagePath")
  protected String imagePath = null;

  
  @SerializedName("name")
  protected Map<String, String> name = null;

  
  @SerializedName("paymentMethod")
  protected Long paymentMethod = null;

  
  
   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getDescription() {
    return description;
  }

  
   /**
   * 
   * @return grayImagePath
  **/
  @ApiModelProperty(value = "")
  public String getGrayImagePath() {
    return grayImagePath;
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
   * @return imagePath
  **/
  @ApiModelProperty(value = "")
  public String getImagePath() {
    return imagePath;
  }

  
   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getName() {
    return name;
  }

  
   /**
   * 
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public Long getPaymentMethod() {
    return paymentMethod;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodBrand paymentMethodBrand = (PaymentMethodBrand) o;
    return Objects.equals(this.description, paymentMethodBrand.description) &&
        Objects.equals(this.grayImagePath, paymentMethodBrand.grayImagePath) &&
        Objects.equals(this.id, paymentMethodBrand.id) &&
        Objects.equals(this.imagePath, paymentMethodBrand.imagePath) &&
        Objects.equals(this.name, paymentMethodBrand.name) &&
        Objects.equals(this.paymentMethod, paymentMethodBrand.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, grayImagePath, id, imagePath, name, paymentMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodBrand {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    grayImagePath: ").append(toIndentedString(grayImagePath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

