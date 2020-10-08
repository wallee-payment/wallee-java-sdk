/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.CreationEntityState;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
@ApiModel(description = "A subscriber represents everyone who is subscribed to a product.")

public class SubscriberCreate extends AbstractSubscriberUpdate {

    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("externalId")
    protected String externalId;


    public SubscriberCreate state(CreationEntityState state) {
        this.state = state;
        return this;
    }

    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public CreationEntityState getState() {
        return state;
    }

    public void setState(CreationEntityState state) {
        this.state = state;
    }


    public SubscriberCreate externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
     *
     * @return externalId
     **/
    @ApiModelProperty(required = true, value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriberCreate subscriberCreate = (SubscriberCreate) o;
        return Objects.equals(this.additionalAllowedPaymentMethodConfigurations, subscriberCreate.additionalAllowedPaymentMethodConfigurations) &&
                Objects.equals(this.billingAddress, subscriberCreate.billingAddress) &&
                Objects.equals(this.description, subscriberCreate.description) &&
                Objects.equals(this.disallowedPaymentMethodConfigurations, subscriberCreate.disallowedPaymentMethodConfigurations) &&
                Objects.equals(this.emailAddress, subscriberCreate.emailAddress) &&
                Objects.equals(this.language, subscriberCreate.language) &&
                Objects.equals(this.metaData, subscriberCreate.metaData) &&
                Objects.equals(this.reference, subscriberCreate.reference) &&
                Objects.equals(this.shippingAddress, subscriberCreate.shippingAddress) && this.state == subscriberCreate.state
                &&
                Objects.equals(this.externalId, subscriberCreate.externalId) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalAllowedPaymentMethodConfigurations, billingAddress, description, disallowedPaymentMethodConfigurations, emailAddress, language, metaData, reference, shippingAddress, state, externalId, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SubscriberCreate { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    additionalAllowedPaymentMethodConfigurations: " +  toIndentedString(additionalAllowedPaymentMethodConfigurations) + "\n" +
            "    billingAddress: " +  toIndentedString(billingAddress) + "\n" +
            "    description: " + toIndentedString(description) +  " \n" +
            "    disallowedPaymentMethodConfigurations: " + toIndentedString(disallowedPaymentMethodConfigurations) + "\n" +
            "    emailAddress: " + toIndentedString(emailAddress) + "\n" +
            "    language: " +  toIndentedString(language) + "\n" +
            "    metaData: " + toIndentedString(metaData) + "\n" +
            "    reference: " + toIndentedString(reference) + " \n" +
            "    shippingAddress: " + toIndentedString(shippingAddress) +  " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    externalId: " + toIndentedString(externalId) +  " \n" +
            "}";
        }


}

