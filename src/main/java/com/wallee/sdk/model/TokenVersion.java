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

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.ChargeAttemptEnvironment;
import com.wallee.sdk.model.enums.TokenVersionState;

@ApiModel(description = "")

public class TokenVersion extends Indentable {

    @JsonProperty("activatedOn")
    protected OffsetDateTime activatedOn;


    @JsonProperty("billingAddress")
    protected Address billingAddress;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("environment")
    protected ChargeAttemptEnvironment environment;


    @JsonProperty("expiresOn")
    protected OffsetDateTime expiresOn;


    @JsonProperty("iconUrl")
    protected String iconUrl;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("labels")
    protected List<Label> labels;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("obsoletedOn")
    protected OffsetDateTime obsoletedOn;


    @JsonProperty("paymentConnectorConfiguration")
    protected PaymentConnectorConfiguration paymentConnectorConfiguration;


    @JsonProperty("paymentInformationHashes")
    protected List<PaymentInformationHash> paymentInformationHashes;


    @JsonProperty("paymentMethod")
    protected Long paymentMethod;


    @JsonProperty("paymentMethodBrand")
    protected Long paymentMethodBrand;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("processorToken")
    protected String processorToken;


    @JsonProperty("shippingAddress")
    protected Address shippingAddress;


    @JsonProperty("state")
    protected TokenVersionState state;


    @JsonProperty("token")
    protected Token token;


    @JsonProperty("type")
    protected TokenVersionType type;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return activatedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getActivatedOn() {
        return activatedOn;
    }


    /**
     * @return billingAddress
     **/
    @ApiModelProperty(value = "")
    public Address getBillingAddress() {
        return billingAddress;
    }


    /**
     * The created on date indicates the date on which the entity was stored into the database.
     *
     * @return createdOn
     **/
    @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return environment
     **/
    @ApiModelProperty(value = "")
    public ChargeAttemptEnvironment getEnvironment() {
        return environment;
    }


    /**
     * The expires on date indicates when token version expires. Once this date is reached the token version is marked as obsolete.
     *
     * @return expiresOn
     **/
    @ApiModelProperty(value = "The expires on date indicates when token version expires. Once this date is reached the token version is marked as obsolete.")
    public OffsetDateTime getExpiresOn() {
        return expiresOn;
    }


    /**
     * @return iconUrl
     **/
    @ApiModelProperty(value = "")
    public String getIconUrl() {
        return iconUrl;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * @return labels
     **/
    @ApiModelProperty(value = "")
    public List<Label> getLabels() {
        return labels;
    }


    /**
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }


    /**
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }


    /**
     * @return obsoletedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getObsoletedOn() {
        return obsoletedOn;
    }


    /**
     * @return paymentConnectorConfiguration
     **/
    @ApiModelProperty(value = "")
    public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
        return paymentConnectorConfiguration;
    }


    /**
     * The payment information hash set contains hashes of the payment information represented by this token version.
     *
     * @return paymentInformationHashes
     **/
    @ApiModelProperty(value = "The payment information hash set contains hashes of the payment information represented by this token version.")
    public List<PaymentInformationHash> getPaymentInformationHashes() {
        return paymentInformationHashes;
    }


    /**
     * @return paymentMethod
     **/
    @ApiModelProperty(value = "")
    public Long getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * @return paymentMethodBrand
     **/
    @ApiModelProperty(value = "")
    public Long getPaymentMethodBrand() {
        return paymentMethodBrand;
    }


    /**
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * @return processorToken
     **/
    @ApiModelProperty(value = "")
    public String getProcessorToken() {
        return processorToken;
    }


    /**
     * @return shippingAddress
     **/
    @ApiModelProperty(value = "")
    public Address getShippingAddress() {
        return shippingAddress;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public TokenVersionState getState() {
        return state;
    }


    /**
     * @return token
     **/
    @ApiModelProperty(value = "")
    public Token getToken() {
        return token;
    }


    /**
     * The token version type determines what kind of token it is and by which payment connector the token can be processed by.
     *
     * @return type
     **/
    @ApiModelProperty(value = "The token version type determines what kind of token it is and by which payment connector the token can be processed by.")
    public TokenVersionType getType() {
        return type;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenVersion tokenVersion = (TokenVersion) o;
        return Objects.equals(this.activatedOn, tokenVersion.activatedOn) &&
                Objects.equals(this.billingAddress, tokenVersion.billingAddress) &&
                Objects.equals(this.createdOn, tokenVersion.createdOn) && this.environment == tokenVersion.environment &&
                Objects.equals(this.expiresOn, tokenVersion.expiresOn) &&
                Objects.equals(this.iconUrl, tokenVersion.iconUrl) &&
                Objects.equals(this.id, tokenVersion.id) &&
                Objects.equals(this.labels, tokenVersion.labels) &&
                Objects.equals(this.language, tokenVersion.language) &&
                Objects.equals(this.linkedSpaceId, tokenVersion.linkedSpaceId) &&
                Objects.equals(this.name, tokenVersion.name) &&
                Objects.equals(this.obsoletedOn, tokenVersion.obsoletedOn) &&
                Objects.equals(this.paymentConnectorConfiguration, tokenVersion.paymentConnectorConfiguration) &&
                Objects.equals(this.paymentInformationHashes, tokenVersion.paymentInformationHashes) &&
                Objects.equals(this.paymentMethod, tokenVersion.paymentMethod) &&
                Objects.equals(this.paymentMethodBrand, tokenVersion.paymentMethodBrand) &&
                Objects.equals(this.plannedPurgeDate, tokenVersion.plannedPurgeDate) &&
                Objects.equals(this.processorToken, tokenVersion.processorToken) &&
                Objects.equals(this.shippingAddress, tokenVersion.shippingAddress) && this.state == tokenVersion.state &&
                Objects.equals(this.token, tokenVersion.token) &&
                Objects.equals(this.type, tokenVersion.type) &&
                Objects.equals(this.version, tokenVersion.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activatedOn, billingAddress, createdOn, environment, expiresOn, iconUrl, id, labels, language, linkedSpaceId, name, obsoletedOn, paymentConnectorConfiguration, paymentInformationHashes, paymentMethod, paymentMethodBrand, plannedPurgeDate, processorToken, shippingAddress, state, token, type, version);
    }


    @Override
    public String toString() {

        return "class TokenVersion {\n" +
            "    activatedOn: " + toIndentedString(activatedOn) +  "\n" +
            "    billingAddress: " + toIndentedString(billingAddress) + "\n" +
            "    createdOn: " +  toIndentedString(createdOn) + "\n" +
            "    environment: " + toIndentedString(environment) + "\n" +
            "    expiresOn: " + toIndentedString(expiresOn) + "\n" +
            "    iconUrl: " + toIndentedString(iconUrl) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    labels: " + toIndentedString(labels) + "\n" +
            "    language: " + toIndentedString(language) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  "\n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    obsoletedOn: " + toIndentedString(obsoletedOn) +  "\n" +
            "    paymentConnectorConfiguration: " + toIndentedString(paymentConnectorConfiguration) +  "\n" +
            "    paymentInformationHashes: " + toIndentedString(paymentInformationHashes) +  "\n" +
            "    paymentMethod: " + toIndentedString(paymentMethod) + "\n" +
            "    paymentMethodBrand: " + toIndentedString(paymentMethodBrand) + "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    processorToken: " + toIndentedString(processorToken) + "\n" +
            "    shippingAddress: " + toIndentedString(shippingAddress) + "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    token: " + toIndentedString(token) + "\n" +
            "    type: " + toIndentedString(type) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

