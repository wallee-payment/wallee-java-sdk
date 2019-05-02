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
import com.wallee.sdk.model.DataCollectionType;
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.OneClickPaymentMode;
import com.wallee.sdk.model.ResourcePath;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The payment method configuration builds the base to connect with different payment method connectors.
 */
public class PaymentMethodConfiguration {

	@SerializedName("dataCollectionType")
	private DataCollectionType dataCollectionType = null;

	@SerializedName("description")
	private DatabaseTranslatedString description = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("imageResourcePath")
	private ResourcePath imageResourcePath = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("oneClickPaymentMode")
	private OneClickPaymentMode oneClickPaymentMode = null;

	@SerializedName("paymentMethod")
	private Long paymentMethod = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("resolvedDescription")
	private Map<String, String> resolvedDescription = new HashMap<String, String>();

	@SerializedName("resolvedImageUrl")
	private String resolvedImageUrl = null;

	@SerializedName("resolvedTitle")
	private Map<String, String> resolvedTitle = new HashMap<String, String>();

	@SerializedName("sortOrder")
	private Integer sortOrder = null;

	@SerializedName("spaceId")
	private Long spaceId = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("title")
	private DatabaseTranslatedString title = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The data collection type determines who is collecting the payment information. This can be done either by the processor (offsite) or by our application (onsite).
	 *
	 * @return The data collection type determines who is collecting the payment information. This can be done either by the processor (offsite) or by our application (onsite).
	 */
	public DataCollectionType getDataCollectionType() {
		return dataCollectionType;
	}

	/**
	 * The payment method configuration description can be used to show a text during the payment process. Choose an appropriate description as it will be displayed to your customer.
	 *
	 * @return The payment method configuration description can be used to show a text during the payment process. Choose an appropriate description as it will be displayed to your customer.
	 */
	public DatabaseTranslatedString getDescription() {
		return description;
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
	 * The image of the payment method configuration overrides the default image of the payment method.
	 *
	 * @return The image of the payment method configuration overrides the default image of the payment method.
	 */
	public ResourcePath getImageResourcePath() {
		return imageResourcePath;
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
	 * The payment method configuration name is used internally to identify the payment method configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The payment method configuration name is used internally to identify the payment method configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
	 */
	public String getName() {
		return name;
	}

	/**
	 * When the buyer is present on the payment page or within the iFrame the payment details can be stored automatically. The buyer will be able to use the stored payment details for subsequent transactions. When the transaction already contains a token one-click payments are disabled anyway
	 *
	 * @return When the buyer is present on the payment page or within the iFrame the payment details can be stored automatically. The buyer will be able to use the stored payment details for subsequent transactions. When the transaction already contains a token one-click payments are disabled anyway
	 */
	public OneClickPaymentMode getOneClickPaymentMode() {
		return oneClickPaymentMode;
	}

	/**
	 * paymentMethod
	 *
	 * @return paymentMethod
	 */
	public Long getPaymentMethod() {
		return paymentMethod;
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
	 * The resolved description uses the specified description or the default one when it is not overridden.
	 *
	 * @return The resolved description uses the specified description or the default one when it is not overridden.
	 */
	public Map<String, String> getResolvedDescription() {
		return resolvedDescription;
	}

	/**
	 * The resolved URL of the image to use with this payment method.
	 *
	 * @return The resolved URL of the image to use with this payment method.
	 */
	public String getResolvedImageUrl() {
		return resolvedImageUrl;
	}

	/**
	 * The resolved title uses the specified title or the default one when it is not overridden.
	 *
	 * @return The resolved title uses the specified title or the default one when it is not overridden.
	 */
	public Map<String, String> getResolvedTitle() {
		return resolvedTitle;
	}

	/**
	 * The sort order of the payment method determines the ordering of the methods shown to the user during the payment process.
	 *
	 * @return The sort order of the payment method determines the ordering of the methods shown to the user during the payment process.
	 */
	public Integer getSortOrder() {
		return sortOrder;
	}

	/**
	 * spaceId
	 *
	 * @return spaceId
	 */
	public Long getSpaceId() {
		return spaceId;
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
	 * The title of the payment method configuration is used within the payment process. The title is visible to the customer.
	 *
	 * @return The title of the payment method configuration is used within the payment process. The title is visible to the customer.
	 */
	public DatabaseTranslatedString getTitle() {
		return title;
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
		PaymentMethodConfiguration paymentMethodConfiguration = (PaymentMethodConfiguration) o;
		return Objects.equals(this.dataCollectionType, paymentMethodConfiguration.dataCollectionType) &&
				Objects.equals(this.description, paymentMethodConfiguration.description) &&
				Objects.equals(this.id, paymentMethodConfiguration.id) &&
				Objects.equals(this.imageResourcePath, paymentMethodConfiguration.imageResourcePath) &&
				Objects.equals(this.linkedSpaceId, paymentMethodConfiguration.linkedSpaceId) &&
				Objects.equals(this.name, paymentMethodConfiguration.name) &&
				Objects.equals(this.oneClickPaymentMode, paymentMethodConfiguration.oneClickPaymentMode) &&
				Objects.equals(this.paymentMethod, paymentMethodConfiguration.paymentMethod) &&
				Objects.equals(this.plannedPurgeDate, paymentMethodConfiguration.plannedPurgeDate) &&
				Objects.equals(this.resolvedDescription, paymentMethodConfiguration.resolvedDescription) &&
				Objects.equals(this.resolvedImageUrl, paymentMethodConfiguration.resolvedImageUrl) &&
				Objects.equals(this.resolvedTitle, paymentMethodConfiguration.resolvedTitle) &&
				Objects.equals(this.sortOrder, paymentMethodConfiguration.sortOrder) &&
				Objects.equals(this.spaceId, paymentMethodConfiguration.spaceId) &&
				Objects.equals(this.state, paymentMethodConfiguration.state) &&
				Objects.equals(this.title, paymentMethodConfiguration.title) &&
				Objects.equals(this.version, paymentMethodConfiguration.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataCollectionType, description, id, imageResourcePath, linkedSpaceId, name, oneClickPaymentMode, paymentMethod, plannedPurgeDate, resolvedDescription, resolvedImageUrl, resolvedTitle, sortOrder, spaceId, state, title, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentMethodConfiguration {\n");
		
		sb.append("		dataCollectionType: ").append(toIndentedString(dataCollectionType)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		imageResourcePath: ").append(toIndentedString(imageResourcePath)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		oneClickPaymentMode: ").append(toIndentedString(oneClickPaymentMode)).append("\n");
		sb.append("		paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		resolvedDescription: ").append(toIndentedString(resolvedDescription)).append("\n");
		sb.append("		resolvedImageUrl: ").append(toIndentedString(resolvedImageUrl)).append("\n");
		sb.append("		resolvedTitle: ").append(toIndentedString(resolvedTitle)).append("\n");
		sb.append("		sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
		sb.append("		spaceId: ").append(toIndentedString(spaceId)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		title: ").append(toIndentedString(title)).append("\n");
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

