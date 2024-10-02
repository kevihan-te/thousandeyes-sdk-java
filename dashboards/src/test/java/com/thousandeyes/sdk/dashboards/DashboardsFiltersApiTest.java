/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.dashboards;

import com.thousandeyes.sdk.dashboards.model.ApiContextFilterRequest;
import com.thousandeyes.sdk.dashboards.model.ApiContextFilterResponse;
import com.thousandeyes.sdk.dashboards.model.ApiContextFiltersResponse;
import com.thousandeyes.sdk.dashboards.model.Error;
import java.net.URI;
import com.thousandeyes.sdk.dashboards.model.UnauthorizedError;
import com.thousandeyes.sdk.dashboards.model.ValidationError;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.common.ContentTypes.AUTHORIZATION;
import static com.github.tomakehurst.wiremock.common.ContentTypes.CONTENT_TYPE;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.NativeApiClient;


/**
 * Request and Response model deserialization tests for DashboardsFiltersApi
 */
@WireMockTest
public class DashboardsFiltersApiTest {
    private static final String TOKEN = "valid-token";
    private static final String BEARER_TOKEN = "Bearer %s".formatted(TOKEN);
    private static DashboardsFiltersApi api;
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    @BeforeAll
    public static void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        ApiClient client = NativeApiClient.builder()
                                .baseUri(wireMockRuntimeInfo.getHttpBaseUrl())
                                .bearerToken(TOKEN)
                                .build();
        api = new DashboardsFiltersApi(client);
    }
    
    /**
     * Create dashboard filter
     * <p>
     * Creates a new dashboard filter in your account group. To create a filter,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin). * &#x60;Edit own dashboard templates&#x60; permission (Regular User). 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void createDashboardFilterRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {

        var requestBodyJson = """
                {
                  "context" : [ {
                    "dataSourceId" : "VIRTUAL_AGENT",
                    "filters" : [ {
                      "filterId" : "TEST_LABEL",
                      "metricIds" : [ "WEB_PAGE_LOAD_COMPLETION_RATE", "WEB_TTFB", "WEB_AVAILABILITY" ],
                      "values" : [ "45862", "59749" ]
                    } ]
                  } ],
                  "name" : "cea-filter",
                  "description" : "Global filter for CEA widgets"
                }
                                 """;
        var requestBodyContentType = "application/json";
        ApiContextFilterRequest mappedRequest = 
                mapper.readValue(requestBodyJson, ApiContextFilterRequest.class);
        assertNotNull(mappedRequest);

        var responseBodyJson = """
                {
                  "createdDate" : "2024-02-01T22:19:19Z",
                  "createdBy" : {
                    "uid" : "1",
                    "name" : "Test User"
                  },
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "context" : [ {
                    "dataSourceId" : "VIRTUAL_AGENT",
                    "filters" : [ {
                      "filterId" : "TEST_LABEL",
                      "metricIds" : [ "WEB_PAGE_LOAD_COMPLETION_RATE", "WEB_TTFB", "WEB_AVAILABILITY" ],
                      "values" : [ "45862", "59749" ]
                    } ]
                  } ],
                  "name" : "cea-filter",
                  "modifiedDate" : "2024-02-01T22:19:19Z",
                  "description" : "Global filter for CEA widgets",
                  "modifiedBy" : {
                    "uid" : "1",
                    "name" : "Test User"
                  },
                  "id" : "65bc18e8f2073a4a469cd958",
                  "aid" : "11"
                }
                                  """;
        var statusCode = 201;
        var responseContentType = "application/json";
        ApiContextFilterResponse mappedResponse = 
                mapper.readValue(responseBodyJson, ApiContextFilterResponse.class);
        assertNotNull(mappedResponse);

        var path = "/dashboards/filters";
        stubFor(post(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .withHeader(CONTENT_TYPE, equalTo(requestBodyContentType))
                        .withRequestBody(equalToJson(requestBodyJson))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.createDashboardFilter(mappedRequest, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Delete dashboard filter
     * <p>
     * Deletes a dashboard filter using the &#x60;filterId&#x60; provided in the request.    **Note**:   * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard filter.   * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboard filters they have created themselves. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void deleteDashboardFilterRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String id = "65bc18e8f2073a4a469cd958";


        var statusCode = 204;

        var path = "/dashboards/filters/{id}";
        stubFor(delete(urlPathTemplate(path))
                        .withPathParam("id", equalTo(URLEncoder.encode(id, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withStatus(statusCode)));

        var apiResponse = api.deleteDashboardFilterWithHttpInfo(id, null);
        assertEquals(statusCode, apiResponse.getStatusCode());
    }
    
    /**
     * Get dashboard filter
     * <p>
     * Returns a list of data source filters and their metadata within the dashboard filter. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getDashboardFilterRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String id = "65bc18e8f2073a4a469cd958";


        var responseBodyJson = """
                {
                  "createdDate" : "2024-02-01T22:19:19Z",
                  "createdBy" : {
                    "uid" : "1",
                    "name" : "Test User"
                  },
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "context" : [ {
                    "dataSourceId" : "VIRTUAL_AGENT",
                    "filters" : [ {
                      "filterId" : "TEST_LABEL",
                      "metricIds" : [ "WEB_PAGE_LOAD_COMPLETION_RATE", "WEB_TTFB", "WEB_AVAILABILITY" ],
                      "values" : [ "45862", "59749" ]
                    } ]
                  } ],
                  "name" : "cea-filter",
                  "modifiedDate" : "2024-02-01T22:19:19Z",
                  "description" : "Global filter for CEA widgets",
                  "modifiedBy" : {
                    "uid" : "1",
                    "name" : "Test User"
                  },
                  "id" : "65bc18e8f2073a4a469cd958",
                  "aid" : "11"
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        ApiContextFilterResponse mappedResponse = 
                mapper.readValue(responseBodyJson, ApiContextFilterResponse.class);
        assertNotNull(mappedResponse);

        var path = "/dashboards/filters/{id}";
        stubFor(get(urlPathTemplate(path))
                        .withPathParam("id", equalTo(URLEncoder.encode(id, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getDashboardFilter(id, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * List dashboard filters
     * <p>
     * Returns a list of dashboard filters and its context within your account group. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getDashboardsFiltersRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {


        var responseBodyJson = """
                {
                  "dashboardFilters" : [ {
                    "createdDate" : "2024-02-01T22:19:19Z",
                    "createdBy" : {
                      "uid" : "1",
                      "name" : "Test User"
                    },
                    "_links" : {
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "context" : [ {
                      "dataSourceId" : "VIRTUAL_AGENT",
                      "filters" : [ {
                        "filterId" : "TEST_LABEL",
                        "metricIds" : [ "WEB_PAGE_LOAD_COMPLETION_RATE", "WEB_TTFB", "WEB_AVAILABILITY" ],
                        "values" : [ "45862", "59749" ]
                      } ]
                    } ],
                    "name" : "cea-filter",
                    "modifiedDate" : "2024-02-01T22:19:19Z",
                    "description" : "Global filter for CEA widgets",
                    "modifiedBy" : {
                      "uid" : "1",
                      "name" : "Test User"
                    },
                    "id" : "65bc18e8f2073a4a469cd958",
                    "aid" : "11"
                  }, {
                    "createdDate" : "2024-02-01T22:19:19Z",
                    "createdBy" : {
                      "uid" : "1",
                      "name" : "Test User"
                    },
                    "_links" : {
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "context" : [ {
                      "dataSourceId" : "VIRTUAL_AGENT",
                      "filters" : [ {
                        "filterId" : "TEST_LABEL",
                        "metricIds" : [ "WEB_PAGE_LOAD_COMPLETION_RATE", "WEB_TTFB", "WEB_AVAILABILITY" ],
                        "values" : [ "45862", "59749" ]
                      } ]
                    } ],
                    "name" : "cea-filter",
                    "modifiedDate" : "2024-02-01T22:19:19Z",
                    "description" : "Global filter for CEA widgets",
                    "modifiedBy" : {
                      "uid" : "1",
                      "name" : "Test User"
                    },
                    "id" : "65bc18e8f2073a4a469cd958",
                    "aid" : "11"
                  } ]
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        ApiContextFiltersResponse mappedResponse = 
                mapper.readValue(responseBodyJson, ApiContextFiltersResponse.class);
        assertNotNull(mappedResponse);

        var path = "/dashboards/filters";
        stubFor(get(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getDashboardsFilters(null, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Update dashboard filter
     * <p>
     * Updates an existing dashboard filter in your account group.                        **Note**:    * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard filter.    * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboard filters they have created themselves. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void updateDashboardFilterRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String id = "65bc18e8f2073a4a469cd958";

        var requestBodyJson = """
                {
                  "context" : [ {
                    "dataSourceId" : "VIRTUAL_AGENT",
                    "filters" : [ {
                      "filterId" : "TEST_LABEL",
                      "metricIds" : [ "WEB_PAGE_LOAD_COMPLETION_RATE", "WEB_TTFB", "WEB_AVAILABILITY" ],
                      "values" : [ "45862", "59749" ]
                    } ]
                  } ],
                  "name" : "cea-filter",
                  "description" : "Global filter for CEA widgets"
                }
                                 """;
        var requestBodyContentType = "application/json";
        ApiContextFilterRequest mappedRequest = 
                mapper.readValue(requestBodyJson, ApiContextFilterRequest.class);
        assertNotNull(mappedRequest);

        var responseBodyJson = """
                {
                  "createdDate" : "2024-02-01T22:19:19Z",
                  "createdBy" : {
                    "uid" : "1",
                    "name" : "Test User"
                  },
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "context" : [ {
                    "dataSourceId" : "VIRTUAL_AGENT",
                    "filters" : [ {
                      "filterId" : "TEST_LABEL",
                      "metricIds" : [ "WEB_PAGE_LOAD_COMPLETION_RATE", "WEB_TTFB", "WEB_AVAILABILITY" ],
                      "values" : [ "45862", "59749" ]
                    } ]
                  } ],
                  "name" : "cea-filter",
                  "modifiedDate" : "2024-02-01T22:19:19Z",
                  "description" : "Global filter for CEA widgets",
                  "modifiedBy" : {
                    "uid" : "1",
                    "name" : "Test User"
                  },
                  "id" : "65bc18e8f2073a4a469cd958",
                  "aid" : "11"
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        ApiContextFilterResponse mappedResponse = 
                mapper.readValue(responseBodyJson, ApiContextFilterResponse.class);
        assertNotNull(mappedResponse);

        var path = "/dashboards/filters/{id}";
        stubFor(put(urlPathTemplate(path))
                        .withPathParam("id", equalTo(URLEncoder.encode(id, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .withHeader(CONTENT_TYPE, equalTo(requestBodyContentType))
                        .withRequestBody(equalToJson(requestBodyJson))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.updateDashboardFilter(id, mappedRequest, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
}
