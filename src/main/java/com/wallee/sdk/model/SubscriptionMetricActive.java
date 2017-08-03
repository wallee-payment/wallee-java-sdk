/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
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
 */
package com.wallee.sdk.model;

import java.util.Objects;
import com.wallee.sdk.model.DatabaseTranslatedStringCreate;
import com.wallee.sdk.model.SubscriptionMetricUpdate;

/**
 * A metric represents the usage of a resource that can be measured.
 */
public class SubscriptionMetricActive extends SubscriptionMetricUpdate {

	@Override
	public SubscriptionMetricActive id(Long id) {
		super.id(id);
		return this;
	}

	@Override
	public SubscriptionMetricActive version(Long version) {
		super.version(version);
		return this;
	}

	@Override
	public SubscriptionMetricActive description(DatabaseTranslatedStringCreate description) {
		super.description(description);
		return this;
	}

	@Override
	public SubscriptionMetricActive name(DatabaseTranslatedStringCreate name) {
		super.name(name);
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
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionMetricActive {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
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
