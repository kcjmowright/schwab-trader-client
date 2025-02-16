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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets status
 */
public enum Status {
  AWAITING_PARENT_ORDER("AWAITING_PARENT_ORDER"),
  AWAITING_CONDITION("AWAITING_CONDITION"),
  AWAITING_STOP_CONDITION("AWAITING_STOP_CONDITION"),
  AWAITING_MANUAL_REVIEW("AWAITING_MANUAL_REVIEW"),
  ACCEPTED("ACCEPTED"),
  AWAITING_UR_OUT("AWAITING_UR_OUT"),
  PENDING_ACTIVATION("PENDING_ACTIVATION"),
  QUEUED("QUEUED"),
  WORKING("WORKING"),
  REJECTED("REJECTED"),
  PENDING_CANCEL("PENDING_CANCEL"),
  CANCELED("CANCELED"),
  PENDING_REPLACE("PENDING_REPLACE"),
  REPLACED("REPLACED"),
  FILLED("FILLED"),
  EXPIRED("EXPIRED"),
  NEW("NEW"),
  AWAITING_RELEASE_TIME("AWAITING_RELEASE_TIME"),
  PENDING_ACKNOWLEDGEMENT("PENDING_ACKNOWLEDGEMENT"),
  PENDING_RECALL("PENDING_RECALL"),
  UNKNOWN("UNKNOWN");

  private String value;

  Status(String value) {
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
  public static Status fromValue(String input) {
    for (Status b : Status.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
}
