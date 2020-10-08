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
import com.wallee.sdk.model.enums.PaymentTerminalState;

@ApiModel(description = "")

public class PaymentTerminal extends Indentable {

    @JsonProperty("configurationVersion")
    protected PaymentTerminalConfigurationVersion configurationVersion;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("identifier")
    protected String identifier;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("locationVersion")
    protected PaymentTerminalLocationVersion locationVersion;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("state")
    protected PaymentTerminalState state;


    @JsonProperty("type")
    protected PaymentTerminalType type;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return configurationVersion
     **/
    @ApiModelProperty(value = "")
    public PaymentTerminalConfigurationVersion getConfigurationVersion() {
        return configurationVersion;
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
     * The identifier uniquely identifies the terminal. Normally it is visible on the device or in the display of the device.
     *
     * @return identifier
     **/
    @ApiModelProperty(value = "The identifier uniquely identifies the terminal. Normally it is visible on the device or in the display of the device.")
    public String getIdentifier() {
        return identifier;
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
     * @return locationVersion
     **/
    @ApiModelProperty(value = "")
    public PaymentTerminalLocationVersion getLocationVersion() {
        return locationVersion;
    }


    /**
     * The terminal name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The terminal name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
    public String getName() {
        return name;
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
     * @return state
     **/
    @ApiModelProperty(value = "")
    public PaymentTerminalState getState() {
        return state;
    }


    /**
     * @return type
     **/
    @ApiModelProperty(value = "")
    public PaymentTerminalType getType() {
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
        PaymentTerminal paymentTerminal = (PaymentTerminal) o;
        return Objects.equals(this.configurationVersion, paymentTerminal.configurationVersion) &&
                Objects.equals(this.id, paymentTerminal.id) &&
                Objects.equals(this.identifier, paymentTerminal.identifier) &&
                Objects.equals(this.linkedSpaceId, paymentTerminal.linkedSpaceId) &&
                Objects.equals(this.locationVersion, paymentTerminal.locationVersion) &&
                Objects.equals(this.name, paymentTerminal.name) &&
                Objects.equals(this.plannedPurgeDate, paymentTerminal.plannedPurgeDate) && this.state == paymentTerminal.state
                &&
                Objects.equals(this.type, paymentTerminal.type) &&
                Objects.equals(this.version, paymentTerminal.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationVersion, id, identifier, linkedSpaceId, locationVersion, name, plannedPurgeDate, state, type, version);
    }


    @Override
    public String toString() {

        return "class PaymentTerminal { \n" +
            "    configurationVersion: " + toIndentedString(configurationVersion) + "\n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    identifier: " + toIndentedString(identifier) +  "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    locationVersion: " + toIndentedString(locationVersion) + " \n" +
            "    name: " + toIndentedString(name) +  "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    state: " +  toIndentedString(state) + " \n" +
            "    type: " + toIndentedString(type) + " \n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

