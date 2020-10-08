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
import com.wallee.sdk.model.enums.CreationEntityState;
import com.wallee.sdk.model.enums.UserType;

@ApiModel(description = "")

public class User extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("scope")
    protected Scope scope;


    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("userType")
    protected UserType userType;


    @JsonProperty("version")
    protected Integer version;


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
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * @return scope
     **/
    @ApiModelProperty(value = "")
    public Scope getScope() {
        return scope;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public CreationEntityState getState() {
        return state;
    }


    /**
     * @return userType
     **/
    @ApiModelProperty(value = "")
    public UserType getUserType() {
        return userType;
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
        User user = (User) o;
        return Objects.equals(this.id, user.id) &&
                Objects.equals(this.plannedPurgeDate, user.plannedPurgeDate) &&
                Objects.equals(this.scope, user.scope) && this.state == user.state && this.userType == user.userType &&
                Objects.equals(this.version, user.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plannedPurgeDate, scope, state, userType, version);
    }


    @Override
    public String toString() {

        return "class User { \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    scope: " + toIndentedString(scope) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    userType: " + toIndentedString(userType) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }

}

