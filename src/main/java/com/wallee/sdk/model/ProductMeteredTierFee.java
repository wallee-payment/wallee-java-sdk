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
import com.wallee.sdk.model.PersistableCurrencyAmount;
import com.wallee.sdk.model.ProductMeteredFee;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductMeteredTierFee
 */
public class ProductMeteredTierFee {

	@SerializedName("fee")
	private List<PersistableCurrencyAmount> fee = new ArrayList<PersistableCurrencyAmount>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("meteredFee")
	private ProductMeteredFee meteredFee = null;

	@SerializedName("startRange")
	private BigDecimal startRange = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The fee determines the amount which is charged. The consumed metric is multiplied by the defined fee. The resulting amount is charged at the end of the period.
	 *
	 * @return The fee determines the amount which is charged. The consumed metric is multiplied by the defined fee. The resulting amount is charged at the end of the period.
	 */
	public List<PersistableCurrencyAmount> getFee() {
		return fee;
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
	 * meteredFee
	 *
	 * @return meteredFee
	 */
	public ProductMeteredFee getMeteredFee() {
		return meteredFee;
	}

	/**
	 * The start range defines the metered consumption of the metric from which on the defined fee gets applied. This means when a subscription consumes a value of 10 or more and the start range is set to 10 the fee defined on the tier will be applied.
	 *
	 * @return The start range defines the metered consumption of the metric from which on the defined fee gets applied. This means when a subscription consumes a value of 10 or more and the start range is set to 10 the fee defined on the tier will be applied.
	 */
	public BigDecimal getStartRange() {
		return startRange;
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
		ProductMeteredTierFee productMeteredTierFee = (ProductMeteredTierFee) o;
		return Objects.equals(this.fee, productMeteredTierFee.fee) &&
				Objects.equals(this.id, productMeteredTierFee.id) &&
				Objects.equals(this.meteredFee, productMeteredTierFee.meteredFee) &&
				Objects.equals(this.startRange, productMeteredTierFee.startRange) &&
				Objects.equals(this.version, productMeteredTierFee.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fee, id, meteredFee, startRange, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductMeteredTierFee {\n");
		
		sb.append("		fee: ").append(toIndentedString(fee)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		meteredFee: ").append(toIndentedString(meteredFee)).append("\n");
		sb.append("		startRange: ").append(toIndentedString(startRange)).append("\n");
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

