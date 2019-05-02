/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author   customweb GmbH (www.customweb.com)
 */
package com.wallee.sdk.model;

import com.google.gson.annotations.SerializedName;


/**
 * CriteriaOperator
 */
public enum CriteriaOperator {
	
	@SerializedName("CONTAINS")
	CONTAINS("CONTAINS"),
	
	@SerializedName("EQUALS")
	EQUALS("EQUALS"),
	
	@SerializedName("EQUALS_IGNORE_CASE")
	EQUALS_IGNORE_CASE("EQUALS_IGNORE_CASE"),
	
	@SerializedName("GREATER_THAN")
	GREATER_THAN("GREATER_THAN"),
	
	@SerializedName("GREATER_THAN_OR_EQUAL")
	GREATER_THAN_OR_EQUAL("GREATER_THAN_OR_EQUAL"),
	
	@SerializedName("LESS_THAN")
	LESS_THAN("LESS_THAN"),
	
	@SerializedName("LESS_THAN_OR_EQUAL")
	LESS_THAN_OR_EQUAL("LESS_THAN_OR_EQUAL"),
	
	@SerializedName("NOT_EQUALS")
	NOT_EQUALS("NOT_EQUALS"),
	
	@SerializedName("NOT_EQUALS_IGNORE_CASE")
	NOT_EQUALS_IGNORE_CASE("NOT_EQUALS_IGNORE_CASE"),
	
	@SerializedName("NOT_CONTAINS")
	NOT_CONTAINS("NOT_CONTAINS"),
	
	@SerializedName("IS_NULL")
	IS_NULL("IS_NULL"),
	
	@SerializedName("IS_NOT_NULL")
	IS_NOT_NULL("IS_NOT_NULL");

	private String value;

	private CriteriaOperator(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

