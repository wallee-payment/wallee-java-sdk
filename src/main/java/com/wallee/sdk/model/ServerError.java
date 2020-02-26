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
import java.util.*;
import java.time.OffsetDateTime;

/**
 * This error is thrown when something unexpected happens on our side.
 */
public class ServerError {
  
  @SerializedName("date")
  protected String date = null;

  
  @SerializedName("id")
  protected String id = null;

  
  @SerializedName("message")
  protected String message = null;

  
  
   /**
   * Date when an error has occurred.
   * @return date
  **/
  @ApiModelProperty(value = "Date when an error has occurred.")
  public String getDate() {
    return date;
  }

  
   /**
   * Unique identifier of an error.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of an error.")
  public String getId() {
    return id;
  }

  
   /**
   * This message describes an error.
   * @return message
  **/
  @ApiModelProperty(value = "This message describes an error.")
  public String getMessage() {
    return message;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerError serverError = (ServerError) o;
    return Objects.equals(this.date, serverError.date) &&
        Objects.equals(this.id, serverError.id) &&
        Objects.equals(this.message, serverError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, id, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerError {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

