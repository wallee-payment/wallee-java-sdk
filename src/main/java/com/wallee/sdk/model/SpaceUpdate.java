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
import com.wallee.sdk.model.AbstractSpaceUpdate;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.SpaceAddressCreate;
import java.util.List;

/**
 * SpaceUpdate
 */
public class SpaceUpdate extends AbstractSpaceUpdate {

	@SerializedName("id")
	private Long id = null;

	@SerializedName("version")
	private Long version = null;

	public SpaceUpdate id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SpaceUpdate version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public SpaceUpdate name(String name) {
		super.name(name);
		return this;
	}

	@Override
	public SpaceUpdate postalAddress(SpaceAddressCreate postalAddress) {
		super.postalAddress(postalAddress);
		return this;
	}

	@Override
	public SpaceUpdate primaryCurrency(String primaryCurrency) {
		super.primaryCurrency(primaryCurrency);
		return this;
	}

	@Override
	public SpaceUpdate requestLimit(Long requestLimit) {
		super.requestLimit(requestLimit);
		return this;
	}

	@Override
	public SpaceUpdate state(CreationEntityState state) {
		super.state(state);
		return this;
	}

	@Override
	public SpaceUpdate technicalContactAddresses(List<String> technicalContactAddresses) {
		super.technicalContactAddresses(technicalContactAddresses);
		return this;
	}

	@Override
	public SpaceUpdate addTechnicalContactAddressesItem(String technicalContactAddressesItem) {
		super.addTechnicalContactAddressesItem(technicalContactAddressesItem);
		return this;
	}

	@Override
	public SpaceUpdate timeZone(String timeZone) {
		super.timeZone(timeZone);
		return this;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SpaceUpdate spaceUpdate = (SpaceUpdate) o;
		return Objects.equals(this.id, spaceUpdate.id) &&
				Objects.equals(this.version, spaceUpdate.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SpaceUpdate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
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

