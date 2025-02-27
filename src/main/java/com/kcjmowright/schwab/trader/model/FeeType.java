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
 * Gets or Sets FeeType
 */
public enum FeeType {
  COMMISSION("COMMISSION"),
  SEC_FEE("SEC_FEE"),
  STR_FEE("STR_FEE"),
  R_FEE("R_FEE"),
  CDSC_FEE("CDSC_FEE"),
  OPT_REG_FEE("OPT_REG_FEE"),
  ADDITIONAL_FEE("ADDITIONAL_FEE"),
  MISCELLANEOUS_FEE("MISCELLANEOUS_FEE"),
  FTT("FTT"),
  FUTURES_CLEARING_FEE("FUTURES_CLEARING_FEE"),
  FUTURES_DESK_OFFICE_FEE("FUTURES_DESK_OFFICE_FEE"),
  FUTURES_EXCHANGE_FEE("FUTURES_EXCHANGE_FEE"),
  FUTURES_GLOBEX_FEE("FUTURES_GLOBEX_FEE"),
  FUTURES_NFA_FEE("FUTURES_NFA_FEE"),
  FUTURES_PIT_BROKERAGE_FEE("FUTURES_PIT_BROKERAGE_FEE"),
  FUTURES_TRANSACTION_FEE("FUTURES_TRANSACTION_FEE"),
  LOW_PROCEEDS_COMMISSION("LOW_PROCEEDS_COMMISSION"),
  BASE_CHARGE("BASE_CHARGE"),
  GENERAL_CHARGE("GENERAL_CHARGE"),
  GST_FEE("GST_FEE"),
  TAF_FEE("TAF_FEE"),
  INDEX_OPTION_FEE("INDEX_OPTION_FEE"),
  TEFRA_TAX("TEFRA_TAX"),
  STATE_TAX("STATE_TAX"),
  UNKNOWN("UNKNOWN");

  private String value;

  FeeType(String value) {
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
  public static FeeType fromValue(String input) {
    for (FeeType b : FeeType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
}
