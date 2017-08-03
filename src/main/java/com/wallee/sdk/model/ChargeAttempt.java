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
import com.wallee.sdk.model.Charge;
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.ChargeAttemptState;
import com.wallee.sdk.model.ConnectorInvocation;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.TokenVersion;
import com.wallee.sdk.model.TransactionAwareEntity;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ChargeAttempt
 */
public class ChargeAttempt extends TransactionAwareEntity {

	@SerializedName("charge")
	private Charge charge = null;

	@SerializedName("connectorConfiguration")
	private PaymentConnectorConfiguration connectorConfiguration = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("environment")
	private ChargeAttemptEnvironment environment = null;

	@SerializedName("failedOn")
	private OffsetDateTime failedOn = null;

	@SerializedName("failureReason")
	private FailureReason failureReason = null;

	@SerializedName("initializingTokenVersion")
	private Boolean initializingTokenVersion = null;

	@SerializedName("invocation")
	private ConnectorInvocation invocation = null;

	@SerializedName("labels")
	private List<Label> labels = new ArrayList<Label>();

	@SerializedName("language")
	private String language = null;

	@SerializedName("nextUpdateOn")
	private OffsetDateTime nextUpdateOn = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("redirectionUrl")
	private String redirectionUrl = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("state")
	private ChargeAttemptState state = null;

	@SerializedName("succeededOn")
	private OffsetDateTime succeededOn = null;

	@SerializedName("timeoutOn")
	private OffsetDateTime timeoutOn = null;

	@SerializedName("tokenVersion")
	private TokenVersion tokenVersion = null;

	@SerializedName("userFailureMessage")
	private String userFailureMessage = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * charge
	 *
	 * @return charge
	 */
	public Charge getCharge() {
		return charge;
	}

	/**
	 * connectorConfiguration
	 *
	 * @return connectorConfiguration
	 */
	public PaymentConnectorConfiguration getConnectorConfiguration() {
		return connectorConfiguration;
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
	 * environment
	 *
	 * @return environment
	 */
	public ChargeAttemptEnvironment getEnvironment() {
		return environment;
	}

	/**
	 * failedOn
	 *
	 * @return failedOn
	 */
	public OffsetDateTime getFailedOn() {
		return failedOn;
	}

	/**
	 * failureReason
	 *
	 * @return failureReason
	 */
	public FailureReason getFailureReason() {
		return failureReason;
	}

	/**
	 * initializingTokenVersion
	 *
	 * @return initializingTokenVersion
	 */
	public Boolean getInitializingTokenVersion() {
		return initializingTokenVersion;
	}

	/**
	 * invocation
	 *
	 * @return invocation
	 */
	public ConnectorInvocation getInvocation() {
		return invocation;
	}

	/**
	 * labels
	 *
	 * @return labels
	 */
	public List<Label> getLabels() {
		return labels;
	}

	/**
	 * language
	 *
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * nextUpdateOn
	 *
	 * @return nextUpdateOn
	 */
	public OffsetDateTime getNextUpdateOn() {
		return nextUpdateOn;
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
	 * redirectionUrl
	 *
	 * @return redirectionUrl
	 */
	public String getRedirectionUrl() {
		return redirectionUrl;
	}

	/**
	 * spaceViewId
	 *
	 * @return spaceViewId
	 */
	public Long getSpaceViewId() {
		return spaceViewId;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public ChargeAttemptState getState() {
		return state;
	}

	/**
	 * succeededOn
	 *
	 * @return succeededOn
	 */
	public OffsetDateTime getSucceededOn() {
		return succeededOn;
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
	 * tokenVersion
	 *
	 * @return tokenVersion
	 */
	public TokenVersion getTokenVersion() {
		return tokenVersion;
	}

	/**
	 * The user failure message contains the message for the user in case the attempt failed. The message is localized into the language specified on the transaction.
	 *
	 * @return The user failure message contains the message for the user in case the attempt failed. The message is localized into the language specified on the transaction.
	 */
	public String getUserFailureMessage() {
		return userFailureMessage;
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
		ChargeAttempt chargeAttempt = (ChargeAttempt) o;
		return Objects.equals(this.charge, chargeAttempt.charge) &&
				Objects.equals(this.connectorConfiguration, chargeAttempt.connectorConfiguration) &&
				Objects.equals(this.createdOn, chargeAttempt.createdOn) &&
				Objects.equals(this.environment, chargeAttempt.environment) &&
				Objects.equals(this.failedOn, chargeAttempt.failedOn) &&
				Objects.equals(this.failureReason, chargeAttempt.failureReason) &&
				Objects.equals(this.initializingTokenVersion, chargeAttempt.initializingTokenVersion) &&
				Objects.equals(this.invocation, chargeAttempt.invocation) &&
				Objects.equals(this.labels, chargeAttempt.labels) &&
				Objects.equals(this.language, chargeAttempt.language) &&
				Objects.equals(this.nextUpdateOn, chargeAttempt.nextUpdateOn) &&
				Objects.equals(this.plannedPurgeDate, chargeAttempt.plannedPurgeDate) &&
				Objects.equals(this.redirectionUrl, chargeAttempt.redirectionUrl) &&
				Objects.equals(this.spaceViewId, chargeAttempt.spaceViewId) &&
				Objects.equals(this.state, chargeAttempt.state) &&
				Objects.equals(this.succeededOn, chargeAttempt.succeededOn) &&
				Objects.equals(this.timeoutOn, chargeAttempt.timeoutOn) &&
				Objects.equals(this.tokenVersion, chargeAttempt.tokenVersion) &&
				Objects.equals(this.userFailureMessage, chargeAttempt.userFailureMessage) &&
				Objects.equals(this.version, chargeAttempt.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(charge, connectorConfiguration, createdOn, environment, failedOn, failureReason, initializingTokenVersion, invocation, labels, language, nextUpdateOn, plannedPurgeDate, redirectionUrl, spaceViewId, state, succeededOn, timeoutOn, tokenVersion, userFailureMessage, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChargeAttempt {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		charge: ").append(toIndentedString(charge)).append("\n");
		sb.append("		connectorConfiguration: ").append(toIndentedString(connectorConfiguration)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		environment: ").append(toIndentedString(environment)).append("\n");
		sb.append("		failedOn: ").append(toIndentedString(failedOn)).append("\n");
		sb.append("		failureReason: ").append(toIndentedString(failureReason)).append("\n");
		sb.append("		initializingTokenVersion: ").append(toIndentedString(initializingTokenVersion)).append("\n");
		sb.append("		invocation: ").append(toIndentedString(invocation)).append("\n");
		sb.append("		labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		redirectionUrl: ").append(toIndentedString(redirectionUrl)).append("\n");
		sb.append("		spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
		sb.append("		timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
		sb.append("		tokenVersion: ").append(toIndentedString(tokenVersion)).append("\n");
		sb.append("		userFailureMessage: ").append(toIndentedString(userFailureMessage)).append("\n");
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
