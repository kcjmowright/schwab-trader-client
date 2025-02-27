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

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* TransactionInstrument
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "assetType")
@JsonSubTypes({
  @JsonSubTypes.Type(value = TransactionCashEquivalent.class, name = "CASH_EQUIVALENT"),
  @JsonSubTypes.Type(value = CollectiveInvestment.class, name = "COLLECTIVE_INVESTMENT"),
  @JsonSubTypes.Type(value = Currency.class, name = "CURRENCY"),
  @JsonSubTypes.Type(value = TransactionEquity.class, name = "EQUITY"),
  @JsonSubTypes.Type(value = TransactionFixedIncome.class, name = "FIXED_INCOME"),
  @JsonSubTypes.Type(value = Forex.class, name = "FOREX"),
  @JsonSubTypes.Type(value = Future.class, name = "FUTURE"),
  @JsonSubTypes.Type(value = Index.class, name = "INDEX"),
  @JsonSubTypes.Type(value = TransactionMutualFund.class, name = "MUTUAL_FUND"),
  @JsonSubTypes.Type(value = TransactionOption.class, name = "OPTION"),
  @JsonSubTypes.Type(value = Product.class, name = "PRODUCT")
})
public interface TransactionInstrument {

}
