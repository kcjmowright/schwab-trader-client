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
import com.kcjmowright.schwab.trader.model.AssetType;
import com.kcjmowright.schwab.trader.model.Instruction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
/**
 * OrderLeg
 */



public class OrderLeg {
  @JsonProperty("askPrice")
  private Double askPrice = null;

  @JsonProperty("bidPrice")
  private Double bidPrice = null;

  @JsonProperty("lastPrice")
  private Double lastPrice = null;

  @JsonProperty("markPrice")
  private Double markPrice = null;

  @JsonProperty("projectedCommission")
  private Double projectedCommission = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  @JsonProperty("finalSymbol")
  private String finalSymbol = null;

  @JsonProperty("legId")
  private BigDecimal legId = null;

  @JsonProperty("assetType")
  private AssetType assetType = null;

  @JsonProperty("instruction")
  private Instruction instruction = null;

  public OrderLeg askPrice(Double askPrice) {
    this.askPrice = askPrice;
    return this;
  }

   /**
   * Get askPrice
   * @return askPrice
  **/
  @Schema(description = "")
  public Double getAskPrice() {
    return askPrice;
  }

  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  public OrderLeg bidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * Get bidPrice
   * @return bidPrice
  **/
  @Schema(description = "")
  public Double getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  public OrderLeg lastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

   /**
   * Get lastPrice
   * @return lastPrice
  **/
  @Schema(description = "")
  public Double getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(Double lastPrice) {
    this.lastPrice = lastPrice;
  }

  public OrderLeg markPrice(Double markPrice) {
    this.markPrice = markPrice;
    return this;
  }

   /**
   * Get markPrice
   * @return markPrice
  **/
  @Schema(description = "")
  public Double getMarkPrice() {
    return markPrice;
  }

  public void setMarkPrice(Double markPrice) {
    this.markPrice = markPrice;
  }

  public OrderLeg projectedCommission(Double projectedCommission) {
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

  public OrderLeg quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(description = "")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public OrderLeg finalSymbol(String finalSymbol) {
    this.finalSymbol = finalSymbol;
    return this;
  }

   /**
   * Get finalSymbol
   * @return finalSymbol
  **/
  @Schema(description = "")
  public String getFinalSymbol() {
    return finalSymbol;
  }

  public void setFinalSymbol(String finalSymbol) {
    this.finalSymbol = finalSymbol;
  }

  public OrderLeg legId(BigDecimal legId) {
    this.legId = legId;
    return this;
  }

   /**
   * Get legId
   * @return legId
  **/
  @Schema(description = "")
  public BigDecimal getLegId() {
    return legId;
  }

  public void setLegId(BigDecimal legId) {
    this.legId = legId;
  }

  public OrderLeg assetType(AssetType assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @Schema(description = "")
  public AssetType getAssetType() {
    return assetType;
  }

  public void setAssetType(AssetType assetType) {
    this.assetType = assetType;
  }

  public OrderLeg instruction(Instruction instruction) {
    this.instruction = instruction;
    return this;
  }

   /**
   * Get instruction
   * @return instruction
  **/
  @Schema(description = "")
  public Instruction getInstruction() {
    return instruction;
  }

  public void setInstruction(Instruction instruction) {
    this.instruction = instruction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLeg orderLeg = (OrderLeg) o;
    return Objects.equals(this.askPrice, orderLeg.askPrice) &&
        Objects.equals(this.bidPrice, orderLeg.bidPrice) &&
        Objects.equals(this.lastPrice, orderLeg.lastPrice) &&
        Objects.equals(this.markPrice, orderLeg.markPrice) &&
        Objects.equals(this.projectedCommission, orderLeg.projectedCommission) &&
        Objects.equals(this.quantity, orderLeg.quantity) &&
        Objects.equals(this.finalSymbol, orderLeg.finalSymbol) &&
        Objects.equals(this.legId, orderLeg.legId) &&
        Objects.equals(this.assetType, orderLeg.assetType) &&
        Objects.equals(this.instruction, orderLeg.instruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(askPrice, bidPrice, lastPrice, markPrice, projectedCommission, quantity, finalSymbol, legId, assetType, instruction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLeg {\n");
    
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    markPrice: ").append(toIndentedString(markPrice)).append("\n");
    sb.append("    projectedCommission: ").append(toIndentedString(projectedCommission)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    finalSymbol: ").append(toIndentedString(finalSymbol)).append("\n");
    sb.append("    legId: ").append(toIndentedString(legId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
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
