/*
 * Endpoint Agent Labels API
 * Manage labels applied to endpoint agents using this API. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.endpoint.labels;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.endpoint.labels.model.Error;
import com.thousandeyes.sdk.endpoint.labels.model.ExpandLabelOptions;
import com.thousandeyes.sdk.endpoint.labels.model.Label;
import com.thousandeyes.sdk.endpoint.labels.model.LabelRequest;
import com.thousandeyes.sdk.endpoint.labels.model.LabelResponse;
import com.thousandeyes.sdk.endpoint.labels.model.Labels;
import java.net.URI;
import com.thousandeyes.sdk.endpoint.labels.model.UnauthorizedError;
import com.thousandeyes.sdk.endpoint.labels.model.ValidationError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointAgentLabelsApi {
  private final ApiClient apiClient;

  public EndpointAgentLabelsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create label
   * Creates a new label.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest Label settings (optional)
   * @return LabelResponse
   * @throws ApiException if fails to make API call
   */
  public LabelResponse createEndpointLabel(String aid, LabelRequest labelRequest) throws ApiException {
    ApiResponse<LabelResponse> response = createEndpointLabelWithHttpInfo(aid, labelRequest);
    return response.getData();
  }

  /**
   * Create label
   * Creates a new label.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest Label settings (optional)
   * @return ApiResponse&lt;LabelResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LabelResponse> createEndpointLabelWithHttpInfo(String aid, LabelRequest labelRequest) throws ApiException {
    createEndpointLabelValidateRequest();

    var requestBuilder = createEndpointLabelRequestBuilder(aid, labelRequest);

    return apiClient.send(requestBuilder.build(), LabelResponse.class);
  }

  private void createEndpointLabelValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder createEndpointLabelRequestBuilder(String aid, LabelRequest labelRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/endpoint/labels";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(labelRequest);
    return requestBuilder;
  }
  /**
   * Delete label
   * Deletes the label from your account. 
   * @param id The unique identifier of the label to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteEndpointLabel(String id, String aid) throws ApiException {
    deleteEndpointLabelWithHttpInfo(id, aid);
  }

  /**
   * Delete label
   * Deletes the label from your account. 
   * @param id The unique identifier of the label to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteEndpointLabelWithHttpInfo(String id, String aid) throws ApiException {
    deleteEndpointLabelValidateRequest(id);

    var requestBuilder = deleteEndpointLabelRequestBuilder(id, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteEndpointLabelValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteEndpointLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteEndpointLabelRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/endpoint/labels/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Retrieve label
   * Returns a single label using its ID.
   * @param id The unique identifier of the label to operate on. (required)
   * @param expand This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. (optional
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return LabelResponse
   * @throws ApiException if fails to make API call
   */
  public LabelResponse getEndpointLabel(String id, List<ExpandLabelOptions> expand, String aid) throws ApiException {
    ApiResponse<LabelResponse> response = getEndpointLabelWithHttpInfo(id, expand, aid);
    return response.getData();
  }

  /**
   * Retrieve label
   * Returns a single label using its ID.
   * @param id The unique identifier of the label to operate on. (required)
   * @param expand This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. (optional
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;LabelResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LabelResponse> getEndpointLabelWithHttpInfo(String id, List<ExpandLabelOptions> expand, String aid) throws ApiException {
    getEndpointLabelValidateRequest(id);

    var requestBuilder = getEndpointLabelRequestBuilder(id, expand, aid);

    return apiClient.send(requestBuilder.build(), LabelResponse.class);
  }

  private void getEndpointLabelValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getEndpointLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder getEndpointLabelRequestBuilder(String id, List<ExpandLabelOptions> expand, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/endpoint/labels/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List labels
   * Returns a list of labels.
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param expand This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. (optional
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Labels
   * @throws ApiException if fails to make API call
   */
  public Labels getEndpointLabels(Integer max, String cursor, List<ExpandLabelOptions> expand, String aid) throws ApiException {
    ApiResponse<Labels> response = getEndpointLabelsWithHttpInfo(max, cursor, expand, aid);
    return response.getData();
  }

  /**
   * List labels
   * Returns a list of labels.
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param expand This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. (optional
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Labels&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Labels> getEndpointLabelsWithHttpInfo(Integer max, String cursor, List<ExpandLabelOptions> expand, String aid) throws ApiException {
    getEndpointLabelsValidateRequest();

    var requestBuilder = getEndpointLabelsRequestBuilder(max, cursor, expand, aid);

    return apiClient.send(requestBuilder.build(), Labels.class);
  }

  private void getEndpointLabelsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getEndpointLabelsRequestBuilder(Integer max, String cursor, List<ExpandLabelOptions> expand, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/endpoint/labels";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("max", max));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Update label
   * Updates a label using its ID.
   * @param id The unique identifier of the label to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param label Fields to change on the agent (optional)
   * @return LabelResponse
   * @throws ApiException if fails to make API call
   */
  public LabelResponse updateEndpointLabel(String id, String aid, Label label) throws ApiException {
    ApiResponse<LabelResponse> response = updateEndpointLabelWithHttpInfo(id, aid, label);
    return response.getData();
  }

  /**
   * Update label
   * Updates a label using its ID.
   * @param id The unique identifier of the label to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param label Fields to change on the agent (optional)
   * @return ApiResponse&lt;LabelResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LabelResponse> updateEndpointLabelWithHttpInfo(String id, String aid, Label label) throws ApiException {
    updateEndpointLabelValidateRequest(id);

    var requestBuilder = updateEndpointLabelRequestBuilder(id, aid, label);

    return apiClient.send(requestBuilder.build(), LabelResponse.class);
  }

  private void updateEndpointLabelValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateEndpointLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder updateEndpointLabelRequestBuilder(String id, String aid, Label label) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PATCH");

    String path = "/endpoint/labels/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(label);
    return requestBuilder;
  }
}
