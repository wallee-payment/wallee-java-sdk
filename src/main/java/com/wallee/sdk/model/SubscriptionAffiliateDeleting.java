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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.SubscriptionAffiliateDeleted;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class SubscriptionAffiliateDeleting extends SubscriptionAffiliateDeleted {
  
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAffiliateDeleting subscriptionAffiliateDeleting = (SubscriptionAffiliateDeleting) o;
    return Objects.equals(this.externalId, subscriptionAffiliateDeleting.externalId) &&
        Objects.equals(this.id, subscriptionAffiliateDeleting.id) &&
        Objects.equals(this.language, subscriptionAffiliateDeleting.language) &&
        Objects.equals(this.linkedSpaceId, subscriptionAffiliateDeleting.linkedSpaceId) &&
        Objects.equals(this.metaData, subscriptionAffiliateDeleting.metaData) &&
        Objects.equals(this.name, subscriptionAffiliateDeleting.name) &&
        Objects.equals(this.plannedPurgeDate, subscriptionAffiliateDeleting.plannedPurgeDate) &&
        Objects.equals(this.reference, subscriptionAffiliateDeleting.reference) &&
        Objects.equals(this.state, subscriptionAffiliateDeleting.state) &&
        Objects.equals(this.version, subscriptionAffiliateDeleting.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, id, language, linkedSpaceId, metaData, name, plannedPurgeDate, reference, state, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAffiliateDeleting {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

