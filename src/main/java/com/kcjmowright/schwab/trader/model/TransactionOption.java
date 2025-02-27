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
import com.kcjmowright.schwab.trader.model.TransactionAPIOptionDeliverable;
import com.kcjmowright.schwab.trader.model.TransactionBaseInstrument;
import com.kcjmowright.schwab.trader.model.TransactionInstrument;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * TransactionOption
 */



public class TransactionOption extends TransactionBaseInstrument implements TransactionInstrument {
  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("optionDeliverables")
  private List<TransactionAPIOptionDeliverable> optionDeliverables = null;

  @JsonProperty("optionPremiumMultiplier")
  private Long optionPremiumMultiplier = null;

  /**
   * Gets or Sets putCall
   */
  public enum PutCallEnum {
    PUT("PUT"),
    CALL("CALL"),
    UNKNOWN("UNKNOWN");

    private String value;

    PutCallEnum(String value) {
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
    public static PutCallEnum fromValue(String input) {
      for (PutCallEnum b : PutCallEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("putCall")
  private PutCallEnum putCall = null;

  @JsonProperty("strikePrice")
  private Double strikePrice = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    VANILLA("VANILLA"),
    BINARY("BINARY"),
    BARRIER("BARRIER"),
    UNKNOWN("UNKNOWN");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("underlyingSymbol")
  private String underlyingSymbol = null;

  @JsonProperty("underlyingCusip")
  private String underlyingCusip = null;

  @JsonProperty("deliverable")
  private TransactionInstrument deliverable = null;

  public TransactionOption expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @Schema(description = "")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public TransactionOption optionDeliverables(List<TransactionAPIOptionDeliverable> optionDeliverables) {
    this.optionDeliverables = optionDeliverables;
    return this;
  }

  public TransactionOption addOptionDeliverablesItem(TransactionAPIOptionDeliverable optionDeliverablesItem) {
    if (this.optionDeliverables == null) {
      this.optionDeliverables = new ArrayList<>();
    }
    this.optionDeliverables.add(optionDeliverablesItem);
    return this;
  }

   /**
   * Get optionDeliverables
   * @return optionDeliverables
  **/
  @Schema(description = "")
  public List<TransactionAPIOptionDeliverable> getOptionDeliverables() {
    return optionDeliverables;
  }

  public void setOptionDeliverables(List<TransactionAPIOptionDeliverable> optionDeliverables) {
    this.optionDeliverables = optionDeliverables;
  }

  public TransactionOption optionPremiumMultiplier(Long optionPremiumMultiplier) {
    this.optionPremiumMultiplier = optionPremiumMultiplier;
    return this;
  }

   /**
   * Get optionPremiumMultiplier
   * @return optionPremiumMultiplier
  **/
  @Schema(description = "")
  public Long getOptionPremiumMultiplier() {
    return optionPremiumMultiplier;
  }

  public void setOptionPremiumMultiplier(Long optionPremiumMultiplier) {
    this.optionPremiumMultiplier = optionPremiumMultiplier;
  }

  public TransactionOption putCall(PutCallEnum putCall) {
    this.putCall = putCall;
    return this;
  }

   /**
   * Get putCall
   * @return putCall
  **/
  @Schema(description = "")
  public PutCallEnum getPutCall() {
    return putCall;
  }

  public void setPutCall(PutCallEnum putCall) {
    this.putCall = putCall;
  }

  public TransactionOption strikePrice(Double strikePrice) {
    this.strikePrice = strikePrice;
    return this;
  }

   /**
   * Get strikePrice
   * @return strikePrice
  **/
  @Schema(description = "")
  public Double getStrikePrice() {
    return strikePrice;
  }

  public void setStrikePrice(Double strikePrice) {
    this.strikePrice = strikePrice;
  }

  public TransactionOption type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TransactionOption underlyingSymbol(String underlyingSymbol) {
    this.underlyingSymbol = underlyingSymbol;
    return this;
  }

   /**
   * Get underlyingSymbol
   * @return underlyingSymbol
  **/
  @Schema(description = "")
  public String getUnderlyingSymbol() {
    return underlyingSymbol;
  }

  public void setUnderlyingSymbol(String underlyingSymbol) {
    this.underlyingSymbol = underlyingSymbol;
  }

  public TransactionOption underlyingCusip(String underlyingCusip) {
    this.underlyingCusip = underlyingCusip;
    return this;
  }

   /**
   * Get underlyingCusip
   * @return underlyingCusip
  **/
  @Schema(description = "")
  public String getUnderlyingCusip() {
    return underlyingCusip;
  }

  public void setUnderlyingCusip(String underlyingCusip) {
    this.underlyingCusip = underlyingCusip;
  }

  public TransactionOption deliverable(TransactionInstrument deliverable) {
    this.deliverable = deliverable;
    return this;
  }

   /**
   * Get deliverable
   * @return deliverable
  **/
  @Schema(description = "")
  public TransactionInstrument getDeliverable() {
    return deliverable;
  }

  public void setDeliverable(TransactionInstrument deliverable) {
    this.deliverable = deliverable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionOption transactionOption = (TransactionOption) o;
    return Objects.equals(this.expirationDate, transactionOption.expirationDate) &&
        Objects.equals(this.optionDeliverables, transactionOption.optionDeliverables) &&
        Objects.equals(this.optionPremiumMultiplier, transactionOption.optionPremiumMultiplier) &&
        Objects.equals(this.putCall, transactionOption.putCall) &&
        Objects.equals(this.strikePrice, transactionOption.strikePrice) &&
        Objects.equals(this.type, transactionOption.type) &&
        Objects.equals(this.underlyingSymbol, transactionOption.underlyingSymbol) &&
        Objects.equals(this.underlyingCusip, transactionOption.underlyingCusip) &&
        Objects.equals(this.deliverable, transactionOption.deliverable) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate, optionDeliverables, optionPremiumMultiplier, putCall, strikePrice, type, underlyingSymbol, underlyingCusip, deliverable, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    optionDeliverables: ").append(toIndentedString(optionDeliverables)).append("\n");
    sb.append("    optionPremiumMultiplier: ").append(toIndentedString(optionPremiumMultiplier)).append("\n");
    sb.append("    putCall: ").append(toIndentedString(putCall)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    underlyingSymbol: ").append(toIndentedString(underlyingSymbol)).append("\n");
    sb.append("    underlyingCusip: ").append(toIndentedString(underlyingCusip)).append("\n");
    sb.append("    deliverable: ").append(toIndentedString(deliverable)).append("\n");
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
