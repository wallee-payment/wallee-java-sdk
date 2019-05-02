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
 * CustomersPresence
 */
public enum CustomersPresence {
	
	@SerializedName("NOT_PRESENT")
	NOT_PRESENT("NOT_PRESENT"),
	
	@SerializedName("VIRTUAL_PRESENT")
	VIRTUAL_PRESENT("VIRTUAL_PRESENT"),
	
	@SerializedName("PHYSICAL_PRESENT")
	PHYSICAL_PRESENT("PHYSICAL_PRESENT");

	private String value;

	private CustomersPresence(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

