/*
 * Emulation API
 * The Emulation API facilitates the retrieval of user-agent strings for HTTP, pageload, and transaction tests. It also enables the retrieval and addition of emulated devices for pageload and transaction tests.  To access Emulation API operations, the following permissions are required:  * `Settings Tests Read` for read operations. * `Settings Tests Update` for write operations. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.emulation;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.emulation.model.EmulatedDevice;
import com.thousandeyes.sdk.emulation.model.EmulatedDeviceResponse;
import com.thousandeyes.sdk.emulation.model.EmulatedDeviceResponses;
import com.thousandeyes.sdk.emulation.model.Error;
import com.thousandeyes.sdk.emulation.model.ExpandEmulatedDeviceOptions;
import com.thousandeyes.sdk.emulation.model.UnauthorizedError;
import com.thousandeyes.sdk.emulation.model.UserAgents;

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
public class EmulationApi {
  private final ApiClient apiClient;

  public EmulationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create emulated device
   * Creates a new device for emulation.
   * @param emulatedDevice  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EmulatedDeviceResponse
   * @throws ApiException if fails to make API call
   */
  public EmulatedDeviceResponse createEmulatedDevice(EmulatedDevice emulatedDevice, String aid) throws ApiException {
    ApiResponse<EmulatedDeviceResponse> response = createEmulatedDeviceWithHttpInfo(emulatedDevice, aid);
    return response.getData();
  }

  /**
   * Create emulated device
   * Creates a new device for emulation.
   * @param emulatedDevice  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EmulatedDeviceResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmulatedDeviceResponse> createEmulatedDeviceWithHttpInfo(EmulatedDevice emulatedDevice, String aid) throws ApiException {
    createEmulatedDeviceValidateRequest(emulatedDevice);

    var requestBuilder = createEmulatedDeviceRequestBuilder(emulatedDevice, aid);

    return apiClient.send(requestBuilder.build(), EmulatedDeviceResponse.class);
  }

  private void createEmulatedDeviceValidateRequest(EmulatedDevice emulatedDevice) throws ApiException {
      // verify the required parameter 'emulatedDevice' is set
      if (emulatedDevice == null) {
        throw new ApiException(400, "Missing the required parameter 'emulatedDevice' when calling createEmulatedDevice");
      }
  }

  private ApiRequest.ApiRequestBuilder createEmulatedDeviceRequestBuilder(EmulatedDevice emulatedDevice, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/emulated-devices";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(emulatedDevice);
    return requestBuilder;
  }
  /**
   * List emulated devices
   * Retrieves a list of emulated devices available for browser tests.
   * @param expand Optional query parameter that controls whether user-agent templates are included in the response. By default, user-agent templates are not included. To include them, add &#x60;?expand&#x3D;user-agent&#x60; to the request.  (optional
   * @return EmulatedDeviceResponses
   * @throws ApiException if fails to make API call
   */
  public EmulatedDeviceResponses getEmulatedDevices(List<ExpandEmulatedDeviceOptions> expand) throws ApiException {
    ApiResponse<EmulatedDeviceResponses> response = getEmulatedDevicesWithHttpInfo(expand);
    return response.getData();
  }

  /**
   * List emulated devices
   * Retrieves a list of emulated devices available for browser tests.
   * @param expand Optional query parameter that controls whether user-agent templates are included in the response. By default, user-agent templates are not included. To include them, add &#x60;?expand&#x3D;user-agent&#x60; to the request.  (optional
   * @return ApiResponse&lt;EmulatedDeviceResponses&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmulatedDeviceResponses> getEmulatedDevicesWithHttpInfo(List<ExpandEmulatedDeviceOptions> expand) throws ApiException {
    getEmulatedDevicesValidateRequest();

    var requestBuilder = getEmulatedDevicesRequestBuilder(expand);

    return apiClient.send(requestBuilder.build(), EmulatedDeviceResponses.class);
  }

  private void getEmulatedDevicesValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getEmulatedDevicesRequestBuilder(List<ExpandEmulatedDeviceOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/emulated-devices";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List user-agents
   * Retrieves a list of user-agent strings.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return UserAgents
   * @throws ApiException if fails to make API call
   */
  public UserAgents getUserAgents(String aid) throws ApiException {
    ApiResponse<UserAgents> response = getUserAgentsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List user-agents
   * Retrieves a list of user-agent strings.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;UserAgents&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserAgents> getUserAgentsWithHttpInfo(String aid) throws ApiException {
    getUserAgentsValidateRequest();

    var requestBuilder = getUserAgentsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), UserAgents.class);
  }

  private void getUserAgentsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getUserAgentsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/user-agents";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
}
