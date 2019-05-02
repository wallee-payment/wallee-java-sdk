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
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.PersistableCurrencyAmount;
import com.wallee.sdk.model.ProductFeeType;
import com.wallee.sdk.model.SubscriptionProductComponent;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductPeriodFee
 */
public class ProductPeriodFee {

	@SerializedName("component")
	private SubscriptionProductComponent component = null;

	@SerializedName("description")
	private DatabaseTranslatedString description = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("ledgerEntryTitle")
	private DatabaseTranslatedString ledgerEntryTitle = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private DatabaseTranslatedString name = null;

	@SerializedName("numberOfFreeTrialPeriods")
	private Integer numberOfFreeTrialPeriods = null;

	@SerializedName("periodFee")
	private List<PersistableCurrencyAmount> periodFee = new ArrayList<PersistableCurrencyAmount>();

	@SerializedName("type")
	private ProductFeeType type = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * component
	 *
	 * @return component
	 */
	public SubscriptionProductComponent getComponent() {
		return component;
	}

	/**
	 * The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.
	 *
	 * @return The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.
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
	 * The ledger entry title will be used for the title in the ledger entry and in the invoice.
	 *
	 * @return The ledger entry title will be used for the title in the ledger entry and in the invoice.
	 */
	public DatabaseTranslatedString getLedgerEntryTitle() {
		return ledgerEntryTitle;
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
	 * The name of the fee should describe for the subscriber in few words for what the fee is for.
	 *
	 * @return The name of the fee should describe for the subscriber in few words for what the fee is for.
	 */
	public DatabaseTranslatedString getName() {
		return name;
	}

	/**
	 * The number of free trial periods specify how many periods are free of charge at the begining of the subscription.
	 *
	 * @return The number of free trial periods specify how many periods are free of charge at the begining of the subscription.
	 */
	public Integer getNumberOfFreeTrialPeriods() {
		return numberOfFreeTrialPeriods;
	}

	/**
	 * The period fee is charged for every period of the subscription except for those periods which are trial periods.
	 *
	 * @return The period fee is charged for every period of the subscription except for those periods which are trial periods.
	 */
	public List<PersistableCurrencyAmount> getPeriodFee() {
		return periodFee;
	}

	/**
	 * type
	 *
	 * @return type
	 */
	public ProductFeeType getType() {
		return type;
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
		ProductPeriodFee productPeriodFee = (ProductPeriodFee) o;
		return Objects.equals(this.component, productPeriodFee.component) &&
				Objects.equals(this.description, productPeriodFee.description) &&
				Objects.equals(this.id, productPeriodFee.id) &&
				Objects.equals(this.ledgerEntryTitle, productPeriodFee.ledgerEntryTitle) &&
				Objects.equals(this.linkedSpaceId, productPeriodFee.linkedSpaceId) &&
				Objects.equals(this.name, productPeriodFee.name) &&
				Objects.equals(this.numberOfFreeTrialPeriods, productPeriodFee.numberOfFreeTrialPeriods) &&
				Objects.equals(this.periodFee, productPeriodFee.periodFee) &&
				Objects.equals(this.type, productPeriodFee.type) &&
				Objects.equals(this.version, productPeriodFee.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(component, description, id, ledgerEntryTitle, linkedSpaceId, name, numberOfFreeTrialPeriods, periodFee, type, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductPeriodFee {\n");
		
		sb.append("		component: ").append(toIndentedString(component)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		ledgerEntryTitle: ").append(toIndentedString(ledgerEntryTitle)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		numberOfFreeTrialPeriods: ").append(toIndentedString(numberOfFreeTrialPeriods)).append("\n");
		sb.append("		periodFee: ").append(toIndentedString(periodFee)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
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

