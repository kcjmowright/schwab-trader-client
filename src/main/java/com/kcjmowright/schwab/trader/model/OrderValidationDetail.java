/*
 * Trader API - Account Access and User Preferences
 * Schwab Trader API access to Account, Order entry and User Preferences
 *
 * OpenAPI spec version: 1.0.0
 * Contact: TraderAPI@Schwab.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.kcjmowright.schwab.trader.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.kcjmowright.schwab.trader.model.APIRuleAction;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OrderValidationDetail
 */



public class OrderValidationDetail {
  @JsonProperty("validationRuleName")
  private String validationRuleName = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("activityMessage")
  private String activityMessage = null;

  @JsonProperty("originalSeverity")
  private APIRuleAction originalSeverity = null;

  @JsonProperty("overrideName")
  private String overrideName = null;

  @JsonProperty("overrideSeverity")
  private APIRuleAction overrideSeverity = null;

  public OrderValidationDetail validationRuleName(String validationRuleName) {
    this.validationRuleName = validationRuleName;
    return this;
  }

   /**
   * Get validationRuleName
   * @return validationRuleName
  **/
  @Schema(description = "")
  public String getValidationRuleName() {
    return validationRuleName;
  }

  public void setValidationRuleName(String validationRuleName) {
    this.validationRuleName = validationRuleName;
  }

  public OrderValidationDetail message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OrderValidationDetail activityMessage(String activityMessage) {
    this.activityMessage = activityMessage;
    return this;
  }

   /**
   * Get activityMessage
   * @return activityMessage
  **/
  @Schema(description = "")
  public String getActivityMessage() {
    return activityMessage;
  }

  public void setActivityMessage(String activityMessage) {
    this.activityMessage = activityMessage;
  }

  public OrderValidationDetail originalSeverity(APIRuleAction originalSeverity) {
    this.originalSeverity = originalSeverity;
    return this;
  }

   /**
   * Get originalSeverity
   * @return originalSeverity
  **/
  @Schema(description = "")
  public APIRuleAction getOriginalSeverity() {
    return originalSeverity;
  }

  public void setOriginalSeverity(APIRuleAction originalSeverity) {
    this.originalSeverity = originalSeverity;
  }

  public OrderValidationDetail overrideName(String overrideName) {
    this.overrideName = overrideName;
    return this;
  }

   /**
   * Get overrideName
   * @return overrideName
  **/
  @Schema(description = "")
  public String getOverrideName() {
    return overrideName;
  }

  public void setOverrideName(String overrideName) {
    this.overrideName = overrideName;
  }

  public OrderValidationDetail overrideSeverity(APIRuleAction overrideSeverity) {
    this.overrideSeverity = overrideSeverity;
    return this;
  }

   /**
   * Get overrideSeverity
   * @return overrideSeverity
  **/
  @Schema(description = "")
  public APIRuleAction getOverrideSeverity() {
    return overrideSeverity;
  }

  public void setOverrideSeverity(APIRuleAction overrideSeverity) {
    this.overrideSeverity = overrideSeverity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderValidationDetail orderValidationDetail = (OrderValidationDetail) o;
    return Objects.equals(this.validationRuleName, orderValidationDetail.validationRuleName) &&
        Objects.equals(this.message, orderValidationDetail.message) &&
        Objects.equals(this.activityMessage, orderValidationDetail.activityMessage) &&
        Objects.equals(this.originalSeverity, orderValidationDetail.originalSeverity) &&
        Objects.equals(this.overrideName, orderValidationDetail.overrideName) &&
        Objects.equals(this.overrideSeverity, orderValidationDetail.overrideSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationRuleName, message, activityMessage, originalSeverity, overrideName, overrideSeverity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderValidationDetail {\n");
    
    sb.append("    validationRuleName: ").append(toIndentedString(validationRuleName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    activityMessage: ").append(toIndentedString(activityMessage)).append("\n");
    sb.append("    originalSeverity: ").append(toIndentedString(originalSeverity)).append("\n");
    sb.append("    overrideName: ").append(toIndentedString(overrideName)).append("\n");
    sb.append("    overrideSeverity: ").append(toIndentedString(overrideSeverity)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}
