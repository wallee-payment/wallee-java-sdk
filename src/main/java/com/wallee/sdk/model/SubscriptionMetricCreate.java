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

/**
 * A metric represents the usage of a resource that can be measured.
 */
@ApiModel(description = "A metric represents the usage of a resource that can be measured.")

public class SubscriptionMetricCreate extends AbstractSubscriptionMetricUpdate implements CreateableEntity {

    @JsonProperty("type")
    protected Long type;


    public SubscriptionMetricCreate type(Long type) {
        this.type = type;
        return this;
    }

    /**
     * @return type
     **/
    @ApiModelProperty(required = true, value = "")
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionMetricCreate subscriptionMetricCreate = (SubscriptionMetricCreate) o;
        return Objects.equals(this.description, subscriptionMetricCreate.description) &&
                Objects.equals(this.name, subscriptionMetricCreate.name) &&
                Objects.equals(this.type, subscriptionMetricCreate.type) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, type, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SubscriptionMetricCreate { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    description: " + toIndentedString(description) + " \n" +
            "    name: " + toIndentedString(name) +  " \n" +
            "    type: " + toIndentedString(type) + " \n" +
            "}";
        }


}

