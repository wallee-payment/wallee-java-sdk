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
 * DeliveryIndicationState
 */
public enum DeliveryIndicationState {
	
	@SerializedName("PENDING")
	PENDING("PENDING"),
	
	@SerializedName("NOT_SUITABLE")
	NOT_SUITABLE("NOT_SUITABLE"),
	
	@SerializedName("MANUAL_CHECK_REQUIRED")
	MANUAL_CHECK_REQUIRED("MANUAL_CHECK_REQUIRED"),
	
	@SerializedName("SUITABLE")
	SUITABLE("SUITABLE");

	private String value;

	private DeliveryIndicationState(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

