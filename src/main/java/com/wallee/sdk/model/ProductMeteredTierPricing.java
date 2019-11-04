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
@JsonAdapter(ProductMeteredTierPricing.Adapter.class)
public enum ProductMeteredTierPricing {
  
  CHEAPEST_TIER_PRICING("CHEAPEST_TIER_PRICING"),
  
  INCREMENTAL_DISCOUNT_PRICING("INCREMENTAL_DISCOUNT_PRICING");

  private String value;

  ProductMeteredTierPricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductMeteredTierPricing fromValue(String text) {
    for (ProductMeteredTierPricing b : ProductMeteredTierPricing.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProductMeteredTierPricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProductMeteredTierPricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProductMeteredTierPricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProductMeteredTierPricing.fromValue(String.valueOf(value));
    }
  }
}

