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
 * CashInitialBalance
 */



public class CashInitialBalance {
  @JsonProperty("accruedInterest")
  private Double accruedInterest = null;

  @JsonProperty("cashAvailableForTrading")
  private Double cashAvailableForTrading = null;

  @JsonProperty("cashAvailableForWithdrawal")
  private Double cashAvailableForWithdrawal = null;

  @JsonProperty("cashBalance")
  private Double cashBalance = null;

  @JsonProperty("bondValue")
  private Double bondValue = null;

  @JsonProperty("cashReceipts")
  private Double cashReceipts = null;

  @JsonProperty("liquidationValue")
  private Double liquidationValue = null;

  @JsonProperty("longOptionMarketValue")
  private Double longOptionMarketValue = null;

  @JsonProperty("longStockValue")
  private Double longStockValue = null;

  @JsonProperty("moneyMarketFund")
  private Double moneyMarketFund = null;

  @JsonProperty("mutualFundValue")
  private Double mutualFundValue = null;

  @JsonProperty("shortOptionMarketValue")
  private Double shortOptionMarketValue = null;

  @JsonProperty("shortStockValue")
  private Double shortStockValue = null;

  @JsonProperty("isInCall")
  private Double isInCall = null;

  @JsonProperty("unsettledCash")
  private Double unsettledCash = null;

  @JsonProperty("cashDebitCallValue")
  private Double cashDebitCallValue = null;

  @JsonProperty("pendingDeposits")
  private Double pendingDeposits = null;

  @JsonProperty("accountValue")
  private Double accountValue = null;

  public CashInitialBalance accruedInterest(Double accruedInterest) {
    this.accruedInterest = accruedInterest;
    return this;
  }

   /**
   * Get accruedInterest
   * @return accruedInterest
  **/
  @Schema(description = "")
  public Double getAccruedInterest() {
    return accruedInterest;
  }

  public void setAccruedInterest(Double accruedInterest) {
    this.accruedInterest = accruedInterest;
  }

  public CashInitialBalance cashAvailableForTrading(Double cashAvailableForTrading) {
    this.cashAvailableForTrading = cashAvailableForTrading;
    return this;
  }

   /**
   * Get cashAvailableForTrading
   * @return cashAvailableForTrading
  **/
  @Schema(description = "")
  public Double getCashAvailableForTrading() {
    return cashAvailableForTrading;
  }

  public void setCashAvailableForTrading(Double cashAvailableForTrading) {
    this.cashAvailableForTrading = cashAvailableForTrading;
  }

  public CashInitialBalance cashAvailableForWithdrawal(Double cashAvailableForWithdrawal) {
    this.cashAvailableForWithdrawal = cashAvailableForWithdrawal;
    return this;
  }

   /**
   * Get cashAvailableForWithdrawal
   * @return cashAvailableForWithdrawal
  **/
  @Schema(description = "")
  public Double getCashAvailableForWithdrawal() {
    return cashAvailableForWithdrawal;
  }

  public void setCashAvailableForWithdrawal(Double cashAvailableForWithdrawal) {
    this.cashAvailableForWithdrawal = cashAvailableForWithdrawal;
  }

  public CashInitialBalance cashBalance(Double cashBalance) {
    this.cashBalance = cashBalance;
    return this;
  }

   /**
   * Get cashBalance
   * @return cashBalance
  **/
  @Schema(description = "")
  public Double getCashBalance() {
    return cashBalance;
  }

  public void setCashBalance(Double cashBalance) {
    this.cashBalance = cashBalance;
  }

  public CashInitialBalance bondValue(Double bondValue) {
    this.bondValue = bondValue;
    return this;
  }

   /**
   * Get bondValue
   * @return bondValue
  **/
  @Schema(description = "")
  public Double getBondValue() {
    return bondValue;
  }

  public void setBondValue(Double bondValue) {
    this.bondValue = bondValue;
  }

  public CashInitialBalance cashReceipts(Double cashReceipts) {
    this.cashReceipts = cashReceipts;
    return this;
  }

   /**
   * Get cashReceipts
   * @return cashReceipts
  **/
  @Schema(description = "")
  public Double getCashReceipts() {
    return cashReceipts;
  }

  public void setCashReceipts(Double cashReceipts) {
    this.cashReceipts = cashReceipts;
  }

  public CashInitialBalance liquidationValue(Double liquidationValue) {
    this.liquidationValue = liquidationValue;
    return this;
  }

