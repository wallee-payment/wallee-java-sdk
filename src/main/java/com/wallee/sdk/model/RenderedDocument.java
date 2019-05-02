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

/**
 * RenderedDocument
 */
public class RenderedDocument {

	@SerializedName("data")
	private byte[] data = null;

	@SerializedName("documentTemplateType")
	private Long documentTemplateType = null;

	@SerializedName("mimeType")
	private String mimeType = null;

	@SerializedName("title")
	private String title = null;

	/**
	 * data
	 *
	 * @return data
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * documentTemplateType
	 *
	 * @return documentTemplateType
	 */
	public Long getDocumentTemplateType() {
		return documentTemplateType;
	}

	/**
	 * mimeType
	 *
	 * @return mimeType
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * title
	 *
	 * @return title
	 */
	public String getTitle() {
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
		RenderedDocument renderedDocument = (RenderedDocument) o;
		return Objects.equals(this.data, renderedDocument.data) &&
				Objects.equals(this.documentTemplateType, renderedDocument.documentTemplateType) &&
				Objects.equals(this.mimeType, renderedDocument.mimeType) &&
				Objects.equals(this.title, renderedDocument.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, documentTemplateType, mimeType, title);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RenderedDocument {\n");
		
		sb.append("		data: ").append(toIndentedString(data)).append("\n");
		sb.append("		documentTemplateType: ").append(toIndentedString(documentTemplateType)).append("\n");
		sb.append("		mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

