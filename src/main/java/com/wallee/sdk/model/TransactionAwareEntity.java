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


@ApiModel(description = "")

public class TransactionAwareEntity {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("linkedTransaction")
    protected Long linkedTransaction;


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
     * @return linkedTransaction
     **/
    @ApiModelProperty(value = "")
    public Long getLinkedTransaction() {
        return linkedTransaction;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionAwareEntity transactionAwareEntity = (TransactionAwareEntity) o;
        return Objects.equals(this.id, transactionAwareEntity.id) &&
                Objects.equals(this.linkedSpaceId, transactionAwareEntity.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, transactionAwareEntity.linkedTransaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction);
    }


    @Override
    public String toString() {

        return "class TransactionAwareEntity { \n" +
            "    id: " + toIndentedString(id) +  " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + " \n" +
            "}";
        }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    protected String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

