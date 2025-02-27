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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OrderBalance
 */



public class OrderBalance {
  @JsonProperty("orderValue")
  private Double orderValue = null;

  @JsonProperty("projectedAvailableFund")
  private Double projectedAvailableFund = null;

  @JsonProperty("projectedBuyingPower")
  private Double projectedBuyingPower = null;

  @JsonProperty("projectedCommission")
  private Double projectedCommission = null;

  public OrderBalance orderValue(Double orderValue) {
    this.orderValue = orderValue;
    return this;
  }

   /**
   * Get orderValue
   * @return orderValue
  **/
  @Schema(description = "")
  public Double getOrderValue() {
    return orderValue;
  }

  public void setOrderValue(Double orderValue) {
    this.orderValue = orderValue;
  }

  public OrderBalance projectedAvailableFund(Double projectedAvailableFund) {
    this.projectedAvailableFund = projectedAvailableFund;
    return this;
  }

   /**
   * Get projectedAvailableFund
   * @return projectedAvailableFund
  **/
  @Schema(description = "")
  public Double getProjectedAvailableFund() {
    return projectedAvailableFund;
  }

  public void setProjectedAvailableFund(Double projectedAvailableFund) {
    this.projectedAvailableFund = projectedAvailableFund;
  }

  public OrderBalance projectedBuyingPower(Double projectedBuyingPower) {
    this.projectedBuyingPower = projectedBuyingPower;
    return this;
  }

   /**
   * Get projectedBuyingPower
   * @return projectedBuyingPower
  **/
  @Schema(description = "")
  public Double getProjectedBuyingPower() {
    return projectedBuyingPower;
  }

  public void setProjectedBuyingPower(Double projectedBuyingPower) {
    this.projectedBuyingPower = projectedBuyingPower;
  }

  public OrderBalance projectedCommission(Double projectedCommission) {
    this.projectedCommission = projectedCommission;
    return this;
  }

   /**
   * Get projectedCommission
   * @return projectedCommission
  **/
  @Schema(description = "")
  public Double getProjectedCommission() {
    return projectedCommission;
  }

  public void setProjectedCommission(Double projectedCommission) {
    this.projectedCommission = projectedCommission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBalance orderBalance = (OrderBalance) o;
    return Objects.equals(this.orderValue, orderBalance.orderValue) &&
        Objects.equals(this.projectedAvailableFund, orderBalance.projectedAvailableFund) &&
        Objects.equals(this.projectedBuyingPower, orderBalance.projectedBuyingPower) &&
        Objects.equals(this.projectedCommission, orderBalance.projectedCommission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderValue, projectedAvailableFund, projectedBuyingPower, projectedCommission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBalance {\n");
    
    sb.append("    orderValue: ").append(toIndentedString(orderValue)).append("\n");
    sb.append("    projectedAvailableFund: ").append(toIndentedString(projectedAvailableFund)).append("\n");
    sb.append("    projectedBuyingPower: ").append(toIndentedString(projectedBuyingPower)).append("\n");
    sb.append("    projectedCommission: ").append(toIndentedString(projectedCommission)).append("\n");
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
