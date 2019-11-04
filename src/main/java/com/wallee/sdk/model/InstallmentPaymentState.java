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
@JsonAdapter(InstallmentPaymentState.Adapter.class)
public enum InstallmentPaymentState {
  
  CREATE("CREATE"),
  
  CONFIRMED("CONFIRMED"),
  
  AUTHORIZED("AUTHORIZED"),
  
  REJECTED("REJECTED"),
  
  COMPLETED("COMPLETED"),
  
  RUNNING("RUNNING"),
  
  DONE("DONE"),
  
  DEFAULTED("DEFAULTED");

  private String value;

  InstallmentPaymentState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InstallmentPaymentState fromValue(String text) {
    for (InstallmentPaymentState b : InstallmentPaymentState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<InstallmentPaymentState> {
    @Override
    public void write(final JsonWriter jsonWriter, final InstallmentPaymentState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InstallmentPaymentState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InstallmentPaymentState.fromValue(String.valueOf(value));
    }
  }
}

