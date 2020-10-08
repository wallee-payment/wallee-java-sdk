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
import com.wallee.sdk.model.enums.ManualTaskState;

/**
 * A manual task requires a manual intervention by a human.
 */
@ApiModel(description = "A manual task requires a manual intervention by a human.")

public class ManualTask extends Indentable {

    @JsonProperty("actions")
    protected List<Long> actions;


    @JsonProperty("contextEntityId")
    protected Long contextEntityId;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("expiresOn")
    protected OffsetDateTime expiresOn;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("spaceId")
    protected Long spaceId;


    @JsonProperty("state")
    protected ManualTaskState state;


    @JsonProperty("type")
    protected Long type;


    /**
     * @return actions
     **/
    @ApiModelProperty(value = "")
    public List<Long> getActions() {
        return actions;
    }


    /**
     * The context entity ID links the manual task to the entity which caused its creation.
     *
     * @return contextEntityId
     **/
    @ApiModelProperty(value = "The context entity ID links the manual task to the entity which caused its creation.")
    public Long getContextEntityId() {
        return contextEntityId;
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
     * The expiry date indicates until when the manual task has to be executed.
     *
     * @return expiresOn
     **/
    @ApiModelProperty(value = "The expiry date indicates until when the manual task has to be executed.")
    public OffsetDateTime getExpiresOn() {
        return expiresOn;
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
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
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
     * @return spaceId
     **/
    @ApiModelProperty(value = "")
    public Long getSpaceId() {
        return spaceId;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public ManualTaskState getState() {
        return state;
    }


    /**
     * The type categorizes the manual task.
     *
     * @return type
     **/
    @ApiModelProperty(value = "The type categorizes the manual task.")
    public Long getType() {
        return type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManualTask manualTask = (ManualTask) o;
        return Objects.equals(this.actions, manualTask.actions) &&
                Objects.equals(this.contextEntityId, manualTask.contextEntityId) &&
                Objects.equals(this.createdOn, manualTask.createdOn) &&
                Objects.equals(this.expiresOn, manualTask.expiresOn) &&
                Objects.equals(this.id, manualTask.id) &&
                Objects.equals(this.linkedSpaceId, manualTask.linkedSpaceId) &&
                Objects.equals(this.plannedPurgeDate, manualTask.plannedPurgeDate) &&
                Objects.equals(this.spaceId, manualTask.spaceId) && this.state == manualTask.state &&
                Objects.equals(this.type, manualTask.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions, contextEntityId, createdOn, expiresOn, id, linkedSpaceId, plannedPurgeDate, spaceId, state, type);
    }


    @Override
    public String toString() {

        return "class ManualTask { \n" +
            "    actions: " + toIndentedString(actions) +  " \n" +
            "    contextEntityId: " + toIndentedString(contextEntityId) + " \n" +
            "    createdOn: " +  toIndentedString(createdOn) + "\n" +
            "    expiresOn: " + toIndentedString(expiresOn) + "\n" +
            "    id: " +  toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    spaceId: " + toIndentedString(spaceId) +  " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    type: " + toIndentedString(type) + "\n" +
            "}";
        }


}

