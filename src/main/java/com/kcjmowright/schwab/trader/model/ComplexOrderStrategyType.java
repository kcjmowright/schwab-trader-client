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
 * Gets or Sets complexOrderStrategyType
 */
public enum ComplexOrderStrategyType {
  NONE("NONE"),
  COVERED("COVERED"),
  VERTICAL("VERTICAL"),
  BACK_RATIO("BACK_RATIO"),
  CALENDAR("CALENDAR"),
  DIAGONAL("DIAGONAL"),
  STRADDLE("STRADDLE"),
  STRANGLE("STRANGLE"),
  COLLAR_SYNTHETIC("COLLAR_SYNTHETIC"),
  BUTTERFLY("BUTTERFLY"),
  CONDOR("CONDOR"),
  IRON_CONDOR("IRON_CONDOR"),
  VERTICAL_ROLL("VERTICAL_ROLL"),
  COLLAR_WITH_STOCK("COLLAR_WITH_STOCK"),
  DOUBLE_DIAGONAL("DOUBLE_DIAGONAL"),
  UNBALANCED_BUTTERFLY("UNBALANCED_BUTTERFLY"),
  UNBALANCED_CONDOR("UNBALANCED_CONDOR"),
  UNBALANCED_IRON_CONDOR("UNBALANCED_IRON_CONDOR"),
  UNBALANCED_VERTICAL_ROLL("UNBALANCED_VERTICAL_ROLL"),
  MUTUAL_FUND_SWAP("MUTUAL_FUND_SWAP"),
  CUSTOM("CUSTOM");

  private String value;

  ComplexOrderStrategyType(String value) {
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
  public static ComplexOrderStrategyType fromValue(String input) {
    for (ComplexOrderStrategyType b : ComplexOrderStrategyType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
}
