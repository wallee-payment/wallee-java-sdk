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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.CreationEntityState;

/**
 * AbstractApplicationUserUpdate
 */
public class AbstractApplicationUserUpdate {

	@SerializedName("name")
	private String name = null;

	@SerializedName("requestLimit")
	private Long requestLimit = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	public AbstractApplicationUserUpdate name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The user name is used to identify the application user in administrative interfaces.
	 *
	 * @return The user name is used to identify the application user in administrative interfaces.
	 */
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
	 * @return The request limit defines the maximum number of API request accepted within 2 minutes. This limit can only be changed with special privileges.
	 */
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
	 * state
	 *
	 * @return state
	 */
	public CreationEntityState getState() {
		return state;
	}

	public void setState(CreationEntityState state) {
		this.state = state;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AbstractApplicationUserUpdate abstractApplicationUserUpdate = (AbstractApplicationUserUpdate) o;
		return Objects.equals(this.name, abstractApplicationUserUpdate.name) &&
				Objects.equals(this.requestLimit, abstractApplicationUserUpdate.requestLimit) &&
				Objects.equals(this.state, abstractApplicationUserUpdate.state);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, requestLimit, state);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AbstractApplicationUserUpdate {\n");
		
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n		");
	}

}

