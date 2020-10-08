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

/**
 * AbstractTransactionInvoiceCommentActive
 */

public class AbstractTransactionInvoiceCommentActive extends Indentable {

    @JsonProperty("content")
    protected String content;


    public AbstractTransactionInvoiceCommentActive content(String content) {
        this.content = content;
        return this;
    }

    /**
     * @return content
     **/
    @ApiModelProperty(value = "")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractTransactionInvoiceCommentActive abstractTransactionInvoiceCommentActive = (AbstractTransactionInvoiceCommentActive) o;
        return Objects.equals(this.content, abstractTransactionInvoiceCommentActive.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }


    @Override
    public String toString() {

        return "class AbstractTransactionInvoiceCommentActive { \n" +
            "    content: " + toIndentedString(content) + " \n" +
            "}";
    }

}

