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

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.CreationEntityState;

/**
 * AbstractApplicationUserUpdate
 */

public class AbstractApplicationUserUpdate extends Indentable {

    @JsonProperty("name")
    protected String name;

    @JsonProperty("requestLimit")
    protected Long requestLimit;

    @JsonProperty("state")
    protected CreationEntityState state;


    public AbstractApplicationUserUpdate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The user name is used to identify the application user in administrative interfaces.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The user name is used to identify the application user in administrative interfaces.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public AbstractApplicationUserUpdate requestLimit(Long requestLimit) {
        this.requestLimit = requestLimit;
        return this;
    }

    /**
     * The request limit defines the maximum number of API request accepted within 2 minutes. This limit can only be changed with special privileges.
     *
     * @return requestLimit
     **/
    @ApiModelProperty(value = "The request limit defines the maximum number of API request accepted within 2 minutes. This limit can only be changed with special privileges.")
    public Long getRequestLimit() {
        return requestLimit;
    }

    public void setRequestLimit(Long requestLimit) {
        this.requestLimit = requestLimit;
    }


    public AbstractApplicationUserUpdate state(CreationEntityState state) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractApplicationUserUpdate abstractApplicationUserUpdate = (AbstractApplicationUserUpdate) o;
        return Objects.equals(this.name, abstractApplicationUserUpdate.name) &&
                Objects.equals(this.requestLimit, abstractApplicationUserUpdate.requestLimit) && this.state
                == abstractApplicationUserUpdate.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, requestLimit, state);
    }


    @Override
    public String toString() {

        return "class AbstractApplicationUserUpdate { \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    requestLimit: " + toIndentedString(requestLimit) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "}";
    }

}

