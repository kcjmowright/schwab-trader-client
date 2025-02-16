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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets APIRuleAction
 */
public enum APIRuleAction {
  ACCEPT("ACCEPT"),
  ALERT("ALERT"),
  REJECT("REJECT"),
  REVIEW("REVIEW"),
  UNKNOWN("UNKNOWN");

  private String value;

  APIRuleAction(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static APIRuleAction fromValue(String input) {
    for (APIRuleAction b : APIRuleAction.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
}
