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
@JsonAdapter(TransactionInvoiceState.Adapter.class)
public enum TransactionInvoiceState {
  
  CREATE("CREATE"),
  
  OPEN("OPEN"),
  
  OVERDUE("OVERDUE"),
  
  CANCELED("CANCELED"),
  
  PAID("PAID"),
  
  DERECOGNIZED("DERECOGNIZED"),
  
  NOT_APPLICABLE("NOT_APPLICABLE");

  private String value;

  TransactionInvoiceState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionInvoiceState fromValue(String text) {
    for (TransactionInvoiceState b : TransactionInvoiceState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TransactionInvoiceState> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionInvoiceState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionInvoiceState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionInvoiceState.fromValue(String.valueOf(value));
    }
  }
}

