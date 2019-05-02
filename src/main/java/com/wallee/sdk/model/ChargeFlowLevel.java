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
import com.wallee.sdk.model.ChargeFlowLevelConfiguration;
import com.wallee.sdk.model.ChargeFlowLevelState;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionAwareEntity;
import java.time.OffsetDateTime;

/**
 * ChargeFlowLevel
 */
public class ChargeFlowLevel extends TransactionAwareEntity {

	@SerializedName("asynchronousCharge")
	private Long asynchronousCharge = null;

	@SerializedName("configuration")
	private ChargeFlowLevelConfiguration _configuration = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("state")
	private ChargeFlowLevelState state = null;

	@SerializedName("synchronousCharge")
	private Long synchronousCharge = null;

	@SerializedName("timeoutOn")
	private OffsetDateTime timeoutOn = null;

	@SerializedName("tokenCharge")
	private Long tokenCharge = null;

	@SerializedName("transaction")
	private Transaction transaction = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * asynchronousCharge
	 *
	 * @return asynchronousCharge
	 */
	public Long getAsynchronousCharge() {
		return asynchronousCharge;
	}

	/**
	 * _configuration
	 *
	 * @return _configuration
	 */
	public ChargeFlowLevelConfiguration getConfiguration() {
		return _configuration;
	}

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
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
	 * state
	 *
	 * @return state
	 */
	public ChargeFlowLevelState getState() {
		return state;
	}

	/**
	 * synchronousCharge
	 *
	 * @return synchronousCharge
	 */
	public Long getSynchronousCharge() {
		return synchronousCharge;
	}

	/**
	 * timeoutOn
	 *
	 * @return timeoutOn
	 */
	public OffsetDateTime getTimeoutOn() {
		return timeoutOn;
	}

	/**
	 * tokenCharge
	 *
	 * @return tokenCharge
	 */
	public Long getTokenCharge() {
		return tokenCharge;
	}

	/**
	 * transaction
	 *
	 * @return transaction
	 */
	public Transaction getTransaction() {
		return transaction;
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
		ChargeFlowLevel chargeFlowLevel = (ChargeFlowLevel) o;
		return Objects.equals(this.asynchronousCharge, chargeFlowLevel.asynchronousCharge) &&
				Objects.equals(this._configuration, chargeFlowLevel._configuration) &&
				Objects.equals(this.createdOn, chargeFlowLevel.createdOn) &&
				Objects.equals(this.plannedPurgeDate, chargeFlowLevel.plannedPurgeDate) &&
				Objects.equals(this.state, chargeFlowLevel.state) &&
				Objects.equals(this.synchronousCharge, chargeFlowLevel.synchronousCharge) &&
				Objects.equals(this.timeoutOn, chargeFlowLevel.timeoutOn) &&
				Objects.equals(this.tokenCharge, chargeFlowLevel.tokenCharge) &&
				Objects.equals(this.transaction, chargeFlowLevel.transaction) &&
				Objects.equals(this.version, chargeFlowLevel.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(asynchronousCharge, _configuration, createdOn, plannedPurgeDate, state, synchronousCharge, timeoutOn, tokenCharge, transaction, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChargeFlowLevel {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		asynchronousCharge: ").append(toIndentedString(asynchronousCharge)).append("\n");
		sb.append("		_configuration: ").append(toIndentedString(_configuration)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		synchronousCharge: ").append(toIndentedString(synchronousCharge)).append("\n");
		sb.append("		timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
		sb.append("		tokenCharge: ").append(toIndentedString(tokenCharge)).append("\n");
		sb.append("		transaction: ").append(toIndentedString(transaction)).append("\n");
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