   /**
   * Get liquidationValue
   * @return liquidationValue
  **/
  @Schema(description = "")
  public Double getLiquidationValue() {
    return liquidationValue;
  }

  public void setLiquidationValue(Double liquidationValue) {
    this.liquidationValue = liquidationValue;
  }

  public CashInitialBalance longOptionMarketValue(Double longOptionMarketValue) {
    this.longOptionMarketValue = longOptionMarketValue;
    return this;
  }

   /**
   * Get longOptionMarketValue
   * @return longOptionMarketValue
  **/
  @Schema(description = "")
  public Double getLongOptionMarketValue() {
    return longOptionMarketValue;
  }

  public void setLongOptionMarketValue(Double longOptionMarketValue) {
    this.longOptionMarketValue = longOptionMarketValue;
  }

  public CashInitialBalance longStockValue(Double longStockValue) {
    this.longStockValue = longStockValue;
    return this;
  }

   /**
   * Get longStockValue
   * @return longStockValue
  **/
  @Schema(description = "")
  public Double getLongStockValue() {
    return longStockValue;
  }

  public void setLongStockValue(Double longStockValue) {
    this.longStockValue = longStockValue;
  }

  public CashInitialBalance moneyMarketFund(Double moneyMarketFund) {
    this.moneyMarketFund = moneyMarketFund;
    return this;
  }

   /**
   * Get moneyMarketFund
   * @return moneyMarketFund
  **/
  @Schema(description = "")
  public Double getMoneyMarketFund() {
    return moneyMarketFund;
  }

  public void setMoneyMarketFund(Double moneyMarketFund) {
    this.moneyMarketFund = moneyMarketFund;
  }

  public CashInitialBalance mutualFundValue(Double mutualFundValue) {
    this.mutualFundValue = mutualFundValue;
    return this;
  }

   /**
   * Get mutualFundValue
   * @return mutualFundValue
  **/
  @Schema(description = "")
  public Double getMutualFundValue() {
    return mutualFundValue;
  }

  public void setMutualFundValue(Double mutualFundValue) {
    this.mutualFundValue = mutualFundValue;
  }

  public CashInitialBalance shortOptionMarketValue(Double shortOptionMarketValue) {
    this.shortOptionMarketValue = shortOptionMarketValue;
    return this;
  }

   /**
   * Get shortOptionMarketValue
   * @return shortOptionMarketValue
  **/
  @Schema(description = "")
  public Double getShortOptionMarketValue() {
    return shortOptionMarketValue;
  }

  public void setShortOptionMarketValue(Double shortOptionMarketValue) {
    this.shortOptionMarketValue = shortOptionMarketValue;
  }

  public CashInitialBalance shortStockValue(Double shortStockValue) {
    this.shortStockValue = shortStockValue;
    return this;
  }

   /**
   * Get shortStockValue
   * @return shortStockValue
  **/
  @Schema(description = "")
  public Double getShortStockValue() {
    return shortStockValue;
  }

  public void setShortStockValue(Double shortStockValue) {
    this.shortStockValue = shortStockValue;
  }

  public CashInitialBalance isInCall(Double isInCall) {
    this.isInCall = isInCall;
    return this;
  }

   /**
   * Get isInCall
   * @return isInCall
  **/
  @Schema(description = "")
  public Double getIsInCall() {
    return isInCall;
  }

  public void setIsInCall(Double isInCall) {
    this.isInCall = isInCall;
  }

  public CashInitialBalance unsettledCash(Double unsettledCash) {
    this.unsettledCash = unsettledCash;
    return this;
  }

   /**
   * Get unsettledCash
   * @return unsettledCash
  **/
  @Schema(description = "")
  public Double getUnsettledCash() {
    return unsettledCash;
  }

  public void setUnsettledCash(Double unsettledCash) {
    this.unsettledCash = unsettledCash;
  }

  public CashInitialBalance cashDebitCallValue(Double cashDebitCallValue) {
    this.cashDebitCallValue = cashDebitCallValue;
    return this;
  }

   /**
   * Get cashDebitCallValue
   * @return cashDebitCallValue
  **/
  @Schema(description = "")
  public Double getCashDebitCallValue() {
    return cashDebitCallValue;
  }

  public void setCashDebitCallValue(Double cashDebitCallValue) {
    this.cashDebitCallValue = cashDebitCallValue;
  }

  public CashInitialBalance pendingDeposits(Double pendingDeposits) {
    this.pendingDeposits = pendingDeposits;
    return this;
  }

