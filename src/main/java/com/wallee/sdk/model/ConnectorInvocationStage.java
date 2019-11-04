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
@JsonAdapter(ConnectorInvocationStage.Adapter.class)
public enum ConnectorInvocationStage {
  
  PAYMENT_METHOD_LIST("PAYMENT_METHOD_LIST"),
  
  FORM_GENERATION("FORM_GENERATION"),
  
  VALIDATION("VALIDATION"),
  
  AUTHORIZATION("AUTHORIZATION");

  private String value;

  ConnectorInvocationStage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConnectorInvocationStage fromValue(String text) {
    for (ConnectorInvocationStage b : ConnectorInvocationStage.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConnectorInvocationStage> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConnectorInvocationStage enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConnectorInvocationStage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConnectorInvocationStage.fromValue(String.valueOf(value));
    }
  }
}

