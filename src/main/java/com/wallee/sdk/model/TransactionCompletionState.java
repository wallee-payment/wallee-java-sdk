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
@JsonAdapter(TransactionCompletionState.Adapter.class)
public enum TransactionCompletionState {
  
  CREATE("CREATE"),
  
  SCHEDULED("SCHEDULED"),
  
  PENDING("PENDING"),
  
  FAILED("FAILED"),
  
  SUCCESSFUL("SUCCESSFUL");

  private String value;

  TransactionCompletionState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionCompletionState fromValue(String text) {
    for (TransactionCompletionState b : TransactionCompletionState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TransactionCompletionState> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionCompletionState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionCompletionState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionCompletionState.fromValue(String.valueOf(value));
    }
  }
}

