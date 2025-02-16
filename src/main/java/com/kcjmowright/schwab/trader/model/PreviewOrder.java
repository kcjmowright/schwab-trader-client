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
import com.kcjmowright.schwab.trader.model.CommissionAndFee;
import com.kcjmowright.schwab.trader.model.OrderStrategy;
import com.kcjmowright.schwab.trader.model.OrderValidationResult;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PreviewOrder
 */



public class PreviewOrder {
  @JsonProperty("orderId")
  private Long orderId = null;

  @JsonProperty("orderStrategy")
  private OrderStrategy orderStrategy = null;

  @JsonProperty("orderValidationResult")
  private OrderValidationResult orderValidationResult = null;

  @JsonProperty("commissionAndFee")
  private CommissionAndFee commissionAndFee = null;

  public PreviewOrder orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @Schema(description = "")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public PreviewOrder orderStrategy(OrderStrategy orderStrategy) {
    this.orderStrategy = orderStrategy;
    return this;
  }

   /**
   * Get orderStrategy
   * @return orderStrategy
  **/
  @Schema(description = "")
  public OrderStrategy getOrderStrategy() {
    return orderStrategy;
  }

  public void setOrderStrategy(OrderStrategy orderStrategy) {
    this.orderStrategy = orderStrategy;
  }

  public PreviewOrder orderValidationResult(OrderValidationResult orderValidationResult) {
    this.orderValidationResult = orderValidationResult;
    return this;
  }

   /**
   * Get orderValidationResult
   * @return orderValidationResult
  **/
  @Schema(description = "")
  public OrderValidationResult getOrderValidationResult() {
    return orderValidationResult;
  }

  public void setOrderValidationResult(OrderValidationResult orderValidationResult) {
    this.orderValidationResult = orderValidationResult;
  }

  public PreviewOrder commissionAndFee(CommissionAndFee commissionAndFee) {
    this.commissionAndFee = commissionAndFee;
    return this;
  }

   /**
   * Get commissionAndFee
   * @return commissionAndFee
  **/
  @Schema(description = "")
  public CommissionAndFee getCommissionAndFee() {
    return commissionAndFee;
  }

  public void setCommissionAndFee(CommissionAndFee commissionAndFee) {
    this.commissionAndFee = commissionAndFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewOrder previewOrder = (PreviewOrder) o;
    return Objects.equals(this.orderId, previewOrder.orderId) &&
        Objects.equals(this.orderStrategy, previewOrder.orderStrategy) &&
        Objects.equals(this.orderValidationResult, previewOrder.orderValidationResult) &&
        Objects.equals(this.commissionAndFee, previewOrder.commissionAndFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderStrategy, orderValidationResult, commissionAndFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewOrder {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderStrategy: ").append(toIndentedString(orderStrategy)).append("\n");
    sb.append("    orderValidationResult: ").append(toIndentedString(orderValidationResult)).append("\n");
    sb.append("    commissionAndFee: ").append(toIndentedString(commissionAndFee)).append("\n");
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
