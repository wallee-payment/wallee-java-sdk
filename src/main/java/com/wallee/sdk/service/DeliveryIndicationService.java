package com.wallee.sdk.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.DeliveryIndication;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;


public class DeliveryIndicationService {
    private ApiClient apiClient;

    public DeliveryIndicationService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param filter  The filter which restricts the entities which are used to calculate the count.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#delivery-indication-service--count">Count Documentation</a>
     **/
    public Long count(Long spaceId, EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(spaceId, filter);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#delivery-indication-service--count">Count Documentation</a>
     **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, false, apiClient, "/delivery-indication/count");
    }

    public HttpResponse countForHttpResponse(Long spaceId, InputStream filter, String mediaType) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, mediaType, false, apiClient, "/delivery-indication/count");
    }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        return ServiceUtils.countForHttpResponse(filter, spaceId, params, apiClient, "/delivery-indication/count");
    }


    /**
     * markAsNotSuitable
     * This operation marks the delivery indication as not suitable.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param deliveryIndicationId The delivery indication id which should be marked as not suitable.
     * @return DeliveryIndication
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#delivery-indication-service--mark-as-not-suitable">markAsNotSuitable Documentation</a>
     **/
    public DeliveryIndication markAsNotSuitable(Long spaceId, Long deliveryIndicationId) throws IOException {
        HttpResponse response = markAsNotSuitableForHttpResponse(spaceId, deliveryIndicationId);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DeliveryIndication>(){});
    }

    /**
     * markAsNotSuitable
     * This operation marks the delivery indication as not suitable.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param deliveryIndicationId The delivery indication id which should be marked as not suitable.
     * @param params               Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DeliveryIndication
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#delivery-indication-service--mark-as-not-suitable">markAsNotSuitable Documentation</a>
     **/
    public DeliveryIndication markAsNotSuitable(Long spaceId, Long deliveryIndicationId, Map<String, Object> params) throws IOException {
        HttpResponse response = markAsNotSuitableForHttpResponse(spaceId, deliveryIndicationId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DeliveryIndication>(){});
    }

    public HttpResponse markAsNotSuitableForHttpResponse(Long spaceId, Long deliveryIndicationId) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsNotSuitable");
        ServiceUtils.checkParam(deliveryIndicationId == null, "deliveryIndicationId", "markAsNotSuitable");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/delivery-indication/markAsNotSuitable")
                .queryParam("spaceId", spaceId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(deliveryIndicationId);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse markAsNotSuitableForHttpResponse(Long spaceId, InputStream deliveryIndicationId, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsNotSuitable");
        ServiceUtils.checkParam(deliveryIndicationId == null, "deliveryIndicationId", "markAsNotSuitable");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/delivery-indication/markAsNotSuitable")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(deliveryIndicationId, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse markAsNotSuitableForHttpResponse(Long spaceId, Long deliveryIndicationId, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsNotSuitable");
        ServiceUtils.checkParam(deliveryIndicationId == null, "deliveryIndicationId", "markAsNotSuitable");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/delivery-indication/markAsNotSuitable");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(deliveryIndicationId);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * markAsSuitable
     * This operation marks the delivery indication as suitable.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param deliveryIndicationId The delivery indication id which should be marked as suitable.
     * @return DeliveryIndication
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#delivery-indication-service--mark-as-suitable">markAsSuitable Documentation</a>
     **/
    public DeliveryIndication markAsSuitable(Long spaceId, Long deliveryIndicationId) throws IOException {
        HttpResponse response = markAsSuitableForHttpResponse(spaceId, deliveryIndicationId);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DeliveryIndication>(){});
    }

    /**
     * markAsSuitable
     * This operation marks the delivery indication as suitable.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param deliveryIndicationId The delivery indication id which should be marked as suitable.
     * @param params               Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DeliveryIndication
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#delivery-indication-service--mark-as-suitable">markAsSuitable Documentation</a>
     **/
    public DeliveryIndication markAsSuitable(Long spaceId, Long deliveryIndicationId, Map<String, Object> params) throws IOException {
        HttpResponse response = markAsSuitableForHttpResponse(spaceId, deliveryIndicationId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DeliveryIndication>(){});
    }

    public HttpResponse markAsSuitableForHttpResponse(Long spaceId, Long deliveryIndicationId) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsSuitable");
        ServiceUtils.checkParam(deliveryIndicationId == null, "deliveryIndicationId", "markAsSuitable");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/delivery-indication/markAsSuitable")
                .queryParam("spaceId", spaceId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(deliveryIndicationId);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse markAsSuitableForHttpResponse(Long spaceId, InputStream deliveryIndicationId, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsSuitable");
        ServiceUtils.checkParam(deliveryIndicationId == null, "deliveryIndicationId", "markAsSuitable");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/delivery-indication/markAsSuitable")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(deliveryIndicationId, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse markAsSuitableForHttpResponse(Long spaceId, Long deliveryIndicationId, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "markAsSuitable");
        ServiceUtils.checkParam(deliveryIndicationId == null, "deliveryIndicationId", "markAsSuitable");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/delivery-indication/markAsSuitable");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(deliveryIndicationId);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the delivery indication which should be returned.
     * @return DeliveryIndication
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#delivery-indication-service--read">Read Documentation</a>
     **/
    public DeliveryIndication read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DeliveryIndication>(){});
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the delivery indication which should be returned.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return DeliveryIndication
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#delivery-indication-service--read">Read Documentation</a>
     **/
    public DeliveryIndication read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<DeliveryIndication>(){});
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, apiClient, "/delivery-indication/read");
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, params, apiClient, "/delivery-indication/read");
    }


    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the delivery indications which are returned by the search.
     * @return List&lt;DeliveryIndication&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#delivery-indication-service--search">Search Documentation</a>
     **/
    public List<DeliveryIndication> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<DeliveryIndication>>(){});
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the delivery indications which are returned by the search.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;DeliveryIndication&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#delivery-indication-service--search">Search Documentation</a>
     **/
    public List<DeliveryIndication> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<DeliveryIndication>>(){});
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/delivery-indication/search")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, InputStream query, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/delivery-indication/search")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(query, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/delivery-indication/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }


}
