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
 * FailureCategory
 */
public enum FailureCategory {
	
	@SerializedName("TEMPORARY_ISSUE")
	TEMPORARY_ISSUE("TEMPORARY_ISSUE"),
	
	@SerializedName("INTERNAL")
	INTERNAL("INTERNAL"),
	
	@SerializedName("END_USER")
	END_USER("END_USER"),
	
	@SerializedName("CONFIGURATION")
	CONFIGURATION("CONFIGURATION"),
	
	@SerializedName("DEVELOPER")
	DEVELOPER("DEVELOPER");

	private String value;

	private FailureCategory(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

