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

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * CashAccount
 */



public class CashAccount extends SecuritiesAccountBase implements SecuritiesAccount {
  @JsonProperty("initialBalances")
  private CashInitialBalance initialBalances = null;

  @JsonProperty("currentBalances")
  private CashBalance currentBalances = null;

  @JsonProperty("projectedBalances")
  private CashBalance projectedBalances = null;

  public CashAccount initialBalances(CashInitialBalance initialBalances) {
    this.initialBalances = initialBalances;
    return this;
  }

   /**
   * Get initialBalances
   * @return initialBalances
  **/
  @Schema(description = "")
  public CashInitialBalance getInitialBalances() {
    return initialBalances;
  }

  public void setInitialBalances(CashInitialBalance initialBalances) {
    this.initialBalances = initialBalances;
  }

  public CashAccount currentBalances(CashBalance currentBalances) {
    this.currentBalances = currentBalances;
    return this;
  }

   /**
   * Get currentBalances
   * @return currentBalances
  **/
  @Schema(description = "")
  public CashBalance getCurrentBalances() {
    return currentBalances;
  }

  public void setCurrentBalances(CashBalance currentBalances) {
    this.currentBalances = currentBalances;
  }

  public CashAccount projectedBalances(CashBalance projectedBalances) {
    this.projectedBalances = projectedBalances;
    return this;
  }

   /**
   * Get projectedBalances
   * @return projectedBalances
  **/
  @Schema(description = "")
  public CashBalance getProjectedBalances() {
    return projectedBalances;
  }

  public void setProjectedBalances(CashBalance projectedBalances) {
    this.projectedBalances = projectedBalances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashAccount cashAccount = (CashAccount) o;
    return Objects.equals(this.initialBalances, cashAccount.initialBalances) &&
        Objects.equals(this.currentBalances, cashAccount.currentBalances) &&
        Objects.equals(this.projectedBalances, cashAccount.projectedBalances) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialBalances, currentBalances, projectedBalances, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    initialBalances: ").append(toIndentedString(initialBalances)).append("\n");
    sb.append("    currentBalances: ").append(toIndentedString(currentBalances)).append("\n");
    sb.append("    projectedBalances: ").append(toIndentedString(projectedBalances)).append("\n");
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
