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


@ApiModel(description = "")

public class TransactionComment extends Indentable {

    @JsonProperty("content")
    protected String content;


    @JsonProperty("createdBy")
    protected Long createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("editedBy")
    protected Long editedBy;


    @JsonProperty("editedOn")
    protected OffsetDateTime editedOn;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("pinned")
    protected Boolean pinned;


    @JsonProperty("transaction")
    protected Long transaction;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return content
     **/
    @ApiModelProperty(value = "")
    public String getContent() {
        return content;
    }


    /**
     * @return createdBy
     **/
    @ApiModelProperty(value = "")
    public Long getCreatedBy() {
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
     * @return editedBy
     **/
    @ApiModelProperty(value = "")
    public Long getEditedBy() {
        return editedBy;
    }


    /**
     * The date on which the comment was last edited.
     *
     * @return editedOn
     **/
    @ApiModelProperty(value = "The date on which the comment was last edited.")
    public OffsetDateTime getEditedOn() {
        return editedOn;
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
     * @return pinned
     **/
    @ApiModelProperty(value = "")
    public Boolean isPinned() {
        return pinned;
    }


    /**
     * @return transaction
     **/
    @ApiModelProperty(value = "")
    public Long getTransaction() {
        return transaction;
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
        TransactionComment transactionComment = (TransactionComment) o;
        return Objects.equals(this.content, transactionComment.content) &&
                Objects.equals(this.createdBy, transactionComment.createdBy) &&
                Objects.equals(this.createdOn, transactionComment.createdOn) &&
                Objects.equals(this.editedBy, transactionComment.editedBy) &&
                Objects.equals(this.editedOn, transactionComment.editedOn) &&
                Objects.equals(this.id, transactionComment.id) &&
                Objects.equals(this.linkedSpaceId, transactionComment.linkedSpaceId) &&
                Objects.equals(this.pinned, transactionComment.pinned) &&
                Objects.equals(this.transaction, transactionComment.transaction) &&
                Objects.equals(this.version, transactionComment.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, createdBy, createdOn, editedBy, editedOn, id, linkedSpaceId, pinned, transaction, version);
    }


    @Override
    public String toString() {

        return "class TransactionComment {\n" +
            "    content: " + toIndentedString(content) +  "\n" +
            "    createdBy: " + toIndentedString(createdBy) + "\n" +
            "    createdOn: " + toIndentedString(createdOn) + "\n" +
            "    editedBy: " + toIndentedString(editedBy) + "\n" +
            "    editedOn: " + toIndentedString(editedOn) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    pinned: " + toIndentedString(pinned) + "\n" +
            "    transaction: " +  toIndentedString(transaction) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

