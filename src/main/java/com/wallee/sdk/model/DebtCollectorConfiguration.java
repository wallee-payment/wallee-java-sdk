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
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.CreationEntityState;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The debt collector configuration defines the behavior of the collection process for a particular collector.
 */
public class DebtCollectorConfiguration {

	@SerializedName("collector")
	private Long collector = null;

	@SerializedName("conditions")
	private List<Long> conditions = new ArrayList<Long>();

	@SerializedName("enabledSpaceViews")
	private List<Long> enabledSpaceViews = new ArrayList<Long>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("priority")
	private Integer priority = null;

	@SerializedName("skipReviewEnabled")
	private Boolean skipReviewEnabled = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The collector handles the debt collection case based on the settings of this configuration.
	 *
	 * @return The collector handles the debt collection case based on the settings of this configuration.
	 */
	public Long getCollector() {
		return collector;
	}

	/**
	 * The conditions applied to the collector configuration restricts the application of this configuration onto a particular debt collection case.
	 *
	 * @return The conditions applied to the collector configuration restricts the application of this configuration onto a particular debt collection case.
	 */
	public List<Long> getConditions() {
		return conditions;
	}

	/**
	 * The collector configuration is only enabled for the selected space views. In case the set is empty the collector configuration is enabled for all space views.
	 *
	 * @return The collector configuration is only enabled for the selected space views. In case the set is empty the collector configuration is enabled for all space views.
	 */
	public List<Long> getEnabledSpaceViews() {
		return enabledSpaceViews;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * The collector configuration name is used internally to identify a specific collector configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The collector configuration name is used internally to identify a specific collector configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
	 */
	public String getName() {
		return name;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	public OffsetDateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * The priority defines the order in which the collector configuration is tried to be applied onto a debt collection case. The higher the value the less likely the configuration is applied on a case.
	 *
	 * @return The priority defines the order in which the collector configuration is tried to be applied onto a debt collection case. The higher the value the less likely the configuration is applied on a case.
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * When the review is skipped there will be no review for cases which use this configuration.
	 *
	 * @return When the review is skipped there will be no review for cases which use this configuration.
	 */
	public Boolean getSkipReviewEnabled() {
		return skipReviewEnabled;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public CreationEntityState getState() {
		return state;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	public Integer getVersion() {
		return version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DebtCollectorConfiguration debtCollectorConfiguration = (DebtCollectorConfiguration) o;
		return Objects.equals(this.collector, debtCollectorConfiguration.collector) &&
				Objects.equals(this.conditions, debtCollectorConfiguration.conditions) &&
				Objects.equals(this.enabledSpaceViews, debtCollectorConfiguration.enabledSpaceViews) &&
				Objects.equals(this.id, debtCollectorConfiguration.id) &&
				Objects.equals(this.linkedSpaceId, debtCollectorConfiguration.linkedSpaceId) &&
				Objects.equals(this.name, debtCollectorConfiguration.name) &&
				Objects.equals(this.plannedPurgeDate, debtCollectorConfiguration.plannedPurgeDate) &&
				Objects.equals(this.priority, debtCollectorConfiguration.priority) &&
				Objects.equals(this.skipReviewEnabled, debtCollectorConfiguration.skipReviewEnabled) &&
				Objects.equals(this.state, debtCollectorConfiguration.state) &&
				Objects.equals(this.version, debtCollectorConfiguration.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(collector, conditions, enabledSpaceViews, id, linkedSpaceId, name, plannedPurgeDate, priority, skipReviewEnabled, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DebtCollectorConfiguration {\n");
		
		sb.append("		collector: ").append(toIndentedString(collector)).append("\n");
		sb.append("		conditions: ").append(toIndentedString(conditions)).append("\n");
		sb.append("		enabledSpaceViews: ").append(toIndentedString(enabledSpaceViews)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("		skipReviewEnabled: ").append(toIndentedString(skipReviewEnabled)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
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
