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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;
import java.util.*;
import java.time.OffsetDateTime;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(ProductFeeType.Adapter.class)
public enum ProductFeeType {
  
  METERED_FEE("METERED_FEE"),
  
  SETUP_FEE("SETUP_FEE"),
  
  PERIOD_FEE("PERIOD_FEE");

  private String value;

  ProductFeeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductFeeType fromValue(String text) {
    for (ProductFeeType b : ProductFeeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProductFeeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProductFeeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProductFeeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProductFeeType.fromValue(String.valueOf(value));
    }
  }
}

