/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointTestAgentSelectorType;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointTestProtocol;
import com.thousandeyes.sdk.endpoint.tests.model.TestInterval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentToServerTestRequest
 */
@JsonPropertyOrder({
  EndpointAgentToServerTestRequest.JSON_PROPERTY_AGENT_SELECTOR_TYPE,
  EndpointAgentToServerTestRequest.JSON_PROPERTY_AGENTS,
  EndpointAgentToServerTestRequest.JSON_PROPERTY_ENDPOINT_AGENT_LABELS,
  EndpointAgentToServerTestRequest.JSON_PROPERTY_MAX_MACHINES,
  EndpointAgentToServerTestRequest.JSON_PROPERTY_TEST_NAME,
  EndpointAgentToServerTestRequest.JSON_PROPERTY_SERVER_NAME,
  EndpointAgentToServerTestRequest.JSON_PROPERTY_PORT,
  EndpointAgentToServerTestRequest.JSON_PROPERTY_IS_PRIORITIZED,
  EndpointAgentToServerTestRequest.JSON_PROPERTY_INTERVAL,
  EndpointAgentToServerTestRequest.JSON_PROPERTY_PROTOCOL
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointAgentToServerTestRequest {
  public static final String JSON_PROPERTY_AGENT_SELECTOR_TYPE = "agentSelectorType";
  private EndpointTestAgentSelectorType agentSelectorType = EndpointTestAgentSelectorType.ALL_AGENTS;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<UUID> agents = new ArrayList<>();

  public static final String JSON_PROPERTY_ENDPOINT_AGENT_LABELS = "endpointAgentLabels";
  private List<String> endpointAgentLabels = new ArrayList<>();

  public static final String JSON_PROPERTY_MAX_MACHINES = "maxMachines";
  private Integer maxMachines = 25;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_SERVER_NAME = "serverName";
  private String serverName;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port = 443;

  public static final String JSON_PROPERTY_IS_PRIORITIZED = "isPrioritized";
  private Boolean isPrioritized = false;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval = TestInterval.NUMBER_60;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public EndpointAgentToServerTestRequest() { 
  }

  public EndpointAgentToServerTestRequest agentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointTestAgentSelectorType getAgentSelectorType() {
    return agentSelectorType;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public EndpointAgentToServerTestRequest agents(List<UUID> agents) {
    this.agents = agents;
    return this;
  }

  public EndpointAgentToServerTestRequest addAgentsItem(UUID agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;.
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<UUID> agents) {
    this.agents = agents;
  }


  public EndpointAgentToServerTestRequest endpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
    return this;
  }

  public EndpointAgentToServerTestRequest addEndpointAgentLabelsItem(String endpointAgentLabelsItem) {
    if (this.endpointAgentLabels == null) {
      this.endpointAgentLabels = new ArrayList<>();
    }
    this.endpointAgentLabels.add(endpointAgentLabelsItem);
    return this;
  }

   /**
   * List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;.
   * @return endpointAgentLabels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENT_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEndpointAgentLabels() {
    return endpointAgentLabels;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENT_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
  }


  public EndpointAgentToServerTestRequest maxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
    return this;
  }

   /**
   * Maximum number of agents which can execute the test.
   * @return maxMachines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxMachines() {
    return maxMachines;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
  }


  public EndpointAgentToServerTestRequest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


  public EndpointAgentToServerTestRequest serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * A server address without a protocol or IP address.
   * @return serverName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServerName() {
    return serverName;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  public EndpointAgentToServerTestRequest port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number.
   * @return port
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public EndpointAgentToServerTestRequest isPrioritized(Boolean isPrioritized) {
    this.isPrioritized = isPrioritized;
    return this;
  }

   /**
   * Indicates whether the test should be prioritized when the number of tests assigned to an agent exceeds the license limit.
   * @return isPrioritized
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PRIORITIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPrioritized() {
    return isPrioritized;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRIORITIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPrioritized(Boolean isPrioritized) {
    this.isPrioritized = isPrioritized;
  }


  public EndpointAgentToServerTestRequest interval(TestInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public EndpointAgentToServerTestRequest protocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointTestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
  }


  /**
   * Return true if this EndpointAgentToServerTestRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentToServerTestRequest endpointAgentToServerTestRequest = (EndpointAgentToServerTestRequest) o;
    return Objects.equals(this.agentSelectorType, endpointAgentToServerTestRequest.agentSelectorType) &&
        Objects.equals(this.agents, endpointAgentToServerTestRequest.agents) &&
        Objects.equals(this.endpointAgentLabels, endpointAgentToServerTestRequest.endpointAgentLabels) &&
        Objects.equals(this.maxMachines, endpointAgentToServerTestRequest.maxMachines) &&
        Objects.equals(this.testName, endpointAgentToServerTestRequest.testName) &&
        Objects.equals(this.serverName, endpointAgentToServerTestRequest.serverName) &&
        Objects.equals(this.port, endpointAgentToServerTestRequest.port) &&
        Objects.equals(this.isPrioritized, endpointAgentToServerTestRequest.isPrioritized) &&
        Objects.equals(this.interval, endpointAgentToServerTestRequest.interval) &&
        Objects.equals(this.protocol, endpointAgentToServerTestRequest.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSelectorType, agents, endpointAgentLabels, maxMachines, testName, serverName, port, isPrioritized, interval, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentToServerTestRequest {\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    endpointAgentLabels: ").append(toIndentedString(endpointAgentLabels)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    isPrioritized: ").append(toIndentedString(isPrioritized)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

