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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DocumentTemplateTypeGroup
 */
public class DocumentTemplateTypeGroup {

	@SerializedName("id")
	private Long id = null;

	@SerializedName("title")
	private Map<String, String> title = new HashMap<String, String>();

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * title
	 *
	 * @return title
	 */
	public Map<String, String> getTitle() {
		return title;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DocumentTemplateTypeGroup documentTemplateTypeGroup = (DocumentTemplateTypeGroup) o;
		return Objects.equals(this.id, documentTemplateTypeGroup.id) &&
				Objects.equals(this.title, documentTemplateTypeGroup.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DocumentTemplateTypeGroup {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		title: ").append(toIndentedString(title)).append("\n");
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

