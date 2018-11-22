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

package com.wallee.sdk.service;

import com.wallee.sdk.ApiCallback;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiResponse;
import com.wallee.sdk.Pair;
import com.wallee.sdk.ProgressRequestBody;
import com.wallee.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.UnencryptedCardDataCreate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardProcessingService {

	private ApiClient apiClient;

	public CardProcessingService(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/* Build call for process */
	private com.squareup.okhttp.Call processCall(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = cardData;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling process(Async)");
		}
		
		// verify the required parameter 'transactionId' is set
		if (transactionId == null) {
			throw new ApiException("Missing the required parameter 'transactionId' when calling process(Async)");
		}
		
		// verify the required parameter 'paymentMethodConfigurationId' is set
		if (paymentMethodConfigurationId == null) {
			throw new ApiException("Missing the required parameter 'paymentMethodConfigurationId' when calling process(Async)");
		}
		
		// verify the required parameter 'cardData' is set
		if (cardData == null) {
			throw new ApiException("Missing the required parameter 'cardData' when calling process(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/card-processing/process".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionId", transactionId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentMethodConfigurationId", paymentMethodConfigurationId));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"application/json;charset=utf-8"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
					.body(new ProgressResponseBody(originalResponse.body(), progressListener))
					.build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {  };
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Process
	 *
	 * The process method will process the transaction with the given card details without using 3-D secure.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionId The ID of the transaction which should be processed. (required)
	 *
	 * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction. (required)
	 *
	 * @param cardData The card details as JSON in plain which should be used to authorize the payment. (required)
	 * @return Transaction
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Transaction process(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData) throws ApiException {
		ApiResponse<Transaction> resp = processWithHttpInfo(spaceId, transactionId, paymentMethodConfigurationId, cardData);
		return resp.getData();
	}

	/**
	 * Process
	 *
	 * The process method will process the transaction with the given card details without using 3-D secure.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionId The ID of the transaction which should be processed. (required)
	 *
	 * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction. (required)
	 *
	 * @param cardData The card details as JSON in plain which should be used to authorize the payment. (required)
	 * @return ApiResponse&lt;Transaction&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Transaction> processWithHttpInfo(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData) throws ApiException {
		com.squareup.okhttp.Call call = processCall(spaceId, transactionId, paymentMethodConfigurationId, cardData, null, null);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Process (asynchronously)
	 *
	 * The process method will process the transaction with the given card details without using 3-D secure.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionId The ID of the transaction which should be processed. (required)
	 *
	 * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction. (required)
	 *
	 * @param cardData The card details as JSON in plain which should be used to authorize the payment. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call processAsync(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData, final ApiCallback<Transaction> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if (callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = processCall(spaceId, transactionId, paymentMethodConfigurationId, cardData, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for processWith3DSecure */
	private com.squareup.okhttp.Call processWith3DSecureCall(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = cardData;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling processWith3DSecure(Async)");
		}
		
		// verify the required parameter 'transactionId' is set
		if (transactionId == null) {
			throw new ApiException("Missing the required parameter 'transactionId' when calling processWith3DSecure(Async)");
		}
		
		// verify the required parameter 'paymentMethodConfigurationId' is set
		if (paymentMethodConfigurationId == null) {
			throw new ApiException("Missing the required parameter 'paymentMethodConfigurationId' when calling processWith3DSecure(Async)");
		}
		
		// verify the required parameter 'cardData' is set
		if (cardData == null) {
			throw new ApiException("Missing the required parameter 'cardData' when calling processWith3DSecure(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/card-processing/processWith3DSecure".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionId", transactionId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentMethodConfigurationId", paymentMethodConfigurationId));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
					.body(new ProgressResponseBody(originalResponse.body(), progressListener))
					.build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {  };
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Process With 3-D Secure
	 *
	 * The process method will process the transaction with the given card details by evenutually using 3-D secure. The buyer has to be redirect to the URL returned by this method.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionId The ID of the transaction which should be processed. (required)
	 *
	 * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction. (required)
	 *
	 * @param cardData The card details as JSON in plain which should be used to authorize the payment. (required)
	 * @return String
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public String processWith3DSecure(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData) throws ApiException {
		ApiResponse<String> resp = processWith3DSecureWithHttpInfo(spaceId, transactionId, paymentMethodConfigurationId, cardData);
		return resp.getData();
	}

	/**
	 * Process With 3-D Secure
	 *
	 * The process method will process the transaction with the given card details by evenutually using 3-D secure. The buyer has to be redirect to the URL returned by this method.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionId The ID of the transaction which should be processed. (required)
	 *
	 * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction. (required)
	 *
	 * @param cardData The card details as JSON in plain which should be used to authorize the payment. (required)
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<String> processWith3DSecureWithHttpInfo(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData) throws ApiException {
		com.squareup.okhttp.Call call = processWith3DSecureCall(spaceId, transactionId, paymentMethodConfigurationId, cardData, null, null);
		Type localVarReturnType = new TypeToken<String>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Process With 3-D Secure (asynchronously)
	 *
	 * The process method will process the transaction with the given card details by evenutually using 3-D secure. The buyer has to be redirect to the URL returned by this method.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionId The ID of the transaction which should be processed. (required)
	 *
	 * @param paymentMethodConfigurationId The payment method configuration ID which is applied to the transaction. (required)
	 *
	 * @param cardData The card details as JSON in plain which should be used to authorize the payment. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call processWith3DSecureAsync(Long spaceId, Long transactionId, Long paymentMethodConfigurationId, UnencryptedCardDataCreate cardData, final ApiCallback<String> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if (callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = processWith3DSecureCall(spaceId, transactionId, paymentMethodConfigurationId, cardData, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<String>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

}