   /**
   * Get pendingDeposits
   * @return pendingDeposits
  **/
  @Schema(description = "")
  public Double getPendingDeposits() {
    return pendingDeposits;
  }

  public void setPendingDeposits(Double pendingDeposits) {
    this.pendingDeposits = pendingDeposits;
  }

  public CashInitialBalance accountValue(Double accountValue) {
    this.accountValue = accountValue;
    return this;
  }

   /**
   * Get accountValue
   * @return accountValue
  **/
  @Schema(description = "")
  public Double getAccountValue() {
    return accountValue;
  }

  public void setAccountValue(Double accountValue) {
    this.accountValue = accountValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashInitialBalance cashInitialBalance = (CashInitialBalance) o;
    return Objects.equals(this.accruedInterest, cashInitialBalance.accruedInterest) &&
        Objects.equals(this.cashAvailableForTrading, cashInitialBalance.cashAvailableForTrading) &&
        Objects.equals(this.cashAvailableForWithdrawal, cashInitialBalance.cashAvailableForWithdrawal) &&
        Objects.equals(this.cashBalance, cashInitialBalance.cashBalance) &&
        Objects.equals(this.bondValue, cashInitialBalance.bondValue) &&
        Objects.equals(this.cashReceipts, cashInitialBalance.cashReceipts) &&
        Objects.equals(this.liquidationValue, cashInitialBalance.liquidationValue) &&
        Objects.equals(this.longOptionMarketValue, cashInitialBalance.longOptionMarketValue) &&
        Objects.equals(this.longStockValue, cashInitialBalance.longStockValue) &&
        Objects.equals(this.moneyMarketFund, cashInitialBalance.moneyMarketFund) &&
        Objects.equals(this.mutualFundValue, cashInitialBalance.mutualFundValue) &&
        Objects.equals(this.shortOptionMarketValue, cashInitialBalance.shortOptionMarketValue) &&
        Objects.equals(this.shortStockValue, cashInitialBalance.shortStockValue) &&
        Objects.equals(this.isInCall, cashInitialBalance.isInCall) &&
        Objects.equals(this.unsettledCash, cashInitialBalance.unsettledCash) &&
        Objects.equals(this.cashDebitCallValue, cashInitialBalance.cashDebitCallValue) &&
        Objects.equals(this.pendingDeposits, cashInitialBalance.pendingDeposits) &&
        Objects.equals(this.accountValue, cashInitialBalance.accountValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accruedInterest, cashAvailableForTrading, cashAvailableForWithdrawal, cashBalance, bondValue, cashReceipts, liquidationValue, longOptionMarketValue, longStockValue, moneyMarketFund, mutualFundValue, shortOptionMarketValue, shortStockValue, isInCall, unsettledCash, cashDebitCallValue, pendingDeposits, accountValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashInitialBalance {\n");

    sb.append("    accruedInterest: ").append(toIndentedString(accruedInterest)).append("\n");
    sb.append("    cashAvailableForTrading: ").append(toIndentedString(cashAvailableForTrading)).append("\n");
    sb.append("    cashAvailableForWithdrawal: ").append(toIndentedString(cashAvailableForWithdrawal)).append("\n");
    sb.append("    cashBalance: ").append(toIndentedString(cashBalance)).append("\n");
    sb.append("    bondValue: ").append(toIndentedString(bondValue)).append("\n");
    sb.append("    cashReceipts: ").append(toIndentedString(cashReceipts)).append("\n");
    sb.append("    liquidationValue: ").append(toIndentedString(liquidationValue)).append("\n");
    sb.append("    longOptionMarketValue: ").append(toIndentedString(longOptionMarketValue)).append("\n");
    sb.append("    longStockValue: ").append(toIndentedString(longStockValue)).append("\n");
    sb.append("    moneyMarketFund: ").append(toIndentedString(moneyMarketFund)).append("\n");
    sb.append("    mutualFundValue: ").append(toIndentedString(mutualFundValue)).append("\n");
    sb.append("    shortOptionMarketValue: ").append(toIndentedString(shortOptionMarketValue)).append("\n");
    sb.append("    shortStockValue: ").append(toIndentedString(shortStockValue)).append("\n");
    sb.append("    isInCall: ").append(toIndentedString(isInCall)).append("\n");
    sb.append("    unsettledCash: ").append(toIndentedString(unsettledCash)).append("\n");
    sb.append("    cashDebitCallValue: ").append(toIndentedString(cashDebitCallValue)).append("\n");
    sb.append("    pendingDeposits: ").append(toIndentedString(pendingDeposits)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
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
