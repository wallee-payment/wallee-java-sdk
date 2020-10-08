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
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.PaymentContractState;

@ApiModel(description = "")

public class PaymentContract extends Indentable {

    @JsonProperty("account")
    protected Account account;


    @JsonProperty("activatedOn")
    protected OffsetDateTime activatedOn;


    @JsonProperty("contractIdentifier")
    protected String contractIdentifier;


    @JsonProperty("contractType")
    protected PaymentContractType contractType;


    @JsonProperty("createdBy")
    protected User createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("rejectedOn")
    protected OffsetDateTime rejectedOn;


    @JsonProperty("rejectionReason")
    protected FailureReason rejectionReason;


    @JsonProperty("startTerminatingOn")
    protected OffsetDateTime startTerminatingOn;


    @JsonProperty("state")
    protected PaymentContractState state;


    @JsonProperty("terminatedBy")
    protected User terminatedBy;


    @JsonProperty("terminatedOn")
    protected OffsetDateTime terminatedOn;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return account
     **/
    @ApiModelProperty(value = "")
    public Account getAccount() {
        return account;
    }


    /**
     * @return activatedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getActivatedOn() {
        return activatedOn;
    }


    /**
     * @return contractIdentifier
     **/
    @ApiModelProperty(value = "")
    public String getContractIdentifier() {
        return contractIdentifier;
    }


    /**
     * @return contractType
     **/
    @ApiModelProperty(value = "")
    public PaymentContractType getContractType() {
        return contractType;
    }


    /**
     * @return createdBy
     **/
    @ApiModelProperty(value = "")
    public User getCreatedBy() {
        return createdBy;
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
     * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
     *
     * @return externalId
     **/
    @ApiModelProperty(value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
    public String getExternalId() {
        return externalId;
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
     * @return rejectedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getRejectedOn() {
        return rejectedOn;
    }


    /**
     * @return rejectionReason
     **/
    @ApiModelProperty(value = "")
    public FailureReason getRejectionReason() {
        return rejectionReason;
    }


    /**
     * @return startTerminatingOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getStartTerminatingOn() {
        return startTerminatingOn;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public PaymentContractState getState() {
        return state;
    }


    /**
     * @return terminatedBy
     **/
    @ApiModelProperty(value = "")
    public User getTerminatedBy() {
        return terminatedBy;
    }


    /**
     * @return terminatedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTerminatedOn() {
        return terminatedOn;
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
        PaymentContract paymentContract = (PaymentContract) o;
        return Objects.equals(this.account, paymentContract.account) &&
                Objects.equals(this.activatedOn, paymentContract.activatedOn) &&
                Objects.equals(this.contractIdentifier, paymentContract.contractIdentifier) &&
                Objects.equals(this.contractType, paymentContract.contractType) &&
                Objects.equals(this.createdBy, paymentContract.createdBy) &&
                Objects.equals(this.createdOn, paymentContract.createdOn) &&
                Objects.equals(this.externalId, paymentContract.externalId) &&
                Objects.equals(this.id, paymentContract.id) &&
                Objects.equals(this.rejectedOn, paymentContract.rejectedOn) &&
                Objects.equals(this.rejectionReason, paymentContract.rejectionReason) &&
                Objects.equals(this.startTerminatingOn, paymentContract.startTerminatingOn) && this.state
                == paymentContract.state &&
                Objects.equals(this.terminatedBy, paymentContract.terminatedBy) &&
                Objects.equals(this.terminatedOn, paymentContract.terminatedOn) &&
                Objects.equals(this.version, paymentContract.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, activatedOn, contractIdentifier, contractType, createdBy, createdOn, externalId, id, rejectedOn, rejectionReason, startTerminatingOn, state, terminatedBy, terminatedOn, version);
    }


    @Override
    public String toString() {

        return "class PaymentContract { \n" +
            "    account: " + toIndentedString(account) +  " \n" +
            "    activatedOn: " + toIndentedString(activatedOn) + " \n" +
            "    contractIdentifier: " +  toIndentedString(contractIdentifier) + "\n" +
            "    contractType: " + toIndentedString(contractType) + "\n" +
            "    createdBy: " + toIndentedString(createdBy) + "\n" +
            "    createdOn: " + toIndentedString(createdOn) +  " \n" +
            "    externalId: " + toIndentedString(externalId) + " \n" +
            "    id: " + toIndentedString(id) +  " \n" +
            "    rejectedOn: " + toIndentedString(rejectedOn) + " \n" +
            "    rejectionReason: " +  toIndentedString(rejectionReason) + "\n" +
            "    startTerminatingOn: " + toIndentedString(startTerminatingOn) +  " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    terminatedBy: " + toIndentedString(terminatedBy) + "\n" +
            "    terminatedOn: " + toIndentedString(terminatedOn) + "\n" +
            "    version: " +  toIndentedString(version) + "\n" +
            "}";
        }


}

