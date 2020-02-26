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
@JsonAdapter(SubscriptionProductVersionState.Adapter.class)
public enum SubscriptionProductVersionState {
  
  PENDING("PENDING"),
  
  ACTIVE("ACTIVE"),
  
  OBSOLETE("OBSOLETE"),
  
  RETIRING("RETIRING"),
  
  RETIRED("RETIRED");

  private String value;

  SubscriptionProductVersionState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubscriptionProductVersionState fromValue(String text) {
    for (SubscriptionProductVersionState b : SubscriptionProductVersionState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SubscriptionProductVersionState> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubscriptionProductVersionState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SubscriptionProductVersionState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SubscriptionProductVersionState.fromValue(String.valueOf(value));
    }
  }
}

