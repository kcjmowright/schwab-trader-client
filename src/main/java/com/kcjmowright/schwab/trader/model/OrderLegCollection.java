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
import com.kcjmowright.schwab.trader.model.AccountsInstrument;
import com.kcjmowright.schwab.trader.model.Instruction;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OrderLegCollection
 */



public class OrderLegCollection {
  /**
   * Gets or Sets orderLegType
   */
  public enum OrderLegTypeEnum {
    EQUITY("EQUITY"),
    OPTION("OPTION"),
    INDEX("INDEX"),
    MUTUAL_FUND("MUTUAL_FUND"),
    CASH_EQUIVALENT("CASH_EQUIVALENT"),
    FIXED_INCOME("FIXED_INCOME"),
    CURRENCY("CURRENCY"),
    COLLECTIVE_INVESTMENT("COLLECTIVE_INVESTMENT");

    private String value;

    OrderLegTypeEnum(String value) {
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
    public static OrderLegTypeEnum fromValue(String input) {
      for (OrderLegTypeEnum b : OrderLegTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("orderLegType")
  private OrderLegTypeEnum orderLegType = null;

  @JsonProperty("legId")
  private Long legId = null;

  @JsonProperty("instrument")
  private AccountsInstrument instrument = null;

  @JsonProperty("instruction")
  private Instruction instruction = null;

  /**
   * Gets or Sets positionEffect
   */
  public enum PositionEffectEnum {
    OPENING("OPENING"),
    CLOSING("CLOSING"),
    AUTOMATIC("AUTOMATIC");

    private String value;

    PositionEffectEnum(String value) {
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
    public static PositionEffectEnum fromValue(String input) {
      for (PositionEffectEnum b : PositionEffectEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("positionEffect")
  private PositionEffectEnum positionEffect = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  /**
   * Gets or Sets quantityType
   */
  public enum QuantityTypeEnum {
    ALL_SHARES("ALL_SHARES"),
    DOLLARS("DOLLARS"),
    SHARES("SHARES");

    private String value;

    QuantityTypeEnum(String value) {
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
    public static QuantityTypeEnum fromValue(String input) {
      for (QuantityTypeEnum b : QuantityTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("quantityType")
  private QuantityTypeEnum quantityType = null;

  /**
   * Gets or Sets divCapGains
   */
  public enum DivCapGainsEnum {
    REINVEST("REINVEST"),
    PAYOUT("PAYOUT");

    private String value;

    DivCapGainsEnum(String value) {
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
    public static DivCapGainsEnum fromValue(String input) {
      for (DivCapGainsEnum b : DivCapGainsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("divCapGains")
  private DivCapGainsEnum divCapGains = null;

  @JsonProperty("toSymbol")
  private String toSymbol = null;

  public OrderLegCollection orderLegType(OrderLegTypeEnum orderLegType) {
    this.orderLegType = orderLegType;
    return this;
  }

   /**
   * Get orderLegType
   * @return orderLegType
  **/
  @Schema(description = "")
  public OrderLegTypeEnum getOrderLegType() {
    return orderLegType;
  }

  public void setOrderLegType(OrderLegTypeEnum orderLegType) {
    this.orderLegType = orderLegType;
  }

  public OrderLegCollection legId(Long legId) {
    this.legId = legId;
    return this;
  }

   /**
   * Get legId
   * @return legId
  **/
  @Schema(description = "")
  public Long getLegId() {
    return legId;
  }

  public void setLegId(Long legId) {
    this.legId = legId;
  }

  public OrderLegCollection instrument(AccountsInstrument instrument) {
    this.instrument = instrument;
    return this;
  }

   /**
   * Get instrument
   * @return instrument
  **/
  @Schema(description = "")
  public AccountsInstrument getInstrument() {
    return instrument;
  }

  public void setInstrument(AccountsInstrument instrument) {
    this.instrument = instrument;
  }

  public OrderLegCollection instruction(Instruction instruction) {
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

  public OrderLegCollection positionEffect(PositionEffectEnum positionEffect) {
    this.positionEffect = positionEffect;
    return this;
  }

   /**
   * Get positionEffect
   * @return positionEffect
  **/
  @Schema(description = "")
  public PositionEffectEnum getPositionEffect() {
    return positionEffect;
  }

  public void setPositionEffect(PositionEffectEnum positionEffect) {
    this.positionEffect = positionEffect;
  }

  public OrderLegCollection quantity(Double quantity) {
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

  public OrderLegCollection quantityType(QuantityTypeEnum quantityType) {
    this.quantityType = quantityType;
    return this;
  }

   /**
   * Get quantityType
   * @return quantityType
  **/
  @Schema(description = "")
  public QuantityTypeEnum getQuantityType() {
    return quantityType;
  }

  public void setQuantityType(QuantityTypeEnum quantityType) {
    this.quantityType = quantityType;
  }

  public OrderLegCollection divCapGains(DivCapGainsEnum divCapGains) {
    this.divCapGains = divCapGains;
    return this;
  }

   /**
   * Get divCapGains
   * @return divCapGains
  **/
  @Schema(description = "")
  public DivCapGainsEnum getDivCapGains() {
    return divCapGains;
  }

  public void setDivCapGains(DivCapGainsEnum divCapGains) {
    this.divCapGains = divCapGains;
  }

  public OrderLegCollection toSymbol(String toSymbol) {
    this.toSymbol = toSymbol;
    return this;
  }

   /**
   * Get toSymbol
   * @return toSymbol
  **/
  @Schema(description = "")
  public String getToSymbol() {
    return toSymbol;
  }

  public void setToSymbol(String toSymbol) {
    this.toSymbol = toSymbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLegCollection orderLegCollection = (OrderLegCollection) o;
    return Objects.equals(this.orderLegType, orderLegCollection.orderLegType) &&
        Objects.equals(this.legId, orderLegCollection.legId) &&
        Objects.equals(this.instrument, orderLegCollection.instrument) &&
        Objects.equals(this.instruction, orderLegCollection.instruction) &&
        Objects.equals(this.positionEffect, orderLegCollection.positionEffect) &&
        Objects.equals(this.quantity, orderLegCollection.quantity) &&
        Objects.equals(this.quantityType, orderLegCollection.quantityType) &&
        Objects.equals(this.divCapGains, orderLegCollection.divCapGains) &&
        Objects.equals(this.toSymbol, orderLegCollection.toSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderLegType, legId, instrument, instruction, positionEffect, quantity, quantityType, divCapGains, toSymbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLegCollection {\n");
    
    sb.append("    orderLegType: ").append(toIndentedString(orderLegType)).append("\n");
    sb.append("    legId: ").append(toIndentedString(legId)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    positionEffect: ").append(toIndentedString(positionEffect)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityType: ").append(toIndentedString(quantityType)).append("\n");
    sb.append("    divCapGains: ").append(toIndentedString(divCapGains)).append("\n");
    sb.append("    toSymbol: ").append(toIndentedString(toSymbol)).append("\n");
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
