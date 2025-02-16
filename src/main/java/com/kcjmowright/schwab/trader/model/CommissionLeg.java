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
import com.kcjmowright.schwab.trader.model.CommissionValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CommissionLeg
 */



public class CommissionLeg {
  @JsonProperty("commissionValues")
  private List<CommissionValue> commissionValues = null;

  public CommissionLeg commissionValues(List<CommissionValue> commissionValues) {
    this.commissionValues = commissionValues;
    return this;
  }

  public CommissionLeg addCommissionValuesItem(CommissionValue commissionValuesItem) {
    if (this.commissionValues == null) {
      this.commissionValues = new ArrayList<>();
    }
    this.commissionValues.add(commissionValuesItem);
    return this;
  }

   /**
   * Get commissionValues
   * @return commissionValues
  **/
  @Schema(description = "")
  public List<CommissionValue> getCommissionValues() {
    return commissionValues;
  }

  public void setCommissionValues(List<CommissionValue> commissionValues) {
    this.commissionValues = commissionValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommissionLeg commissionLeg = (CommissionLeg) o;
    return Objects.equals(this.commissionValues, commissionLeg.commissionValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissionValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionLeg {\n");
    
    sb.append("    commissionValues: ").append(toIndentedString(commissionValues)).append("\n");
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
