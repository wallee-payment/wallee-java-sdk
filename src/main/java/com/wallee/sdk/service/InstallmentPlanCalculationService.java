package com.wallee.sdk.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.InstallmentCalculatedPlan;


public class InstallmentPlanCalculationService {
    private ApiClient apiClient;

    public InstallmentPlanCalculationService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Calculate Plans
     * This operation allows to calculate all plans for the given transaction. The transaction will not be changed in any way.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param transactionId The transaction for which the plans should be calculated for.
     * @return List&lt;InstallmentCalculatedPlan&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-plan-calculation-service--calculate-plans">Calculate Plans Documentation</a>
     **/
    public List<InstallmentCalculatedPlan> calculatePlans(Long spaceId, Long transactionId) throws IOException {
        HttpResponse response = calculatePlansForHttpResponse(spaceId, transactionId);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<InstallmentCalculatedPlan>>(){});
    }

    /**
     * Calculate Plans
     * This operation allows to calculate all plans for the given transaction. The transaction will not be changed in any way.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param transactionId The transaction for which the plans should be calculated for.
     * @param params        Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;InstallmentCalculatedPlan&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-plan-calculation-service--calculate-plans">Calculate Plans Documentation</a>
     **/
    public List<InstallmentCalculatedPlan> calculatePlans(Long spaceId, Long transactionId, Map<String, Object> params) throws IOException {
        HttpResponse response = calculatePlansForHttpResponse(spaceId, transactionId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<InstallmentCalculatedPlan>>(){});
    }

    public HttpResponse calculatePlansForHttpResponse(Long spaceId, Long transactionId) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "calculatePlans");
        ServiceUtils.checkParam(transactionId == null, "transactionId", "calculatePlans");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/installment-plan-calculation/calculatePlans")
                .queryParam("spaceId", spaceId)
                .queryParam("transactionId", transactionId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse calculatePlansForHttpResponse(Long spaceId, Long transactionId, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "calculatePlans");
        ServiceUtils.checkParam(transactionId == null, "transactionId", "calculatePlans");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/installment-plan-calculation/calculatePlans");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'transactionId' to the map of query params
        allParams.put("transactionId", transactionId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
