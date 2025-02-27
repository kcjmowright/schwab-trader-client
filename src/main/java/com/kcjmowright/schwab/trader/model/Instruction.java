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
 * Gets or Sets instruction
 */
public enum Instruction {
  BUY("BUY"),
  SELL("SELL"),
  BUY_TO_COVER("BUY_TO_COVER"),
  SELL_SHORT("SELL_SHORT"),
  BUY_TO_OPEN("BUY_TO_OPEN"),
  BUY_TO_CLOSE("BUY_TO_CLOSE"),
  SELL_TO_OPEN("SELL_TO_OPEN"),
  SELL_TO_CLOSE("SELL_TO_CLOSE"),
  EXCHANGE("EXCHANGE"),
  SELL_SHORT_EXEMPT("SELL_SHORT_EXEMPT");

  private String value;

  Instruction(String value) {
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
  public static Instruction fromValue(String input) {
    for (Instruction b : Instruction.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
}
